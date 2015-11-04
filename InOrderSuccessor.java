import java.io.*;
import java.util.*;

/*
 * Given the root of a tree and a node e, find the inorder Successor of node e
 * Constraint: There is no pointer to the parent of the current node
 *
 */

class InOrderSuccessor {
  public static void main(String[] args) {

    // Assume for the purpose of this program, Treenode e and root are given
    TreeNode successor = inorderSucc(e, root);

  }

  public static TreeNode inorderSucc(TreeNode e, TreeNode root){

    TreeNode successor;
    while(root != null && root != e){
      if(root.left != null){
        successor = root;
        root = root.left;
       }
      if(root.right != null){
        root = root.right;
       }
    }

    if(root == e && root.right != null){
      successor = leftMostChild(root.right)
    }else{
      successor = Null;
    }

    return successor;
  }
}
