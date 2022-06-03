class Solution {
    public void reverseString(char[] a) {
        int l = 0;
        int h = a.length - 1 ;
        while(l<h){
            char temp = a[l];
            a[l] = a[h];
            a[h] = temp ;
            l++;
            h--;
        }
        
    }
}
