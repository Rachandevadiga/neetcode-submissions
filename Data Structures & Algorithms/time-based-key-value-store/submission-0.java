class TimeMap {

    record Pair(int timestamp, String value){}
    HashMap<String,ArrayList<Pair>> map= new HashMap<>();
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
         if(!map.containsKey(key))
         {
            map.put(key,new ArrayList<>());
         }
         map.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        {
            return "";
        }
        ArrayList<Pair> list  = map.get(key);
        int low=0;
        int high = list.size()-1;
        String ans = "";
        while(low<=high)
        {
            int mid=low+ (high-low)/2;
            if(list.get(mid).timestamp()==timestamp)
            {
                ans= list.get(mid).value();
                return ans;
            }
            else if(list.get(mid).timestamp()<timestamp)
            {
               ans= list.get(mid).value();
               low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
}
