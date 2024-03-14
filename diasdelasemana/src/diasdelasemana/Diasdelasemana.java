/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diasdelasemana;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Diasdelasemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número");
        num=sc.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;         
        }
        // TODO code application logic here
        int nota;
        System.out.println("Introduce your note");
        nota=sc.nextInt();
        
        switch(nota)
        {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
             System.out.println("Insuficiente");
             break;
         case 5:
             System.out.println("Suficiente");
         case 6:
             System.out.println("Bien");
             break;
         case 7:
         case 8:
             System.out.println("Notable");
             break;
         case 9:
         case 10:
             System.out.println("Sobresaliente");
             break;
    
          }
    }
}
