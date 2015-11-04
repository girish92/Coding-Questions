import java.io.*;
import java.util.*;

/*
 * Facebook Careercup
 *
 * Given an array of integers. Modify the array by moving all the zeros to the
 * end (right side). The order of the other elements doesn't matter.
 *
 *
 * Time Complexity = O(N)
 * Space Complexity = O(1)
 *
 */

class PushZerosToEnd {
  public static void main(String[] args) {

    int[] arr = new int[]{1,0,0,5,7,0,2,0,19,1,0,0,9,0};

    int[] res = pushZerosToEnd(arr);
    System.out.println(Arrays.toString(res));

  }


  public static int[] pushZerosToEnd(int[] arr){

    int pointer = updatePointer(arr, arr.length);

    for(int i = 0; i < arr.length; i++){
      if(arr[i] == 0 && i <= pointer){
        int temp = arr[i];
        arr[i] = arr[pointer];
        arr[pointer] = temp;
        pointer = updatePointer(arr, pointer);
        if(pointer <= i) break;
      }
    }
    return arr;
  }

  public static int updatePointer(int[] arr, int index){

    for(int i = index-1; i >= 0; i--){
      if(arr[i] != 0){
        return i;
      }
    }
    return -1;
  }
}
