/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tamaño;
        System.out.println("Introduzca tamaño del array");
        tamaño=sc.nextInt();
       int[] array=new int[tamaño];
        for (int i = 0; i < tamaño; i++) 
        {
         System.out.println("Introduzca numero");
         array[i]=sc.nextInt();
        }
        /*for (int i = 0; i < tamaño; i++) 
        {
            System.out.print(array[i]+" ");
            
        }*/
        for (int i = tamaño-1; i > -1 ; i--) 
        {
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        int[] array2={7,5,6};
        int size= array2.length;
        System.out.println(size);
        
        int[] a={3,2,7};
        int[] b=new int[3];
        b=a;
        System.out.println("El valor del numero 0 del array es "+b[0]);
        a[0]=5;
        System.out.println("El valor del numero 0 del array es "+b[0]);
    }
    
}
