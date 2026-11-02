/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        List<Integer>wow=new ArrayList<>();
        public void runs(TreeNode root)
        {
            if(root==null) return;
         wow.add(root.val);
         runs(root.left);
         runs(root.right);
        }
    public List<Integer> preorderTraversal(TreeNode root) {
        runs(root);
        return wow;
    }
}