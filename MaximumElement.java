

/*

Hacker Rank

Maximum Element

You have an empty sequence, and you will be given N queries. Each query is one of these three types:

1 x  -Push the element x into the stack.
2    -Delete the element present at the top of the stack.
3    -Print the maximum element in the stack.
Input Format

The first line of input contains an integer, N. The next N lines each contain an above mentioned query. (It is guaranteed that each query is valid.)

Constraints 
 1. 1 <= N <= 10^5
 2. 1 <= x <= 10^9
 3. 1 <= type <= 3
 

Output Format

For each type 3 query, print the maximum element in the stack on a new line.

Sample Input

10
1 97
2
1 20
2
1 26
1 20
2
3
1 91
3


Sample Output

26
91

*/



import java.io.*;
import java.util.*;

public class MaximumElement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int max = 0;
        Stack<StackNode> stk = new Stack<StackNode>();
        while(count < n){
            int command = sc.nextInt();
            if(command == 1){
                int num = sc.nextInt();
                if(num > max){
                    max = num;
                }
                stk.push(new StackNode(max, num));
            }else if(command == 2){
                stk.pop();
                if(!stk.empty()){
                    max = stk.peek().getMax();
                }else{
                    max = 0;
                }
            }else{
                StackNode node = stk.peek();
                System.out.println(node.getMax());
            }
            count++;
        }
    }
    
    public static class StackNode {
        int maxNum;
        int curVal;

        public StackNode(int maxNum, int curVal){
            this.maxNum = maxNum;
            this.curVal = curVal;
        }
        
        public int getMax(){
            return this.maxNum;
        }
        
        public int getCurVal(){
            return this.curVal;
        }
    }
}