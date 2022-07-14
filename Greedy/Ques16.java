class Solution {

    public static long maximizeSum(long a[], int n, int k)
    {
        // Your code goes here  
        PriorityQueue<Long> heap = new PriorityQueue<>();
        
        for(long e : a) {
            heap.add(e);
        }        
        
        if(heap.peek() > 0) {
            if(k == 1 || k % 2 != 0) {
                heap.add(heap.remove() * -1);
            }
        } else {
            for(int i = 0; i < k; ++i) {
                heap.add(heap.remove() * -1);
            }
        }
        
        int sum = 0;
        while(!heap.isEmpty()) {
            sum += heap.remove();
        }
        
        return sum;
    }
}
