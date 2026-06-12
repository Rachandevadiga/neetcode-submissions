class Solution {

    public String encode(List<String> strs) {
        
        String encode = "";
        for(String x:strs)
        {
            encode= encode +"?"+"/"+x;
        }
        return encode;

    }

    public List<String> decode(String str) {
        List<String>result=new ArrayList<>();
        
        
        String res ="";
        for(int i=2;i<str.length();i++)
        {
            char x = str.charAt(i);

            if(i==str.length()-1)
            {
                res=res+x;
                result.add(res);
                res="";
                break;
            }
            if(str.charAt(i)=='?' && str.charAt(i+1)=='/')
            {
                
                result.add(res);
                res="";
                i=i+1;
                continue;
            }
         
            res=res+x;
        }
        if(str.endsWith("?/"))
        {
            result.add(res);
        }
    return result;
    }
}
