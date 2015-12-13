import java.io.*;
import java.util.*;

/*
 * Given an array nums, write a function to move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 *
 *
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function,
 * nums should be [1, 3, 12, 0, 0].
 *
 * 1. You must do this in-place without making a copy of the array.
 * 2. Minimize the total number of operations.
 *
 *
 */

class MoveZeros {
  public static void main(String[] args) {

    int[] arr = new int[]{0,1,0,3,12};
    int[] res = new int[arr.length];

    res = moveZeros(arr);

    for(int i = 0; i < res.length; i++){
      System.out.println(res[i]);
    }
  }

  public static int[] moveZeros(int[] arr){
    int pointer = 0;
    boolean set = false;
    for(int i = 0; i < arr.length; i++){
      if(!set && arr[i] == 0){
        pointer = i;
        set = true;
        continue;
      }
      if(set && arr[i] != 0){
        int tmp = arr[i];
        arr[i] = arr[pointer];
        arr[pointer] = tmp;
        pointer++;
      }
    }
    return arr;
  }
}
