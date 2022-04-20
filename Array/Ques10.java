
class Solution{
    static int minJumps(int[] a){
        // your code here
        int n = a.length;
        if(n==1)return 0;
        if(a[0]==0)return -1;
        if(a[0]>n)return 1;
     
        int maxstep = a[0];
        int step = a[0];
        int jump =1 ;
        
        for (int i =1 ; i<n ; i++){
            if(i==n-1){
                return jump ;
            }
            maxstep = Math.max(maxstep , i+a[i]);
            step -- ;
            if (step ==0 ){
                jump++ ;
                if(i>=maxstep){return -1 ;}
                step = maxstep -i ;
            }
        }
        
    return -1 ;
    }
}

