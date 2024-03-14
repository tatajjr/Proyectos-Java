/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array4;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Array4 {
    public static boolean comparaArrays(int[] a,int[] b)
    {
        boolean igual=true;
            for (int i = 0; i < a.length; i++) 
            {
            
            
                if(a[i]!=b[i])
                    {
                        igual=false;
                    }
                else
                    {
                        igual=true;
                    }
            }
            return igual;
        }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Para mostrar array en consola
        //char a[]=new char[5];
        //Arrays.fill(a,'a');
        //System.out.println(Arrays.toString(a));
        int[] array1={1,2,3};
        System.out.println("Introduzca el tamaño de su array, mínimo tiene que ser 3.");
        int size=sc.nextInt();
        int[] array2=new int[size];
        for (int i = 0; i < size; i++) 
        {
              System.out.println("Introduzca dato en posición " +i);
              array2[i]=sc.nextInt();
        }
        System.out.print("Este es su array= ");
        System.out.println(Arrays.toString(array2));
       // System.out.println(compara);
        System.out.println(comparaArrays(array1,array2));
        
    }
    
}
