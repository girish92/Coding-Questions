
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Picking Numbers

Given an array of integers, find and print the maximum number of integers you can select from the array such that the absolute difference between any two of the chosen integers is <= 1.

Input Format

The first line contains a single integer, n, denoting the size of the array. 
The second line contains n space-separated integers describing the respective values of a0, a1, a2, ..., an-1.

Constraints
1. 2 <= n <= 100
2. 0 <= ai < 100
3. The answer will be >= 2.

Output Format

A single integer denoting the maximum number of integers you can choose from the array such that the absolute difference between any two of the chosen integers is <= 1.

Sample Input 0

6
4 6 5 3 3 1

Sample Output 0

3

Explanation 0

We choose the following multiset of integers from the array: {4, 3, 3}. Each pair in the multiset has an absolute difference <= 1 (i.e., |4-3| = 1 and |3-3| = 0), so we print the number of chosen integers, 3, as our answer.

Sample Input 1

6
1 2 2 3 1 2

Sample Output 1

5

Explanation 1

We choose the following multiset of integers from the array: {1, 2, 2, 1, 2}. Each pair in the multiset has an absolute difference <= 1 (i.e., |1-2|  = 1, |1-1| = 0, and |2-2| = 0), so we print the number of chosen integers, 5, as our answer.


*/



public class PickingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] freq = new int[100];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        //Initialize frequency array
        for(int i = 0; i < freq.length; i ++){
            freq[i] = 0;
        }
        
        for(int i = 0; i < n; i ++){
            freq[a[i]]++;
        }
        int max = 0;
        for(int i = 1; i < freq.length; i++){
            if(freq[i] == 0){
                continue;
            }
            if(freq[i] > max) max = freq[i];
            
            int j = i+1;
            while(j < freq.length && freq[j] == 0){
                j++;
            }
            if(j < freq.length && freq[j] > max) max = freq[j];
            
            if(j < freq.length && freq[i] + freq[j] > max && j - i == 1){
                max = freq[i] + freq[j];
            }
        }
        System.out.println(max);
    }
}

