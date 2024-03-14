/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscaminas2;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class Buscaminas2 {
     
    public static void rellenar(char[][]a)
    {
        
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[0].length; j++)
            {
                a[i][j]='*';
            }
        }
    }
    
    public static void mostrar(char [][]a)
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(Arrays.toString(a[i]));
        }
    }
    
    public static void introducirBomba(char[][]a)
    {
        int filas=(int)(Math.random()*3);
        int col=(int)(Math.random()*3);
        a[filas] [col]='o';
    }
    
    public static void jugar(char[][]tablero,char[][]tablero_copia)
    { 
        Scanner sc=new Scanner(System.in);
        boolean ganar=true;
        int turnos=3;
        do {
            
            int fila;
            int col;
            mostrar(tablero_copia);
            do {
                System.out.println("Introduce una coordenada de fila");
                fila=sc.nextInt();
                System.out.println("Introduce una coordenada de columna");
                col=sc.nextInt();
            } while (!((fila>=0&&fila<3)||(col>=0&&col<3)));
           if (tablero[fila][col]=='o')
           {
               System.out.println("BOOM!!");
               ganar=false;
               turnos=0;
               tablero_copia[fila][col]='o';
           }
           else
           {
               System.out.println("Has gastado un turno");
               turnos--;
               tablero_copia[fila][col]='_';
           }
        } while (turnos>0);
        if(ganar)
        {
            System.out.println("Has ganado");
        }
        else
        {
            System.out.println("Has perdido");
        }
        
    }
    public static void main(String[] args) {
        char [][]tablero= new char[3][3];
        char [][]tablerocopia= new char[3][3];
        rellenar(tablero);
        rellenar(tablerocopia);
        //mostrar(tablero);
        //mostrar(tablerocopia);   
        introducirBomba(tablero);
        //mostrar(tablero);
        jugar(tablero,tablerocopia);
        
    }
    
}
