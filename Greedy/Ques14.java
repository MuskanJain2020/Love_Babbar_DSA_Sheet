class Solution 
{
    static class Pair implements Comparable <Pair>{
        int s;
        int e ;
        Pair(int s , int e ){
            this.s = s ;
            this.e = e ;
        }
        
       public int compareTo(Pair p){
           return this.e-p.e ;
       }
    }
    
     public static int maxMeetings(int start[], int end[], int n)
    {
       ArrayList<Pair> a = new ArrayList<>();
       int count = 1 ;
       for (int i =0 ; i<n ; i++)
       {
           Pair p1 = new Pair (start[i], end[i]);
           a.add(p1);
       }
       
       Collections.sort(a);
       int prev = a.get(0).e ;
       for (int i =1; i<n ; i++){
           if (a.get(i).s>prev){
               count++ ;
               prev = a.get(i).e ;
           }
       }
       
       return count ;
   
        
    }
}
