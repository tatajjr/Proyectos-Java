
package javaapplication13;
import java.util.Scanner;

public class JavaApplication13 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       double nota=sc.nextDouble();
      /* if((nota<0)||(nota>10))
       {
           System.out.println("Nota no valida");
       }
       else if(nota<5)
       {
           System.out.println("Suspenso");
       }
       else
       {
           System.out.println("Aprobado");
       }*/
      if((nota>0)&&(nota<5))
      {
          System.out.println("Suspenso");
      }
      else if((nota>=5)&&(nota<=10))
      {
          System.out.println("Aprobado");
      }
        
    }
    
}
