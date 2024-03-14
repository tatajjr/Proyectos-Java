/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;


/**
 *
 * @author Medac
 */
public class Poo {

  
    public static void main(String[] args) {
        Persona persona6 = new Persona();
            System.out.println(persona6.dni);
            persona6.edad=15;
            System.out.println(persona6.mayorEdad());
            persona6.edad=19;
            System.out.println(persona6.mayorEdad());
            //System.out.println(persona6);
            persona6 = new Persona("Ivan",18,"79394451S");
            persona6.pintar();
            
        /*
            persona6.nombre="Ivan";
            persona6.edad=18;
            persona6.dni="79394451S";
            persona6.email="ivangcortes6@gmail.com";
            persona1.saludar();
            persona1.comer();
            
            
       Persona persona2 = new Persona();
       
            persona2.nombre="Carlos";
            persona2.edad=27;
            persona2.dni="44665509S";
            persona2.email="carlosmariafernandezcano@gmail.com";
            persona2.saludar();
            persona2.comer();
            
            
      Persona persona3= new Persona("Julian",18);
       
            System.out.println(persona3.nombre);
            persona3.saludar();
          
     Persona persona5 =new Persona("Paco",18);
           persona5.Incrementar(4);
           System.out.println(persona5.edad);
           persona5.Incrementar(10);
           System.out.println(persona5.edad);
        
       */
    }
    
}
