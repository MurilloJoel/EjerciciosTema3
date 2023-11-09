/*
 * Ejercicio 1

Escribir un programa que determine si un número introducido por teclado entre 1 y 7 
escriba por pantalla el nombre del día de la semana correspondiente: lunes, martes, ...
 */
package EjerciciosCase;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner teclado= new Scanner(System.in);
        int num_Dia;
        String dia= "";
        
        
        System.out.print("Proporcione un dia de la semana: ");
        num_Dia= teclado.nextInt();
        
        switch(num_Dia){
            case 1: dia="Lunes";
            break;
                
                case 2: dia="Martes";
            break;
            
                case 3: dia="Martes";
            break;
                
                case 4: dia="Jueves";
            break;
                
                case 5: dia="Viernes";
            break;
                
                case 6: dia="Sabado";
            break;
            
                case 7: dia="Domingo";
            break;
            
            
        }
        
        System.out.print("El numero de dia de la semana es: "+ num_Dia + " y el dia de la semana es: "+ dia +"\n");

        
    }
    
}
