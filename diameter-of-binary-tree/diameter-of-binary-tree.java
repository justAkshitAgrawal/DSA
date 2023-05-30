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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] d = new int[1];
        helper(root, d);
        return d[0];
    }

    public int helper(TreeNode root, int[] d) {
        if (root == null) return 0;

        int l = helper(root.left, d);
        int r = helper(root.right, d);

        d[0] = Math.max(d[0], l + r);

        return 1 + Math.max(l, r);
    }
}