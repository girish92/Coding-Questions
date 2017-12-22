

/*

LeetCode

Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

Example 1:
    2
   / \
  1   3
Binary tree [2,1,3], return true.

Example 2:
    1
   / \
  2   3
Binary tree [1,2,3], return false.

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
class ValidBST {
    
    //Track previous node in Inorder Traversal
    TreeNode prev;
    
    public boolean isValidBST(TreeNode root) {
        prev = null;
        return isBST(root);
    }
    
    //Returns true if valid BST
    public boolean isBST(TreeNode cur){
        
        //Perform Inorder Traversal
        //And keep track of previous node
        if(cur != null){
            
            if(!isBST(cur.left)) return false;
            
            //Allows only nodes with distinct values
            if(prev != null && cur.val <= prev.val) return false;
            
            prev = cur;
            return isBST(cur.right);
        }
        return true;
    }
}


