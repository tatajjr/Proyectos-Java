/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package media;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    /*public static double media(double num1,double num2){
        double res=(num1+num2)/2;
        return res;
    }
    public static int potencia(int b, int e){
        int res=1;         
        for(int i=1;i<=e;i++)
        {
            res=res*b;
        }
        return res;
        }*/
    public static int factor(int a){
        int res=1;
        for(int i=a;i>=1;i--)
        {
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       /* double a=122,b=32;
        
        System.out.println(media(a,b));
        a=78;b=145;
        System.out.println(media(a,b));
        
        int base, exp;
        System.out.println("Introduce la base");
        base=sc.nextInt();
        System.out.println("Introduzca el exponente");
        exp=sc.nextInt();
            System.out.println("El resultado es "+potencia(base,exp));*/
       int num;
        System.out.println("Introduzca el numero que quieres factorizar");
        num=sc.nextInt();
        System.out.println("El resultado es "+ factor(num));
        
    }
  
}
    
    
    

