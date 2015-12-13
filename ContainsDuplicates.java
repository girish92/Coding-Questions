import java.io.*;
import java.util.*;

/*
 *  LeetCode.com
 *
 *
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in
 * the array, and it should return false if every element is distinct.
 *
 *
 */

class ContainsDuplicates {
  public static void main(String[] args) {

    int[] nums = new int[]{1,2,3,4,5,6,21,9};
    System.out.println(containsDuplicate(nums));
  }

  public static boolean containsDuplicate(int[] nums){

    HashSet<Integer> set = new HashSet<Integer>();
    for(int i = 0; i < nums.length; i++){
      if(set.contains(nums[i])) return true;
      set.add(nums[i]);
    }
    return false;
  }
}
