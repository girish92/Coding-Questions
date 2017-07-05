
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Beautiful Binary String

Alice has a binary string, B, of length n. She thinks a binary string is beautiful if and only if it doesn't contain the substring "010".

In one step, Alice can change a 0 to a 1 (or vice-versa). Count and print the minimum number of steps needed to make Alice see the string as beautiful.

Input Format

The first line contains an integer, n (the length of binary string B). 
The second line contains a single binary string, B, of length n.

Constraints
1. 1 <= n <= 100
2. Each character in B is an element of {0, 1}.

Output Format

Print the minimum number of steps needed to make the string beautiful.

Sample Input 0

7
0101010
Sample Output 0

2
Sample Input 1

5
01100
Sample Output 1

0
Sample Input 2

10
0100101010
Sample Output 2

3
Explanation

Sample Case 0:

In this sample, 

Get rid of each instance of "010".

   0 1 0 1 0 1 0
1: 0 1 1 1 0 1 0
2: 0 1 1 1 0 0 0


Because we were able to make the string beautiful by changing 2 characters and indices ( 2 and 5 ), we print 2.

Sample Case 1:

In this sample 

The substring "010" does not occur in B, so the string is already beautiful and we print 0.

*/

public class BeautifulBinaryString {
    
    static String replaceCharAt(String s, int pos, char c) {
        return s.substring(0,pos) + c + s.substring(pos+1);
    }
    
    static int minSteps(int n, String B){
        // Complete this function
        int start = 0;
        int end = n-1;
        int count = 0;
        while(start <= end){
            int pos = B.indexOf("010");
            if(pos != -1){
                pos +=2;
                if(pos < n){
                    B = replaceCharAt(B, pos, '1');
                    count++;
                }
                start = pos+1;
            }else{
                break;
            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}

