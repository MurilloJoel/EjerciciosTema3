/*
 * Ejercicio 1
 * Pedir dos números por teclado hasta que sean iguales.
 */
package EjerciciosDiagramas;

/**
 *
 * @author joel
 */

import java.util.Scanner;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int numero1=0;
        int numero2=1;
        
        do{
            System.out.println("\n------------------------------------------------");
            System.out.print("Dame un numero: ");
            numero1=teclado.nextInt();
            System.out.print("Dame un numero: ");
            numero2=teclado.nextInt();
            System.out.println("------------------------------------------------\n");
            
        }while(numero1!=numero2);
        
    }
    
}
