
import java.util.Scanner;

class Game {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int data = 1 + (int) (Math.random() * 1999);
        int answer = 555;
        int guess;

        GameBinarySearchTree tree = new GameBinarySearchTree();
        for (int k = 1; k <= 2000; k++) {
            data = k;
            tree.insert(data);
        }
        //tree.inorder();
        System.out.println(" Please guess a number between 1-2000");

        while (true) {
            guess = keyboard.nextInt();
            if (guess == answer) {
                System.out.println("you win!");
                break;
            } else if (guess < answer)  {
                for (int k = 1; k <= guess; k++) {
                    tree.delete(k);
                }

                System.out.print("Please guess a number between ");
                tree.findMini();
                System.out.print(" to ");
                tree.findMaxi();
                System.out.println("");
                
            } else if (guess >= answer) {
                for (int j = 2000; j >= guess; j--) {
                    tree.delete(j);
                }
             System.out.print("Please guess a number between");
                tree.findMini();
                System.out.print(" to ");
                tree.findMaxi();
                System.out.println("");

            }else {
                System.out.println("you lose!");
                      
            }
           
        }

    }

}
