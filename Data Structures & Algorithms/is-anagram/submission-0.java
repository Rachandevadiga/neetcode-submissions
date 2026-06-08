

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        
        for (char x : s.toCharArray()) {
            sMap.put(x, sMap.getOrDefault(x, 0) + 1);
        }
        
       
        for (char x : t.toCharArray()) {
            tMap.put(x, tMap.getOrDefault(x, 0) + 1);
        }
        
        
        return sMap.equals(tMap);
    }
}
