import java.io.*;
import java.util.*;

/*
 * LeetCode.com
 *
 * Given two strings s and t, write a function to determine if t is an
 * anagram of s.
 *
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 *
 *
 * You may assume the string contains only lowercase alphabets.
 *
 */

class ValidAnagram {
  public static void main(String[] args) {
    String s = new String("anagram");
    String t = new String("nagaram");
    System.out.println(isAnagram(s,t));
  }

  public static boolean isAnagram(String s, String t){

    if(s.length() != t.length()) return false;

    int[] arr = new int[256];
    Arrays.fill(arr, 0);

    for(int i = 0; i < s.length(); i++){
      char c = s.charAt(i);
      arr[(int)c]++;
    }
    for(int i = 0; i < t.length(); i++){
      char c = t.charAt(i);
      arr[(int)c]--;
    }
    for(int i = 0; i < arr.length; i++){
      if(arr[i] != 0) return false;
    }
    return true;
  }
}
