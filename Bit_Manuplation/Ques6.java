/* Find position of set bit 
N = 2
Output:
2
Explanation:
2 is represented as "10" in Binary.
As we see there's only one set bit
and it's in Position 2 and thus the
Output 2.*/

class Solution {
    static int findPosition(int N) {
        // code here
           int count=0,pos=0;
       while(N !=0)
       {
           if((N )& (1))
               count++;
           if(count > 1)
               return -1;
           N>>=1;
           pos++;
       }
       if(count ==0)
           return -1;
       else
           return(pos);
   }
    }
