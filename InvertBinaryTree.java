/**
 *
 * LeetCode.com
 *
 * Invert a binary tree (Swap LHS with RHS)
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<TreeNode>();

        if(root != null){
            q.add(root);
        }
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            if(cur.left != null){
                q.add(cur.left);
            }
            if(cur.right != null){
                q.add(cur.right);
            }

            TreeNode tmp = cur.left;
            cur.left = cur.right;
            cur.right = tmp;
        }

        return root;

    }
}
