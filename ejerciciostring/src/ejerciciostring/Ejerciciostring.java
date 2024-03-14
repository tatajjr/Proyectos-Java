/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciostring;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Ejerciciostring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce la primera palabra");
        String palabra1=sc.nextLine();
        System.out.println("Introduce la segunda palabra");
        String palabra2=sc.nextLine();
        System.out.println(palabra1.length());
        System.out.println(palabra2.length());
        if (palabra1.length()>palabra2.length()) 
        {
            System.out.println("La palabra 1 es mas grande");
        }
        else if (palabra2.length()>palabra1.length())
        {
            System.out.println("La palabra 2 es mas grande");
        }
        else
        {
            System.out.println("Son de igual tamaño");
        }
    }
    
}
