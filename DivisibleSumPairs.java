
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Divisible Sum Pairs

You are given an array of n integers, a0, a1, a2, ... an-1, and a positive integer, k. Find and print the number of (i,j) pairs where i < j and ai + aj is divisible by k.

Input Format

The first line contains 2 space-separated integers, n and k, respectively. 
The second line contains n space-separated integers describing the respective values of a0, a1, a2, ..., an-1.

Constraints
1. 2 <= n <= 100
2. 1 <= k <=100
3. 1 <= ai <= 100

Output Format

Print the number of (i, j) pairs where i < j and ai + aj is evenly divisible by k.

Sample Input

6 3
1 3 2 6 1 2

Sample Output

 5

Explanation

Here are the 5 valid pairs:

1. (0,2) --> a0 + a2 = 1 + 2 = 3
2. (0,5) --> a0 + a5 = 1 + 2 = 3
3. (1,3) --> a1 + a3 = 3 + 6 = 9
4. (2,4) --> a2 + a4 = 2 + 1 = 3
5. (4,5) --> a4 + a5 = 1 + 2 = 3

*/


public class DivisibleSumPairs{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // write your code here
        
        /*
        //O(n^2) Solution
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(j > i && ((a[i] + a[j]) % k == 0)){
                    count++;
                }
            }
        }
        System.out.println(count);
        */
        
        //O(n) Solution
        int[] count = new int[k];
        for(int i = 0; i < k; i++){
            count[i] = 0;
        }
        
        for(int i = 0; i < n; i++){
            int rem = a[i] % k;
            count[rem]++;
        }

        int pairs = ( count[0] * (count[0] - 1) )/ 2;
        for(int i = 1; i < k; i++){
            int j = k - i;
            if(i < j){
                pairs += (count[i] * count[j]);
            }else if (i == j){
                pairs += ( count[i] * (count[i] - 1) )/ 2;
            }
        }
        System.out.println(pairs);
    }
}

