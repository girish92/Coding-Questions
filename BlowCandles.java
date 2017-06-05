import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Birthday Cake Candles

Colleen is turning n years old! She has n candles of various heights on her cake, and candle i has height i . Because the taller candles tower over the shorter ones, Colleen can only blow out the tallest candles.

Given the height i for each individual candle, find and print the number of candles she can successfully blow out.

Input Format

The first line contains a single integer, n, denoting the number of candles on the cake. 
The second line contains n space-separated integers, where each integer i describes the height of candle i.

Constraints

1. 1 <= n <= 10^5
2. 1 <= height i <= 10^7


Output Format

Print the number of candles Colleen blows out on a new line.


Sample Input 0

4
3 2 1 3

Sample Output 0

2

Explanation 0

We have one candle of height 1, one candle of height 2, and two candles of height 3. Colleen only blows out the tallest candles, meaning the candles where height = 3. Because there are 2 such candles, we print 2 on a new line.

*/


public class BlowCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int tallest = 0;
        int count = 0;
        int current;
        for(int height_i=0; height_i < n; height_i++){
            current = in.nextInt();
            height[height_i] = current;
            if(current > tallest){
                tallest = current;
                count = 1;
            }else if(current == tallest){
                count++;
            }
        }
        System.out.println(count);
    }
}

