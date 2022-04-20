//Approach 1 : use sorting algorithm TC = O(nlogn)
// Approach 2 : using loop with condition

public class negpos {
	public static void negToPos(int [] arr , int n ){
		int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a [] = { -1 , -2 ,-3 , 4 ,5, -7} ;
      negToPos(a, 6);
	
	for (int i =0 ; i<6 ; i++) {
		System.out.print(a[i] + " ");
	}

	}}

      
