class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int num: stones)
        {
            pq.add(num);
        }
        while(pq.size()>1)
        {
            int x=pq.poll();
            int y= pq.poll();
            if(y<x)
            {
                pq.add(x-y);
            }

        }
        if(pq.isEmpty())
        {
            return 0;
        }
        else
        {
            return pq.peek();
        }
    }
}
