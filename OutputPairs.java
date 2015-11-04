import java.io.*;
import java.util.*;

/*
 * Facebook Careercup
 *
 * Given an array of positive, unique, increasingly sorted numbers A, e.g. A =
 * [1, 2, 3, 5, 6, 8, 9, 11, 12, 13]. Given a positive value K, e.g. K = 3.
 * Output all pairs in A that differ exactly by K.
 *
 * e.g. 2, 5
 * 3, 6
 * 5, 8
 * 6, 9
 * 8, 11
 * 9, 12
 *
 * What is the runtime for your code?
 *
 *
 * Runtime of code below: O(N)
 *
 */

class OutputPairs {
  public static void main(String[] args) {

    int[] arr = new int[]{1, 2, 3, 5, 6, 8, 9, 11, 12, 13};
    int k = 3;

    outputPairs(arr, k);

  }

  public static void outputPairs(int[] arr, int k){

    Set<Integer> st = new HashSet<Integer>();
    for(int i = 0; i < arr.length; i++){
      st.add(arr[i]);
    }

    for(int i = 0; i < arr.length; i++){
      if(st.contains(arr[i] + k)){
        int sum = arr[i] + k;
        System.out.println(arr[i] + ", " + sum);
      }
    }
  }

}
