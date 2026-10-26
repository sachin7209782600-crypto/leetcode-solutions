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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        {
        return ans;
        }
        Queue <TreeNode> wow=new LinkedList<>();
        wow.offer(root);

        while(!wow.isEmpty())
        {
            int size=wow.size();
        List<Integer> adds=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            TreeNode node=wow.poll();
            adds.add(node.val);

            if(node.left!=null)
            {
             wow.offer(node.left);
            }
            if(node.right!=null)
            {
             wow.offer(node.right);
            }
        }
        ans.add(adds);

        }
        return ans;
    }
}