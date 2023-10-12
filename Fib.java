/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fib;

import java.util.Scanner;

/**
 *
 * @author laraf
 */
public class Fib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner letura =new Scanner (System.in);
        int n,n2=1;
        int n3;
        int suma=0;
        
        System.out.println("ingrese el numero a desear ");
        n=letura.nextInt();
        for (int i = 0; i<n;i++) {
            n3 =suma;
            suma=n2+suma;
            
            n2= n3;
            
            System.out.println(n2);
        }
       
    }
    
}
