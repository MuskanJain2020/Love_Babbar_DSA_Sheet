class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int a[], int n) { 
        
        int left = 0 ;
        int right = n-1 ; 
        int maxleft = 0 ; 
        int maxright = 0 ; 
        
    long res = 0 ;
        
        while (left <= right ){
            if (a[left] <= a[right]){
                if (a[left] >= maxleft){
                    maxleft = a[left];
                    
                }else{
                   res =  res + maxleft - a[left];
                    
                }
                left++;
            }
            
            else {
               
                if (a[right] >= maxright){
                    maxright = a[right];
                    
                }else{
                   res =  res + maxright - a[right];
                    
                }
                right-- ;
            }
        }
        
        return res ;
    } 
}
