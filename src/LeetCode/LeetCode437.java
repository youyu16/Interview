package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by t-tiyou on 10/30/2016.
 */
public class LeetCode437 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public int pathSum(TreeNode root, int sum) {
            if (root == null)
                return 0;
            return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
        }

        public int findPath(TreeNode node, int sum) {
            int res = 0;
            if (node == null) {
                return res;
            }
            if (node.val == sum) {
                res++;
            }
            res += findPath(node.left, sum - node.val);
            res += findPath(node.right, sum - node.val);
            return res;
        }
    }


    // this is better
    public int pathSum(TreeNode root, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  //Default sum = 0 has one count
        return backtrack(root, 0, sum, map);
    }

    //BackTrack one pass
    public int backtrack(TreeNode root, int sum, int target, Map<Integer, Integer> map) {
        if (root == null)
            return 0;
        sum += root.val;
        int res = map.getOrDefault(sum - target, 0);    //See if there is a subarray sum equals to target
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        //Extend to left and right child
        res += backtrack(root.left, sum, target, map) + backtrack(root.right, sum, target, map);
        map.put(sum, map.get(sum) - 1);   //Remove the current node so it wont affect other path
        return res;
    }
}
