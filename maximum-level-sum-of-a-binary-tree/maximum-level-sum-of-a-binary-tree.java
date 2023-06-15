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
    public int maxLevelSum(TreeNode root) {
        if (root == null) return 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int max = Integer.MIN_VALUE, level = 0, smallest = 0;

        while(!q.isEmpty()) {
            int size = q.size();
            int curSum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();

                curSum += temp.val;

                if (temp.left!=null) q.add(temp.left);
                if (temp.right!=null) q.add(temp.right);
            }

            level++;

            if (curSum > max) {
                max = curSum;
                smallest = level;
            }
        }

        return smallest;
    }
}