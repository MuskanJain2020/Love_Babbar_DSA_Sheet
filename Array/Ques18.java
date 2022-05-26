class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
          int res = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++)
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        for (int i = 0; i < n; i++) {
            int x = k - arr[i];
            if (hm.containsKey(x)) {
                hm.put(arr[i], hm.get(arr[i]) - 1);
                res += hm.get(x);
            }
        }
        return res;
    }
}
