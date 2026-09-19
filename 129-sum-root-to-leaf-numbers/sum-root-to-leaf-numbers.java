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
    public int sumNumbers(TreeNode root) {
        return solve(root, 0);
    }

    private int solve(TreeNode root, int number) {

        if (root == null) {
            return 0;
        }

        number = number * 10 + root.val;

        if (root.left == null && root.right == null) {
            return number;
        }

        return solve(root.left, number)
             + solve(root.right, number);
    }
}

        
    
