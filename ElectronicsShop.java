
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Hacker Rank

Electronics Shop 

Monica wants to buy exactly one keyboard and one USB drive from her favorite electronics store. The store sells n different brands of keyboards and m different brands of USB drives. Monica has exactly s dollars to spend, and she wants to spend as much of it as possible (i.e., the total cost of her purchase must be maximal).

Given the price lists for the store's keyboards and USB drives, find and print the amount money Monica will spend. If she doesn't have enough money to buy one keyboard and one USB drive, print -1 instead.

Note: She will never buy more than one keyboard and one USB drive even if she has the leftover money to do so.

Input Format

The first line contains three space-separated integers describing the respective values of s (the amount of money Monica has), n (the number of keyboard brands) and m (the number of USB drive brands). 
The second line contains n space-separated integers denoting the prices of each keyboard brand. 
The third line contains m space-separated integers denoting the prices of each USB drive brand.

Constraints
1. 1 <= n, m <= 1000
2. 1 <= s <= 10^6

The price of each item is in the inclusive range [1, 10^6].


Output Format

Print a single integer denoting the amount of money Monica will spend. If she doesn't have enough money to buy one keyboard and one USB drive, print -1 instead.

Sample Input 0

10 2 3
3 1
5 2 8
Sample Output 0

9
Explanation 0

She can buy the 2nd keyboard and the 3rd USB drive for a total cost of 8 + 1 = 9.

Sample Input 1

5 1 1
4
5

Sample Output 1

-1

Explanation 1

There is no way to buy one keyboard and one USB drive because 4 + 5 > 5, so we print -1.

*/

public class ElectronicsShop  {

    static int getMoneySpent(Integer[] keyboards, int[] drives, int s){
        // Complete this function
        
        /*  
        Time Complexity: O(n+m (log (n+m))) //We sort in n+m (log (n+m)) then iterate in n+m  
        Space Complexity: O(1) //We consider the arrays as given
        */
        
        //Sort takes O(n log n) & O(m log m)
        Arrays.sort(keyboards, Collections.reverseOrder()); //sort in descending order
        Arrays.sort(drives); // sort in ascending order
       
        int max =  -1;
        for(int i = 0, j = 0; i < keyboards.length; i++){
            //for(; j < drives.length; j++){
            while(j < drives.length){
                if(keyboards[i] + drives[j] > s){
                    break;
                }
                if(keyboards[i] + drives[j] > max){
                    max = keyboards[i] + drives[j];
                }
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        Integer[] keyboards = new Integer[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}


