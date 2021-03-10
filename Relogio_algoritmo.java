/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relogio_algoritmo;

//import java.util.Scanner;
/**
 *
 * @author rafac
 */
public class Relogio_algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        for (int d = 0; d <= 31; d++) {
            for (int h = 0; h <= 23; h++) {
                for (int m = 0; m <= 59; m++) {
                    for (int s = 0; s <= 59; s++) {
                        System.out.printf("%d:%d:%d:%d \n", d, h, m, s);
                        if ((d == 1) && (h == 12) && (m == 0) && (s == 0)) {
                            System.out.println("ALARME!!!");
                            break;

                        }
                    }
                    if (h == 12) {

                        if (d == 1 && h == 12) {
                            break;
                        }
                    }

                }
            }

        }

    }
}
