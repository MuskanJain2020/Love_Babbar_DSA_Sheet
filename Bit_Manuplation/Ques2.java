/* Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas
the other two number occur exactly once and are distinct. Find the other two numbers.
Input: 
N = 2
arr[] = {1, 2, 3, 2, 1, 4}
Output:
3 4 
Explanation:
3 and 4 occur exactly once.*/


class Solution
{
    public int[] singleNumber(int[] nums)
    {int xor = 0;
    int res1 = 0;
    int res2 = 0 ;
        for (int i =0 ; i<nums.length ; i++){
            xor = xor^nums[i];
        }
        
        int lb = xor & (~(xor - 1)); // for rightmost set bit
        
        for (int i =0 ; i<nums.length ; i++){
            if ((nums[i] & lb) != 0){
                res1 = res1^nums[i] ;
            }
            else{
                 res2 = res2^nums[i] ;
            }
            
        }
        
        int a[] = {res1 , res2 } ;
        Arrays.sort(a) ;
        return a ;
    }
}
