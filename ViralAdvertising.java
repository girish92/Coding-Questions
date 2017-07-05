


import java.io.*;
import java.util.*;


/*

Hacker Rank

Viral Advertising

HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new product, they advertise it to exactly 5 people on social media.

On the first day, half of those 5 people (i.e., floor(5/2) = 2) like the advertisement and each person shares it with of their friends; the remaining people (i.e., 5 - floor(5/2) = 3) delete the advertisement because it doesn't interest them. So, at the beginning of the second day, floor(5/2) x 3 = 2 x 3 = 6 people receive the advertisement.

On the second day, half of the 6 people who received the advertisement share it with 3 new friends. So, at the beginning of the third day, floor(6/2) x 3 =  3 x 3 = 9 people receive the advertisement. The diagram below depicts the advertisement's virality over the first three days (green denotes a person that likes the advertisement and red denotes a person that disliked and deleted it):

strange ad.png

Assume that at the beginning of the ith day, m people received the advertisement, floor(m/2) people like and share it with 3 new friends, and m - floor(m/2) people dislike and delete it. At the beginning of the (i+1)th day, floor(m/2) x 3 people receive the advertisement.

Given an integer, n, find and print the total number of people who liked HackerLand Enterprise's advertisement during the first n days. It is guaranteed that no two people have any friends in common and, after a person shares the advertisement with a friend, the friend always sees it the next day.

Input Format

A single integer, n, denoting a number of days.

Constraints
1. 1 <= n <= 50

Output Format

Print the number of people who liked the advertisement during the first n days.

Sample Input

3

Sample Output

9

Explanation

This example is depicted by the diagram at the top of the challenge. 2 people liked the advertisement on the first day, 3 people liked the advertisement on the second day and 4 people liked the advertisement on the third day, so the answer is 2 + 3 + 4 = 9.

*/


public class ViralAdvertising {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 2;
        int rec = 5;
        for(int i = 1; i < n; i++){
            rec = (int)Math.floor(rec / 2) * 3;
            total += (int)Math.floor(rec/2);
        }
        System.out.println(total);
    }
}