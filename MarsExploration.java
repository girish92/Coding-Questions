

/*

Hackerrank.com

Mars Exploration 

Sami's spaceship crashed on Mars! She sends n sequential SOS messages to Earth for help.


Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, S, determine how many letters of Sami's SOS have been changed by radiation.

Input Format

There is one line of input: a single string, S.

Note: As the original message is just SOS repeated n times, S's length will be a multiple of 3.

Constraints



S will contain only uppercase English letters.
Output Format

Print the number of letters in Sami's message that were altered by cosmic radiation.

Sample Input 0

SOSSPSSQSSOR
Sample Output 0

3
Sample Input 1

SOSSOT
Sample Output 1

1
Explanation

Sample 0

S = SOSSPSSQSSOR, and signal length |S| = 12. Sami sent 4 SOS messages (i.e.: 12/3 = 4).

Expected signal: SOSSOSSOSSOS
Recieved signal: SOSSPSSQSSOR

We print the number of changed letters, which is 3.

Sample 1

 = SOSSOT, and signal length |S| = 6. Sami sent 2 SOS messages (i.e.: 6/3 = 2).

Expected Signal: SOSSOS 
Received Signal: SOSSOT

We print the number of changed letters, which is 1.


*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        String message = "SOS";
        int count = 0;
        
        for(int i = 0; i < S.length()-2; i++){
            if(S.charAt(i) != message.charAt(0)){
                count++;
            }
            if(S.charAt(i+1) != message.charAt(1)){
                count++;
            }
            if(S.charAt(i+2) != message.charAt(2)){
                count++;
            }
            i+=2;
        }
        System.out.println(count);
    }
}