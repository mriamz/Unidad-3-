/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paroimpar;
import java.util.Scanner;

/**
 *
 * @author laraf
 */
public class Paroimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner (System.in);
        int num, resultado;
        System.out.println("ingrese numero ");
        num = lectura.nextInt();
        resultado =num%2;
        if (resultado==0) {
            System.out.println("el numero ingresado es par "); 
            
        }else{
            System.out.println("el numero ingresado es impar ");
        }
    }
    
}
