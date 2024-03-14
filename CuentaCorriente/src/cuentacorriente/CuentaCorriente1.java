/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentacorriente;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class CuentaCorriente1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1= new Persona("Antonio","79394451s",18,"0807angomor@gmail.com");
             
        Scanner sc= new Scanner (System.in);
        CuentaCorriente cc1=new CuentaCorriente(persona1,600,50);
        cc1.mostrar();
        System.out.println("(---------------------------------------------------------------)");
        //System.out.println("¿Cuanto dinero quieres ingresar?");
        //double x=sc.nextDouble();
       // cc1.ingreso(x);
        //System.out.println("¿Cuanto dinero quieres retirar?");
        //double cantidad=sc.nextDouble();
        //cc1.retirar(cantidad);
        
        CuentaCorriente cc2= new CuentaCorriente(1000);
        cc2.mostrar();
        System.out.println("(---------------------------------------------------------------)");
        //CuentaCorriente cc3=new CuentaCorriente("Carlos","44665509S",1000,60);
        //cc3.mostrar();
        System.out.println("(---------------------------------------------------------------)");
        //cc3.nombre;
       
    }
    
}
