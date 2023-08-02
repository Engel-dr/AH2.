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
public class ejercicio1 {
public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("ingrese su primer numero");
    int numero = teclado.nextInt();
    System.out.println("ingrese su segundo numero");
    int numero2 = teclado.nextInt();
     if (numero == numero2){
     System.out.println("son iguales");
     }
     else {
     System.out.println("no son iguales");
     }
     }
    
}
