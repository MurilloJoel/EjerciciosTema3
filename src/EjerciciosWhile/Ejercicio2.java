/*
 * Ejercicio 2: Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
 */
package EjerciciosWhile;

/**
 *
 * @author joel
 */

import java.util.Scanner;
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double numero;
        
        do{
            System.out.println("Dame un numero: ");
            numero=teclado.nextInt();
            if(numero>0){
                System.out.println("Es positivo");
            }else if(numero<0){
                System.out.println("Es negativo");
            }
        }while(numero!=0);
    }
    
}
