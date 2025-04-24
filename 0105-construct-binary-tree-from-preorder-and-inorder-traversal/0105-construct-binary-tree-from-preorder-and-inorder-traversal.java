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

    private int p=0;

    private int linear(int key, int[] ino) {
        int n=ino.length;
        for(int i=0;i<n;i++) {
            if(ino[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public TreeNode tree(int[] pre, int[] ino, int low, int high) {
        if(low > high)
            return null;
        int idx = linear(pre[p++], ino);
        TreeNode root=new TreeNode(ino[idx]);
        root.left = tree(pre, ino, low, idx-1);
        root.right = tree(pre, ino, idx+1, high);
        return root;
        
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=inorder.length;
        return tree(preorder, inorder, 0, n-1);

    }
}