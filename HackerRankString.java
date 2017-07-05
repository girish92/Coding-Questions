
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

HackerRank in a String!

We say that a string, s, contains the word hackerrank if a subsequence of the characters in s spell the word hackerrank. For example, haacckkerrannkk does contain hackerrank, but haacckkerannk does not (the characters all appear in the same order, but it's missing a second r).

More formally, let p0p1p2p3,..,p9 be the respective indices of h, a, c, k, e, r, r, a, n, k in string . If p0 < p1 < p2 < p3 < ... < p9 is true, then s contains hackerrank.

You must answer q queries, where each query consists of a string, s. For each query, print YES on a new line if contains hackerrank; otherwise, print NO instead.

Input Format

The first line contains an integer denoting q (the number of queries). 
Each line of the q subsequent lines contains a single string denoting s.

Constraints
1. 2 <= q <= 10^2
2. 10 <= length(s) <= 10^4


Output Format

For each query, print YES on a new line if si contains hackerrank; otherwise, print NO instead.

Sample Input 0

2
hereiamstackerrank
hackerworld

Sample Output 0

YES
NO

Explanation 0

We perform the following q = 2 queries:

1. 	 s = hereiamstackerrank
	 The characters of hackerrank are bolded in the string above. Because the string contains all the characters in hackerrank in the same exact order as they appear in hackerrank, we print YES on a new line.
2. 	 s = hackerworld does not contain the last three characters of hackerrank, so we print NO on a new line.

*/

public class HackerRankString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        char[] arr = {'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            boolean flag = true;
            int index = 0;
            for(int i = 0; i < arr.length; i++){
                char c = arr[i];
                index = s.indexOf(c);
                if(index == -1){
                    flag = false;
                    break;
                }
                if(index + 1 < s.length()){
                    s = s.substring(index+1);   
                }else if(arr.length - i > 1){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}

