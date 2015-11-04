import java.io.*;
import java.util.*;

/*
 * Given the root node of a tree, we can get the max and min depth
 *
 */

class MaxMinDepth {
  public static void main(String[] args) {

    Node root = new Node();
    //Assume buildTree builds a random tree and returns the root of the tree
    root = buildTree(root);

    int maxHeight = maxDepth(root);
    int minHeight = minDepth(root);

    System.out.println("Max Depth = " + maxHeight);
    System.out.println("Min Depth = " + minHeight);

  }

  public static int maxDepth(Node root){
        if(root == null){
           return 0;
       }
       return Math.max(height(root.left), height(root.right)) + 1;

  }

  public static int minDepth(Node root){
        if(root == null){
           return 0;
       }
       return Math.min(height(root.left), height(root.right)) + 1;

  }

}

/*

    class Node
       int data;
       Node left;
       Node right;
 */
