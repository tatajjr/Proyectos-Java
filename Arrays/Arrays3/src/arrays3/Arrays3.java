/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays3;
import java.util.Scanner;

        
/**
 *
 * @author Medac
 */
public class Arrays3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
   
 
 
  /*  int[] secreta=new int[3];
    int[] usuario=new int[3];
    boolean respuesta=false;
        for (int i = 0; i < 3; i++) 
        {
            int r1=(int)(Math.random()*10);
            secreta[i]=r1;
            System.out.println(secreta[i]);  
        }
        //Para pintar el array directamente System.out.println(Arrays.tostring(secreta));
        //También hay que importar lo siguiente import java.util.Arrays;
     while(!respuesta)
     {
        for (int i = 0; i < 3; i++)           
        {
            usuario[i]=sc.nextInt();
        }
          if((secreta[0]==usuario[0])&&(secreta[1]==usuario[1])&&(secreta[2]==usuario[2]))
            {
                respuesta=true;
                System.out.println("Adivinaste los numeros");
            }
            else
            {
                System.out.println("Intentelo de nuevo");
            }
            
     }  */ 
 double nota1=0,nota2=0,nota3=0;
        System.out.println("Dime la nota de tu primer examen");
        nota1=sc.nextDouble();
        System.out.println("Dime la nota de tu segundo examen");
        nota2=sc.nextDouble();
        System.out.println("Dime la nota de tu tercerr examen");
        nota3=sc.nextDouble();
        double media;
        media=(nota1+nota2+nota3)/3;
        System.out.println("La nota media de sus examenes es"+ media);
        
        
   }
}
