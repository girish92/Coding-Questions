import java.io.*;
import java.util.*;

/*
 *  LeetCode.com
 *
 * Given an array of size n, find the majority element. The majority element
 * is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 *
 *
 */

class MajorityElement {
  public static void main(String[] args) {

    int[] nums = new int[]{1,2,3,3,2,3,2,2,3,2,2};
    System.out.println(majorityElement(nums));
  }

  public static int majorityElement(int[] nums){

    int count = nums.length / 2;
    Map<Integer, Integer> map = new HashMap<Integer,Integer>();

    for(int i = 0; i < nums.length; i++){
      int freq = 0;
      if(map.containsKey(nums[i])){
        freq = map.get(nums[i]);
        map.remove(nums[i]);
      }
      freq++;
      map.put(nums[i], freq);
      if(freq > count){
        return nums[i];
      }
    }
    return -1;
  }
}
