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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null) return maxDepth(root.right)+1;
        if(root.right==null) return maxDepth(root.left)+1;
        
        int dLeft=maxDepth(root.left);
        int dRight=maxDepth(root.right);
        if(dLeft>=dRight) return dLeft+1;
        else return dRight+1;
    }
}