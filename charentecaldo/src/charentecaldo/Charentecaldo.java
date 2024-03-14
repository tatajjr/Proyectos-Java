/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package charentecaldo;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Charentecaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una letra");
        num=sc.next().charAt(0);
        switch(num)
        {
            case 'l':
                System.out.println("Lunes");
                break;
            case 'm':
                System.out.println("Martes");
                break;
            case 'x':
                System.out.println("Miercoles");
                break;
            case 'j':
                System.out.println("Jueves");
                break;
            case 'v':
                System.out.println("Viernes");
                break;
            case 's':
                System.out.println("Sabado");
                break;
            case 'd':
                System.out.println("Domingo");
                break;         
        }
        // TODO code application logic here
    }
    
}
