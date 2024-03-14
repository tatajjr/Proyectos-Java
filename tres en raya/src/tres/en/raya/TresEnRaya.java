/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tres.en.raya;
import java.util.Scanner;
import java.util.Arrays;

public class TresEnRaya {
  
    public static void rellenar(char[][]a)
    {
        for (int i = 0; i <a.length; i++) 
        {
         Arrays.fill(a[i], '_');
        }
    }
   public static void mostrar(char [][] a)
   {
       for (int i = 0; i < a.length; i++) 
       {
           System.out.println(Arrays.toString(a[i]));    
       }
   }
   public static void jugar(char[][]a)
   {
       Scanner sc=new Scanner (System.in);
       System.out.println("Introduzca su nombre jugador 1");
       String j1=sc.nextLine();
       System.out.println("Introduzca su nombre jugador 2");
       String j2=sc.nextLine();
       System.out.println("¿Quieres leer las instrucciones? true/false");
           boolean intrucciones=sc.nextBoolean();
           if (intrucciones==true) 
           {
               System.out.println("El jugador 1 será O y el jugador 2 será X, el tablero en el que jugareis es 3x3,");
               System.out.println("las coordenas se introducirán por filas ( - ) y por columnas( | ),");
               System.out.println("el jugador que consiga poner tres figuras de forma consecutiva será el ganador del juego.");
           }
           
       boolean fin=false;
       do {
           
               System.out.println("Introduzca coordenadas de fila "+j1);
               int fila=sc.nextInt();
               System.out.println("Introduzca coordenadas de columna "+j1);
               int col=sc.nextInt();
               a[fila][col]='O';
               
               mostrar(a);
               
               if         (a[0][0]=='O'&&a[0][1]=='O'&&a[0][2]=='O')       
               {
                   System.out.println("Ha ganado "+j1+" Enhorabuena!!!");
                   fin=true;
               }              
                else if (a[1][0]=='O'&&a[1][1]=='O'&&a[1][2]=='O')
               {
                   System.out.println("Ha ganado "+j1+" Enhorabuena!!!");
                   fin=true;
               }
               else if (a[2][0]=='O'&&a[2][1]=='O'&&a[2][2]=='O')                    
               {
                   System.out.println("Ha ganado "+j1+" Enhorabuena!!!");
                   fin=true;
               }
               else if (a[0][0]=='O'&&a[1][0]=='O'&&a[2][0]=='O')
               {
                   System.out.println("Ha ganado "+j1+" Enhorabuena!!!");
                   fin=true;
               }
               else if (a[0][1]=='O'&&a[1][1]=='O'&&a[2][1]=='O')     
               {
                   System.out.println("Ha ganado "+j1+" Enhorabuena!!!");
                   fin=true;
               }
               else if (a[0][2]=='O'&&a[1][2]=='O'&&a[2][2]=='O')
               {
                   System.out.println("Ha ganado "+j1+" Enhorabuena!!!");
                   fin=true;
               }                
               else if (a[0][0]=='O'&&a[1][1]=='O'&&a[2][2]=='O')
               {
                   System.out.println("Ha ganado "+j1+" Enhorabuena!!!");
                   fin=true;
               }
                else if (a[0][2]=='O'&&a[1][1]=='O'&&a[2][0]=='O')
               {
                   System.out.println("Ha ganado "+j1+" Enhorabuena!!!");
                   fin=true;
               }
               
               System.out.println("Introduzca coordenadas de fila "+j2);
               fila=sc.nextInt();
               System.out.println("Introduzca coordenadas de columna "+j2);
               col=sc.nextInt();
               a[fila][col]='X';
               
               mostrar(a);
             
               if         (a[0][0]=='X'&&a[0][1]=='X'&&a[0][2]=='X') 
               {
                   System.out.println("Ha ganado "+j2+" Enhorabuena!!!");
                   fin=true;                   
               }               
                else if (a[1][0]=='X'&&a[1][1]=='X'&&a[1][2]=='X')                   
               {
                   System.out.println("Ha ganado "+j2+" Enhorabuena!!!");
                   fin=true;
               }               
               else if (a[2][0]=='X'&&a[2][1]=='X'&&a[2][2]=='X')
               {
                   System.out.println("Ha ganado "+j2+" Enhorabuena!!!");
                   fin=true;
               }               
               else if (a[0][0]=='X'&&a[1][0]=='X'&&a[2][0]=='X')                  
               {
                   System.out.println("Ha ganado "+j2+" Enhorabuena!!!");
                   fin=true;
               }               
               else if (a[0][1]=='X'&&a[1][1]=='X'&&a[2][1]=='X')
               {
                   System.out.println("Ha ganado "+j2+" Enhorabuena!!!");
                   fin=true;
               }              
               else if (a[0][2]=='X'&&a[1][2]=='X'&&a[2][2]=='X')
               {
                   System.out.println("Ha ganado "+j2+" Enhorabuena!!!");
                   fin=true;
               }              
               else if (a[0][0]=='X'&&a[1][1]=='X'&&a[2][2]=='X')
               {
                   System.out.println("Ha ganado "+j2+" Enhorabuena!!!");
                   fin=true;
               }
               else if (a[0][2]=='X'&&a[1][1]=='X'&&a[2][0]=='X')
               {
                   System.out.println("Ha ganado "+j2+" Enhorabuena!!!");
                   fin=true;
               }
                
       } while (!fin);
       
       System.out.println("Gracias por jugar!!!");
       
   }
    public static void main(String[] args) {
        
      char[][] tresenraya=new char[3][3];
      rellenar(tresenraya);
      mostrar(tresenraya);
      jugar(tresenraya);
      
    }
}
