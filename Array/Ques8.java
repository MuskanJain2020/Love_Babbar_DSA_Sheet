//Kadane Algorithm
    long maxSubarraySum(int a[], int n){
        long current_sum = 0 ;
        long max_so_far = 0;
      for (int i=0 ; i<n ;i++){
          
         current_sum = Math.max(a[i] , current_sum+a[i]) ;
         max_so_far = Math.max(current_sum  , max_so_far);
          
        }
      return max_so_far ;
        
    }
