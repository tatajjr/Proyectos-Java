/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* int a;
        a=3;
        while (a<5)
        {
            System.out.println("hola");
            a++;
        }
        */
       int num;
       Scanner sc=new Scanner(System.in);
       System.out.println("Introduzca un numero");
       num=sc.nextInt();
       while(num!=0)
       {
           if(num%2==0){
               System.out.println("Su numero es par");
               
           }
           else{
               System.out.println("Su numero es impar");
           }
           System.out.println("Introduzca otro numero");
           num=sc.nextInt();
       }
       
    }
    
}
