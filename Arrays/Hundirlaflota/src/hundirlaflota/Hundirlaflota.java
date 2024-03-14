/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundirlaflota;
import java.util.Scanner;
import java.util.Arrays;

public class Hundirlaflota {
    public static void rellenar(char[][] a)
            {
               for (int fila = 0; fila < a.length; fila++) 
               {
                    Arrays.fill(a[fila],'*');
                }
            }
    public static void introducirBarco(char[][]m,int tam, char letra)
    {
            boolean condicion;
            int posx,posy;
            do {
                condicion=false;
                posx=(int)(Math.random()*10);
                posy=(int)(Math.random()*10);
                if (posy+tam<m[0].length) 
                {
                    condicion=true;
                    for (int i = 0; i < tam; i++) 
                    {
                        if (m[posx][posy+i]!='*') 
                        {
                            condicion=false;
                        }
                    }
                    if (condicion) 
                    {
                        for (int i = 0; i < tam; i++)
                        {
                            m[posx][posy+i]=letra;
                        }
                    }
                }
            
        } while (!condicion);
    }
            
    {
        
    }
    public static void mostraragua(char[][]a)
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
        Scanner sc= new Scanner (System.in);
        char[][]tablero=new char[10][10];
        rellenar(tablero);
        introducirBarco(tablero,5,'B');
        introducirBarco(tablero,3,'C');
        introducirBarco(tablero,1,'D');
         mostraragua(tablero);
         System.out.println("------------------------------");
         System.out.println("------------------------------");
        char[][]copia=new char[10][10];
        rellenar(copia);
        int coordx,coordy;
        int contB1=5,contB2=3,contB3=1;
        do {
            mostraragua(copia);
            System.out.println("Introduce una coordena de fila");
            coordx=sc.nextInt();
            System.out.println("Introduce una coordena de columna");
            coordy=sc.nextInt();
            char letra= tablero[coordx-1][coordy-1];
          
           switch(letra)
           {
               case '*':
               break;
               case'B':
                   tablero[coordx][coordy]='T';
                   contB1--;
                   copia[coordx][coordy]='T';
               break;
               case'C':
                   tablero[coordx][coordy]='T';
                   contB2--;
                   copia[coordx][coordy]='T';
               break;
               case'D':
                   tablero[coordx][coordy]='T';
                   contB3--;
                   copia[coordx][coordy]='T';
               break;
           }
        } while(!(contB1==0&&contB2==0&&contB3==0));
        mostraragua(copia);
        System.out.println("FIN!!!!!");
         
        
    }
    
}
