class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int maxfreq=0;
        int maxlength=0;
        HashMap<Character,Integer> m = new HashMap<>();
        while(right< s.length())
        {
            char c=s.charAt(right);
            m.put(c,m.getOrDefault(c,0)+1);
            maxfreq=Math.max(maxfreq,m.get(c));
            while((right-left+1)-maxfreq >k)
            {
                char ch= s.charAt(left);
                m.put(ch,m.getOrDefault(ch,0)-1);
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
            right++;
        }
        
    return maxlength;
    }
}
