/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ajedrez;

import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class Ajedrez {
public static void rellenar(String [][] a)
    {
        for (int i = 0; i <a.length; i++) 
        {
            for (int j = 0; j <8; j++)
            {
               a[i][j]="* ";
            }                     
        }
    }
public static void mostrar(String [][]a)
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(Arrays.toString(a[i]));    
        }
    }
    public static void main(String[] args) {      
        String[][] tablero=new String[8][8];
        rellenar(tablero);
        for (int i = 0; i < 8; i++) {
            tablero[1][i]="P1";
        }
        for (int i = 0; i < 8; i++) {
            tablero[6][i]="p1";
        }
        tablero[0][0]="T1";
  
        mostrar(tablero);
    }
    
}
