/*
 *Ejercicio 4

Escribe un programa, de nombre Socios, que calcule la cuota que se debe abonar en un club de paddel. La cuota es de 800 euros. 
Tendrán un 40% de descuento las personas mayores de 65 años y un 25% de descuento los menores de 21 años, si los padres no son socios, ç
y un 45% si los padres son socios.
 */
package EjerciciosIF;



/**
 *
 * @author joel
 */
import java.util.Scanner;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double cuota= 800;
        double cuota2;
        int edad;
        char socios;
        
        System.out.print("Cuantos años tienes: ");
        edad= teclado.nextInt();
        teclado.nextLine();
        
        if(edad>21 && edad<65){
            System.out.println("Tu cuota sera de 800\u20AC");
        }else if(edad<21){
            System.out.print("¿Tus padres son socios? (S/N): ");
            socios=teclado.nextLine().toUpperCase().charAt(0);
            if(socios== 'S'){
                cuota2= cuota-(cuota* 0.45);
                System.out.println("La cuota final es: "+ cuota2);
            }else if(socios == 'N'){
                cuota2= cuota-(cuota* 0.25);
                System.out.println("La cuota final es: "+ cuota2);
            }else{
                System.out.println("Valor no valido, por lo que se te aplicara la cuota normal de "+cuota);
            }
        }else if(edad>65){
            cuota2= cuota-(cuota*0.4);
            System.out.println("La cuota final es: "+ cuota2);
        }else{
            System.out.println("La edad introducida es incorrecta");
        }
        
    }
    
}
