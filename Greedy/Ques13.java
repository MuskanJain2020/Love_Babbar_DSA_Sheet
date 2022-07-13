public class Island {

    public static  void survive(int n , int s , int m){
        if(m>s){
            System.out.println("No");

        }
       else if(m==s){
            System.out.println("yes" + n + "days");
        }

       else if (m<s){
          int  count = 1 ;
          int k = s ;
            for (int i =0 ; i<n ; i++){
                if (k>=m){
                   k= k-m ;
                }
                else if(k<m){
                    count++ ;
                    k = s+k ;

                }
            }
            System.out.println("yes" + count + "days");
        }
    }


    public static void main(String args[]){
               survive(10,16,2);
    }
}
