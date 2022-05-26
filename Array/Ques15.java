class Solution {
    public void nextPermutation(int[] nums) {
      int  index1 = -1;
      int  index2 = -1;
       
        for (int i = nums.length-2 ; i>=0 ; i--){
            if (nums[i] < nums[i +1]){
                index1 = i ;
                break ;
            }
            
        }
        if (index1 == -1){
            Arrays.sort(nums);
            return ;
        }
        for (int i = nums.length-1 ; i>=index1 ; i--){
            if (nums[i] > nums[index1]){
                index2 = i ;
                break ;
            }
        }
        
        int temp = nums[index1];
        nums[index1] = nums[index2] ;
        nums[index2] = temp ;
        
       int l = index1+1 ;
       int h = nums.length-1 ;
        while (l<=h){
            temp = nums[l];
            nums[l] = nums[h];
            nums[h]= temp ;
            l++ ;
            h--;
        }
        
        
        
        
        
        
        
        
    }
}
