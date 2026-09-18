class KthLargest {

    PriorityQueue<Integer> hp;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        hp=new PriorityQueue<>();
        for(int num : nums)
        {
            hp.offer(num);
            if(hp.size()>k)
            {
                hp.poll();
            }
        }
    }
    
    public int add(int val) {
        hp.add(val);
        if(hp.size()>k)
        {
            hp.poll();
        }
        return hp.peek();
    }

}
