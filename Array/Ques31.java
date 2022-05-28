class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 
        
       int i=0;
       int j=0;
       int sum=0;
       int min=Integer.MAX_VALUE;
       int count=0;
       while(i<n && j<n){
           sum+=a[j];
           count++;
           if(sum>x){
               min=Math.min(min,count);
               sum=0;
               count=0;
               i++;j=i;
           }else{
               j++;
           }
       }
       return min;
   }
        
        
        
    
}
