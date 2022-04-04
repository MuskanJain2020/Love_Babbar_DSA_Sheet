/* Count set bits in an integer
Approach 1 : using while loop 
 TC : theta(no of bits in n) 
 */

public static int CountBits(int n ){
  int res = 0 ;
  while (n>0){
    if ((n & 1) == 1){
      res++ ;
      n = n>>1 ;}}
    return res;}
      
/* Approach 2 : Brian Kerningam's Algorithm 
               TC = THETA(no of set bits) */
  
public static int CountSetBits(int n ){
  int res = 0 ;
  while (n>0){
   n = n & (n-1) ;
      res++ ;}
    return res ;}

