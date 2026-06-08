

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        if (s.length() == t.length()) 
        {     
        
        for (char x : s.toCharArray()) {
            sMap.put(x, sMap.getOrDefault(x, 0) + 1);
        }
        
       
        for (char x : t.toCharArray()) {
            tMap.put(x, tMap.getOrDefault(x, 0) + 1);
        }
        
        
        return sMap.equals(tMap);
        }
        return false;
    }
}
