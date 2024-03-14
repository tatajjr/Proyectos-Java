/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfor;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        /*System.out.println("¿Que tabla de multiplicar quieres hacer?");
        System.out.print("La del:");int num=sc.nextInt();
      for(int i=1;i<=10;i++)
      {
          System.out.println(num+"x"+i+"="+num*i);
      }*/
        int resultado=1;
        int i;
       for( i=1;i<20;i=i+2)
       {
         resultado=resultado*i;
       }
        System.out.println("El resultado es "+resultado);
    }
    }
    

