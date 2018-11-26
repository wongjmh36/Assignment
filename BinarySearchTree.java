
class BinarySearchTree {

    private BinaryNode root;

    public BinarySearchTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public BinaryNode search(BinaryNode t, int x) {
        if (t == null) {
            return null;
        }
        if (x < t.data) {
            return search(t.left, x);
        } else if (x > t.data) {
            return search(t.right, x);
        } else {
            return t;
        }
    }

    private void visit(BinaryNode t) {
        System.out.print(Integer.toString(t.data));
    }

    private BinaryNode insertSubtree(BinaryNode t, int d) {
        if (t == null) {
            t = new BinaryNode(d);
        } else if (d < t.data) {
            t.left = insertSubtree(t.left, d);
        } else if (d > t.data) {
            t.right = insertSubtree(t.right, d);
        }
        return t;
    }

    public void insert(int d) {
        root = insertSubtree(root, d);
    }

    private BinaryNode findMin(BinaryNode t) {
        if (t == null) {
            return null;
        } else if (t.left == null) {
            return t;
        } else {
            return findMin(t.left);
        }
    }

    public void delete(int x) {
        root = deleteSubtree(root, x);
    }

    private BinaryNode deleteSubtree(BinaryNode t, int x) {
        BinaryNode temp, child;
        if (t == null) {
            return null;
        }
        if (x < t.data) {
            t.left = deleteSubtree(t.left, x);
        } else if (x > t.data) {
            t.right = deleteSubtree(t.right, x);
        } else if (t.left != null && t.right != null) {
            /* has 2 leaves */
            t.data = findMin(t.right).data;
            t.right = deleteSubtree(t.right, t.data);
        } else {
            t = (t.left != null) ? t.left : t.right;
        }
        return t;
    }

    public void inorder() {
        inorderSubtree(root);
        System.out.println();
    }

    private void inorderSubtree(BinaryNode t) {
        if (t == null) {
            return;
        }
        inorderSubtree(t.left);
        System.out.print(" ");
        visit(t);
        inorderSubtree(t.right);
    }

}
