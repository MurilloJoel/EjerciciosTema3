/*
 * Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
 */
package EjerciciosWhile;

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
        int numero=0;
        double resultado=0;
        
        do{
            System.out.print("Dime un numero: ");
            numero= teclado.nextInt();
            resultado= Math.pow(numero, 2);
            System.out.println("El cuadrado del numero es: "+resultado);
            
            
            
        }while(numero>= 0);
        
    }
    
}
