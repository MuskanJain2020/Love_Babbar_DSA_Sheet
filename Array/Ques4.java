//Approach 1 : First approach is to count no of 1s 0s and 2s and then iterate through array and based on their counts assingn in array
//Approach 2 : Using Switch Case Statements.


 static void sort012(int[] a, int arr_size)
    {
        int lo = 0;
        int hi = arr_size - 1;
        int m = 0, temp = 0;

        while (m <= hi) {
            switch (a[mid]) {
            case 0: {
                temp = a[lo];
                a[lo] = a[m];
                a[m] = temp;
                lo++;
                m++;
                break;
            }
            case 1:
                m++;
                break;
            case 2: {
                temp = a[m];
                a[m] = a[hi];
                a[hi] = temp;
                hi--;
                break;
            }
            }
        }
    }
