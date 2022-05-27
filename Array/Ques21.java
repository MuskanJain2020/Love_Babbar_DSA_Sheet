class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n){
 
     int sum =0;
        
        HashSet<Integer>hs = new HashSet<>();
        
        for(int i = 0; i<n ; i++)
        {
            sum = sum + arr[i];
            
            if(arr[i] == 0) return true;
            if(sum == 0) return true;
            if(hs.contains(sum)) return true;
           
           hs.add(sum);
           
        }
        return false;
    }
}
