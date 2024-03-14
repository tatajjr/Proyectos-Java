/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2022;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ivang
 */
public class Practica2022 {

    public static void rellenartablero(char[][] a)
    {
        for (int i = 0; i <a.length; i++) 
        {
            for (int j = 0; j < a[0].length; j++) 
            {
                a[i][j]='_';
            }
        }
    }
    public static void mostrar(char[][]a)
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(Arrays.toString(a[i]));
        }
    }   
   
    public static void juego( char[][]a)
    {
        int fila=0,col=0,contador=0;
        Scanner sc= new Scanner(    System.in);
        boolean jugar=true;
        do {
            boolean numero=true;
            do {
                System.out.println("Introduce una coordenada de fila");
            fila=sc.nextInt();
            System.out.println("Introduce una coordenada de columna");
            col=sc.nextInt();
                if (fila>4||col>4) 
                {
                    numero=false;
                    System.out.println("Coordenadas fuera del tablero, introduce de (0-4)");
                }
            } while (!numero);
            System.out.println("esta bien");
            a[fila][col]='X';
            mostrar(a);
            if (((fila == 1 && col == 0) || (fila == 3 && col == 3) || (fila == 0 && col == 3)))              
            {
                boolean ppt=true;
                int guardia=(int)(Math.random()*3+1);
                    System.out.println(guardia);
                do {
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                System.out.println("Te has topado con un guardia!!! Ganale en piedra papel o tijeras para conseguir el objeto");
                System.out.println("----------------------------------------------------------------------------------------------------------------------");
                System.out.println("Piedra, papel o tijeras, 1,2,3 YA!!");
                System.out.println("--------------------------------------------");
                System.out.print("¿Qué quieres sacar? P de Piedra, A de pApel o T de Tijeras: ");
                System.out.println("------------------------------------------------------------------------------");
                char minijuego;
                minijuego=sc.next().charAt(0);
                
                    if ((guardia==1&&minijuego=='P')||(guardia==2&&minijuego=='T')||(guardia==3&&minijuego=='A')) 
                    {
                        System.out.println("--------------------------------");
                        System.out.println("Empate, Volved a jugar.");
                        System.out.println("--------------------------------");
                    }
                    else if((guardia==1&&minijuego=='T')||(guardia==2&&minijuego=='A')||(guardia==3&&minijuego=='P'))
                    {
                        System.out.println("--------------------------------------------");
                        System.out.println("Has perdido, vuelve a intentarlo.");
                        System.out.println("--------------------------------------------");
                    }
                    else if((guardia==1&&minijuego=='A')||(guardia==2&&minijuego=='P')||(guardia==3&&minijuego=='T'))
                    {
                        System.out.println("----------------");
                        System.out.println("Has ganado");
                        System.out.println("----------------");
                        ppt=false;
                        contador++;
                    }
               
            } while (ppt==true);
            }
            if((fila==4&&col==4)&&(contador==3))
            {
                jugar=false;
            }
            else if((fila==4&&col==4)&&(contador<3))
            {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Faltan por recoger objetos, NO puedes salir.");
                System.out.println("-----------------------------------------------------------");
            }
        } while (jugar==true);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Has escapado de la prisión con todos los objetos, Enhorabuena.");
        System.out.println("Ahora huye lo mas lejos que puedas para no ser alcanzado por los guardias.");
       System.out.println("-----------------------------------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(    System.in);
        char[][]tablero=new char[5][5];      
        
        rellenartablero(tablero);
        
        //Le pedimos al jugador si desea que se le muestren las instrucciones por pantalla.
        System.out.println("---------------------------------------------------");
        System.out.println("Desea leer las instrucciones: true/false");
        System.out.println("---------------------------------------------------");
        boolean ins=sc.nextBoolean();
        if (ins==true) 
        {
            System.out.println("El juego consistirá en escapar de la prisión, para ellos deberemos robar los");
            System.out.println("prismáticos, el mapa y la navaja. Nos moveremos por el mapa introduciendo");
            System.out.println("coordenas en cada turno(solo podremos movernos una casilla((izq, drch o alante)).");
            System.out.println("Cada vez que lleguemos a la casilla de un objeto deberemos ganarle un piedra papel");
            System.out.println("o tijeras al guardia que los custodie. El juego acaba cuando consigas todos los objetos");
            System.out.println("y huyas de la prisión.");
        }
        
        //Introducimos el lugar donde estarán los prismáticos, mapa y navaja. Tambien la casilla inicial y la salida.
        tablero[0][3]='P';
        tablero[1][0]='M';
        tablero[3][3]='N';
        tablero[4][0]='X';
        tablero[4][4]='O';
        
        mostrar(tablero);
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Teniendo en cuenta que nuestro jugador se encuentra en la casilla X y necesitamos recoger");
        System.out.println("el mapa (M), los prismáticos (P) y la navaja (N). Para huir de la prisión debe salir por la salida(O), comienza a jugar.");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        juego(tablero);
        
        
    }
    
}
