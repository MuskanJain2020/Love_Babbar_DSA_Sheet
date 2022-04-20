// Approach 1 : initialise a hashset and copy elements of both array 
                 TC = O(m+n)
// Approach 2 : Initialize union U as empty.Find smaller m and n and sort the smaller array.Copy the smaller array to U.
//For every element x of a larger array, do the following Binary Search x in the smaller array. If, x is not present, then copy it to U.Return U.
// TC = O(m*logn)
                   
                   
                   
                   
public static void unionIntersection(int a[] , int b[] , int m , int n){
   HashSet<Integer> hp = new HashSet<>();
   List<Integer> union = new ArrayList<>();
    List<Integer> intersection = new ArrayList<>();
      for (int i = 0 ; i<m ; i++){
     hp.add(a[i]);
     union.add(a[i]);
      }
     for (int i = 0 ; i<n ; i++){
     if (hp.contains(b[i] == true){
       intersection.add(b[i]);}
      else if(hp.contains(b[i]) != true){
         union.add(b[i]);
     }
         }}
        
      
     
