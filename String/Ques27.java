class Solution {
    public String longestCommonPrefix(String[] arr) {
         int min = arr[0].length();
        int  n = arr.length ;
        for (int i = 1; i < n; i++)
        {
            if (arr[i].length() < min)
            {
                min = arr[i].length();
            }
        }
         String result = ""; // Our resultant string
        char current; // The current character
 
        for (int i = 0; i < min; i++)
        {
            // Current character (must be same
            // in all strings to be a part of
            // result)
            current = arr[0].charAt(i);
 
            for (int j = 1; j < n; j++)
            {
                if (arr[j].charAt(i) != current)
                {
                    return result;
                }
            }
 
            // Append to result
            result += (current);
        }
 
        return (result);
 
    }
}
