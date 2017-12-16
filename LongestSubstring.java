/*
LeetCode

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


*/

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0 || s.length() == 1){
            return s.length();
        }
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        int max_len = 0;
        int len = 0;
        int ptr = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int start = map.get(c);
                ptr = Math.max(start, ptr);
                if(max_len < len){
                    max_len = len;
                }
                len = i - ptr;
            }else{
                len++;
            }
            map.put(c, i);
        }
        max_len = Math.max(max_len, len);
        return max_len;
        
    }
}