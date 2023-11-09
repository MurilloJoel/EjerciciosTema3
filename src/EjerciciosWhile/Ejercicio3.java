/*
 * Ejercicio 3: Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
 */
package EjerciciosWhile;

/**
 *
 * @author developer
 */

import java.util.Scanner;
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int numero;
        
        do{
            System.out.println("Dame un numero: ");
            numero=teclado.nextInt();
            if(numero%2==0&& numero!=0){
                System.out.println("Es par");
            }else if(numero%2!=0){
                System.out.println("Es impar");
            }
        }while(numero!=0);
    }
    
}
