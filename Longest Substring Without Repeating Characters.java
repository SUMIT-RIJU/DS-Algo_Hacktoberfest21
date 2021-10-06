class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == "" || s.length()==1){
            return s.length();
        }
        String result = "";
        
        int maxLen = 0;
        for(char ch : s.toCharArray()){
            
            String str = String.valueOf(ch);
            
            if(result.contains(str)){
                result = result.substring(result.indexOf(str)+1);
            }
            result += str;
            maxLen = Math.max(maxLen, result.length());
        }
        
        return maxLen;
    }
}
