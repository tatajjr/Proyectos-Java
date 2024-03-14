/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenarmayoramenor;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Ordenarmenoramayor 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
       Scanner sc=new Scanner(System.in);/*
       int num1,num2;
       System.out.println("Introduzca su primer numero");
       num1=sc.nextInt();
       System.out.println("Introduzca su segundo numero");
       num2=sc.nextInt();
       if (num1==num2)
       {
       System.out.println("Sus numeros son iguales");
       }
       else
       {
           if(num1<num2)
           {
           System.out.println(num1+" es menor que "+num2);
           }
           else
           {
           System.out.println(num1+" es mayor que "+num2);
           }
       }*/
       //Ordenar 3 numeros de mayor a menor
       int num1,num2,num3;
       System.out.println("Introduzca tres numeros para ordenarlos de mayor a menor");
       num1=sc.nextInt();
       num2=sc.nextInt();
       num3=sc.nextInt();
       if(num1>num2&&num2>num3)
       {
       System.out.println(num1 + "<" + num2 +"<" + num3);
       }
       else if(num1<num2&&num2<num3)
       {
           System.out.println(num3+ ">" + num2 + ">" +num1);
       }
       else if(num2>num1&&num1>num3)
       {
           System.out.println(num2 + ">" + num1 + ">" +num3);
       }
       else if(num2<num1&&num1<num3)
       {
           System.out.println(num3 + ">" + num1 + ">" +num2);
       }
       else if(num3>num1&&num1<num2)
       {
           System.out.println(num2 + ">" + num3 + ">" +num1);
       }
       else if(num3<num1&&num1>num2)
       {
           System.out.println(num1 + ">" + num3 + ">" + num2);
       }
    }
            
}
