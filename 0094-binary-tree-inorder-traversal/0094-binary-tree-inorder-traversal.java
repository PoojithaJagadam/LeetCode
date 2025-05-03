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
    ArrayList<Integer> arr=new ArrayList<>();

    public void In(TreeNode root) {
        if(root==null)
            return;
        In(root.left);
        arr.add(root.val);
        In(root.right);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        In(root);
       return arr;

    }
}