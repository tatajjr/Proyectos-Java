/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starwars;

/**
 *
 * @author Medac
 */
public class Luke extends/*La palabra reservada extends siginifIca que toda la informacion declarada en la clase "Darthvader" va a ser hederada por la clase "Luke"*/ Darthvader{
    //Contructor llamando a la clase padre
    public Luke(){
        super();
        lado_oscuro=false;
        habilidad_espadalaser=5;
    }
        
   @Override
   public void hablar(){
       System.out.println("Hola soy tu hijo");
   }
    
}
