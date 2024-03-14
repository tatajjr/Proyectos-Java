/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg0al10;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num;
       System.out.println("Introduce a number between 0 and 10");
       num=sc.nextInt();
       if (num==0||num==1||num==2||num==3||num==4)
       {
           System.out.println("Insuficiente");
       }
       else if(num==5)
       {
           System.out.println("Suficiente");
       }
       else if(num==6)
       {
           System.out.println("Bien");
       }
       else if(num==7||num==8)
       {
           System.out.println("Notable");
       }
       else if(num==9||num==10)
       {
           System.out.println("Sobresaliente");
       }
       else{
           System.out.println("El numero introducido no es correcto");
       }
    }
    
}
