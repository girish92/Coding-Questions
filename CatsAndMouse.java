
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Cats and a Mouse

Two cats named A and B are standing at integral points on the x-axis. Cat A is standing at point x and cat B is standing at point y. Both cats run at the same speed, and they want to catch a mouse named C that's hiding at integral point z on the x-axis. Can you determine who will catch the mouse?

You are given q queries in the form of x, y, and z. For each query, print the appropriate answer on a new line:

If cat A catches the mouse first, print Cat A.
If cat B catches the mouse first, print Cat B.
If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.

Input Format

The first line contains a single integer, q, denoting the number of queries. 
Each of the q subsequent lines contains three space-separated integers describing the respective values of x (cat A's location), y (cat B's location), and  (mouse C's location).

Constraints
1. 1 <= q <= 100
2. 1 <= x, y, z<= 100

Output Format

On a new line for each query, print Cat A if cat  catches the mouse first, Cat B if cat  catches the mouse first, or Mouse C if the mouse escapes.

Sample Input 0

3
1 2 3
1 3 2
2 1 3

Sample Output 0

Cat B
Mouse C
Cat A

Explanation 0

Query 0: The positions of the cats and mouse are shown below.

Cat B will catch the mouse first, so we print Cat B on a new line.

Query 1: In this query, cats A and B reach mouse C at the exact same time.

Because the mouse escapes, we print Mouse C on a new line.

*/


public class CatsAndMouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            int diff1 = (int)Math.abs(z - y);
            int diff2 = (int)Math.abs(z - x);
            
            if(diff1 > diff2){
                System.out.println("Cat A");
            }else if(diff1 < diff2){
                System.out.println("Cat B");
            }else{
                System.out.println("Mouse C");
            }
        }
    }
}

