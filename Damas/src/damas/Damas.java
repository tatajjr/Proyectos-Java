/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package damas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Damas {

   public static void rellenar(char [][] a)
    {
        for (int i = 0; i <a.length; i++) 
        {
            for (int j = 0; j <5; j++)
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
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        char[][]tablero=new char[5][5];
        rellenar(tablero);
        
        
        for (int i = 0; i < tablero.length; i++) 
        {
        tablero[0][i]='N';    
        }
        
        for (int i = 0; i < tablero.length; i++) 
        {   
         tablero[4][i]='B';   
      
        }
        mostrar(tablero);
        int turnos =10;
        do {    
            int posx=0;
            int posy=0;
            boolean blanca=true;
            do {
                blanca=true;
                 System.out.println("Mueven las blancas,   ¿Introduzca las coordenadas (X | Y) de la pieza que quieres mover:?");
            System.out.println("Coordena X: ");
             posx=sc.nextInt();
            System.out.println("Coordena Y: ");
             posy=sc.nextInt();
            if(tablero[posx][posy]=='N'){
                System.out.println("Eso es una pieza Negra");
                blanca=false;
            }
            else if(tablero[posx][posy]=='*'){
                System.out.println("No hay ninguna pieza en esas coordenadas");
                blanca=false;
            }
            } while (!(blanca==true));
           
            System.out.println("Has seleccionado la pieza que se encuentra en las coordenadas "+posx+" "+posy+", ahora que quieres hacer: ");
            boolean juega=false;
            do {
                System.out.println(" 1.Alante 2.Atras 3.Derecha 4.Izquierda");
            int movimiento=sc.nextInt();
            switch(movimiento){
                case 1:
                    if ((posx-1)<0) {
                        System.out.println("No se puede mover esta pieza hacia delante");
                    }                  
                    else{
                    if(tablero[posx-1][posy]=='B'){
                        System.out.println("Ya hay una Blanca en esa posición");
                    }
                    tablero[posx][posy]='*';
                    tablero[posx-1][posy]='B';
                    juega=true;
                    }
                    break;
                case 2:
                    if ((posx+1)>4) {
                        System.out.println("No se puede mover esta pieza hacia atras");
                    }
                    
                    else{
                        
                    if(tablero[posx+1][posy]=='B'){
                        System.out.println("Ya hay una Blanca en esa posición");
                    }
                    else{
                    tablero[posx][posy]='*';
                    tablero[posx+1][posy]='B';
                    juega=true;
                    }
                    }
                    break;
                case 3:
                    if ((posy+1)>4) {
                        System.out.println("No se puede mover esta pieza a la Derecha");
                    }
                    
                    else{
                    if(tablero[posx][posy+1]=='B'){
                        System.out.println("Ya hay una Blanca en esa posición");
                    }
                    else{
                    tablero[posx][posy]='*';
                    tablero[posx][posy+1]='B';
                    juega=true;
                    }
                    }
                    break;
                case 4: 
                    if ((posy-1)<0) {
                        System.out.println("No puedes mover esta pieza a la Izquierda");
                    }
                    
                    else{
                    if(tablero[posx][posy-1]=='B'){
                        System.out.println("Ya hay una Blanca en esa posición");
                    }
                    else{
                        tablero[posx][posy]='*';
                        tablero[posx][posy-1]='B';
                        juega=true;
                    }
                    }
                    break;
                default:
                    System.out.println("Un numero del 1 al 4 porfavor");
                    break;
            }
            } while (juega==false);
            
          mostrar(tablero);
            turnos++;
            boolean negra=true;
            do {
                negra=true;
                 System.out.println("Mueven las negras,   ¿Introduzca las coordenadas (X | Y) de la pieza que quieres mover:?");
            System.out.println("Coordena X: ");
             posx=sc.nextInt();
            System.out.println("Coordena Y: ");
             posy=sc.nextInt();
            if(tablero[posx][posy]=='B'){
                System.out.println("Eso es una pieza Blanca");
                negra=false;
            }
            else if(tablero[posx][posy]=='*'){
                System.out.println("No hay ninguna pieza en esas coordenadas");
                negra=false;
            }
            } while (!(negra==true));
           
            System.out.println("Has seleccionado la pieza que se encuentra en las coordenadas "+posx+" "+posy+", ahora que quieres hacer: ");
            boolean jueganegra=false;
            do {
                System.out.println(" 1.Alante 2.Atras 3.Derecha 4.Izquierda");
            int movimiento=sc.nextInt();
            switch(movimiento){
                case 1:
                    if ((posx+1)>4) {
                        System.out.println("No se puede mover esta pieza hacia delante");
                    }                  
                    else{
                    if(tablero[posx+1][posy]=='N'){
                        System.out.println("Ya hay una Negra en esa posición");
                    }
                    tablero[posx][posy]='*';
                    tablero[posx+1][posy]='N';
                    jueganegra=true;
                    }
                    break;
                case 2:
                    if ((posx-1)<0) {
                        System.out.println("No se puede mover esta pieza hacia atras");
                    }
                    
                    else{
                        
                    if(tablero[posx-1][posy]=='N'){
                        System.out.println("Ya hay una Negra en esa posición");
                    }
                    else{
                    tablero[posx][posy]='*';
                    tablero[posx-1][posy]='N';
                    jueganegra=true;
                    }
                    }
                    break;
                case 3:
                    if ((posy-1)<0) {
                        System.out.println("No se puede mover esta pieza a la Derecha");
                    }
                    
                    else{
                    if(tablero[posx][posy-1]=='N'){
                        System.out.println("Ya hay una Negra en esa posición");
                    }
                    else{
                    tablero[posx][posy]='*';
                    tablero[posx][posy-1]='N';
                    jueganegra=true;
                    }
                    }
                    break;
                case 4: 
                    if ((posy+1)>4) {
                        System.out.println("No puedes mover esta pieza a la Izquierda");
                    }
                    
                    else{
                    if(tablero[posx][posy+1]=='N'){
                        System.out.println("Ya hay una Negra en esa posición");
                    }
                    else{
                        tablero[posx][posy]='*';
                        tablero[posx][posy+1]='N';
                        jueganegra=true;
                    }
                    }
                    break;
                default:
                    System.out.println("Un numero del 1 al 4 porfavor");
                    break;
            }
            } while (jueganegra==false);
            
          mostrar(tablero);
            turnos++;
        } while (turnos>0);
    }
    
}
