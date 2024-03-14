/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacion;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Ecuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Variables
       double a,b,c,aux;
       double x1,x2;
       Scanner sc=new Scanner(System.in);
       //Meter datos por teclado
       System.out.println("Introduce a");
       a=sc.nextDouble();
       System.out.println("Introduce b");
       b=sc.nextDouble();
       System.out.println("Introduce c");
       c=sc.nextDouble();
       aux= b*b - (4*a*c);
       if(aux<0)
       {
           if (a==0)
           {
               System.out.println("No existe resultado");
           }
            System.out.println("No existe resultado");
       }
       else
       {
           x1=(-b+Math.sqrt (aux)) / (2*a);
           x2=(-b-Math.sqrt(aux)) / (2*a);
           System.out.println("Su primer resultado es "+ x1 +" y el segundo es " +x2);
       }
       
    }
    
}