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
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        addToList(root,0);
        return res;
    }
    private void addToList(TreeNode root, int level){
        if(root==null) return;
        if(res.size()<=level) res.add(0,new ArrayList<Integer>());
        if(root.left!=null) addToList(root.left,level+1);
        if(root.right!=null) addToList(root.right,level+1);
        res.get(res.size()-level-1).add(root.val);
        return;
    }
}