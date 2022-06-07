class Solution{
    static int minimumNumberOfSwaps(String S){

       int swap =0;
       
       for(int i =0;i<S.length();i++)
       {
           if(S.charAt(i) ==']')
           {
               c++;
               
               if(c > 0)
               swap += c;
           }
           else
           {
               c--;
           }
       }
       return swap;
    
    }
}
