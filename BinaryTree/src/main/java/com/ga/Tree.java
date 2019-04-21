package com.ga;

public class Tree {
    private TreeNode root;

    public boolean insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
            return true;
        } else {
            root.insert(value);
            return true;
        }
    }

    public boolean traverseInOrder() {
        if (root != null) {
            root.traverseInorder();
            return true;
        }
        return false;
    }
}
