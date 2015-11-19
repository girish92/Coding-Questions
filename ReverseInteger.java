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

class Solution {
  public static void main(String[] args) {

    int x = -214;
    System.out.println(reverseInteger(x));
  }
  
  public static int reverseInteger(int num){
    int ans;
    boolean positive;
    if(num >= 0){
      positive = true;
      if(num < 10 && num  >= 0){
        return num;
      }
    }else{
      positive = false;
      if(num == Math.abs(num)){
        return 0;
      }
      num = Math.abs(num);
    }

    String res = new String("");
    while(num > 9){
      int digit = num % 10;
      res = res.concat(Integer.toString(digit));
      num /= 10;
    }
    res = res.concat(Integer.toString(num));
    ans = convertToInt(res);

    if(!positive){
      ans *= -1;
    }
    return ans;
  }

  public static int convertToInt(String str){
    int res = 0;
    try{
      res = Integer.parseInt(str);
    }catch(NumberFormatException e){
      return 0;
    }
    return res;
  }
}
