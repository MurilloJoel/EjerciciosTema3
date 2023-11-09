/*
 * Ejercicio 14: Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
 */
package EjerciciosFor;


/**
 *
 * @author joel
 */

import java.util.Scanner;
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
         int numero;
         int cantidadTotal = 10;
        int numerosP = 0;
        int numerosN = 0;
        int nCero = 0;
        double sumaP = 0;
        double sumaN = 0;

         
         
         for (int contador= 0; contador< cantidadTotal; contador++) {
             System.out.print("Introduce un numero: ");
             numero=teclado.nextInt();
             if(numero>0){
                sumaP += numero;
                numerosP++;
             }else if(numero==0){
                 nCero++;
             }else if(numero<0){
                 sumaN += numero;
                numerosN++;
             }
             
        }
         if (numerosP > 0) {
            double mediaP = sumaP / numerosP;
            System.out.println("Media de los numeros positivos: " + mediaP);
        }
         
          if (numerosN > 0) {
            double mediaN = sumaN / numerosN;
            System.out.println("Media de los numeros negativos: " + mediaN);
        }
          
         System.out.println("El numero de ceros es: "+ nCero);
         
        
    }
    
}