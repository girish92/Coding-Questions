import java.io.*;
import java.util.*;

/*
 * Reverse digits of an integer.
 *
 *
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 *
 */

class ReverseInteger {
  public static void main(String[] args) {

    int x = -123;
    System.out.println(reverseInteger(x));
  }

  public static int reverseInteger(int num){
    int ans;
    boolean positive;
    if(num >= 0){
      positive = true;
    }else{
      positive = false;
    }

    String res = new String("");
    if(positive){
      if(num < 10 && num  >= 0){
        return num;
      }
      while(num > 9){
        int digit = num % 10;
        res = res.concat(Integer.toString(digit));
        //System.out.println(res);
        num /= 10;
      }
      res = res.concat(Integer.toString(num));
      ans = Integer.valueOf(res);
    }else{
      if(num > -10 && num < 0){
        return num;
      }

      num = Math.abs(num);
      while(num > 9){
        int digit = num % 10;
        res = res.concat(Integer.toString(digit));
        num /= 10;
      }
      res = res.concat(Integer.toString(num));
      ans = Integer.valueOf(res);
      ans *= -1;
    }
    return ans;
  }
}
