/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundialaflotacasa;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Medac
 */
public class HundirlaFlotacasa {
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
        int posx=(int)(Math.random()*10);      
        int posy=(int)(Math.random()*10);
        if(posy+7<10)
        {
            for (int i = 0; i < 4; i++) 
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
            int posx=(int)(Math.random()*10);
            int posy=(int)(Math.random()*10);
              for (int i = 0; i < 3; i++) 
              {
                  if (posy+8<10) 
                  {
                    agua[posx][posy+1]='D';
                    
                  }
                  else
                  {
                      aux=false;
                  }
              }
        } while (!aux);
       mostraragua(agua);
    }
    
}