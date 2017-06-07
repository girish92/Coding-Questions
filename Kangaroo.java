import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Kangaroo

There are two kangaroos on an x-axis ready to jump in the positive direction (i.e, toward positive infinity). The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump. The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump. Given the starting locations and movement rates for each kangaroo, can you determine if they'll ever land at the same location at the same time?

Input Format

A single line of four space-separated integers denoting the respective values of x1, v1, x2, and v2.

Constraints

1. 0 <= x1 <= x2 <= 10000
2. 1 <= v1 <= 10000 
3. 1 <= v2 <= 10000

Output Format

Print YES if they can land on the same location at the same time; otherwise, print NO.

Note: The two kangaroos must land at the same location after making the same number of jumps.

Sample Input 0

0 3 4 2

Sample Output 0

YES

Explanation 0

The two kangaroos jump through the following sequence of locations:
1. 0 --> 3 --> 6 --> 9 --> 12
2. 4 --> 6 --> 8 --> 10 --> 12


Thus, the kangaroos meet after 4 jumps and we print YES.

Sample Input 1

0 2 5 3

Sample Output 1

NO

Explanation 1

The second kangaroo has a starting location that is ahead (further to the right) of the first kangaroo's starting location (i.e., x2 > x1). Because the second kangaroo moves at a faster rate (meaning v2 > v1) and is already ahead of the first kangaroo, the first kangaroo will never be able to catch up. Thus, we print NO.

*/


public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean flag = false;
        int small = 0;
        int big = 0;
        int smallCount = 0;
        int bigCount = 0;
        if((x1 > x2 && v1 >= v2) || (x1 < x2 && v1 <= v2)){
            flag = false;
        }else{
            if(x1 == x2 || ((x1 + v1) == (x2 + v2))){
                flag = true;
            }else{
                if(x1 + v1 < x2 + v2){
                    small = x1 + v1;
                    big = x2 + v2;
                    smallCount = v1;
                    bigCount = v2;
                }else{
                    small = x2 + v2;
                    big = x1 + v1;
                    smallCount = v2;
                    bigCount = v1;
                }
                while(small < big){
                    small += smallCount;
                    big += bigCount;
                }
                if(small == big){
                    flag = true;
                }else{
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}




