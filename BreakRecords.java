import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Breaking the Records


Maria plays n games of college basketball in a season. Because she wants to go pro, she tracks her points scored per game sequentially in an array defined as score = [s0, s1, s2, ..., sn-1]. After each game i, she checks to see if score si breaks her record for most or least points scored so far during that season.

Given Maria's array of scores for a season of n games, find and print the number of times she breaks her record for most and least points scored during the season.

Note: Assume her records for most and least points at the start of the season are the number of points scored during the first game of the season.

Input Format

The first line contains an integer denoting n(the number of games). 
The second line contains n space-separated integers describing the respective values of s0, s1, s2, ..., sn-1.

Constraints

1. 1 <= n <= 100
2. 0 <= si <= 10^8


Output Format

Print two space-seperated integers describing the respective numbers of times her best (highest) score increased and her worst (lowest) score decreased.

Sample Input 0

9
10 5 20 20 4 5 2 25 1

Sample Output 0

2 4

Explanation 0

Depicts the number of times Maria broke her best and worst records throughout the season:


She broke her best record twice (after games 2 and 7) and her worst record four times (after games 1, 4, 6, and 8), so we print 2 4 as our answer. Note that she did not break her record for best score during game 3, as her score during that game was not strictly greater than her best record at the time.


Sample Input 1

10
3 4 21 36 10 28 35 5 24 42

Sample Output 1

4 0

Explanation 1

Depicts the number of times Maria broke her best and worst records throughout the season:

She broke her best record four times (after games 1, 2, 3, and 9) and her worst record zero times (no score during the season was lower than the one she earned during her first game), so we print 4 0 as our answer.

*/


public class BreakRecords {

    static int[] getRecord(int[] s){
        // Complete this function
        int min = s[0];
        int max = s[0];
        int best = 0;
        int worst = 0;
        for(int i = 1; i < s.length; i++){
            if(min > s[i]){
                min = s[i];
                worst++;
            }else if(max < s[i]){
                max = s[i];
                best++;
            }
        }
        int[] res = new int[2];
        res[0] = best;
        res[1] = worst;
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}

