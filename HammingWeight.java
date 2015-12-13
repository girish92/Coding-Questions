import java.io.*;
import java.util.*;

/*
 *  LeetCode.com
 *
 * Write a function that takes an unsigned integer and returns the number of
 * ’1' bits it has (also known as the Hamming weight).
 *
 * For example, the 32-bit integer ’11' has binary representation
 * 00000000000000000000000000001011, so the function should return 3.
 *
 *
 */

class HammingWeight {
  public static void main(String[] args) {
    int num = 11;
    System.out.println(hammingWeight(num));
  }

  public static int hammingWeight(int n){
    
    String bits = Integer.toBinaryString(n);
    int count = 0;
    for(int i = 0; i < bits.length(); i++){
      if(bits.charAt(i) == '1') count++;
    }
    return count;
  }
}
