/*

Hackerrank.com

Super Reduced String 

Steve has a string, s, consisting of n lowercase English alphabetic letters. In one operation, he can delete any pair of adjacent letters with same value. For example, string "aabcc" would become either "aab" or "bcc" after operation.

Steve wants to reduce s as much as possible. To do this, he will repeat the above operation as many times as it can be performed. Help Steve out by finding and printing s's non-reducible form!

Note: If the final string is empty, print Empty String .

Input Format

A single string, s.

Constraints


Output Format

If the final string is empty, print Empty String; otherwise, print the final non-reducible string.

Sample Input 0

aaabccddd
Sample Output 0

abd
Sample Case 0

Steve can perform the following sequence of operations to get the final string:

aaabccddd → abccddd
abccddd → abddd
abddd → abd
Thus, we print abd.

Sample Input 1

baab
Sample Output 1

Empty String
Explanation 1

Steve can perform the following sequence of operations to get the final string:

baab → bb
bb → Empty String
Thus, we print Empty String.

Sample Input 2

aa
Sample Output 2

Empty String
Explanation 2

Steve can perform the following sequence of operations to get the final string:

aa → Empty String
Thus, we print Empty String.


*/



import java.io.*;
import java.util.*;

public class SuperReducedString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res = new String("");
        
        Stack stk = new Stack();
        
        if(str.length() < 2){
            System.out.println(str);
        }else{
            
            for(int i = 0; i < str.length(); i++){
                if(stk.isEmpty() || (Character)stk.peek() != str.charAt(i)){
                    stk.push(str.charAt(i));
                }else{
                    stk.pop();
                }
            }            
            
            if(stk.isEmpty()){
                System.out.println("Empty String");
            }else{
                while(!stk.isEmpty()){
                    res = stk.pop() + "" + res;
                }
                System.out.println(res);
            }
        }
    }
}