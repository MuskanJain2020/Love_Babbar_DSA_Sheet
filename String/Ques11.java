class Solution {
    public static int maxSubStr(String str) {
       //Write your code here
       
       int count1 = 0 ;
       int count0 = 0 ;
       for (int i =0 ; i<str.length() ; i++){
           if (str.charAt(i) == '1'){
               count1++ ;
           }
           else{
               count0++ ;
           }
       }
       
       if (count0 != count1){
           return -1 ;
       }
       int res = 0 ;
       int ans = 0 ;
       for (int i =0 ; i<str.length() ; i++){
           if (str.charAt(i) == '1'){
               ans = ans+1 ;
           }
           else{
               ans = ans -1 ; ;
           }
           
           if (ans == 0){
               res++ ;
           }
       }
       
       
       
       return res ;
       
       
       
    }
}
