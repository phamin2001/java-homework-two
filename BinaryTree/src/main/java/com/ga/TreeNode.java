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
            if(leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else if(value > this.data) {
            if(rightChild == null) {
                rightChild = new TreeNode(value);;
            } else {
                rightChild.insert(value);
            }
        }
    }

    public void traverseInorder() {
        if (leftChild != null) {
            leftChild.traverseInorder();
        }

        System.out.print(data + ", ");

        if (rightChild != null) {
            rightChild.traverseInorder();
        }
    }
}
