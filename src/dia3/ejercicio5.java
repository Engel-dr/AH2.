/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3;

import java.util.Scanner;

/**
 *
 * @author CesarLopez
 */ 
public class ejercicio5 {
public static void main(String[] args){
Scanner sp = new Scanner(System.in);
System.out.print("ingrese el dia: ");
int dia = sp.nextInt();
System.out.print("ingrese el mes: ");
int mes = sp.nextInt();
System.out.print("ingrese el año: ");
int año = sp.nextInt();
if(año >= 1992 && año <=4000){
    if(mes >=1 && mes <=12) {
        if(mes == 2){
          if (dia >=1 && dia <=28){
      System.out.println("la fecha ingresada es: "+ dia+"/"+ mes+"/"+año);
     }else{
          System.out.println("el dia no es valido");
          }
              
        }else{
            if(mes==4|mes==6|mes==9|mes==11 ){ 
            if (dia >=1 && dia <=30){
      System.out.println("la fecha ingresada es: "+ dia+"/"+ mes+"/"+año);
     }else{
          System.out.println("el dia no es valido");
          }
        }else{
        if(mes==1|mes==3|mes==5|mes==7|mes==8|mes==10|mes==12){ 
            if (dia >=1 && dia <=31){
      System.out.println("la fecha ingresada es: "+ dia+"/"+ mes+"/"+año);
     }else{
          System.out.println("el dia no es valido");
          }
        }}
        }
    }else{
    System.out.println("el mes no es valido");
}    
}else{
    System.out.println("el año no es valido");
}
}
}