
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Hackerland Radio Transmitters

Hackerland is a one-dimensional city with n houses, where each house i is located at some xi on the x-axis. 
The Mayor wants to install radio transmitters on the roofs of the city's houses. Each transmitter has a range, k, 
meaning it can transmit a signal to all houses <= k units of distance away.

Given a map of Hackerland and the value of k, can you find and print the minimum number of transmitters needed 
to cover every house in the city? (Every house must be covered by at least one transmitter) Each transmitter must 
be installed on top of an existing house.

Input Format

The first line contains two space-separated integers describing the respective values of n (the number of houses 
in Hackerland) and k (the range of each transmitter). 
The second line contains n space-separated integers describing the respective locations of each house (i.e., ).

Constraints
1. 1 <= n, k <= 10^5
2. 1 <= xi <= 10^5
3.There may be more than one house at the same location.

Subtasks

--> 1 <= n <= 1000 for 50% of the maximum score.
Output Format

Print a single integer denoting the minimum number of transmitters needed to cover all the houses.

Sample Input 0

5 1
1 2 3 4 5
Sample Output 0

2

Explanation 0

We can cover the entire city by installing transmitters on houses at locations 2 and 4. Thus, we print 2 on a new line.

Sample Input 1

8 2
7 2 4 6 5 9 12 11 

Sample Output 1

3

Explanation 1

We can cover the entire city by installing transmitters on houses at locations 4, 9, and 12. Thus, we print 3 on 
a new line.

*/

public class HackerlandRadioTransmitters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        
        int i = 0;
        int numTransmitters = 0;
        //O(n log n)
        Arrays.sort(x);
        
        //Use Greedy approach to place transmitter to the furthest position to the right
        while(i < n){
            numTransmitters++;
            int loc = x[i] + k;
            //Go as far right as possible to middle position which will cover original location
            while(i < n && x[i] <= loc){
                i++;
            }
            loc = x[--i] + k;
            //Go as far right as possible to end position which will cover middle location
            while(i < n && x[i] <= loc){
                i++;
            }
        }
        System.out.println(numTransmitters);
    }
}

