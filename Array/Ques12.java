class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        
        
         int i=n-1, j=0;
   while(i>=0 && j<m){
       if(arr1[i]>arr2[j]){
          
           int temp = arr1[i];
           arr1[i] = arr2[j];
           arr2[j] = temp ;
           i--;
       }
       else{
           break;
       }
       j++;
   }
   Arrays.sort(arr1);
   Arrays.sort(arr2);   
}
    
}

// Time Complexity will be = 2* nlogn + o(m) 
