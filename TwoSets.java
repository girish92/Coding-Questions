import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Between Two Sets

Consider two sets of positive integers, A = {a1, a2, a3, ..., an-1} and B = {b1, b2, b3, ..., bn-1}. We say that a positive integer, x, is between sets A and B if the following conditions are satisfied:

1. All elements in A are factors of x.
2. x is a factor of all elements in B.

In other words, some x is between A and B if that value of x satisfies x mod ai = 0 for every ai in A and also satisfies bi mod x = 0 for every bi in B. For example, if A = {2, 6} and B = {12}, then our possible x values are 6 and 12.

Given A and B, find and print the number of integers (i.e., possible x's) that are between the two sets.

Input Format

The first line contains two space-separated integers describing the respective values of n(the number of elements in set A) and m(the number of elements in set B). 
The second line contains  distinct space-separated integers describing a0, a1, ..., an-1. 
The third line contains  distinct space-separated integers describing b0, b1, ..., bm-1.

Constraints

1. 1 <= n, m <= 10
2. 1 <= ai <= 100
3. 1 <= bi <= 100


Output Format

Print the number of integers that are considered to be between A and B.

Sample Input

2 3
2 4
16 32 96

Sample Output

3

Explanation

There are three  values between A = {2, 4} and B = {16, 32, 96}:

1. x = 4:
 - All the elements in A evenly divide x = 4.
 - x = 4 evenly divides all the elements in B.

2. x = 8:
 - All the elements in A evenly divide x = 8.
 - x = 8 evenly divides all the elements in B.
3. x = 16:
- All the elements in A evenly divide x = 16.
- x = 16 evenly divides all the elements in B.

Thus, we print 3 as our answer.


*/



public class TwoSets {
    
    static int gcd(int x, int y){
         while (y > 0){
             int temp = y;
             y = x % y;
             x = temp;
        }
        return x;
    }
    
    static int lcm(int x, int y){
        return x * (y / gcd(x, y));
    }
    
    static int findMin(int[] b){
        int min = b[0];
        for(int i=0; i<b.length; i++){
            if(min > b[i]){
                min = b[i];
            }
        }
        return min;
    }

    static int getTotalX(int[] a, int[] b){
        // Complete this function
        
        int gcdB = b[0];
        for(int i = 1; i < b.length; i++) gcdB = gcd(gcdB, b[i]);
        
        int lcmA = a[0];
        for(int i = 1; i < a.length; i++) lcmA = lcm(lcmA, a[i]);
        
        int minB = findMin(b);
        
        int count = 0;
        int inc = 2;
        if(gcdB % lcmA == 0 && gcdB != lcmA){
            count += 2;
            int mul = lcmA;
            while(mul < gcdB){
                mul = lcmA * inc;
                inc++;
                if(gcdB % mul == 0 && gcdB != mul){
                    count++;
                }
            }
        }else if(gcdB % lcmA == 0){
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}





