class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>charray=new HashMap<>();
        for(String x:strs)
        {
            char[] n=x.toCharArray();
            Arrays.sort(n);

            String key = new String(n);

            if(charray.containsKey(key))
            {
                List<String> z =charray.get(key);
                z.add(x);
                
            }
            else
            {List<String> newList = new ArrayList<>();
                newList.add(x);
                charray.put(key, newList);}
        }
        return new ArrayList<>(charray.values());

    }
}
