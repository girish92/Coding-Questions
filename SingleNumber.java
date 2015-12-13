import java.io.*;
import java.util.*;

/*
 *  LeetCode.com
 *
 * Given an array of integers, every element appears twice except for one.
 * Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 *
 *
 */

class SingleNumber {
  public static void main(String[] args) {

    int[] nums = new int[]{1,2,3,4,3,4,1};
    System.out.println(singleNumber(nums));
  }

  public static int singleNumber(int[] nums){

    int res = nums[0];
    for(int i = 1; i < nums.length; i++){
      res ^= nums[i];
    }
    return res;
  }
}
