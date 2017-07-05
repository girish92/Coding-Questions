
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

The Hurdle Race

Dan is playing a video game in which his character competes in a hurdle race by jumping over n hurdles with heights h0, h1, ..., hn-1. He can initially jump a maximum height of k units, but he has an unlimited supply of magic beverages that help him jump higher! Each time Dan drinks a magic beverage, the maximum height he can jump during the race increases by 1 unit.

Given n, k, and the heights of all the hurdles, find and print the minimum number of magic beverages Dan must drink to complete the race.

Input Format

The first line contains two space-separated integers describing the respective values of n (the number of hurdles) and k (the maximum height he can jump without consuming any beverages). 
The second line contains n space-separated integers describing the respective values of h0, h1, ..., hn-1.

Constraints
1. 1 <= n, k <= 100
2. 1 <= hi <= 100

Output Format

Print an integer denoting the minimum number of magic beverages Dan must drink to complete the hurdle race.

Sample Input 0

5 4
1 6 3 5 2

Sample Output 0

2

Explanation 0

Dan's character can jump a maximum of k=4 units, but the tallest hurdle has a height of h1 = 6.


To be able to jump all the hurdles, Dan must drink 6 - 4 = 2 magic beverages.

Sample Input 1

5 7
2 5 4 5 2

Sample Output 1

0

Explanation 1

Dan's character can jump a maximum of k = 7 units, which is enough to cross all the hurdles:

image

Because he can already jump all the hurdles, Dan needs to drink 0 magic beverages.

*/


public class HurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        // your code goes here
        int drinks = 0;
        int ht = k;
        for(int i = 0; i < n ; i++){
            if(ht < height[i]){
                drinks += (height[i] - ht);
                ht = height[i];
            }
        }
        System.out.println(drinks);
    }
}

