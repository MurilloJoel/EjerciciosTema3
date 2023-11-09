/*
 *Ejercicio 2

Escribir un programa que reciba los datos de una persona por teclado: nombre,  edad y sexo (‘H’/’M’) y 
saque un mensaje por pantalla indicando el nombre, si es mayor de edad y si es una mujer o un hombre.
 */
package EjerciciosIF;

/**
 *
 * @author joel
 */
import java.util.Scanner;
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int edad;
        char sexo;
        
        System.out.println("Proporcione su nombre: ");
        nombre= teclado.nextLine();
        
        System.out.println("Propocione su edad: ");
        edad= teclado.nextInt();
        
        
        
        if(edad>=18){
            teclado.nextLine();
            
            System.out.println("Proporcione su sexo (H / M): ");
            sexo= teclado.nextLine().toUpperCase().charAt(0);
            
            if(sexo== 'H'){
                
                System.out.println(nombre+ " bienvenido, tienes " +edad+  " años, por lo que eres mayor de edad, y eres hombre.");
                
            }else if(sexo== 'M'){
                
                System.out.println(nombre+ " bienvenido, tienes " +edad+  " años, por lo que eres mayor de edad, y eres mujer.");
                
            }else {
                System.out.print("El valor del sexo introducido no es correcto");
            }
            
        }else if(edad>=0 && edad<18){
            teclado.nextLine();
            System.out.println("Proporcione su sexo (H / M): ");
            sexo= teclado.nextLine().toUpperCase().charAt(0);
            
            if(sexo== 'H'){
                
                System.out.println(nombre+ " bienvenido, tienes " +edad+  " años, por lo que eres menor de edad, y eres hombre.");
                
            }else if(sexo== 'M'){
                
                System.out.println(nombre+ " bienvenido, tienes " +edad+  " años, por lo que eres menor de edad, y eres mujer.");
                
            }else {
                System.out.print("El valor del sexo introducido no es correcto");
            }
        }else{
            System.out.println("La edad introducida no es valida ");
        }
        
    }
    
}
