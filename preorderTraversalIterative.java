import java.io.*;
import java.util.*;

/*
 *  LeetCode.com
 *
 * Given a binary tree, return the preorder traversal of its nodes' values.
 *
 * Note: Recursive solution is trivial, could you do it iteratively?
 *
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



public static List<Integer> preorderTraversal(TreeNode root) {
    ArrayList<Integer> lst = new ArrayList<Integer>();
    if(root == null) return lst;

    Stack<TreeNode> s = new Stack<TreeNode>();
    s.push(root);

    while(!s.isEmpty()){
      TreeNode cur = s.pop();
      lst.add(cur.val);
      if(cur.right != null) s.push(cur.right);
      if(cur.left != null) s.push(cur.left);
    }
    return lst;
}
