package solutions;

import Utilities.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _113_PathSumII {

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
