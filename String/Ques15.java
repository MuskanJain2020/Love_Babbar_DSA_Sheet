class Solution{
    static List<Integer> nextPermutation(int N, int a[]){
        // code here
        List<Integer>  l = new ArrayList<>();
        int index1 = -1 ;
        int index2 = -1 ;
        for (int i =N-1 ; i>0; i--){
            if(a[i-1] <a[i]  ){
              index1 = i-1  ;
              break ;
            }
            
        }
        
        
        if (index1 == -1){
            
            
                 for (int i =N-1 ; i>=0 ; i--){
                     l.add(a[i]);
                 }
                 
                 return l;
        }
        
   
        for (int i =N-1 ; i>index1; i--){
            if(a[i] > a[index1] ){
              index2 = i  ;
              break ;
            }
            
        }
        
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp ;
        
        
        
       
      
      Arrays.sort(a, index1+1, N);
      
        for (int i =0 ; i<N ; i++){
                     l.add(a[i]);
                 }
                 
                 return l;
           
      
    }
}
