import java.io.*;
import java.util.*;

/*
 * Facebook Careercup
 *
 * Given an array of positive integers (excluding zero) and a target number,
 * detect whether there is a set of consecutive elements in the array that add
 * up to the target.
 *
 * Example: a = {1, 3, 5, 7, 9}
 * target = 8
 * output = true ({3, 5})
 *
 * OR
 *
 * target = 15
 * output = true : {3, 5, 7}
 * OR
 *
 * target = 6
 * output = false (1 and 5 are not next to each other)
 *
 *
 * =======================
 * Solution:
 * Keep 2 pointers at the ends of the array.
 * Assuming sorted array, increase lower pointer or
 * Decrease higher pointer till you get closer to the target
 *
 * Runtime = O(N)
 * No additional Space Complexity
 *
 */

class HasSet {
  public static void main(String[] args) {

    int[] arr = new int[]{1, 3, 5, 7, 9};
    int target = 8;

    hasSet(arr, target);

  }

  public static void hasSet(int[] arr, int target){

    int curSum = 0;
    boolean flag = false;
    for(int i = 0; i < arr.length; i++){
      curSum += arr[i];
    }

    int p1 = 0, p2 = arr.length-1;

    while(p1 <= p2){
      if(curSum - arr[p2] >= target){
        curSum -= arr[p2];
        p2 -- ;
      }else if(curSum - arr[p1] >= target){
        curSum -= arr[p1];
        p1++;
      }else{
        //If we cannot increase the lower pointer of decrease the higher pointer, we cannot get target. So break
        break;
      }
      if(curSum == target){
        System.out.print("true: ");
        flag = true;
        for(int i = p1; i <= p2; i++){
          System.out.print(arr[i] + " ");
        }
        System.out.println();
        break;
      }
    }

    if(!flag){
      System.out.println("false");
    }
  }
}
