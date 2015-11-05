import java.io.*;
import java.util.*;

/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1
 * as one sorted array.
 *
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal
 * to m + n) to hold additional elements from nums2. The number of elements
 * initialized in nums1 and nums2 are m and n respectively.
 *
 *
 */

class InPlaceMerge {
  public static void main(String[] args) {

    int[] arr = new int[10];
    arr[0] = 1;
    arr[1] = 4;
    arr[2] = 7;
    arr[3] = 9;
    arr[4] = 13;
    arr[5] = 20;
    int[] arr2 = new int[]{6,12,15,22};

    merge(arr, 6, arr2, 4);
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n){

    int p1 = m-1;
    int p2 = n-1;

    while(p1 != -1 && p2 != -1){
      //System.out.println(nums1[p1] + " " + nums2[p2]);
      //System.out.println("pointer: " + p1 + " " + p2);
      if(nums1[p1] > nums2[p2]){
        nums1[p1+p2+1] = nums1[p1];
        p1--;
      }else{
        nums1[p1+p2+1] = nums2[p2];
        p2--;
      }
    }
    while(p2 != -1){
      nums1[p2] = nums2[p2];
      p2--;
    }
    System.out.println(Arrays.toString(nums1));
  }
}
