
class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
          if(n==1){
           return 0;
       }
  Arrays.sort(arr);
      
      int diff = arr[n-1] - arr[0];
      
      int max = arr[n-1]-k,min = arr[0]+k;
      
      for(int i = 1;i<n;i++)
      {
          if(arr[i]-k < 0)
          {
              
              continue;
          }
          
          max = Math.max(arr[i-1]+k,max);
          min = Math.min(min,arr[i]-k);
          
          diff = Math.min(diff,max-min);
      }
      return diff;
    }
}
