import java.io.*;
import java.util.*;

/*
 * LeetCode.com
 *
 * Given a non-negative integer num, repeatedly add all its digits until the
 * result has only one digit.

 * For example:

 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has
 * only one digit, return it.
 *
 */

class AddDigits {
  public static void main(String[] args) {

    int num = 9991;
    System.out.println(addDigit(num));
    System.out.println(digitalRoot(num));
  }

  //Method using while loop
  public static int addDigit(int num){

    int count = 0;
    while(num > 9){
      while(num > 9){
        count += num % 10;
        num /= 10;
      }
      num = count + num;
      count = 0;
    }
    return num;
  }

  //Method using formula - O(1) Constant time
  public static int digitalRoot(int num){
    return num - 9*(int)(Math.floor((num-1) / 9));
  }
}
