package solutions;

import Utilities.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _113_PathSumII {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        System.out.println(new _113_PathSumII().pathSum(root, 22));

    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> sums = new LinkedList<>();

        pathSum(root, sum, sums, new ArrayList<>(), 0);
        return sums;
    }

    public void pathSum(TreeNode root, int sum, List<List<Integer>> sums, List<Integer> currentSumList, int currentSum) {

        if (root == null)
            return;
        if (root != null && root.left == null && root.right == null) {
            if (currentSum + root.val == sum) {
                currentSumList.add(root.val);
                sums.add(new ArrayList<>(currentSumList));
                currentSumList.remove(currentSumList.size() - 1);
            }
            return;
        }

        currentSumList.add(root.val);
        currentSum += root.val;

        pathSum(root.left, sum, sums, currentSumList, currentSum);
        pathSum(root.right, sum, sums, currentSumList, currentSum);
        currentSumList.remove(currentSumList.size() - 1);
    }
}
