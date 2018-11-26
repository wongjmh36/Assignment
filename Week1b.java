
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
public class Week1b {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ldlc, tc, hdlc, tg;
        System.out.println("Please input tc: ");
        tc = sc.nextInt();
        System.out.println("Please input hdlc: ");
        hdlc = sc.nextInt();
        System.out.println("Please input tg: ");
        tg = sc.nextInt();
        ldlc = tc - hdlc - tg / 5;
        System.out.println("LDLC = " + ldlc);
    }

}
