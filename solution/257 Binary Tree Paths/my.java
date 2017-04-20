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
    List<String> res=new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return res;
        bTreePath("",root);
        return res;
    }
    
    private void bTreePath(String prePath,TreeNode node){
        if(node.left==null&&node.right==null){
            res.add(prePath+node.val);
            return;
        }
        if(node.left!=null){
            bTreePath(prePath+node.val+"->",node.left);
        }
        if(node.right!=null){
            bTreePath(prePath+node.val+"->",node.right);
        }
        return;
    }
}