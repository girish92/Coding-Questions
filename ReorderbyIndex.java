import java.io.*;
import java.util.*;

/*
 * Facebook Careercup
 *
 * We have an array of objects A and an array of indexes B. Reorder objects in
 * array A with given indexes in array B. Do not change array A's length.
 *
 *
 * In this Question, we will make the Object array a character array
 *
 *
 * Time Complexity = O(N)
 * Space Complexity = O(1)
 *
 */

class ReorderbyIndex {
  public static void main(String[] args) {

    char[] A = new char[]{'A', 'B', 'C', 'D', 'E'};
    int[] B = new int[]{2, 0, 4, 3, 1};

    char[] res = reorder(A, B);
    System.out.println(Arrays.toString(res));

  }

  public static char[] reorder(char[] A, int[] B){

    for(int i = 0; i < A.length; i++){
      if(i != B[i]){
        swapObj(A, i, B[i]);
        swapPos(B, i, B[i]);
      }
    }
    return A;
  }

  public static void swapObj(char[] A, int cur, int end){

    char obj = A[cur];
    A[cur] = A[end];
    A[end] = obj;

  }

  public static void swapPos(int[] B, int cur, int end){

    int temp = B[cur];
    B[cur] = B[end];
    B[end] = temp;

  }

}
