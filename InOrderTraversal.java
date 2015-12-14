import java.io.*;
import java.util.*;

/*
 * LeetCode.com
 *
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * Note: Recursive solution is trivial, could you do it iteratively?
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

 public static List<Integer> inorderTraversal(TreeNode root) {
    ArrayList<Integer> lst = new ArrayList<Integer>();
    Stack<TreeNode> s = new Stack<TreeNode>();

    if(root == null) return lst;

    boolean end = false;
    TreeNode cur = root;

    while(!end){
      /*Keep traversing left till we hit null*/
      if(cur != null){
        s.push(cur);
        cur = cur.left;
      }else{
        /*If current is a null, then pop top element from stack and next
        node will be the right child of current node*/
        if(!s.isEmpty()){
          cur = s.pop();
          lst.add(cur.val);
          cur = cur.right;
        }else{
          /*End loop when cur == null and stack is empty*/
          end = true;
        }
      }
    }
    return lst;
  }
