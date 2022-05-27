class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   Arrays.sort(arr);
	   int count  = 1;
	   int maxcount = 0;
	   if(N==1){
	       return 1 ;
	   }
	   for (int i =0 ; i<N-1 ; i++){
	       if (arr[i + 1] == arr[i] +1 ){
	           count++ ;
	       }
	       
	       else if (arr[i + 1] == arr[i]){
	          
	       }
	       
	       else{
	           count = 1 ;
	       }
	       
	       maxcount = Math.max(count , maxcount);
	       
	   }
	   return maxcount ;
	}
	
}
