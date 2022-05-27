class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
    
    if(n==1  ){
        return arr[0] ;
    }
    if (n==0){
        return 0 ;
    }
    

    long maxprod = 1;
    long maxsofar = 0;
    for (int i =0; i< n ;i++){
        maxprod = maxprod*arr[i];
        maxsofar = Math.max(maxprod , maxsofar);
        if (maxprod == 0){
            maxprod = 1 ;
        }
    }
     maxprod = 1 ;
    for (int i =n-1; i>=0 ;i--){
        maxprod = maxprod*arr[i];
        maxsofar = Math.max(maxprod , maxsofar);
        if (maxprod == 0){
            maxprod = 1 ;
        }
    }
    
    return maxsofar ;
    
    
    
    
    
    
    
    
    }
}
