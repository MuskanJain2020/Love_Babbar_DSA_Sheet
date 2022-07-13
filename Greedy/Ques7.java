import java.util.Arrays;

public class test {

    public static void main(String args[]){
        train arr[] = new train[5];
        arr[0] = new train(1000, 1030, 1);
        arr[1] = new train(1010, 1020, 1);
        arr[2] = new train(1025, 1040, 1);
        arr[3] = new train(1130, 1145, 2);
        arr[4] = new train(1130, 1140, 2);

        solution.fun(arr , 5);
          System.out.println( solution.fun(arr , 5));
    }
}

class train {
    int arrival ;
    int depart ;
    int p ;
    train(int arrival , int depart , int p){
        this.arrival = arrival;
        this.depart = depart ;
        this.p = p ;
    }

}
class solution{


    public static int fun(  train arr[] , int n){
        Arrays.sort(arr , (a,b)->(a.depart -b.depart ));
        int plat = 0 ;
        for (int i =0 ; i<n ; i++){
            if (arr[i].p >plat){
                plat= arr[i].p ;
            }
        }
        int plats [] = new int[plat+1];
        for (int k =0 ; k<plat+1 ; k++){
            plats[k] = -1 ;
        }
        int count = 1 ;
        int prev = arr[0].depart ;
        plats[arr[0].p] = prev ;
        for(int i = 1; i<n ; i++){
           if( plats[arr[i].p] == -1){
               plats[arr[i].p] =arr[i].depart;
             
               count++ ;
           }
           else if ( plats[arr[i].p] < arr[i].arrival ){
             
               plats[arr[i].p] = arr[i].depart ;
               count++ ;
           }
        }
        return count ;
    }







}
