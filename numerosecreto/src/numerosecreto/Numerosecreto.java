/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosecreto;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Numerosecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Juego secreto
       int num,numsecreto;
       numsecreto=(int)(Math.random()*100+1);
      // System.out.println(numsecreto);
       Scanner sc=new Scanner(System.in);
       System.out.println("Introduce un numero");
       num=sc.nextInt();
       while (num!=numsecreto&&num!=-1)
       {  
           if (num>numsecreto)
                {
               System.out.println("Su numero es menor");
                }
           else if (num<numsecreto) 
                {
               System.out.println("Su numero es mayor");
                }
           
           System.out.println("Introduce un numero");
           num=sc.nextInt();
           
            if(num==numsecreto)
                    {
                    System.out.println("Enhorabuena, has ganado");              
                    }
        }
           
           if(num==-1){
               System.out.println("Saliendo... has perdido");
           }
       }
    
    
}
