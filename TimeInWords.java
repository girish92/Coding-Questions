

import java.io.*;
import java.util.*;

/*

Hacker Rank

The Time in Words

Given the time in numerals we may convert it into words, as shown below:


Write a program which prints the time in words for the input given in the format mentioned above.

Input Format

There will be two lines of input:
H, representing the hours
M, representing the minutes

Constraints

1. 1 <= H <= 12
2. 0 <= M < 60

Output Format

Display the time in words.

Sample Input

5  
47  
Sample Output

thirteen minutes to six

*/

public class TimeInWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        
        String time = "";
        if(min == 0){
            time = numbers[hour] + " o' clock";
        }else if(min == 15){
            time  = "quarter past " + numbers[hour];
        }else if(min == 30){
            time  = "half past " + numbers[hour];
        }else if(min == 45){
            time = "quarter to " + numbers[hour+1];
        }else if(min == 1){
            time = numbers[min] + " minute past " + numbers[hour];
        }else if(min <= 20){
            time = numbers[min] + " minute past " + numbers[hour];
        }else if(min > 20 && min < 30){
            int ones = min % 10;
            time = "twenty " + numbers[ones] + " minutes past " + numbers[hour];
        }else if (min > 30 && min < 40){
            int rem = 60 - min;
            int ones = rem % 10;
            time =  "twenty " + numbers[ones] + " minutes to " + numbers[hour+1];
        }else{
            int rem = 60 - min;
            time = numbers[rem] + " minutes to " + numbers[hour+1];
        }
        System.out.println(time);
    }
}