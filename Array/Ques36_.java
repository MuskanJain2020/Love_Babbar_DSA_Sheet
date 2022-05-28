class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        double a []= new double[n1 + n2];
        int i = 0 , j=0 , k = 0;
        double median = 0 ;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                a[k] = nums1[i];
                k++;
                i++;
            }
            else{ 
                a[k] = nums2[j];
                k++;
                j++;
                
            }
            
        }
        
        while(i<n1){
             a[k] = nums1[i];
                k++;
                i++;
        }
        while(j<n2){
             a[k] = nums2[j];
                k++;
                j++;
                
        }
         
        if((n1+n2)%2 == 0){
            median =a[(n1+n2)/2]/2+ a[(n1+n2-1)/2]/2 ;
            System.out.println(median);
            
        }else{
            median = a[(n1+n2)/2];
        }
        return median ;
        
        
        
        
    }
}
