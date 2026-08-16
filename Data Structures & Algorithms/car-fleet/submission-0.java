class Solution {
    public int carFleet(int target, int[] position, int[] speed) 
    {
        record Pair(int pos, int speed){}
        List<Pair> sorted=new ArrayList<>();
        Deque<Pair> res = new ArrayDeque<>();
        for(int i=0;i<position.length;i++)
        {
            sorted.add(new Pair(position[i],speed[i]));
        }
        sorted.sort(Comparator.comparingInt(p->p.pos));
        for(int i=position.length-1;i>=0;i--)
        {
            Pair car=sorted.get(i);
            if(res.isEmpty())
            {
                res.push(car);
            }
            else
            {
                double currtime=(double)(target - car.pos())/car.speed();
                Pair prevcar=res.peek();
                double prevtime=(double)(target - prevcar.pos())/prevcar.speed();
                if(currtime>prevtime)
                {
                    res.push(car);
                }
                else
                {
                    continue;
                }

            }
        }
        return res.size();
    }
}
