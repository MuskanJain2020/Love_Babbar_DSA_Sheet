class Solution 
{ 
    String printSequence(String S) 
    { 
        HashMap<Character , Integer> hm = new HashMap <>();
        String ans ="";
        hm.put('A',2);
       hm.put('B',22);
       hm.put('C',222);
       hm.put('D',3);
       hm.put('E',33);
       hm.put('F',333);
       hm.put('G',4);
       hm.put('H',44);
       hm.put('I',444);
       hm.put('J',5);
       hm.put('K',55);
       hm.put('L',555);
       hm.put('M',6);
       hm.put('N',66);
       hm.put('O',666);
       hm.put('P',7);
       hm.put('Q',77);
       hm.put('R',777);
       hm.put('S',7777);
       hm.put('T',8);
       hm.put('U',88);
       hm.put('V',888);
       hm.put('W',9);
       hm.put('X',99);
       hm.put('Y',999);
       hm.put('Z',9999);
       hm.put(' ',0);
       for(char ch:S.toCharArray()){
       ans = ans +hm.get(ch) ;}
       return  ans;
    }
}
