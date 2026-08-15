class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> res=new ArrayDeque<>();
        for(String x : tokens)
        {
            if(x.equals("+"))
            {
                int a= res.pop();
                int b= res.pop();
                res.push(a+b);
            }
            else if(x.equals("-"))
            {
                int a= res.pop();
                int b= res.pop();
                res.push(b-a);
            }
            else if(x.equals("*"))
            {
                int a= res.pop();
                int b= res.pop();
                res.push(a*b);
            }
            else if(x.equals("/"))
            {
                int a= res.pop();
                int b= res.pop();
                res.push(b/a);
            }
            else
            {
                int num= Integer.parseInt(x);
                res.push(num);
            }
        }
        return res.peek();
    }
}
