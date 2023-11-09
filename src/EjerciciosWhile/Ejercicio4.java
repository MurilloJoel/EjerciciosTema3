/*
 * Ejercicio 4: Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 */
package EjerciciosWhile;

/**
 *
 * @author joel
 */
import java.util.Scanner;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int numero;
        int contador=0;
        
        do{
            System.out.println("Dame un numero: ");
            numero=teclado.nextInt();
            if(numero>=0){
                contador=contador+1;
            }
            System.out.println("La cantidad de numeros introducidos es: "+ contador);
            
        }while(numero>=0);
        
    }
    
}
