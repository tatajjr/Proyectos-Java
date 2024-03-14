/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcadoarray;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class AhorcadoARRAY {
   

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)
    {
        boolean jugar=true;
        do {
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
        
            //System.out.println("La palabra a adivinar es " +Arrays.toString(palabra));
            System.out.println(Arrays.toString(palabra2));
            do 
        {
            System.out.println("Introduce una letra"); 
            char letra=sc.next().charAt(0);
            //System.out.println("Te quedan "+(turnos-intentos)+ " oportunidades" );
            boolean letraAdivinada = false;
            boolean aux= false;
            for (int i = 0; i < tamaño; i++) 
            {
                if(letra==palabra[i])
                    {
                      letraAdivinada=true;
                      palabra2[i]=letra;
                      aux=true;
                    }
            }
                if(aux==true)
                {
                    System.out.println("Has acertado");                  
                    aux=false;
                }
                       
                if(letraAdivinada==false)
                    {
                      intentos++;
                      int oportunidades= turnos-intentos;
                      System.out.println("Incorrecto, te quedan " +oportunidades+ " intentos" );
                    }
                if(Arrays.equals(palabra, palabra2))
                {
                    adivinado=true;
                }                
        }
        while((intentos< turnos) && (!adivinado));
        if(intentos>=turnos)
        {
            System.out.println("Te has quedado sin intentos, has perdido!!!");
            System.out.println("La palabra era "+Arrays.toString(palabra));
        }
        else
        {
            System.out.println(Arrays.toString(palabra));
            System.out.println("Has ganado!,Enhorabuena!!!");
        }
            System.out.println("¿Quieres seguir jugando? s/n");
            char respuesta=sc.next().charAt(0);
            if( respuesta=='s')
            {
                jugar=true;
            }
            else if(respuesta=='n')
            {
                jugar=false;
            }
        } while (jugar==true);     
        System.out.println("Gracias por jugar, Hasta la próxima!!");
    }
}