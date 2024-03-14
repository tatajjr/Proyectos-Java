/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radioyarea;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Radioyarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radio, pi=Math.PI;
        System.out.println("Introduzca el radio");
        radio=sc.nextDouble();
        double area=pi*(radio*radio);
        System.out.println("Su area es:" +area);
        double longitud=2*pi*radio;
        System.out.println("Su longitud es:" +longitud);
        
        // TODO code application logic here
    }
    
}
