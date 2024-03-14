/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebacopiaconstructor;

/**
 *
 * @author Medac
 */
public class PruebaCopiaconstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1=new Persona("Antonio","8939929s");
        Persona persona2= new Persona(persona1);
        persona1.setNombre("pepe");
        System.out.println(persona2.getNombre());
        System.out.println(persona1.getNombre());
        
    }
    
}
