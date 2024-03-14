/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class Matrices {
    public static void mostrarArray(char[][] a)
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(Arrays.toString(a[i]));
        }
    }
    public static void mostrar2Array(int[][] a)
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
       Scanner sc=new Scanner(System.in);
        int[][] matriz=new int[3]/*filas*/[3]/*Columnas*/;
        //rellenamos
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[0].length; j++) 
            {
                matriz[i][j]=3;
            }
        }
        for (int filas = 0; filas < matriz.length; filas++) 
        {
            System.out.println(Arrays.toString(matriz[filas]));
        }
        
       int[][] matriz1={{2,3},{7,5},{5,5}};
        for (int i = 0; i < matriz1.length; i++) 
        {
            System.out.println(Arrays.toString(matriz1[i]));    
        }
        mostrar2Array(matriz1);
        
        char[][] matriz2= new char[3][4];
        for (int i = 0; i < matriz2.length; i++)
        {
            for (int j = 0; j < matriz2[0].length; j++)
            {
                matriz2[i][j]='b';
            }
            
        }
        mostrarArray(matriz2);
    }
    
}
