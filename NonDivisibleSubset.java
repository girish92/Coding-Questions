
import java.io.*;
import java.util.*;


/*

Hacker Rank

Non-Divisible Subset

Given a set, S, of n distinct integers, print the size of a maximal subset, S', of S where the sum of any 2 numbers in  S' is not evenly divisible by k.

Input Format

The first line contains 2 space-separated integers, n and k, respectively. 
The second line contains n space-separated integers (we'll refer to the ith value as ai) describing the unique values of the set.

Constraints
1. 1 <= n <= 10^5
2. 1 <= k <= 100
3. 1 <= ai <= 10^9
4. All of the given numbers are distinct.


Output Format

Print the size of the largest possible subset (S').

Sample Input

4 3
1 7 2 4

Sample Output

3

Explanation

The largest possible subset of integers is S' = {1,7,4}, because no two integers will have a sum that is evenly divisible by k=3:

- 1 + 7 = 8, and 8 is not evenly divisible by 3.
- 1 + 4 = 5, and 5 is not evenly divisible by 3.
- 7 + 4 = 11, and 11 is not evenly divisible by 3.
The number 2 cannot be included in our subset because it will produce an integer that is evenly divisible by when summed with any of the other integers in our set:

1 + 2 = 3, and 3/3 = 1 (remainder = 0).
4 + 2 = 6, and 6/3 = 2 (remainder = 0).
7 + 2 = 9, and 9/3 = 3 (remainder = 0).

Thus, we print the length of S' on a new line, which is 3.


*/



public class NonDivisibleSubset {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        //Store elements in array
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        for(int i = 0; i < k; i++){
            map.put(i, new ArrayList<Integer>());
        }
        
        //Store remainder, r(key) and list of indices (value) whose corresponding elements give r whem % k
        for(int i = 0; i < n; i++){
            int rem = arr[i] % k;
            ArrayList<Integer> lst = map.get(rem);
            lst.add(i);
            map.put(rem, lst);
        }
        
        //Store the count of numbers that give remanider r when % with k
        int[] count = new int[k];
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()){
            int key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            count[key] = value.size();
        }
        
        int length = 0;
        if(count[0] > 0){
            length++;
        }
        for(int i = 1; i < k; i++){
            int j = k-i;
            if(i > j){
                break;
            }
            if(i == j){
                length+=1;
            }else if(count[i] > count[j]){
                length += count[i];
            }else{
                length += count[j];
            }
        }
        System.out.println(length);
    }
}