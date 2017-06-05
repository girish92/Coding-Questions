/*

Hackerrank.com


Mini-Max Sum

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format

A single line of five space-separated integers.

Constraints

Each integer is in the inclusive range [1, 10^9].
Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

Our initial numbers are 1, 2, 3, 4, and 5. We can calculate the following sums using four of the five integers:

If we sum everything except 1, our sum is 14.
If we sum everything except 2, our sum is 13.
If we sum everything except 3, our sum is 12.
If we sum everything except 4, our sum is 11.
If we sum everything except 5, our sum is 10.
As you can see, the minimal sum is 10 and the maximal sum is 14. Thus, we print these minimal and maximal sums as two space-separated integers on a new line.

Hints: Beware of integer overflow! Use 64-bit Integer.

*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long[] arr = new long[]{a,b,c,d,e};
        
        int max_index = 0;
        int min_index = 0;
        long max  = a;
        long min = a;
        
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                max_index = i;
            }
            if(min > arr[i]){
                min = arr[i];
                min_index = i;
            }
        }
        
        max = 0;
        min = 0;
        for(int i = 0; i < arr.length; i++){
            if(i != max_index){
                min += arr[i];
            }
            if(i != min_index){
                max += arr[i];
            }
        }
        
        System.out.println(min + " " + max);
    }
}

