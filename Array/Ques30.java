class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
     Collections.sort(a);
     int min = Integer.MAX_VALUE ;
     
     for (int i=0 ; i<n-m+1 ; i++){
    int diff = a.get(i+m-1) - a.get(i);
  if(min>diff)
  {
   min = diff;
  }
 }
 return min;
         
     }
     
    
}
