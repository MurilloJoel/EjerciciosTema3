/*
 * Ejercicio 9

Realizar un programa que compruebe si un número es primo. Un número es primo si solo es divisible por 1 y por sí mismo.
 */
package Variados3;

/**
 *
 * @author joel
 */
import java.util.Scanner;
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        int numero;
        boolean primo= true;
        
        System.out.print("Dame un numero: ");
        numero=teclado.nextInt();
        
        /*          VERSION FOR
        
            for(int i= 2; i < numero && primo; i++){
                if(numero % i == 0){
                    primo = false;
                }
            }
        */
        
        int i= 2;
        while(i< Math.sqrt(numero) && primo){
            if(numero % i == 0){
                primo = false;
            }
            i++;
        }
        
            if(primo){
                System.out.println("Es primo");
                
            }else{
                System.out.println("No es primo");
            }
        
        
    }
    
}
