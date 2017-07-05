
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Drawing Book

Brie’s Drawing teacher asks her class to open their n-page book to page number p. Brie can either start turning pages from the front of the book (i.e., page number 1) or from the back of the book (i.e., page number n), and she always turns pages one-by-one (as opposed to skipping through multiple pages at once). When she opens the book, page 1 is always on the right side.


Each page in the book has two sides, front and back, except for the last page which may only have a front side depending on the total number of pages of the book (see the Explanation sections below for additional diagrams).

Given n and p, find and print the minimum number of pages Brie must turn in order to arrive at page p.

Input Format

The first line contains an integer, n, denoting the number of pages in the book. 
The second line contains an integer, p, denoting the page that Brie's teacher wants her to turn to.


Constraints
1. 1 <= n <= 10^5
2. 1 <= p <= n

Output Format

Print an integer denoting the minimum number of pages Brie must turn to get to page p.


Sample Input 0

6
2

Sample Output 0

1

Explanation 0

If Brie starts turning from page 1, she only needs to turn 1 page.


If Brie starts turning from page 6, she needs to turn 2 pages.


Because we want to print the minumum number of page turns, we print 1 as our answer.

Sample Input 1

5
4

Sample Output 1

0

Explanation 1

If Brie starts turning from page 1, she needs to turn 2 pages.

If Brie starts turning from page 5, she doesn't need to turn any pages.

Because we want to print the minimum number of page turns, we print 0 as our answer.

*/

public class DrawingBook {

    static int solve(int n, int p){
        // Complete this function
        int diff1 = n-p; // 1
        int diff2 = p-1; // 1
        if(diff1 == 0 || diff2 == 0 || (n%2!=0 && n-1 == p)){
            return 0;
        }
        int flips1;
        if(n%2 == 0){
            flips1 = (int)Math.ceil(diff1/2.0);
        }else{
            flips1 = (int)Math.floor(diff1/2.0);
        }
        
        int flips2 = (int)Math.ceil(diff2/2.0);
        if(flips1 < flips2){
            return flips1;
        }else{
            return flips2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}

