import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Migratory Birds


A flock of n birds is flying across the continent. Each bird has a type, and the different types are designated by the ID numbers 1, 2, 3, 4, and 5.

Given an array of n integers where each integer describes the type of a bird in the flock, find and print the type number of the most common bird. If two or more types of birds are equally common, choose the type with the smallest ID number.

Input Format

The first line contains an integer denoting n (the number of birds). 
The second line contains n space-separated integers describing the respective type numbers of each bird in the flock.

Constraints

1. 5 <= n <= 2 x 10^5
2. It is guranteed that each type is 1,2,3,4, or 5.

Output Format

Print the type number of the most common bird; if two or more types of birds are equally common, choose the type with the smallest ID number.

Sample Input 0

6
1 4 4 4 5 3
Sample Output 0

4
Explanation 0

The different types of birds occur in the following frequencies:

Type 1:  1 bird
Type 2:  0 birds
Type 3:  1 bird
Type 4:  3 birds
Type 5:  1 bird
The type number that occurs at the highest frequency is type 4, so we print 4 as our answer.

*/


public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int[] freq = new int[5];
        for(int i = 0; i < ar.length; i++){
            int index = ar[i] - 1;
            freq[index]+=1;
        }
        
        int max = 0;
        for(int i = 1; i < freq.length; i++){
            if(freq[max] < freq[i]){
                max = i;
            }
        }
        return (max+1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}

