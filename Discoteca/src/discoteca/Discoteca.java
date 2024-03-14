package discoteca;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Discoteca {


    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double dinero=0;
        System.out.println("Dicoteca MEDAC");
        Persona p1=null;
        try{
   
         p1=new Persona();
//        Persona p2=new Persona();
        
        Persona [] array={p1};
        
        
        }
        catch(InputMismatchException e1){
            System.out.println("Error por introducir un valor que no coincide con el tipo esperado");
        }
        catch(EdadException e2){
            System.out.println(e2.toString());
        }
        catch(SaldoException e3){
            System.out.println(e3.toString());
        }
        
        
        try{
            System.out.println("¿Cuanto dinero quieres sacar?");           
            dinero=sc.nextDouble();
            p1.sacarDinero(dinero);
        }
        catch(InputMismatchException e4){
            System.out.println("Error por intoducir un valor que no coincide con el tipo esperado");
        }
        catch(SaldoException e5){
            System.out.println(e5.toString());
        }
        catch (NullPointerException e6){
            System.out.println("error por no crear persona");
        }
        
        
        
        finally{
            System.out.println("Saliendo de la Discoteca MEDAC...");
        }
            
        
        }//main
    
    
    
    
}
