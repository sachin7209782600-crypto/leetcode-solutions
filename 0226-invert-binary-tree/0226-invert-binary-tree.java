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
    public TreeNode invertTree(TreeNode root) {
        TreeNode dupli=root;
        if(dupli==null)
        {
            return root;
        }
        TreeNode temp=invertTree(dupli.left);
        dupli.left=invertTree(dupli.right);
        dupli.right=temp;
      return dupli;
    }
}