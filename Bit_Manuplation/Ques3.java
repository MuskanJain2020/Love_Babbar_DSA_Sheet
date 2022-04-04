/* You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.
Input: A = 10, B = 20
Output: 4
Explanation:
A  = 01010
B  = 10100
As we can see, the bits of A that need 
to be flipped are 01010. If we flip 
these bits, we get 10100, which is B.*/

/* Approach : first we do xor of A and B and then count the set bits 
              TC = theta(no of set bits ) */

class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        int n = a^b ;
        int count = 0; 
        while (n >0){
            	n &= (n - 1); 
            count ++ ;
        }
        
        return count ;
        
    }
    
    
}
