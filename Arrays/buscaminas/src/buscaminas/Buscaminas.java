/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscaminas;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class Buscaminas {
    public static void rellenar(char[][] a)
            {
               for (int fila = 0; fila < a.length; fila++) 
               {
                    Arrays.fill(a[fila],'*');
                }
            }
    public static void mostrar(char[][]a)
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        char[][]tablero=new char[3][3];
        char[][]copia=new char[3][3];
        rellenar(tablero);
        rellenar(copia);
        
        System.out.println("Vamos a jugar al buscaminas.");
        System.out.println("Introduzca el numero de intentos: ");
        int intentos=sc.nextInt();
        boolean buscaminas=false;
        int posx=(int)(Math.random()*3);
        int posy=(int)(Math.random()*3);
        tablero[posx][posy]='o';
        //mostrar(copia);
        System.out.println("----------");
        System.out.println("----------");
        //mostrar(tablero);
        
        do {
            mostrar(copia);
            System.out.println("Introduce una coordena de fila: ");
            int fila=sc.nextInt();
            System.out.println("Introduce una coordena de columna");
            int col=sc.nextInt();
            if(tablero[fila-1][col-1]=='o')
            {
                copia[fila-1][col-1]='o';
                System.out.println("BOOM");
                buscaminas=true;
                mostrar(copia);
            }
            else
            {
                System.out.println("En las coordenadas " +(fila)+"|"+(col)+" no hay bomba.");
                intentos--;
                System.out.println("Te quedan "+ intentos + " intentos");
                if (intentos==0) 
                {
                    System.out.println("Te has quedado sin intentos, has perdido.");
                }
            }
            
        } while (!buscaminas);
            
            if (intentos>0)
            {
                System.out.println("Enhorabuena, Has ganado!!!!");
            }
    }
    
}
