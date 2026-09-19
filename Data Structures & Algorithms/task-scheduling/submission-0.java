class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count=new int[26];
        for(char x : tasks)
        {
            count[x - 'A']++;
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
        for(int x : count)
        {
            if(x>0)
            {
                pq.add(x);
            }
        }
        int time = 0;
        while(!pq.isEmpty())
        {
            ArrayList<Integer> t = new ArrayList<>();

            for(int i=0;i<n+1;i++)
            {
                if(!pq.isEmpty())
                {
                    int freq = pq.poll();
                    freq--;
                    if(freq>0)
                    {
                        t.add(freq);
                    }

                    time++;
                }
                else
                {
                    if(t.isEmpty())
                    {
                        break;
                    }
                    time++;
                }
            }
            for(int x : t)
            {
                pq.add(x);
            }
        }
        return time;
    }
}
