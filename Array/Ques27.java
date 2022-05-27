
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashMap <Long, Integer>  hm = new HashMap<>();
        for (int i = 0 ; i< n ; i++){
            hm.put(a1[i] , hm.getOrDefault(a1[i] , 0)+1 ) ;
        }
        
        for (int i = 0 ; i<m ; i++){
            if(hm.containsKey(a2[i]) != true ){
                return "No" ;
            }
        }
        return "Yes" ;
    }
}
