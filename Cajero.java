/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.util.Scanner;

/**
 *
 * @author laraf
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura =new Scanner (System.in);
        
        final  double su=5000;
         System.out.println("Bienvenido al Cajero Automático");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar Dinero");
            System.out.println("3. Retirar Dinero");

           int opcion = lectura.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("----------- Consultar Saldo-----------");
                    System.out.println("Su saldo es de: $"+su);
                    break;
                case 2:
                    double st,sd;
               System.out.println("-----------Depositar Dinero-----------");
                    System.out.println("ingrese la cantidad a Depositar ");
                    sd = lectura.nextDouble();
                    st =su+sd;
                    System.out.println("Su nuevo saldo es: $"+st);
               
                    break;
                case 3:
                    double sr,srt;
                    System.out.println("-----------Retirar Dinero-----------");
                    System.out.println("ingrese la cantidad que desee retirar ");
                    sr=lectura.nextDouble();
                    
                    
                    if (su>=sr) {
                        System.out.println("retiro fue exitoso !!");
                        srt=su-sr;
                        System.out.println("Su nuevo saldo es: $"+srt);
                         
                        
                    }else{
                        System.out.println("fondos insuficientes");
                    
                    }
                       break;  
                default:
                    System.out.println("Opción no valida. Por Favor seleccione una opción válida");
            
            }
    }
    
}
