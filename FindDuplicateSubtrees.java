
/*

LeetCode


Given a binary tree, return all duplicate subtrees. For each kind of duplicate subtrees, you only need to return the root node of any one of them.

Two trees are duplicate if they have the same structure with same node values.

Example 1: 
        1
       / \
      2   3
     /   / \
    4   2   4
       /
      4
The following are two duplicate subtrees:
      2
     /
    4
and
    4
Therefore, you need to return above trees' root in the form of a list.


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


// Time Complexity: O(N), where N is the number of nodes in the tree. We visit each node once.
// Space Complexity: O(N). Every structure we use is using O(1) storage per node.

class FindDuplicateSubtrees {
    
    // Suppose we have a unique identifier for subtrees: 
    // Two subtrees are the same if and only if they have the same id.
    // Then, for a node with left child id of x and right child id of y, 
    // (node.val, x, y) uniquely determines the tree.
    
    int numTrees;
    Map<String, Integer> trees;
    Map<Integer, Integer> count;
    List<TreeNode> res;
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        numTrees = 1;
        trees = new HashMap<String, Integer>();
        count = new HashMap<Integer, Integer>();
        res = new ArrayList<TreeNode>();
        findDuplicates(root);
        return res;
    }
    
    // If we have seen the triple (node.val, x, y) before, we can 
    // use the identifier we've remembered. Otherwise, we'll create a new one.
    
    public int findDuplicates(TreeNode node){
        if(node == null) return 0;
        
        String subtree = node.val + "," + findDuplicates(node.left) + "," + findDuplicates(node.right);
        int uid = trees.computeIfAbsent(subtree, key -> numTrees++);
        count.put(uid, count.getOrDefault(uid, 0) + 1);
        
        if(count.get(uid) == 2) res.add(node);
        return uid;
    }
}