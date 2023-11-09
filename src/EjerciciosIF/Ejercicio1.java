/*
 * Ejercicio 1

Escribir un programa que determine si un numero introducido por teclado es par o impar. Comprobar además si es negativo o positivo.
 */
package EjerciciosIF;

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
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dame un numero: ");
        numero= teclado.nextInt();
        
        if(numero%2==0){
            
            if(numero<0){
                System.out.println("El numero es par y negativo");
            }else{
                System.out.println("El numero es par y positivo");
            }
        }else{
            if(numero<0){
                System.out.println("El numero es impar y negativo");
                System.out.println("El numero es impar y positivo");
            }
        }
        
    }
    
}
