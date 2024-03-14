/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redondeocorrectamente;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Redondeocorrectamente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Programa que redondea correctamente le numero real 
        que el usuario introduzca*/
        Scanner sc=new Scanner(System.in);
         double datoreal;
         System.out.println("Introduzca un numero real");
         datoreal=sc.nextDouble();
         int redondeo;
         datoreal=datoreal+0.5;
         redondeo=(int)datoreal;
         
        System.out.println("Su numero redondeado correctamente es: "+redondeo);
        // TODO code application logic here
    }
    
}
