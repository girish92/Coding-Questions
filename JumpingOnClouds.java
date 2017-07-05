
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Jumping on the Clouds: Revisited

Aerith is playing a cloud game! In this game, there are n clouds numbered sequentially from 0 to n-1. Each cloud is either an ordinary cloud or a thundercloud.

Aerith starts out on cloud 0 with energy level E = 100. She can use 1 unit of energy to make a jump of size K to cloud (i + k ) % n, and she jumps until she gets back to cloud 0. If Aerith lands on a thundercloud, her energy (E) decreases by 2 additional units. The game ends when Aerith lands back on cloud 0.

Given the values of n, k, and the configuration of the clouds, can you determine the final value of E after the game ends?

Note: Recall that % refers to the modulo operation.

Input Format

The first line contains two space-separated integers, n (the number of clouds) and k (the jump distance), respectively. 
The second line contains n space-separated integers describing the respective values of clouds c0, c1, c2, ..., cn-1. Each cloud is described as follows:

If ci = 0, then cloud  is an ordinary cloud.
If ci = 1, then cloud  is a thundercloud.

Constraints
1. 2 <= n <= 25
2. 1 <= k <= n
3. n % k = 0
4. ci is an element of {0, 1}


Output Format

Print the final value of E on a new line.

Sample Input

8 2
0 0 1 0 0 1 1 0

Sample Output

92

Explanation

Observe that our thunderclouds are the clouds numbered 2, 5, and 6. Aerith makes the following sequence of moves:

Move: 0 --> 2, Energy: E = 100 - 1 - 2 = 97.
Move: 2 --> 4, Energy: E = 97 - 1 = 96.
Move: 4 --> 6, Energy: E = 96 - 1 - 2 = 93.
Move: 6 --> 0, Energy: E = 93 - 1 = 92.
Thus, we print 92 as our answer.

*/


public class JumpingOnClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int start = (0 + k) % n;
        int energy = 100;
        while(true){
            if(c[start] == 1){
                energy -=2;
            }
            energy -=1;
            if(start == 0){
                break;
            }
            start = (start + k) % n;
        }
        System.out.println(energy);
    }
}

