class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}


class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {    double res = 0 ;
         Arrays.sort(arr, (a,b)->((b.value*a.weight)-(a.value*b.weight)));
         
         for(int i =0 ; i<n ; i++){
             if(arr[i].weight < W){
                 res = res + arr[i].value;
                 W = W - arr[i].weight ;
             }
             
             else if (arr[i].weight >=  W){
                 res = res + arr[i].value * ((double)W/(double)arr[i].weight) ;
                 break ;
             }
         }
         return res ;
    }
}
