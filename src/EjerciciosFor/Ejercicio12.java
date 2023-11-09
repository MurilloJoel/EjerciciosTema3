/*
 * Ejercicio 12: Pedir un número y calcular su factorial. Ejemplo: 5! es el factorial de 5 y es 5*4*3*2*1 = 120
 */
package EjerciciosFor;

/**
 *
 * @author joel
 */
import java.util.Scanner;
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int numero;
        int factorial=1;
        
        System.out.println("Dame un numero: ");
        numero=teclado.nextInt();
        
        for (int contador = 1; contador <= numero; contador++) {
            factorial = factorial * contador;
        }
        System.out.println("\n El factorial es: "+ factorial);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
