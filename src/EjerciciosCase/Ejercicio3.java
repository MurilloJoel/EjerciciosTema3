/*
 * Ejercicio 3

Escribir una programa que dado un nombre de mes introducido por teclado y escriba por pantalla el número de días que tiene ese mes.
 */
package EjerciciosCase;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String mes= "";
        int dias=0;
        
        
        System.out.print("Proporcione un mes: ");
        mes= teclado.nextLine().toUpperCase();
        
        switch(mes){
            case "ENERO": dias= 31;
            break;
                
                case "FEBRERO": dias= 28;
            break;
            
                case "MARZO": dias= 31;
            break;
                
                case "ABRIL": dias= 30;
            break;
                
                case "MAYO": dias= 31;
            break;
                
                case "JUNIO": dias= 30;
            break;
            
                case "JULIO": dias= 31;
            break;
            
            case "AGOSTO": dias= 31;
            break;
            
            case "SEPTIEMBRE": dias= 30;
            break;
            
            case "OCTUBRE": dias= 31;
            break;
            
            case "NOVIEMBRE": dias= 30;
            break;
            
            case "DICIEMBRE": dias= 31;
            break;
            
            
        }
        
        System.out.print("El numero de mes es: "+ mes + " y el numero de dias es: "+ dias +"\n");
    }
    
}
