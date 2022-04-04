/* Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some x.

Example 1:

Input: N = 1
Output: YES
Explanation:1 is equal to 2 
raised to 0 (20 = 1).


Approach : A number which is power of 2 contains only one set bit */

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        int count  =0 ;
         while (n >0)
        {
            n = n & (n - 1);
            count++;
        }
        
        if (count == 1)
            return true;
        else
            return false;
        
        
    }
    
}
