class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
        {return "";}
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0; i<t.length();i++)
        {
            char c=t.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> map2= new HashMap<>();
        int left=0;
        int right=0;
        int maxlength=Integer.MAX_VALUE;
        int need=t.length();
        int have=0;
        int[] res = new int[2]; 
        while(right<s.length())
        {
            char current=s.charAt(right);
            if(map.containsKey(current))
            {
                map2.put(current,map2.getOrDefault(current,0)+1);
                if(map2.get(current)<=map.get(current))
                {
                    have++;
                }

            }
            while(have==need)
            {
                
                while(!map.containsKey(s.charAt(left)))
                {
                    left++;
                }
                char currlef=s.charAt(left);
                map2.put(currlef,map2.getOrDefault(currlef,0)-1);
                if(map2.get(currlef)<map.get(currlef))
                {
                    have--;
                }
                if(right-left+1<=maxlength)
                {
                    res[1]=right;
                    res[0]=left;
                    maxlength=right-left+1;
                }
                left++;
            }
            
            right++;
        }
       
      if (maxlength == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(res[0],res[1]+1);
    }
}
