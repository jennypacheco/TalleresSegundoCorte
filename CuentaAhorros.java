/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentahaorros;

import java.util.ArrayList;
import java.util.Scanner;

public class CuentaHaorros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        int Salario = 0;
        int Gastos = 0;
        int Cuota = 0;
        double UTotal = 0;
        int salir = 2;


        //Valor del mes
        ArrayList<String> mes = new ArrayList<String>();

        while (salir != 1) {
        for (int i = 1; i <= salir; i++) {
        
                //Valor del Salarario
                Scanner EntradaSalario = new Scanner(System.in);
                System.out.println("Ingrese su salario del mes: " + i);
                Salario = EntradaSalario.nextInt();

                //Valor del Gastos
                Scanner EntradaGastos = new Scanner(System.in);
                System.out.print("Ingrese sus Gastos");
                Gastos = EntradaGastos.nextInt();

                //Valor del Cuota
                Scanner EntradaCuota = new Scanner(System.in);
                System.out.print("Ingrese su Cuota");
                Cuota = EntradaCuota.nextInt();



                while (Salario != -1) {
                    if (i != 0 && i <= 12) {
                        double Total = ((Salario - Gastos - Cuota) * 1.1);
                        UTotal = Total + UTotal;
                        System.out.println("El total del salario en el mes : " + i + " es de: " + Total);
                        break;
                    } else {
                        System.out.println("El mes no esta dentro del rango 1 a 12");
                        break;
                    }
                }
                
                    
                    Scanner EntradaContinuidad = new Scanner(System.in);
                    System.out.println("desea continuar: 1->No, 2->Si");
                    salir= EntradaContinuidad.nextInt();
            }

        }
        System.out.println("El total de la cantidad de meses guardados es de salario es: " + UTotal);
    }
}
