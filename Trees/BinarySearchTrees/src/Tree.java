public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInorder();
        }
    }

    public void preOrder(){
        if (root != null) {
            root.preOrder();
        }
    }

    public void delete(int value) {
        //passing the root of a subtree
        root = delete(root, value);
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }
        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        } else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        } else {
            //Root is the value that we are looking for

            //Cases: 1 and 2 node to delete has 0 or 1 child(ren)
            if (subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild();
            } else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }

            //Case 3: Node to delete has 2 children

            //Replace the value in the subtree node with the smallest value from the right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().getMin());

            //Delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));

        }

        return subtreeRoot;
    }

    public int min() {
        if (root != null) {
            return root.getMin();
        }
        return Integer.MIN_VALUE;
    }

    public int max() {
        if (root != null) {
            return root.getMax();
        }
        return Integer.MAX_VALUE;
    }

}
