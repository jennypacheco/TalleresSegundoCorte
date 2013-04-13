/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aniobisiesto;

import java.util.Scanner;

/**
 *
 * @author Jenny
 */
public class AnioBisiesto {

    public static void main(String[] args) {
        int Anio = 0;

        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el año a validar");
        Anio = entrada.nextInt();


        while (Anio != 0) {
            if (Anio % 4 == 0) {

                System.out.println("El año es bisieto");

            } else {
                System.out.println("El año no es bisieto");
            }
          
            
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digite el año a validar");
        Anio = entrada2.nextInt();
        }
    }
}
