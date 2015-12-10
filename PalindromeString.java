import java.io.*;
import java.util.*;

/*
 * Check if a given string is Palindrome
 */

class PalindromeString {
  public static void main(String[] args) {
    String str = "A man, a plan, a canal, Panama";
    if(isPalindrome(str)){
      System.out.println("This is a Palindrome");
    }else{
      System.out.println("This is not a Palindrome");
    }
  }

  public static boolean isPalindrome(String strOriginal){

    String str = strOriginal.toLowerCase();
    if(str.length() == 0 || str.length() == 1){
      return true;
    }
    int leftPtr = 0;
    int rightPtr = str.length();

    while(leftPtr <= rightPtr){
      Character left = str.charAt(leftPtr);
      Character right = str.charAt(rightPtr-1);
      if(!Character.isDigit(left) && !Character.isLetter(left)){
        leftPtr++;
        continue;
      }
      if(!Character.isDigit(right) && !Character.isLetter(right)){
        rightPtr--;
        continue;
      }
      if(str.charAt(leftPtr) != str.charAt(rightPtr-1)){
        return false;
      }
      leftPtr++;
      rightPtr--;
    }
    return true;
  }
}
