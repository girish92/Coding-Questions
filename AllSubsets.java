import java.io.*;
import java.util.*;

/*
 * Facebook
 *
 * Print all subsets of a given set
 *
 * E.g. set = [1,2,3]
 *
 * Output: {}, 1, 2, 3, {1,2}, {1,3}, {2,3}, {1,2,3}
 *
 * Iterative Solution
 * Time Complexity = O(n 2 ^ n)
 *
 *
 */

class AllSubsets {
  public static void main(String[] args) {

    int[] arr = new int[]{1,2,3};

    ArrayList<ArrayList<Integer>> lst = subsets(arr);

    for(int i = 0; i < lst.size(); i++){
      System.out.print("{ ");
      for(int j = 0; j < lst.get(i).size(); j++){
        System.out.print(lst.get(i).get(j) + " ");
      }
      System.out.println("}");
    }

  }

  public static ArrayList<ArrayList<Integer>> subsets(int[] arr){

    int len = arr.length;
    ArrayList<ArrayList<Integer>> lst = new ArrayList<ArrayList<Integer>>();

    // 2^n subsets can be formed from an array of size n
    int size = (int)Math.pow(2, len);

    for(int i = 0; i < size; i++){
      String num = Integer.toBinaryString(i);
      ArrayList<Integer> inner = new ArrayList<Integer>();
      // Iterate from (2^n)-1 to 0
      for(int j = num.length()-1; j >= 0; j--){
        // 1 represents that this subset has this element
        if(Integer.valueOf(num.charAt(j)+"") == 1){
          inner.add(arr[num.length()-1-j]);
        }
      }
      lst.add(i, inner);
    }
    return lst;
  }
}
