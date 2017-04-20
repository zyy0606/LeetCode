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
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        addToLevelList(root, 0);
        return result;
    }

    public void addToLevelList(TreeNode root, int depth) {
        if(root == null) {
            return;
        }

        if(result.size() < depth+1)
            result.add(depth, new ArrayList<Integer>());

        result.get(depth).add(root.val);

        depth ++;
        if(root.left != null)
            addToLevelList(root.left, depth);
        if(root.right != null)
            addToLevelList(root.right, depth);
    }
}