import java.io.*;
import java.util.*;

/*
 * LeetCode.com
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 *
 * For example,
 * Given nums = [0, 1, 3] return 2.
 *
 * Your algorithm should run in linear runtime complexity. Could you
 * implement it using only constant extra space complexity?
 *
 *
 */

class MissingNumber {
  public static void main(String[] args) {

    int[] nums = new int[]{0,1,2,3,5};
    System.out.println(missingNumber(nums));

  }

  public static int missingNumber(int[] nums){
    int len = nums.length;
    int calculatedSum = len*(len+1) / 2;
    int sum = 0;

    for(int i = 0; i < nums.length; i++){
      sum += nums[i];
    }
    return calculatedSum - sum;
  }
}
