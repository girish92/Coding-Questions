
/*

HackerRank.com

You are given pointer to the root of the binary search
tree and two values v1 and v2. You need to return the
lowest common ancestor (LCA) of v1 and v2 in the binary search tree.

Node is defined as :
class Node
   int data;
   Node left;
   Node right;

*/

public static Node lca(Node root,int v1,int v2){

    if(root == null) {
        return null;
    }
    if(root.data > v2 && root.data > v1) {
        // both targets are left
        return lca(root.left, v1, v2);
    } else if (root.data < v2 && root.data < v1) {
        // both targets are right
        return lca(root.right, v1, v2);
    } else {
        // either we are diverging or both targets are equal
        // in both cases so we've found the LCA
        // check for actual existence of targets here, if you like
        return root;
    }
}
