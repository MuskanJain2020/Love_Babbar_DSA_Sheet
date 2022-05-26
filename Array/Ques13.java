
//Kadane Algorithm

class Solution{
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
     int max = arr[0];
     int maxsofar = arr[0] ;
        
        
    for (int i =1 ; i<n ; i++){
      max = Math.max(max+arr[i], arr[i])  ;
      maxsofar = Math.max(max , maxsofar);
        
        
    }
    return maxsofar ;
        
    }
    
}
