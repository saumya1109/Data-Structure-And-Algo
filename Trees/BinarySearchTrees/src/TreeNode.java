public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    //when we start at first it will be just leaf node having no left or right child
    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        //doesn't allow duplication
        if (value == data) {
            return;
        }
        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }


    public TreeNode get(int value) {
        if (value == data) {
            return this;
        }
        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;
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

    public void preOrder() {
        System.out.print(data + ", ");

        if (leftChild != null) {
            leftChild.traverseInorder();
        }
        if (rightChild != null) {
            rightChild.traverseInorder();
        }

    }


    public int getMin() {

        if (leftChild == null) {
            return data;
        } else {
            return leftChild.getMin();
        }

    }

    public int getMax() {
        if (rightChild == null) {
            return data;
        } else {
            return rightChild.getMax();
        }
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

    @Override
    public String toString() {
        return "Data =" + data;
    }
}
