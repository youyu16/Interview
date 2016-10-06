package LeetCode;

import java.util.HashSet;

/**
 * Created by t-tiyou on 10/6/2016.
 */
public class LeetCode112 {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        Solution.hasPathSum(t, 3);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static class Solution {
        public static boolean hasPathSum(TreeNode root, int sum) {
            if (root == null) {
                return false;
            }
            HashSet<Integer> set = new HashSet<>();
            path(root, 0, set);
            if (set.contains(sum))
                return true;
            else
                return false;
        }

        public static void path(TreeNode node, int sum, HashSet<Integer> set) {
            if (node.left == null && node.right == null) {
                sum += node.val;
                set.add(sum);
            }
            if (node.left != null) {
                path(node.left, sum + node.val, set);
            }
            if (node.right != null) {
                path(node.right, sum + node.val, set);
            }
        }
    }
}
