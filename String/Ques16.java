class Solution
{  public static boolean matching(char a,char b){
        return (( a=='(' && b==')' )||( a=='[' && b==']' )||( a=='{' && b=='}' ));
    }
    
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
      ArrayDeque <Character> s = new ArrayDeque <>();
      for (int i =0 ; i< x.length() ; i++){
          if (x.charAt(i) == '[' || x.charAt(i) == '{' || x.charAt(i) == '(' ){
              s.push(x.charAt(i) );
              }
          else {if(s.isEmpty() == true){return false ;}  
          else if (matching( s.peek() ,x.charAt(i)) == false) {
                return false ;
            }
            
            else {
                s.pop();
            }
            }
              
      } return s.isEmpty() ;
    }
}
