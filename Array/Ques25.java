
class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int check = n/k ;
        HashMap <Integer , Integer > hp = new HashMap <>() ;
        for (int i =0 ; i< n ; i++){
            hp.put(arr[i] , hp.getOrDefault(arr[i] , 0)+1) ;
        }
        int cnt = 0 ;
        for (Integer x : hp.values()){
            if(x>check) {
                cnt++ ;
            }
        }
        return cnt ; 
    }
}
