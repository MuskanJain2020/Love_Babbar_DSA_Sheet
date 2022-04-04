/* Given a string S find all possible subsequences of the string in lexicographically-sorted order.

Example 1:

Input : str = "abc"
Output: a ab abc ac b bc c
Explanation : There are 7 substrings that 
can be formed from abc. */


class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        
      List<String> l = new ArrayList<>();
      int n = s.length();
      int count = 1<<n ;
      
      for (int i =1 ; i<count ; i++){
          String temp = "";
          for (int j =0 ; j<n ; j++){
              
              if ((i & (1<<(j))) != 0){
                  temp = temp + s.charAt(j) ; }
              }
              l.add(temp);
          }
          Collections.sort(l);
          return l ;

      }
      
