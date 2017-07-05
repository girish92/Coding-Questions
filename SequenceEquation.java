
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Sequence Equation

You are given a sequence of n integers, p(1), p(2), p(3),..., p(n). Each element in the sequence is distinct and satisfies 1 <= p(x) <= n. For each x where 1<= x <= n, find any integer y such that p(p(y)) = x and print the value of y on a new line.

Input Format

The first line contains an integer, n, denoting the number of elements in the sequence. 
The second line contains n space-separated integers denoting the respective values of p(1), p(2), p(3),..., p(n).

Constraints
1. 1 <= n <= 50
2. 1 <= p(x) <= 50, where 1 <= x <= n.
3. Each element in the sequence is distinct.

Output Format

For each x from 1 to n, print an integer denoting any valid y satisfying the equation p(p(y)) = x on a new line.

Sample Input 0

3
2 3 1

Sample Output 0

2
3
1

Explanation 0

Given the values of p(1) = 2, p(2) = 3, and p(3) = 1, we calculate and print the following values for each x from 1 to n:

x = 1 => p(3) = p(p(2)) = p(p(y)) , so we print the value of y=2 on a new line.
x = 2 => p(1) = p(p(3)) = p(p(y)) , so we print the value of y=3 on a new line.
x = 3 => p(2) = p(p(1)) = p(p(y)) , so we print the value of y=1 on a new line.

*/


public class SequenceEquation {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            int x  = i+1;
            map.put(arr[i], x);
        }
        
        for(int i = 0; i < arr.length; i++){
            int j = i+1;
            int res = map.get(map.get(j));
            System.out.println(res);
        }
    }
}

