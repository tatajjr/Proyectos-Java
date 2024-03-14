/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydificil;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class Arraydificil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       int[] array={3,2,4,7};
        System.out.println("Este es el primer array" +Arrays.toString(array));
       int[] array2;
       //Para copiar un array en otro array nuevo y le añade nuevas posiciones con valor 0 predefinido
       array2=Arrays.copyOf(array, 5);
        //for (int i = 0; i < 2; i++) 
        //{
       //     array2[i]=array[i];
        //}
        
        System.out.println("Introduzca el nuevo valor");
        array2[2]=sc.nextInt();
        //System.out.println("En que posicion quieres meter el array");
        //int posi=sc.nextInt();
        for (int i = 2; i < array2.length-1; i++) 
        {
            array2[i+1]=array[i];
        }
        
        System.out.println(Arrays.toString(array2));
        System.out.print("Este es tu array ordenado de menor a mayor: ");
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
    
}
