import java.io.*;
import java.util.*;

/*
 * Given a string, find the length of the longest substring without repeating
 * characters. For example, the longest substring without repeating letters
 * for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest
 * substring is "b", with the length of 1.
 *
 *
 *
 */

class LongestSubstring {
  public static void main(String[] args) {

    String s = "abba";
    System.out.println(lengthOfLongestSubstring(s));
  }

  public static int lengthOfLongestSubstring(String s){

    Map<Character, Integer> map = new HashMap<Character, Integer>();

    int left = -1;
    int max_len = 0;
    int len = 0;
    for(int i = 0; i < s.length(); i++){
      if(!map.containsKey(s.charAt(i))){
        map.put(s.charAt(i), i);
        len++;
      }else{
        left = Math.max(map.get(s.charAt(i)), left);
        if(max_len < Math.max(len, i-left)){
          max_len = Math.max(len, i-left);
        }
        map.remove(s.charAt(i));
        map.put(s.charAt(i), i);
        len = i-left;
      }
    }
    return Math.max(max_len, len);
  }
}
