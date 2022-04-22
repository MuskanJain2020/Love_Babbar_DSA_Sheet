//Approach 1 - Using HashMap , TC = O(n)
// Approach 2 - Using an auxiliary array to store count of numbers TC = O(n)
//Approach 3 - Sort and then linear search O(nlogn)


class Solution {
    public int findDuplicate(int[] nums) {
     HashSet <Integer> hp = new HashSet<>();
        
    for  (int x : nums ){
        if (hp.contains(x) == true){
            return x ;
        }
        hp.add(x);
    }
        
        return -1 ;
    }
}
