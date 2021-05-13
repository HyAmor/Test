package com.practice.tree.bst;

public class BinarySortTreeDemo {
    public static void main(String[] args) {
        int[] arr = {9, 2};
        BinarySortTree bst = new BinarySortTree();
        for (int i = 0; i < arr.length; i++) {
            bst.add(new Node(arr[i]));
        }
        bst.midSearch();
        System.out.println("----------");
        bst.deleteNode(9);
        bst.midSearch();
    }
}

class BinarySortTree {
    private Node root;

    public Node search(int value) {
        if (root == null) {
            return null;
        } else {
            return root.search(value);
        }
    }

    public Node searchParent(int value) {
        if (root == null) {
            return null;
        } else {
            return root.searchParent(value);
        }
    }

    public void deleteNode(int value) {
        if (root == null) {
            return;
        } else {
            Node targertNode = search(value);
            if (targertNode == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                root = null;
            }
            Node parent = searchParent(value);
            if (targertNode.left == null && targertNode.right == null) {
                if (parent.left != null && parent.left.value == value) {
                    parent.left = null;
                } else if (parent.right != null && parent.right.value == value) {
                    parent.right = null;
                }
            } else if (targertNode.left != null && targertNode.right != null) {
                int minVal = deleteRightTreeMin(targertNode.right);
                targertNode.value = minVal;
            } else {
                if (targertNode.left != null) {
                    if (parent != null) {
                        if (parent.left.value == value) {
                            parent.left = targertNode.left;
                        } else {
                            parent.right = targertNode.left;
                        }
                    } else {
                        root = targertNode.left;
                    }
                } else {
                    if (parent != null) {
                        if (parent.left.value == value) {
                            parent.left = targertNode.right;
                        } else {
                            parent.right = targertNode.right;
                        }
                    } else {
                        root = parent.right;
                    }
                }
            }
        }
    }

    public int deleteRightTreeMin(Node node) {
        Node target = node;
        while (target.left != null) {
            target = target.left;
        }
        deleteNode(target.value);
        return target.value;
    }

    public void add(Node node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    public void midSearch() {
        if (root != null) {
            root.midOrder();
        } else {
            System.out.println("kong");
        }
    }
}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    public Node search(int value) {
        if (value == this.value) {
            return this;
        } else if (value < this.value) {
            if (this.left == null) {
                return null;
            }
            return this.left.search(value);
        } else {
            if (this.right == null) {
                return null;
            }
            return this.right.search(value);
        }
    }

    public Node searchParent(int value) {
        if ((this.left != null && this.left.value == value) || (this.right != null && this.right.value == value)) {
            return this;
        } else {
            if (value < this.value && this.left != null) {
                return this.left.searchParent(value);
            } else if (value > this.value && this.right != null) {
                return this.right.searchParent(value);
            } else {
                return null;
            }
        }
    }

    public void add(Node node) {
        if (node == null) {
            return;
        }
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.add(node);
            }
        } else {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }
    }

    public void midOrder() {
        if (this.left != null) {
            this.left.midOrder();
        }
        System.out.println(this);
        if (this.right != null) {
            this.right.midOrder();
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

}