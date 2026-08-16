class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res= new int[temperatures.length];
        Deque<Integer>s1= new ArrayDeque<>();
        for(int i=0;i<temperatures.length;i++)
        {
            if(s1.isEmpty())
            {
                s1.push(i);
            }
            else if(temperatures[i]<=temperatures[s1.peek()])
            {
                s1.push(i);
            }
            else
            {
                
                while(!s1.isEmpty() && temperatures[i]>temperatures[s1.peek()])
                {
                    int x =s1.pop();
                    res[x]=i - x;

                }
                s1.push(i);
            }
        }
        return res;
    }
}
