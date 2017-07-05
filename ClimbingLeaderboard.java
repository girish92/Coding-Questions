
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*

Hacker Rank

Climbing the Leaderboard

Alice is playing an arcade game and wants to climb to the top of the leaderboard. Can you help her track her ranking as she beats each level? The game uses Dense Ranking, so its leaderboard works like this:

- The player with the highest score is ranked number 1 on the leaderboard.
- Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.

For example, four players have the scores 100, 90, 90, and 80. Those players will have ranks 1, 2, 2, and 3, respectively.

When Alice starts playing, there are already n people on the leaderboard. The score of each player i is denoted by si. Alice plays for m levels, and we denote her total score after passing each level j as alice_j. After completing each level, Alice wants to know her current rank.

You are given an array, scores, of monotonically decreasing leaderboard scores, and another array, alice, of Alice's cumulative scores for each level of the game. You must print m integers. The jth integer should indicate the current rank of alice after passing the jth level.

Input Format

The first line contains an integer, n, denoting the number of players already on the leaderboard. 
The next line contains n space-separated integers describing the respective values of scores_0, scores_1, ..., scores_n-1. 
The next line contains an integer, m, denoting the number of levels Alice beats. 
The last line contains m space-separated integers describing the respective values of alice_0, alice_1, .., alice_m-1.

Constraints

1. 1 <= n <= 2 x 10^5
2. 1 <= m <= 2 x 10^5
3. 0 <= scores_i <= 10^9 for 0 <= i < n
4. 0 <= alice_i <= 10^9 for 0 <= j < m
4. The existing leaderboard, scores, is in descending order.
5. Alice's scores are cumulative, so alice is in ascending order.

Subtask

For 60% of the maximum score:
1. 1 <= n <= 200
2. 1 <= m <= 200

Output Format

Print m integers. The jth integer should indicate the rank of alice after passing the jth level.

Sample Input 0

7
100 100 50 40 40 20 10
4
5 25 50 120

Sample Output 0

6
4
2
1

Explanation 0

Alice starts playing with 7 players already on the leaderboard, which looks like this.

After Alice finishes level 0, her score is 5 and her ranking is 6.

After Alice finishes level 1, her score is 25 and her ranking is 4.

After Alice finishes level 2, her score is 50 and her ranking is tied with Caroline at 2.

After Alice finishes level 3, her score is 120 and her ranking is 1.

*/


// Time complexity: O(m log n)


public class ClimbingLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        int dup = 0;
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
            if(scores_i > 0 && scores[scores_i - 1] == scores[scores_i]){
                dup++;
            }
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        // your code goes here
        int[] ranks = new int[n+1-dup];
        ranks[0] = -1;
        int len = 0;
        if(scores.length == 1)ranks[1] = scores[0];
        int j = 1;
        for(int i = 0; i < scores.length; i++){
            if(i == 0 || scores[i] != scores[i-1]){
                ranks[j] = scores[i];
                j++;
                len++;
            }
        }
        int start = 1;
        int end = len;
        int mid = (start + end) / 2;
        
        for(int i = 0; i < alice.length; i++){
            int key = alice[i];
            int rank = -1;
            start = 1;
            end = len;
            mid = (start + end) / 2;

            //Binary Search: O(log n)
            while(start <= end){
                mid = (start + end) / 2;
                if(key == ranks[mid]){
                    rank = mid;
                    break;
                }
                if(key < ranks[mid]){
                    start = mid + 1;
                }
                if(key > ranks[mid]){
                    end = mid - 1;
                }
            }
            if(rank == -1){
                if(start > end){
                    rank = start;
                }
            }
            if(rank < 1){
                rank = 1;
            }
            System.out.println(rank);
        }
    }
}

