/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control.de.excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class ControlDeExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int []array={2,3,7};
        System.out.println("Introduce un numero");
     /*
        try{
            num=sc.nextInt();
            System.out.println(array[num]/num);
            System.out.println("Final del Try");
        }
        catch(ArithmeticException e1){
            System.out.println("Error por dividir en 0");
          //  e1.printStackTrace();
         //   System.out.println(e1.toString());
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Error tamaño array");
        }
        catch(InputMismatchException e4){
            System.out.println("Error de String");
        }
        catch(Exception e3){
            System.out.println(e3);
        }
        finally{
            System.out.println("Entrando en el finally");
        }
        */
       try{
            division(array);
        
    
   
            }
       catch(ArithmeticException e){
           System.out.println("Por dividir");
       }
       catch(ArrayIndexOutOfBoundsException a){
           System.out.println("Error por array");
       }
    }
 public static void division(int[] array )throws ArithmeticException{
        
   
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(array[num]/num);
        System.out.println("Final del try");
        if(num>2){
    
           throws new ArithmeticException("Por dividir");
        }
    }
}
