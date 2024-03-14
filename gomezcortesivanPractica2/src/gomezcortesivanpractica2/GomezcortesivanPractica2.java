/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gomezcortesivanpractica2;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class GomezcortesivanPractica2 {
    public static void rellenar(char [][] a)
    {
        for (int i = 0; i <2 ; i++) 
        {
            for (int j = 6; j <a.length; j++)
            {
               a[i][j]='X';
            }                     
        }
        for (int i = 0; i < 1; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
            a[i][j]='_';    
            }
        }
        for (int i = 1; i < 2; i++) 
        {
            for (int j = 5; j < 6; j++) 
            {
            a[i][j]='_';    
            }   
        }
         for (int i = 2; i < 3; i++) 
        {
            for (int j = 5; j < 9; j++) 
            {
            a[i][j]='_';    
            }   
        }
          for (int i = 2; i < 9; i++) 
        {
            for (int j = 9; j < 10; j++) 
            {
            a[i][j]='X';    
            }   
        }
          for (int i = 2; i < 10; i++) 
        {
            for (int j = 8; j < 9; j++) 
            {
            a[i][j]='_';    
            }   
        }
        
        for (int i = 1; i < 10; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
            a[i][j]='X';    
            }
    
        }
        for (int i = 3; i < 10; i++) 
        {
            for (int j = 5; j < 7; j++) 
            {
            a[i][j]='X';    
            }   
        }
        for (int i = 5; i < 6; i++) 
        {
            for (int j = 7; j < 8; j++) 
            {
                a[i][j]='*';
            }
        }
        for (int i = 3; i < 5; i++) 
        {
            for (int j = 7; j < 8; j++) 
            {
             a[i][j]='X';    
            }
        }
        for (int i = 6; i < 10; i++) 
        {
            for (int j = 7; j < 8; j++) 
            {
            a[i][j]='X';    
            }
    
        }
        for (int i = 9; i < 10; i++) 
        {
            for (int j = 9; j < 10; j++) 
            {
            a[i][j]='O';    
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
    
    
     public static void jugar(char[][]a)
     {
         Scanner sc= new Scanner (System.in);
         boolean fin=false;
         
         do {
             //Iniciamos desde la casilla[ 9]/[9]
         int fila=9,col=9,turnos=0;
            
             boolean bien=true;
             int posi;
                  
                               
                 boolean partida=true;
                 boolean numero=true;
                 System.out.println("Estas en la casilla O, ¿Hacia donde quieres moverte? 1.Derecha, 2.Izquierda, 3.Arriba, 4.Abajo.");
                 do{
                     //Le preguntamos al jugador hacia donde quiere ir                
                 do {
                     posi=sc.nextInt();
                     if(posi<1||posi>4)
                     {
                         //Si el jugador mete un numero que no debe se le mostrará lo siguiente y se le volverá a pedir el número gracias al bucle do while
                         System.out.println("El numero que has introducido no es válido, Vuelve a introducirlo.");
                     }
                     else
                     {
                         numero=false;
                     }
                 } while (numero==true);              
                 switch (posi)
                 {
                     //Case 1 para ir a la derecha
                     //Contemplamos que si ir a la derecha supone salir del tablero, nos devuelva que no podemos y nos sume un fallo
                 case 1:
                          if(col+1<10)
                          {
                              if(a[fila][col+1]=='_')
                              {
                                  a[fila][col]='_';
                                  col=col+1;
                                  a[fila][col]='O';
                                  System.out.println("Correcto!! ¿Hacia dónde quieres continuar? 1.Derecha, 2.Izquierda, 3.Arriba, 4.Abajo.");
                              }
                              else
                              {
                                  turnos++;
                                  System.out.println("Mal, no puedes ir por ahí. Vuelve a intentarlo.");
                                  System.out.println("LLevas " +turnos+ " fallos");
                              }
                              mostrar(a);
                          }
                          else
                          {
                              System.out.println("Te has salido del tablero, no puedes ir por ahí");
                              turnos++;
                              System.out.println("LLevas "+turnos+" fallos");
                          }
                              
                    break;
                    //Case 2 para ir a la izquierda
                    //En este case no contemplamos la opción de salir del tablero, ya que estar al borde izquierdo del tablero, supone haber conseguido salir del laberinto y ganar el juego.
                 case 2:
                     
                     if(a[fila][col-1]=='_')
                              {
                                  a[fila][col]='_';
                                  col=col-1;
                                  a[fila][col]='O';
                                  System.out.println("Correcto!! ¿Hacia dónde quieres continuar? 1.Derecha, 2.Izquierda, 3.Arriba, 4.Abajo.");
                              }
                    
                              else
                              {
                                  if (!(a[fila][col-1]=='*'))
                                         {
                                  turnos++;
                                  System.out.println("Mal, no puedes ir por ahí. Vuelve a intentarlo.");
                                  System.out.println("LLevas " +turnos+ " fallos");
                                  }
                                else
                                       {
                                  System.out.println("Has entrado en el atajo.");
                                  a[0][0]='O';
                                 mostrar(a);
                                      }
                              }
                     mostrar(a);
                     
                     break;
                     //Case 3 para ir arriba
                     //Contemplamos que si ir arriba supone salir del tablero, nos devuelva que no podemos y nos sume un fallo
                 case 3:
                     if(fila-1>=0)
                     {
                     if(a[fila-1][col]=='_')
                              {
                                  a[fila][col]='_';
                                  fila=fila-1;
                                  a[fila][col]='O';
                                  System.out.println("Correcto!! ¿Hacia dónde quieres continuar? 1.Derecha, 2.Izquierda, 3.Arriba, 4.Abajo.");
                              }
                              else
                              {
                                  turnos++;
                                  System.out.println("Mal, no puedes ir por ahí. Vuelve a intentarlo.");
                                  System.out.println("LLevas " +turnos+ " fallos");
                              }
                    
                     mostrar(a);
                     }
                     else
                     {
                         System.out.println("Te has salido del tablero, no puedes ir por ahí");
                         turnos++;
                         System.out.println("LLevas "+turnos+" fallos");
                     }
                     break;
                     //Case 4 para ir abajo
                     //Contemplamos que si ir abajo supone salir del tablero, nos devuelva que no podemos y nos sume un fallo
                 case 4:
                     if(fila+1<10)
                     {
                     if((a[fila+1][col]=='_'))
                              {
                                  a[fila][col]='_';
                                  fila=fila+1;
                                  a[fila][col]='O';
                                  System.out.println("Correcto!! ¿Hacia dónde quieres continuar? 1.Derecha, 2.Izquierda, 3.Arriba, 4.Abajo.");
                              }
                              else
                              {
                                  turnos++;
                                  System.out.println("Mal, no puedes ir por ahí. Vuelve a intentarlo.");
                                  System.out.println("LLevas " +turnos+ " fallos");
                              }
                     }
                     else
                     {
                         System.out.println("Te has salido del tablero, no puedes ir por ahí");
                        turnos++;
                        System.out.println("LLevas " +turnos+ " fallos");
                     }
                     mostrar(a);
                     break;
                         }                   
                     if (a[0][0]=='O') 
                     {
                         System.out.println("Enhorabuena, Has encontrado la salida!!!!!");
                         partida=false;
                     }
                 }while(partida==true&&turnos<3);
                 if(turnos==3)
                 {
                     //Indicamos al usuario que ha perdido debido a su cantidad de fallos
                     System.out.println("Has fallado 3 veces, Has perdido.");
                 }
                 //Preguntamos si quiere volver a jugar o acabar con el juego
                 
       }while (fin==true);
         System.out.println("¿Quieres volver a jugar? true/false");
                 fin=sc.nextBoolean();
     }
        
    
    public static void main(String[] args) 
    {
        
        char [][]tablero=new char[10][10];
        rellenar(tablero);       
        mostrar(tablero);
        jugar(tablero);
        
    }
    
}
