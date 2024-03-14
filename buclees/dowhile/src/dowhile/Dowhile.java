/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhile;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* int a;
        a=0;
        do{
            System.out.println("Hola");
            a++;
        }
        while (a<3);
       Scanner sc=new Scanner(System.in);
       
        System.out.println("Introduzca su rango minimo:");
       int min=sc.nextInt();
        System.out.println("Introduzca su rango maximo");
       int max=sc.nextInt();
      int rango;
       do{
           System.out.println("Ahora, introduzca su rango, si no está dentro del rango max y min se te volverá a pedir un rango");
            rango=sc.nextInt();
       }
       while((rango<min)||(rango>max));
        System.out.println("Si,bye");*/
       //tabla de multiplicar
       Scanner sc=new Scanner(System.in);
      
        int num,num1=1;
        do{
            System.out.println("Introduce un numero del 1 al 10");
             num=sc.nextInt();
            
        }
        while((num<1)||(num>10));//También lo podemos hacer de la siguiente manera (!((num>0)&&(num<11)) );
          while(num1<11){
             System.out.print(num+"x"+num1+"="+num*num1+" ");
             num1++;
          }
        }
        
    }
    

