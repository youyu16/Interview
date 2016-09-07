package LeetCode;

/**
 * Created by t-tiyou on 9/6/2016.
 */
public class LeetCode226 {

    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode InvertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = root.left;
        root.left = InvertTree(root.right);
        root.right = InvertTree(left);
        return root;
    }
}
