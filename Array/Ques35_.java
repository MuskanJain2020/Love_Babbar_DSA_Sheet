class Solution
{
    public int find_median(int[] v)
    {
       int n = v.length;
       if (n== 0){
           return 0 ;
       }
     Arrays.sort(v);
     if (n%2 != 0){
         return v[n/2] ;  // After sorting the array middle element is the median
     }
     else {
         return   (v[n/2]+v[(n/2)-1])/2     ;           //In case of even number of elements, average of two middle elements is the median
     }
     
     
    }
}
