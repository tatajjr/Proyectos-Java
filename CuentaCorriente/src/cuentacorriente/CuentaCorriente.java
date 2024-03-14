/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentacorriente;

/**
 *
 * @author Medac
 */
public class CuentaCorriente {
    //Variables
    private double saldo;
   Persona persona;
   private double limite;
   
   //Constructores
    public CuentaCorriente(double saldo){
        this.saldo=saldo;
     }
     CuentaCorriente(String dni, String nombre){       
       saldo=0;       
       limite=-50;
    }
     CuentaCorriente (Persona persona, double saldo, double limite){
         this.persona=persona;        
         this.saldo=saldo;
         this.limite=limite;
     }
   //Métodos
   void ingreso(double ingreso){
       this.saldo=saldo+ingreso;
    
}
  void retirar(double sacar){
       if((saldo-sacar)<limite){
           System.out.println("No tienes suficiente dinero");
       }
       else{
           saldo=saldo-sacar;
       }
   }
   void mostrar(){
       System.out.println(persona);
       System.out.println("Saldo es " +saldo);
       System.out.println("Limite es "+limite);
       
   }
    
}
