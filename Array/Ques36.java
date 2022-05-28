class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        
        
     if (m>n){
         return medianOfArrays(m , n , b , a) ;
     }
     
    int l = 0 ;
    int h =m  ;
    double res = 0.00 ;
    
    
    while(l<=h){
        int c1 =( h+l)/2 ;
        int c2 = (n+m+1)/2 -c1 ;
        int l1 = c1==0 ? Integer.MIN_VALUE : b[c1-1] ;
        int l2 = c2==0 ? Integer.MIN_VALUE : a[c2-1] ;
        int r1 = c1==m? Integer.MAX_VALUE : b[c1] ;
        int r2 = c2==n? Integer.MAX_VALUE : a[c2] ;
        
        if (l1<=r2 && l2<=r1){
            if ((n+m)%2 == 0){
                res = Math.max(l1,l2) + Math.min(r1,r2);
                res = res/2.0 ;
                return res ;
            }
            else{
                res = Math.max(l1,l2) ;
                return res ;
            }
        }
        
        else if (l1>r2){
            h = c1 -1 ;
        }
        
        else {
             l = c1+1 ;
        }
        
           
        
    } 
       return res ; 
  
        
    }
}// TC = O(min(log n, log m)).
