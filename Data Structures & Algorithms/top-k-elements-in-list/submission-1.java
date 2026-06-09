

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        
       
        for (int x : nums) {
            
            arr.put(x, arr.getOrDefault(x, 0) + 1);
        }
        
       List<int[]>farr = new ArrayList<>();
       for(Map.Entry<Integer,Integer> m: arr.entrySet())
       {
        farr.add(new int[] {m.getValue(),m.getKey()});
       }
       farr.sort((a,b) ->b[0]-a[0]);
       int[] res=new int[k];
       for(int i=0;i<k;i++)
       {
        res[i]=farr.get(i)[1];
       }
       return res;
    }
}
