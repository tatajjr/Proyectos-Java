/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosrepetidos;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author ivang
 */
public class NumerosRepetidos {
    
    public static void mostrar(int[]a)
    {
       
            System.out.println(Arrays.toString(a));
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []array1= {1,1,1,1,2,2,2,3,4,5};
        int []array01= {1,1,1,1,2,2,2,3,4,5};
        int []array2=new int[array1.length];
        int contador=0;
        for (int i = 0; i < 7; i++)
        {
                if(array1[i]==array1[i+1])
                {                  
                     array2[i]=array1[i+1];  
                     array2= new int [array1.length-1];
                     
                }

            
         }
        mostrar(array1);
        mostrar(array2);
        
    }
    
    
}
