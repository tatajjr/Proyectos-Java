/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asfahgahgagh;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class Asfahgahgagh {
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
        Scanner sc=new Scanner(System.in);
        char[][] agua= new char[10][10];
        for (int i = 0; i < agua.length; i++)
        {
            for (int j = 0; j < agua[0].length; j++)
            {
                agua[i][j]='*';
            }
            //if  (posicion que me da randon en x+5 es <10)
            // {
            //      vale
            //}
            //else
            //{
            //      no vale
            //}
        }
       
        boolean aux=true;
        do{
            aux=true;
        int posx=(int)(Math.random()*10);      
        int posy=(int)(Math.random()*10);
        if (posy+5<10) 
        {
            for (int i = 0; i < 5; i++) 
            {
             agua[posx][posy+i]='B';   
            }
        }
        else
        {
            aux=false;
        }
        }while(!aux);
        
         
          do{
              aux=true;
        int posx=(int)(Math.random()*10);      
        int posy=(int)(Math.random()*10);
        if(posy+7<10)
        {
            for (int i = 0; i < 3; i++) 
            {
              agua[posx][posy+i]='C';
            }
        }
        else
        {
            aux=false;
        }
        }while(!aux);
          do {
              aux=true;
            int posx=(int)(Math.random()*10);
            int posy=(int)(Math.random()*10);
              for (int i = 0; i < 2; i++) 
              {
                  if (posy+8<10) 
                  {
                    agua[posx][posy+i]='D';
                    
                  }
                  else
                  {
                      aux=false;
                  }
              }
        } while (!aux);
       mostraragua(agua);
        System.out.println("Vamos a jugar!!");
              System.out.println("Instrucciones: ");
        System.out.println("Introduce 'B' para enontrar el gran buque(5 espacios), 'C' para el barco(3 espacios) y 'D' para el barquito (2 espacios).");
        int buque=5;
        int barc=3;
        int barquito=2;
        char[][] juego= new char[10][10];
        for (int i = 0; i < juego.length; i++) 
        {
            for (int j = 0; j < juego[0].length; j++) 
            {
                juego[i][j]='*';
            }
        }
        mostraragua(juego);
        boolean tocado=false;
        boolean hundido=false;
        do {  
        System.out.println("Introduzca una coordenada de fila");
        int fila=0;
        fila=sc.nextInt();
        System.out.println("Introduzca una coordenada de columna");
        int col=0;
        col=sc.nextInt();
        System.out.println("¿Qué barco quieres enocntrar? B,C o D ");
        char barco=sc.next().charAt(0);
        
        if(agua[fila-1][col-1]==barco)
        {
            juego[fila-1][col-1]=barco;
            tocado=true;
            System.out.println("tocado");
            
            if(barco=='B')
            {
                buque--;
            }
            else if(barco=='C')
            {
                barc--;
            }
            else if(barco=='D')
            {
                barquito--;
            }
          
        }
        if(buque==0)
           {
               buque++;
               System.out.println("y hundido");
           }
        if(barc==0)
           {
               barc++;
               System.out.println("y hundido");
           }
         if(barquito==0)
           {
               barquito++;
               System.out.println("y hundido");
           }
          mostraragua(juego);
            
        if(Arrays.equals(agua,juego))
        {
            hundido=true;
        }
      
        } while (!hundido);       
    }
    
}
    
    

