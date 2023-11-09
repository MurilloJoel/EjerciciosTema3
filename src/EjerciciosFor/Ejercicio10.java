/*
 * Ejercicio 10: Pedir 15 números y escribir la suma total.
 */
package EjerciciosFor;

/**
 *
 * @author joel
 */
import java.util.Scanner;
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int num;
        int suma=0;
        int contador;
        
        for (contador=0; contador<15;contador++){
            System.out.print("Dame un numero: ");
            num= teclado.nextInt();
            suma+=num;
        }
        System.out.println("\nLa suma total es: "+ suma);
    }
    
}
