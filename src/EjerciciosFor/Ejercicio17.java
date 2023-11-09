/*
 * Ejercicio 17: Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.
 */
package EjerciciosFor;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contador;

        System.out.println("Dame un numero entre 0 y 10: ");
        numero = teclado.nextInt();
        
        if(numero<=-1 || numero>=11){
            System.out.println("Valor de la tabla no valido");;
        }else{
            for (contador = 1; contador <= 10; contador++) {

                System.out.println("La tabla de multiplicar del " + numero + " es: \n" + numero + " x " + contador + "= " + (contador * numero));

            }
        }

            
        
    }

}
