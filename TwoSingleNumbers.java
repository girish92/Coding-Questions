import java.io.*;
import java.util.*;

/*
 *  LeetCode.com
 *
 * Given an array of numbers nums, in which exactly two elements appear only
 * once and all the other elements appear exactly twice. Find the two
 * elements that appear only once.
 *
 * For example:
 *
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 *
 *
 */

class TwoSingleNumbers {
  public static void main(String[] args) {

    int[] nums = new int[]{1,2,3,4,3,5,4,1};
    int[] res = singleNumber(nums);
    for(int i = 0; i < res.length; i++){
      System.out.print(res[i] + " ");
    }
  }

  public static int[] singleNumber(int[] nums){

    /*xor all elements*/
    int xor = nums[0];
    for(int i = 1; i< nums.length; i++){
      xor ^= nums[i];
    }
    /*store single set bit of xor*/
    int set_bit = xor & ~(xor-1);
    int a = 0,b = 0;
    /* Divide elements in two sets by comparing rightmost set
    bit of xor with bit at same position in each element. */
    for(int i = 0; i < nums.length; i++){
      if((set_bit & nums[i]) != 0){
        a ^= nums[i];
      }else{
        b ^= nums[i];
      }
    }
    int[] res = new int[]{a,b};
    return res;
  }
}
