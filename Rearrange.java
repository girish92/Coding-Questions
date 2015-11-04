import java.io.*;
import java.util.*;

/*
 * Google Careercup
 *
 * Rearrange characters in a string so that no character repeats twice.
 *
 * Input: aaabc
 * Output: abaca
 *
 * Input: aa
 * Output: No valid output
 *
 * Input: aaaabc
 * Output: No valid output
 *
 */

class Rearrange {
  public static void main(String[] args) {

    String str = new String("aaabc");
    String str2 = new String("aa");
    String str3 = new String("aaaabc");

    System.out.println(rearrange(str));
    System.out.println(rearrange(str2));
    System.out.println(rearrange(str3));

  }

  public static String rearrange(String str){

    char[] arr = str.toCharArray();
    int len = str.length();
    int left = 1;
    char prev = arr[0];
    int prior = -1;
    int count = 0;

    while(left < len){
      if(arr[left] != prev){
        if(prior != -1) {
          char temp = arr[prior];
          arr[prior] = arr[left];
          arr[left] = temp;
          count--;
          prior+=2;
          if (count == 0) {
            prior = -1;
          }
        }
        prev = arr[left];
      }else{
        prior = (prior == -1) ? left : prior;
        count++;
      }
      left++;

    }
      if(count != 0){
        return "No valid output";
      }
    return new String(arr);
  }
}
