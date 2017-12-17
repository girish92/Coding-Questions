
/*

Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.
For example:
Given BST [1,null,2,2],
   1
    \
     2
    /
   2
return [2].

Note: If a tree has more than one mode, you can return them in any order.

Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).


*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTMode {
    
    private int curVal;
    private int count = 0;
    private int maxCount = 0;
    
    private ArrayList<Integer> mode;
    
    public int[] findMode(TreeNode root) {
        inorder(root, false);
        
        //reset count to 0
        count = 0;
        
        mode = new ArrayList<Integer>();
        inorder(root, true);
        
        int[] modeArr = new int[mode.size()];
        for(int i = 0; i < mode.size(); i++){
            modeArr[i] = mode.get(i);
        }
        
        return modeArr;
    }
    
    public void inorder(TreeNode node, boolean isSecondPass){
        if(node == null) return;
        if(node.left != null) inorder(node.left, isSecondPass);
        
        countFreq(node, isSecondPass);
        
        if(node.right != null) inorder(node.right, isSecondPass);
    }
    
    public void countFreq(TreeNode node, boolean isSecondPass){
        if(node.val == curVal){
            count++;
        }else{
            curVal = node.val;
            count = 1;
        }
        
        //if not second pass, update maxCount
        if(!isSecondPass && count > maxCount){
            maxCount = count;
        }// if second pass, add nodes with maxCount to list
        else if(isSecondPass && count == maxCount){
            mode.add(node.val);
        }
       
        
    }
}