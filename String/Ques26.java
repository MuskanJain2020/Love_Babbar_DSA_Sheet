class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here


HashMap<Character, Integer> map= new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);
       int ans=0;
       
       
       
       if (str.length() == 1){
           return map.get(str.charAt(0));
       }
       
       for (int i =0  ; i<str.length()-1 ; i++){
          if (map.get(str.charAt(i)) < map.get(str.charAt(i+1))){
              ans = ans - map.get(str.charAt(i)) ;
          }
          else if  (map.get(str.charAt(i)) >= map.get(str.charAt(i+1))){
              ans = ans + map.get(str.charAt(i)) ;
          } 
          
       }
       ans = ans + map.get(str.charAt(str.length()-1)) ;
       return ans ;
       
    }
}
