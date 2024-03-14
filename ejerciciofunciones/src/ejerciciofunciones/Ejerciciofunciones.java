/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciofunciones;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Ejerciciofunciones {

    public static boolean tipo(char a)
     {
         boolean voc=true;
        boolean cons=false;
         if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
         {
         System.out.println("Vocal");
          return voc;
             
         }
         else
         {
          System.out.println("Consonante");
          return cons;
         }
             
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char letra;
        
        
        System.out.println("Introduzca una letra para saber si es vocal o consonante");
        letra=sc.next().charAt(0);
        
        
        while(letra!='f')
        {
            System.out.println(tipo(letra));     
            break;
        }
        
        if (letra=='f')
        {
            System.out.println("Has salido del programa");
        }
        
        
    }
    
}










