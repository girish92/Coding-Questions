import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Grading Students

HackerLand University has the following grading policy:
- Every student receives a grade in the inclusive range from 0 to 100.
- Any grade less than 40 is a failing grade.

Sam is a professor at the university and likes to round each student's grade according to these rules:
- If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
- If the value of grae is less than 38, no rounding occurs as the result will still be a failing grade.
For example, grade = 84 will be rounded to 85 but grade = 29 will not be rounded because the rounding would result in a number that is less than 40.

Given the initial value of grade for each of Sam's n students, write code to automate the rounding process. For each grade i, round it according to the rules above and print the result on a new line.

Input Format

The first line contains a single integer denoting n (the number of students). 
Each line i of the n subsequent lines contains a single integer, grade i, denoting student i's grade.

Constraints



Output Format

For each  of the  grades, print the rounded grade on a new line.

Sample Input 0

4
73
67
38
33

Sample Output 0

75
67
40
33

Explanation

1. Student  received a , and the next multiple of  from  is . Since , the student's grade is rounded to .
2. Student  received a , and the next multiple of  from  is . Since , the grade will not be modified and the student's final grade is .
3. Student  received a , and the next multiple of  from  is . Since , the student's grade will be rounded to .
4. Student  received a grade below , so the grade will not be modified and the student's final grade is .


*/


public class GradingStudents {

    static int[] solve(int[] grades){
        // Complete this function
        for(int i=0; i < grades.length; i++){
            if(grades[i] >= 38){
                int nextMultiple = ((grades[i]/5) + 1) * 5;
                if(nextMultiple - grades[i] < 3){
                    grades[i] = nextMultiple;
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}

