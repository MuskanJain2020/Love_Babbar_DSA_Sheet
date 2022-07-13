class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
      Arrays.sort(arr);
      Arrays.sort(dep);
      int count = 1 ;
      int i =1 ;
      int j =0 ;
      while(i<n && j<n){
          if(arr[i]<=dep[j]){
              count++ ;
              i++;
              
          }
          else if (arr[i]>dep[j]){
              j++ ;
              i++ ;
          }
      }
      return count ;
    }
    
}

