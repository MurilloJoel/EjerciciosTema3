/*
 * Ejercicio 19: Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
 */
package EjerciciosFor;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String negativos="no";

        for (int contador = 1; contador <= 10; contador++) {
            System.out.println("Dame un numero: ");
            numero = teclado.nextInt();
            
            if(numero<0){
                negativos="si";
            }
            
        }
        System.out.println("\n ¿Ha habido negativos? --> " + negativos);
    }

}
