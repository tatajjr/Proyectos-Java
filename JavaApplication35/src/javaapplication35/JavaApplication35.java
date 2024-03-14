/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication35;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     int turnos;
        System.out.println("Introduzca el número de turnos");
        turnos=sc.nextInt();
        int tamaño=0;
        System.out.println("Introduce el tamaño de la palabra");
       tamaño=sc.nextInt();
      char[]palabra=new char[tamaño];
        for (int i = 0; i < tamaño; i++) 
        {
            System.out.println("Introduce la letra de la pos "+i);
            palabra[i]=sc.next().charAt(0);     
        }        
        
        System.out.println("Adivina la palabra");
        char[] palabra2=new char[tamaño];
        Arrays.fill(palabra2,'_');     
        int intentos=0;
        boolean adivinado=false;
        do 
        {
            //System.out.println("La palabra a adivinar es " +Arrays.toString(palabra));
            System.out.println(Arrays.toString(palabra2));
            System.out.println("Introduce una letra"); 
            char letra=sc.next().charAt(0);
            //System.out.println("Te quedan "+(turnos-intentos)+ " oportunidades" );
            boolean letraAdivinada = false;
            for (int i = 0; i < tamaño; i++) 
            {
                if(letra==palabra[i])
                    {
                      letraAdivinada=true;
                      palabra2[i]=letra;
                 
                    }
                else
                    {
                      letraAdivinada=false;
                    }
            }
                if(letraAdivinada==false)
                    {
                      intentos++;
                      System.out.println(intentos );
                    }
                
        }
        while((intentos< turnos) && (!adivinado));
        System.out.println("Te has quedado sin intentos, has perdido!!!");
    }
    
}
