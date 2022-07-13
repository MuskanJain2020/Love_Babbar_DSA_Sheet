class Pair implements  Comparable<Pair>{
    int key ;
    int value ;
    Pair(int key , int value){
        this.key = key ;
        this.value = value ;
    }
    
     public int compareTo (Pair p){
           return this.value-p.value ;
       }
    
}

class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
       
       ArrayList<Pair> al = new ArrayList<>();
       for (int i =0 ; i<n ; i++){
           al.add(new Pair(i+1 , price[i] )) ;
       }
       Collections.sort(al);
       if(k<al.get(0).value){
           return 0 ;
       }
        
        
        
        
       int j = 0 ;
       int count = 0 ;
       while(k!=0 &&  j<n){
          if(al.get(j).value * al.get(j).key <= k){
              k = k-al.get(j).value * al.get(j).key ;
              count = count + al.get(j).key ;
              if(k==0){
                  break ;
              }}
              else {
                  int t  = al.get(j).value * al.get(j).key ;
                  int y = al.get(j).key;
                  while( t>k){
                      t =t -al.get(j).value ;
                      y--  ;
                  }
                  count = count + y ;
                  break ;
              }
             j++ ;  
          }
         
          
       
       
       return count ;
       
       
       
        
    }
}
        
