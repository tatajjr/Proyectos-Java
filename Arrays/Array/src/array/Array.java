/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Array {

        public static int sumaArray(int[]a)
        {
            int suma=0;
            for (int i = 0; i < 7; i++) 
            {
            suma=suma+a[i];
             }
            return suma;
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    /*  
        //array cuando conozco los valores que hay dentro
            int [] array={5,3,2,1,7};
            char[] arraya={'a','b','c'};
            System.out.println(array[0]);
        //array cuando no sé los valores que hay dentro
            int[]array2=new int[5];
            array2[0]=2;
            array2[1]=3;
                System.out.println(array2[0]+" "+array2[1]+" "+array2[2]);
    
    int []tabla=new int[4];
    //Rellenar con teclado
        for (int i = 0; i < 4; i++) 
        {
            System.out.println("Introduce el valor=");
            tabla[i]=sc.nextInt();
        }
    //mostrar
        for (int i = 0; i < 4; i++) 
        {
            System.out.print(tabla[i]+" ");   
        }
*/
    //array de tamaño 7, los mete el usuario
       int[] eje=new int[7];
       
      
        for (int i = 0; i < 7; i++) 
        {
            System.out.println("Introduce su valor");
            eje[i]=sc.nextInt();
            
        }
           
        System.out.println(sumaArray(eje));
    }
    
}
