/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notacase;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Notacase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nota;
        System.out.println("Introduzca su nota");
        nota=sc.nextInt();
       switch (nota)//podemos poner datos primitivos (int,booleano,char,double,string)
       {
           case 0:
              System.out.println("Tiene un 0");
              break;
           case 1:
              System.out.println("Tiene un 1");
              break;
           case 2:
              System.out.println("Tiene 2");
              break;
           default:
              System.out.println("error");
       }
    }
    
}
