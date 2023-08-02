/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CesarLopez
 */
public class ejercicio2 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("ingrese un numero");
    int numero = teclado.nextInt();
     if (numero >=0){
     System.out.println("es un numero positivo");
     }
     else {
     System.out.println("es un numero negativo");
     }
     }
    
}
