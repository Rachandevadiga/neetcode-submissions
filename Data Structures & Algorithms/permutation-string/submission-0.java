class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Set<List<Character>> set= new HashSet<>();
        List<Character> substr= new ArrayList<>();
        for(int i =0; i < s1.length();i++)
        {
            substr.add(s1.charAt(i));
        }
        Collections.sort(substr);
        set.add(substr);
        substr=new ArrayList<>();
        int right=0;
        int left=0;
        while(right<s2.length())
        {
            char c=s2.charAt(right);
            substr.add(c);
            
            if(right-left+1 == s1.length())
            {
                List<Character> copy = new ArrayList<>(substr);
                Collections.sort(copy);
                if(set.contains(copy))
                {
                    return true;
                }
                else
                {
                    char ch=s2.charAt(left);
                    substr.remove((Character)ch);
                    left++;
                }
            }
            right++;
            
        }
    return false;
    }
}
