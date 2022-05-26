class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {  ArrayList<Integer> al = new ArrayList<Integer>();
        HashSet <Integer> hp = new HashSet <Integer>();
         HashSet <Integer> hp2 = new HashSet <Integer>();
          HashSet <Integer> hp3 = new HashSet <Integer>();
        for (int x : A){
            hp.add(x);
        }
        
        for (int y : B){
            if (hp.contains(y) == true){
                hp2.add(y);
            }
        }
        
        
        for (int z : C){
            if(hp2.contains(z) == true){
               hp3.add(z); 
            }
        }
        
        for (Integer t : hp3){
            al.add(t);
        }
        Collections.sort(al);
        return al ;
    }
}

// Time Complexity =  O(n1 + n2 + n3)
// Space Complexity = O(n1 + n2 + n3)
