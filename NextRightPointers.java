/**
 *
 * LeetCode.com
 *
 * Populate each next pointer to point to its next right node.
 * If there is no next right node, the next pointer should be set to NULL.
 *
 * Note:
 * You may only use constant extra space.
 * You may assume that it is a perfect binary tree (ie, all leaves
 * are at the same level, and every parent has two children).
 *
 *
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */


public class NextRightPointers {
    public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();

        if(root == null) return;

        q.add(root);
        int height = heightOf(root);

        TreeLinkNode cur;
        TreeLinkNode prev = root;

        while(!q.isEmpty()){
            cur = q.poll();
            int curHeight = heightOf(cur);
            if(curHeight == height && cur!=root){
                prev.next = cur;
                prev = cur;
            }else{
                prev.next = null;
                prev = cur;
                height = curHeight;
            }
            if(cur.left != null) q.add(cur.left);
            if(cur.right != null) q.add(cur.right);
        }
    }
    public int heightOf(TreeLinkNode node){
        if(node == null) return 0;
        return Math.max(heightOf(node.left), heightOf(node.right))+1;
    }
}
