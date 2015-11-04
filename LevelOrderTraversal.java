import java.io.*;
import java.util.*;

/*
 * Print the nodes of a tree level by level - Level Order Traversal
 *
 */

class LevelOrderTraversal {
  public static void main(String[] args) {

    Node root = new Node();
    //Assume buildTree builds a random tree and returns the root of the tree
    root = buildTree(root);
    Levelorder(root);

  }

  public static void LevelOrder(Node root){

       Queue<Node> q = new LinkedList<Node>();
       q.add(root);

       while(!q.isEmpty()){

           Node cur = q.poll();
           System.out.print(cur.data + " “);

           if(cur.left != null){
               q.add(cur.left);
           }

           if(cur.right != null){
               q.add(cur.right);
           }
      }
  }
}
