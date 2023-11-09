/*
 * Ejercicio 3

Escribir una programa que pida la nota de un examen (un número real entre 0 y 10) e imprima por pantalla la calificación :

    “Suspenso”, si la nota es menor que 5,
    “Aprobado” si está entre 5 y 7 sin incluirlo,
    “Notable” si está entre 7 y 9 sin incluirlo,
    “Sobresaliente” si está entre 9 y 10 sin incluirlo
    “Matrícula de honor” si la nota es igual a 10.
    “fuera de rango” si no es ninguno de los casos anteriores

 */
package EjerciciosIF;



/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota;
        
        System.out.print("Proporcione la nota real: ");
        nota= teclado.nextDouble();
        if(nota<0 || nota> 10){
            System.out.println("Nota no valida");
        }else if(nota<5){
            System.out.println("Estas suspenso con una puntuacion de: "+ nota);
        }else if(nota>=5 && nota< 7){
            System.out.println("Estas aprobado con una puntuacion de: "+ nota);
        }else if(7>=nota &&nota<9){
            System.out.println("Tienes un notable con una puntuacion de: "+ nota);
        }else if(9>=nota &&nota<10){
            System.out.println("Tienes un sobresaliente con una puntuacion de: "+ nota);
        }else if(nota==10){
            System.out.println("Tienes matricula de honor, ENHORABUENA");
        }
        
        
        
    }
    
}
