class Solution{
    static ArrayList<Integer> candyStore(int c[],int n,int k){
        // code here
          int i=0, j=n;
        int a=0, b=0;
        Arrays.sort(c);
        while(i<j){
            a=a+c[i];
            j=j-k;
            i++;
        }
        i=n-1;
        j=0;
        while(i>=j){
            b=b+c[i];
            j=j+k;
            i--;
        }
        return new ArrayList(Arrays.asList(a,b));
    }
}
