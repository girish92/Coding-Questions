import java.io.*;
import java.util.*;

/*
 * Determine whether an integer is a palindrome.
 * Do this without extra space.
 *
 *
 *
 */

class PalindromeNumber {
  public static void main(String[] args) {

    int x = 15351;
    //System.out.println(x);
    System.out.println(isPalindrome(x));
  }

  public static boolean isPalindrome(int num){
    String str = Integer.toString(num);
    int len = str.length();
    for(int i = 0; i < str.length()/2; i++){
      if(str.charAt(i) != str.charAt(len-i-1)){
        return false;
      }
    }
    return true;
  }
}
