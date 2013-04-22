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

        double Total = 0;
        int Salario = 0;
        int Gastos = 0;
        int Cuota = 0;
        int NumMes = 0;


        //Valor del Salarario
        Scanner EntradaMes = new Scanner(System.in);
        System.out.println("Ingrese el el numero de meses que desea validar");
        NumMes = EntradaMes.nextInt();
        //Valor del mes
        ArrayList<String> mes = new ArrayList<String>();



        if (NumMes >= 13 || NumMes==0) {
            System.out.println("El mes: " + NumMes + " No es valido");
        } else {
            for (int i = 1; i <= NumMes; i++) {

                if (i <= NumMes) {

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
                            Total = ((Total + Salario - Gastos - Cuota) * 1.1);
                            System.out.println("El total del salario en el mes : " + i + " es de: " + Total);
                            break;
                        } else {
                            System.out.println("El mes no esta dentro del rango 1 a 12");
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("El numero de meses que desea validar fue eccedido o incorrecto los solicitados son: " + NumMes);
        System.out.println("El total de la cantidad de meses guardados es de salario es: " + Total);
    }
}
