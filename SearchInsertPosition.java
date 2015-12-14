import java.io.*;
import java.util.*;
import java.math.*;

/*
 * LeetCode.com
 *
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 *
 * You may assume no duplicates in the array.
 *
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 *
 */


class SearchInsertPosition {
  public static void main(String[] args) {
    
    int[] arr = new int[]{1,3,5,6};
    int target = 5;
    System.out.println(searchInsert(arr, target));
  }

  public static int searchInsert(int[] nums, int target){
    if(target <= nums[0]){
      return 0;
    }
    for(int i = 1; i < nums.length; i++){
      if(target == nums[i] || (target > nums[i-1] && target < nums[i])){
        return i;
      }
    }
    return nums.length;
  }
}
