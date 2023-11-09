/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

/**
 *
 * @author developer
 */
import java.util.Scanner;
public class Probando_Excepciones1 {


    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        boolean procesar= true;
        int num;
        
        while(procesar){
            try{
                System.out.print("Escribe un numero: ");
                num= Integer.parseInt(teclado.nextLine());          // peligro por usuario con ganas de molestar.
                System.out.println("El numero leido es: "+ num);
                procesar = false;
            }catch(NumberFormatException ex){
                System.out.println("Dije entero, no es tan dificil, tu puedes. ");
            }
        }
    }
    
}
