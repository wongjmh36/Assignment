
class TestTree {

    public static void main(String[] args) {
        int data = 0;
        int[] array = new int[]{2, 7, 9, 4, 1, 5, 3, 6, 0, 8};

        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Inserting :");
        for (int k = 0; k <= 9; k++) {
            data = array[k];
            System.out.print(data + " ");
            tree.insert(data);
        }
        System.out.println();
        System.out.println("Arranging in ascending order:");
        tree.inorder();

    }
}
