class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        Map<String, Integer> mp = new HashMap<>();
       for(int i=0;i<arr.length;i++){
           if(mp.containsKey(arr[i]))
               mp.put(arr[i], mp.get(arr[i])+1);
           else
               mp.put(arr[i],1);
       }
       Map<Integer, String> mp1 = new HashMap<>();
       for(Map.Entry<String, Integer> e : mp.entrySet()){
           mp1.put(e.getValue(), e.getKey());
       }
       ArrayList<Integer> al = new ArrayList<>(mp1.keySet());
       Collections.sort(al);
       for(Map.Entry<Integer, String> e : mp1.entrySet()){
           if(e.getKey()==al.get(al.size()-2))
               return e.getValue();
       }
       return "";
    }
}
