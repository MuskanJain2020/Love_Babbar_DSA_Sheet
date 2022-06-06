class Sol
{
    int countRev (String s)
    {
        if(s.length()%2!=0) //Odd number of brackets cannot be balanced
            return -1;
            
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            
            if(c=='{')
            {
                st.push(c);
            }
            
            else //if c = '}'
            {
                //if stack is empty it means that the bracket has to be reversed
                //since there cannot be a closing bracket without an opening one.
                if(st.isEmpty()) 
                {
                    st.push('{');
                    count++;
                }
                
                //if the stack is not empty, it means that only '{' are present in the stack
                else
                {
                    st.pop();
                }
            }
        }
        
        if(s.isEmpty())
            return count;
            
         //if the stack is not empty, it means that 
         //only '{' are present in the stack
         //even number of brackets are present
         //changing half of them to '}' will make them balanced.
        else
        {
            int sizeOfStack=st.size();
            return count+(sizeOfStack/2);    
        }
      
    }
}
