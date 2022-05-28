class Complete{
    
   
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        int count = 0;
    for (int i = 0; i < n; ++i)
    if (arr[i] <= k)
        ++count;
 
    // Find unwanted elements in current
    // window of size 'count'
    int bad = 0;
    for (int i = 0; i < count; ++i)
    if (arr[i] > k)
        ++bad;
 
    // Initialize answer with 'bad' value of
    // current window
    int ans = bad;
    for (int i = 0, j = count; j < n; ++i, ++j) {
 
    // Decrement count of previous window
    if (arr[i] > k)
        --bad;
 
    // Increment count of current window
    if (arr[j] > k)
        ++bad;
 
    // Update ans if count of 'bad'
    // is less in current window
    ans = Math.min(ans, bad);
    }
    return ans;
    }
    
    
}
