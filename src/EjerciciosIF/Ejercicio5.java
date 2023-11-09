/*
 * Ejercicio 5 (Especial Halloween)

Tenemos personas con las siguientes propiedades:

    nombre
    edad
    altura (en centímetros)

Cuando nos encontramos con ellas les preguntamos ¿truco o trato? Según la respuesta haremos lo siguiente:

Si responden truco, el programa devolverá un número de sustos que se calcularán por la acumulación de los siguientes datos:

    1 susto por cada 2 letras del nombre de la persona
    2 sustos si la edad es par
    3 sustos si supera los 100 cm de altura

Si responden trato, el programa devolverá un número de golosinas que se calcularán por la acumulación de los siguientes datos:

    1 golosina por cada letra del nombre
    1 golosina si la edad es múltiplo de 3, pero solo a los que tienes 10 años o menos
    2 golosinas por cada 50 cm de altura hasta un máximo de 150 cm

La salida del programa será el número de sustos seguido por la palabra "BUUUH" o el número de golosinas seguido por la palabra "DULCES".

Si quieres cambiar el aspecto de la salida del programa, puedes sustituir esas palabras por emojis, como por ejemplo:

"BUUUH" por   	"\uD83D\uDC7B"

"DULCE" por    	"\uD83C\uDF6C"

 */
package EjerciciosIF;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre;
        int edad;
        int altura;
        String truco_trato;
        int sustos = 0;       //contador
        int golosinas= 0;       //contador

        System.out.println("¿como te llamas?");
        nombre = teclado.nextLine();

        System.out.println("¿cuantos años tienes?");
        edad = teclado.nextInt();

        System.out.println("¿cuanto mides (en cm)?");
        altura = teclado.nextInt();

        teclado.nextLine();

        System.out.println("truco o trato");
        truco_trato = teclado.nextLine();

        if (truco_trato.equalsIgnoreCase("truco")) {
            int longitudNombre = nombre.length();

            sustos += longitudNombre / 2;

            if (edad % 2 == 0) {

                sustos += 2;

            }

            if (altura >= 100) {
                sustos += 3;

            }
            System.out.println("Te asustaron un total de: " + sustos + " BUUUH");
            
            
        }else if (truco_trato.equalsIgnoreCase("trato")){
            int longitudNombre = nombre.length();

            golosinas += longitudNombre;

            if(edad<=10 && edad%(edad/3)==0){
                golosinas+= 1;
            }
            
            if(altura<=150){
                golosinas+= 2*(altura/50);
            }
            
            System.out.println("Has recibido: " +golosinas+" DULCE");
        }

    }

}
