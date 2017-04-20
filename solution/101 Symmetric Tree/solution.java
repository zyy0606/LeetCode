/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isMirror(root.left,root.right);
    }
    private boolean isMirror(TreeNode p,TreeNode q){
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        return p.val==q.val&&isMirror(p.left,q.right)&&isMirror(q.left,p.right);
    }
}