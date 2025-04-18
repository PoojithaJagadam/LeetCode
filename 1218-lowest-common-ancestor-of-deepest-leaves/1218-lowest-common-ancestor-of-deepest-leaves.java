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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null) return null;
        int lh=height(root.left);
        int rh=height(root.right);

        if(lh==rh) return root;
        if(lh>rh) {
            return  lcaDeepestLeaves(root.left);
        }
        return  lcaDeepestLeaves(root.right);
    } 
    private int height(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}