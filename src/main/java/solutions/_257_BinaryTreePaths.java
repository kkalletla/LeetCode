package solutions;

import Utilities.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _257_BinaryTreePaths {

    List<String> paths = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        binaryTreePaths(new String(), root);

        return paths;
    }

    public void binaryTreePaths(String path, TreeNode root) {

        if (root == null)
            return;

        if (root != null && root.left == null && root.right == null)
            paths.add(path + (Integer.toString(root.val)));

        binaryTreePaths(path + Integer.toString(root.val) + "->", root.left);
        binaryTreePaths(path + Integer.toString(root.val) + "->", root.right);
    }
}
