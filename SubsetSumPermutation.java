import java.io.*;
import java.util.*;

/*
 * Facebook Careercup
 *
 * On a given array with N numbers, find subset of size M (exactly M elements)
 * that equal to SUM
 *
 * This solution shows the permutation approach
 *
 *
 * Time Complexity = O(n C m) where n = N and m = M
 *
 *
 */

class SubsetSumPermutation {
  public static void main(String[] args) {

    int[] arr = new int[]{1,4,2,5,9,7,6};
    int N = 7;
    int M = 3;
    int SUM = 9;

    //int [] res = findSubset(arr, N, M, SUM);
    //System.out.println(Arrays.toString(res));
    findSubset(arr, N, M, SUM);


  }

  public static void findSubset(int[] arr, int n, int m, int sum){

    ArrayList<Integer> array = new ArrayList<Integer>();

    for(int i = 0; i < arr.length; i++){
      array.add(arr[i]);
    }

    ArrayList<Integer> temp = new ArrayList<Integer>();
    findSubset(temp, array, m, sum);

  }

  public static void findSubset(ArrayList<Integer> temp, ArrayList<Integer> arr, int m, int sum){
    int len = temp.size();
    if(len == m && checkSum(temp, sum)){
      for(int i = 0; i < len; i++){
        System.out.print(temp.get(i) + " ");
      }
      System.out.println();
    }else{
      for(int i = 0; i < arr.size(); i++){
        ArrayList<Integer> cur_arr = new ArrayList<Integer>();
        ArrayList<Integer> cur_temp = new ArrayList<Integer>();
        cur_arr.addAll(arr.subList(0, i));
        cur_arr.addAll(arr.subList(i+1, arr.size()));

        for(int j = 0; j < temp.size(); j++){
          cur_temp.add(temp.get(j));
        }
        cur_temp.add(arr.get(i));
        findSubset(cur_temp, cur_arr, m, sum);
      }
    }

  }

  public static boolean checkSum(ArrayList<Integer> temp, int sum){

    int cur_sum = 0;
    for(int i = 0; i < temp.size(); i++){
      cur_sum += temp.get(i);
    }
    return cur_sum == sum;
  }
}
