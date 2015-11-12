import java.io.*;
import java.util.*;

/*
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number.
 *
 * The function twoSum should return indices of the two numbers such that
 * they add up to the target, where index1 must be less than index2. Please
 * note that your returned answers (both index1 and index2) are not zero-
 * based.
 *
 * You may assume that each input would have exactly one solution.
 *
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 *
 *
 */

class TwoSum {
  public static void main(String[] args) {

    //int[] arr = new int[]{2,7,11,15};
    //int target = 9;
    int[] arr = new int[]{3,2,4};
    int target = 6;

    int res[] = twoSum(arr, target);
    int index1 = res[0];
    int index2 = res[1];
    System.out.println("index1="+ index1 + ", index2=" + index2);
  }

  public static int[] twoSum(int[] arr, int target){

    int res[] = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i = 0; i < arr.length; i++){
      map.put(arr[i], i+1);
    }
    int index1 = 0;
    int index2 = 0;
    for(int i = 0; i < arr.length; i++){
      int num = target - arr[i];
      if(map.containsKey(num) && map.get(num)!=i+1){
        index1 = Math.min(i+1, map.get(num));
        index2 = Math.max(i+1, map.get(num));
        //System.out.println(arr[i] + " " + num);
        break;
      }
    }
    res[0] = index1;
    res[1] = index2;
    return res;
  }
}
