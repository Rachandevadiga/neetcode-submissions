class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int i =0;
        
        for(int x :nums)
        {
            int diff = target  - x;
            if(map.containsKey(diff))
            {
                
                return new int[] {map.get(diff),i};
            }
            map.put(x,i);
            i++;
        }
        return new int[] {-1,-1};
    }
}
