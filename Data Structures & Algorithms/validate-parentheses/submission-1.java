class Solution {
    public boolean isValid(String s) {
        Deque<Character> valid= new ArrayDeque<>();
        for(char ch : s.toCharArray())
        {
            if(ch=='(' || ch=='{' || ch=='[')
            {
                valid.push(ch);
            }
            else if(ch==')')
            {
                if(valid.isEmpty())
                {
                    return false;
                }
                if(valid.peek()=='(')
                {
                    valid.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(ch=='}')
            {
                if(valid.isEmpty())
                {
                    return false;
                }
                if(valid.peek()=='{')
                {
                    valid.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(ch==']')
            {
                if(valid.isEmpty())
                {
                    return false;
                }
                if(valid.peek()=='[')
                {
                    valid.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(valid.isEmpty())
        {
            return true;
        }
        return false;
    }
}
