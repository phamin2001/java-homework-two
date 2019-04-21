package com.ga;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void insert(int value) {
        // Binary tree doesn't accept same duplicate values
        if(value == this.data) {
            return;
        }

        if(value < this.data) {
            if(getLeftChild() == null) {
                TreeNode node = new TreeNode(value);
                setLeftChild(node);
            } else {
                insert(value);
            }
        } else if(value > this.data) {
            if(getRightChild() == null) {
                TreeNode node = new TreeNode(value);
                setRightChild(node);
            } else {
                insert(value);
            }
        }
    }
}
