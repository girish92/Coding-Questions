
/*

Hackerrank.com

CamelCase

Alice wrote a sequence of words in CamelCase as a string of letters, s, having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given s, print the number of words in s on a new line.

Input Format

A single line containing string s.

Constraints


Output Format

Print the number of words in string s.

Sample Input

saveChangesInTheEditor
Sample Output

5
Explanation

String  contains five words:

save
Changes
In
The
Editor
Thus, we print 5 on a new line.



*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        String word = new String();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                //System.out.println(word);
                word = new String();
                count++;
            }
            word = word + "" + s.charAt(i);
        }
        count++;
        System.out.println(count);
    }
}