package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t-tiyou on 10/6/2016.
 */
public class LeetCode257 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> result = new ArrayList<>();
            if (root != null)
                DFS(root, "", result);
            return result;
        }

        public void DFS(TreeNode node, String path, List<String> result) {
            if (node.left == null && node.right == null)
                result.add(path + node.val);
            if (node.left != null)
                DFS(node.left, path + node.val + "->", result);
            if (node.right != null)
                DFS(node.right, path + node.val + "->", result);
        }
    }
}
