
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Sock Merchant

John's clothing store has a pile of n loose socks where each sock i is labeled with an integer, ci, denoting its color. He wants to sell as many socks as possible, but his customers will only buy them in matching pairs. Two socks, i and j, are a single matching pair if c_i = c_j.

Given n and the color of each sock, how many pairs of socks can John sell?

Input Format

The first line contains an integer, n, denoting the number of socks. 
The second line contains n space-separated integers describing the respective values of c_0, c_1, c_2, ..., c_n-1.

Constraints
1. 1 <= n <= 100
2. 1 <= c_i <= 100


Output Format

Print the total number of matching pairs of socks that John can sell.

Sample Input

9
10 20 20 10 10 30 50 10 20

Sample Output

3

*/


public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        int[] freq = new int[101];
        for(int i = 0; i < freq.length; i++){
            freq[i] = 0;
        }
        
        for(int i = 0; i < ar.length; i++){
            freq[ar[i]]++;
        }
        
        int pairs = 0;
        for(int i = 0; i < freq.length; i++){
            pairs += (freq[i] / 2);
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}

