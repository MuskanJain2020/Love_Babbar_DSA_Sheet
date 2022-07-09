Class Solution{

    //Function to find the maximum profit and the number of jobs done.

    int[] JobScheduling(Job arr[], int n)

    {

       Arrays.sort(arr, (a,b)->(b.profit-a.profit));

        int maxi = 0;

        for(int i=0; i<n; i++){

           if(arr[i].deadline>maxi){

               maxi=arr[i].deadline;

            }

        }

        int[] res = new int[maxi+1];

        for(int i=1; i<=maxi; i++){

            res[i]=-1;

        }

        int countjobs=0; int jobprofit=0;

        for(int i=0; i<n; i++){

            for(int j=arr[i].deadline; j>0; j--){ //the idea is to try and place the job that we just picked towards the end as much as possible, of course if the slot is occupied by someother job then we can try an earlier day (as it is very important to get this profit being greedy)

               if(res[j]==-1){

                   res[j]=i;

                   countjobs++;

                   jobprofit+=arr[i].profit;

                    break;

                }

            }

        }

        int[] ans = new int[2];

       ans[0]=countjobs;

       ans[1]=jobprofit;

        return ans;

    }

}

