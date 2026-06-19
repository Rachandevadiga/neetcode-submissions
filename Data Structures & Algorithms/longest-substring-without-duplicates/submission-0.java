class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int max=0;
        HashSet<Character> sub= new HashSet<>();
        for(int right =0; right<s.length();right ++)
        {
            while(sub.contains(s.charAt(right)))
            {
                sub.remove(s.charAt(left));
                left++;
            }
            sub.add(s.charAt(right));
            max=Math.max(max, (right-left)+1);
        }
        
    return max;
    }
}
