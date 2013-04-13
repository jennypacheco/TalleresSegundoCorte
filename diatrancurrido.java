/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diatrancurrido;


import java.util.Scanner;


public class DiaTrancurrido {

        
        
    
    public static void main(String[] args) {
        
        
     int horas=0;
     double Minuto=0;
     int Segundo=0;
     int CMH=0;
     int CMS=0;
     double PT=0;
     


        //Leer cantidad de horas 
        Scanner EntradaHoras =new Scanner(System.in);
        System.out.println("Digite la hora del dia");
        horas = EntradaHoras.nextInt();
        
        //Leer Minutos
        Scanner EntradaMinutos =new Scanner(System.in);
        System.out.println("Digite los minutos del dia");
        Minuto = EntradaMinutos.nextInt();    
        
        //leer segundos
        Scanner Entradasegundos =new Scanner(System.in);
        System.out.println("Digite los segundos del dia");
        Minuto = Entradasegundos.nextInt();    
        
        if(horas>=0 && horas<=23)
        {
        CMH=(horas*60);    
        System.out.println("la cantidad de horas ingresados convertidos a minutos son"+CMH);
         }else{
        System.out.println("La hora no es valida");
        //Leer cantidad de horas 
        Scanner EntradaHoras2 =new Scanner(System.in);
        System.out.println("Digite la hora del dia");
        horas = EntradaHoras2.nextInt();
        }
    
    
    if(Minuto>=0 && Minuto<=59)
        {
        Minuto=Minuto;
        System.out.println("Minutos ingresados"+Minuto);
         }else{
        System.out.println("el Minuto no es valido");
        Minuto=0;
        Scanner EntradaMinutos2 =new Scanner(System.in);
        System.out.println("Digite los minutos del dia");
        Minuto = EntradaMinutos2.nextInt(); 
        }
    
    
    if(Segundo>=0 && Segundo<=59)
        {
        CMS=Segundo/60;
        System.out.println("La cantidad de segundos convertidos a minutos son:"+CMS);
         }else{
        System.out.println("El segundo no es valido");
                
        } 
    
    PT=(CMH+Minuto+CMS)*100/1440;
    System.out.println("El porcentaje del dia en minutos es: "+PT);
    }
}
    
