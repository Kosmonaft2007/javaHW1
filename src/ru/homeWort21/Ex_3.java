package ru.homeWort21;

import java.util.List;


class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        getTreePaths(root, "", ans);
        return ans;
    }

    public void getTreePaths(TreeNode root, String curPath, List<String> ans) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            ans.add(curPath + root.val);
            return;
        }

        getTreePaths(root.left, curPath + root.val + "->", ans);
        getTreePaths(root.right, curPath + root.val + "->", ans);
    }
}

