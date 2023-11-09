/*
 * Ejercicio 2

Escribir un programa que dado un número introducido por teclado entre 1 y 12  
escriba por pantalla el número de días que tiene ese mes.
 */
package EjerciciosCase;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int num_Mes=0;
        int dias=0;
        
        
        System.out.print("Proporcione un mes: ");
        num_Mes= teclado.nextInt();
        
        switch(num_Mes){
            case 1: dias= 31;
            break;
                
                case 2: dias= 28;
            break;
            
                case 3: dias= 31;
            break;
                
                case 4: dias= 30;
            break;
                
                case 5: dias= 31;
            break;
                
                case 6: dias= 30;
            break;
            
                case 7: dias= 31;
            break;
            
            case 8: dias= 31;
            break;
            
            case 9: dias= 30;
            break;
            
            case 10: dias= 31;
            break;
            
            case 11: dias= 30;
            break;
            
            case 12: dias= 31;
            break;
            
            
        }
        
        System.out.print("El numero de mes es: "+ num_Mes + " y el numero de dias es: "+ dias +"\n");
    }
    
}
