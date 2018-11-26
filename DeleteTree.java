
import java.util.Scanner;

class DeleteTree {

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
        System.out.println("Arranging in order:");
        tree.inorder();
        while (true) {
            System.out.println("Choose an element from above to remove it from the sequence: ");
            Scanner sc = new Scanner(System.in);           
            tree.delete(sc.nextInt()); // 
            System.out.println("Remaining sequence:");
            tree.inorder();

            //   System.out.println("Tranversed as following:");
            //   System.out.println("Preorder:");
            //   tree.preorder();
            //   System.out.println("Post-Order:");
            //   tree.postorder();
            //  System.out.println("In order:");
            //  tree.inorder();
        }

    }

}
