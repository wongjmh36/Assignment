
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jason
 */
public class Week1a {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight: ");
        int weight = sc.nextInt();
        System.out.println("Enter height: ");
        int height = sc.nextInt();

        int FC = weight / (height * height);

        if (FC > 25) {
            System.out.println("Too Fat, need to keep fit!");
        } else if (FC < 15) {
            System.out.println("Too thin,  need to keep fat!");
        } else {
            System.out.println("Just fit, keep on!");
        }

    }

}
