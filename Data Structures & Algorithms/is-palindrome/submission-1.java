class Solution {
    public boolean isPalindrome(String s) {
        String cs="";
        for(int i=0;i<s.length();i++)
        {
            char x = s.charAt(i);
            if(Character.isLetterOrDigit(x))
            {
                cs=cs+Character.toLowerCase(x);
            }
        }
        
        if(cs.isEmpty())
        {return true;}
        int x = cs.length() -1;
       
        for(int i=0; i<=cs.length()/2;i++)
        {
            if(cs.charAt(i)!=cs.charAt(x-i))
            {
                return false;
            }
        }
        
    return true;
    }
}
