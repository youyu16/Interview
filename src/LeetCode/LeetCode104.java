package LeetCode;

/**
 * Created by t-tiyou on 9/6/2016.
 */


public class LeetCode104 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return (right > left ? right : left) + 1;
    }
}
