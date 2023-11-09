/*
 * Ejercicio 2
 * Sumar los 50 primeros números.
 */
package EjerciciosDiagramas;

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
        Scanner teclado= new Scanner (System.in);
        int a=1;
        int b=2;
        
        while(b!=51){
            
            a=a+b;
            b=b+1;
        }
        System.out.println("La suma total es: "+a);
    }
    
}
