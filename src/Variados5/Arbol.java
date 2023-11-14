/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variados5;

/**
 *
 * @author developer
 */
import java.util.Scanner;
public class Arbol {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la altura del árbol: ");
        int altura = Math.abs(teclado.nextInt());                       //CASTEAR EL NUMERO INTRODUCIDO A POSITIVO

        for (int i = 0; i <= altura; i++) {       
            
            for (int espaciosIn = 0; espaciosIn < (altura - i); espaciosIn++) {      //IMPRIME LOS ESPACIOS ANTERIORES DEL ARBOL
                System.out.print(" ");
            }

            if (i % 3 != 0) {                                           //CASTEO DE LOS IMPARES EMPEZANDO EN LA LINEA 3 PARA LOS #

                for (int izquierda = 0; izquierda < i; izquierda++) {                //IMPRIME LOS * DE LA IZQUIERDA (SI ES PAR)
                    System.out.print("*");
                }

            } else {

                for (int izquierda = 0; izquierda < i; izquierda++) {                 //IMPRIME LOS # DE LA IZQUIERDA (SI ES IMPAR)
                    System.out.print("#");
                }
            }

            if (i != 0 && i % 3 != 0) {                                 //CASTEO DE LOS IMPARES EMPEZANDO EN LA LINEA 3 PARA LOS #

                System.out.print("|");

            } else if (i != 0 && i % 3 == 0) {                                          //IMPRIME EL # CENTRAL SI ES EN UN IMPAR DISTINTO 1

                System.out.print("#");

            } else if (i == 0) {                                        //IMPRIME LA ESTRELLA INICIAL
                System.out.print("*");
            }

            if (i % 3 != 0) {                                           //CASTEO DE LOS IMPARES EMPEZANDO EN LA LINEA 3 PARA LOS #
                
                for (int derecha = 0; derecha < i; derecha++) {                         //IMPRIME LOS * DE LA DERECHA (SI ES PAR)
                    System.out.print("*");
                }
                
            } else {
                for (int derecha = 0; derecha < i; derecha++) {                         //IMPRIME LOS # DE LA DERECHA (SI ES PAR)
                    System.out.print("#");
                }
            }

            for (int espaciosFin= 0; espaciosFin < (altura - i); espaciosFin++) {       //IMPRIME LOS ESPACIOS POSTERIORES DEL ARBOL
                System.out.print(" ");
            }
            System.out.println();                                               //
        }
    }
}