/*
 * Ejercicio 18: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota entre 4 y 5) y suspensos.
 */
package EjerciciosFor;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota;
        int contador;
        int aprobados = 0;
        int suspensos = 0;
        int condicionados = 0;

        for (contador = 1; contador <= 6; contador++) {
            System.out.print("Dame una nota: ");
            nota = teclado.nextDouble();

            if (nota >= 5) {
                aprobados++;
            } else if (nota < 4) {
                suspensos++;
            } else {
                condicionados++;
            }

        }
        System.out.println("El numero de aprobados es: " + aprobados);
        System.out.println("El numero de suspensos es: " + suspensos);
        System.out.println("El numero de condicionados es: " + condicionados);
    }

}
