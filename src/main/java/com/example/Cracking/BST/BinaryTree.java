package com.example.Cracking.BST;


public class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    void printInorder(Node node) {

        if (node == null) {
            return;
        }

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);

    }

    public void addNode(int data) {

        Node node = new Node(data);

        if (root == null) {
            root = node;
        } else {
            addRecursion(root, node);
        }

    }

    private void addRecursion(Node node, Node inputNode) {

        if (node.data >= inputNode.data) {
            if (node.left == null) {
                node.left = inputNode;
            } else {
                addRecursion(node.left, inputNode);
            }
        } else {
            if (node.right == null) {
                node.right = inputNode;
            } else {
                addRecursion(node.right, inputNode);
            }
        }

    }

    public void addNodeIterative(int data) {

        Node node = new Node(data);
        Node runner = root;

        if (runner == null) {
            root = node;
        } else {
            while (runner.right != null && runner.left != null) {
                if (runner.data >= data) {
                    runner = runner.left;
                } else {
                    runner = runner.right;
                }
            }

            if (runner.data >= data) {
                runner.left = node;
            } else {
                runner.right = node;
            }

        }
    }


    public boolean search(int data) {

        Node runner = root;

        if (runner == null) {
            return false;
        } else if (runner.data == data) {
            return true;
        } else {
            while (runner.right != null || runner.left != null) {

                if (runner.data == data) {
                    return true;
                } else if (runner.data >= data) {
                    runner = runner.left;
                } else {
                    runner = runner.right;
                }
            }
            return false;
        }
    }

    public void letfView(Node root) {

        if (root == null) {
            return;
        }

        Node node = root;
        System.out.print(node.data);

        if (node.left == null) {
            letfView(node.right);
        } else {
            letfView(node.left);
        }
    }

    public void printSibling(Node node) {
        int counter = 0;

        if (node.left != null && node.right != null) {
            printSibling(node.left);
            printSibling(node.right);
        } else if (node.left == null ^ node.right == null) {
            if (node.right == null) {
                System.out.print(node.left.data + " ");
            } else {
                System.out.print(node.right.data + " ");
            }
            counter++;
        }

        if (counter == 0) {
            System.out.println(-1);
        }

    }

    public boolean isIdentical(Node root1, Node root2) {
        if (root1 != null && root2 != null) {

            if (root1.data == root2.data && isIdentical(root1.left, root2.left) &&
                isIdentical(root1.right, root2.right)) {
                return true;
            } else {
                return false;
            }
        } else if (root1 != null && root2 == null) {
            return false;
        } else if (root1 == null && root2 != null) {
            return false;
        } else {
            return true;
        }
    }

    public int getHeightOfTree(Node node) {
        if (node == null) {
            return 0;
        } else {
            return Math.max(getHeightOfTree(node.left), getHeightOfTree(node.right)) + 1;
        }
    }

    public void traversePreOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + "--");
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }

    public void traverseInOrder(Node root) {
        if (root == null) {
            return;
        }

        traversePreOrder(root.left);
        System.out.print(root.data + "--");
        traversePreOrder(root.right);
    }

    public void traversePostOrder(Node root) {
        if (root == null) {
            return;
        }

        traversePreOrder(root.left);
        traversePreOrder(root.right);
        System.out.print(root.data + "--");
    }

    public boolean isBST(Node root) {

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        return helpBST(root, min, max);

    }

    public boolean helpBST(Node root, int min, int max) {

        if(root == null){
            return true;
        }

        if (root.left.data < min || root.right.data >= max) {
            return false;
        }
        return helpBST(root.right, root.data, max) && helpBST(root.left, min, root.data);
    }

    protected class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }
}


