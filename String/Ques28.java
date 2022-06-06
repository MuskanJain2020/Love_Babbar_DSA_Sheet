class Solution {
    public int minFlips(String S) {
        // Code here
      int n = S.length();
      int c1 = 0 ; 
      int c2 = 0 ;
        
        
        
        
       // considering zeroth index 1 value 
       for (int i =0 ; i<n  ; i++){
           if (i%2== 0 && S.charAt(i) == '0')
           {
               c1++ ;
           }
           else if(i%2 != 0 && S.charAt(i) == '1') {
               c1++ ;
           }
           else {
               continue ;
           }
       }
       
       // considering zeroth index 0 value 
       for (int i =0 ; i<n  ; i++){
           if (i%2== 0 && S.charAt(i) == '1')
           {
               c2++ ;
           }
           else if(i%2 != 0 && S.charAt(i) == '0') {
               c2++ ;
           }
           else {
               continue ;
           }
       }
        
        return Math.min(c1,c2) ;
        
        
    }
}
