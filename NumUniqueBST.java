

/*

Leet Code

Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3


*/

class NumUniqueBST {
    public int numTrees(int n) {
        
        //Let count[i] be the number of unique binary search trees for i. 
        //The number of trees are determined by the number of subtrees 
        //which have different root node. 
        
        int[] count = new int[n + 1];
 
        count[0] = 1;
        count[1] = 1;
        
        //DP Solution: i=n, count[n] = sum(count[0..k]*count[k+1...n]) 0 <= k < n-1
        //E.g. i = 5
        // T[5] =   (T[0] * T[4]) 
        //        + (T[1] * T[3]) 
        //        + (T[2] * T[2]) 
        //        + (T[3] * T[1]) 
        //        + T[4] 
        //      = 42
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                // for every i, calculate the possible number of trees
                // this is also known as Catalan Number
                count[i] += count[j] * count[i - j - 1];
            }
        }
        return count[n];
    }
}