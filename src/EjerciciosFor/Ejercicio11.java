/*
 * Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros números impares.
 */
package EjerciciosFor;

/**
 *
 * @author joel
 */


public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=1;
        int producto=1;
        int contador;
        
        for (contador=1; contador<=19 && numero%2!=0;contador=contador+2){
            
            producto=numero*producto;
            numero=numero+2;
        }
        System.out.println("\n El producto total es: "+ producto);
    }
    
}
