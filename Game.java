
import java.util.Scanner;

class Game {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int data = 1 + (int) (Math.random() * 99);
        int answer = 5;
        int guess;

        GameBinarySearchTree tree = new GameBinarySearchTree();
        for (int k = 1; k <= 10; k++) {
            data = k;
            tree.insert(data);
        }
        tree.inorder();
        System.out.println(" Please guess a number among 1-2000");

        while (true) {
            guess = keyboard.nextInt();
            if (guess == answer) {
                System.out.println("you win!");
                break;
            } else if (guess < answer) {

                for (int k = 1; k <= guess; k++) {
                    tree.delete(k);
                }
                
                System.out.print("Please guess a number between");
                tree.inorder();
                System.out.println("");
            } else if (guess > answer) {
                for (int j = 10; j >= guess; j--) {
                    tree.delete(j);
                }
                System.out.print("Please guess a number among ");
                tree.inorder();

            }

        }

    }

}
