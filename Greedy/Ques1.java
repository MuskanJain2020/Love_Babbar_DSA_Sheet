// Using Priority Queue

class Activity{
    int s ;
    int f ;
    Activity(int s , int f ){
        this.s=s ;
        this.f= f ;
    }
    
}


class Solution
{
    public static int activitySelection(int start[], int end[], int n)
    {
        int res = 0 ;
PriorityQueue<Activity> pq = new PriorityQueue<>((p1,p2) -> p1.f-p2.f);
 for(int i=0; i<n; i++){
            pq.offer(new Activity(start[i],end[i]));
        }
            Activity temp = pq.poll() ;
            int first = temp.s;
            int  last = temp.f;
            res++;
            while(pq.isEmpty() != true ){
                Activity curr = pq.poll() ;
                if(curr.s >last){
                    last = curr.f;
                    res++ ;
                }
            }
            return res;
    }
}
