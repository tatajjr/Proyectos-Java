/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author Medac
 */
public abstract class Animal {
    //Atributos
    int patas;
    String nombre;
    
    //Constructores
    public Animal(){
        patas=4;
        nombre="no name";
    }
    //Metodos
    public abstract void comer();
    public abstract void dormir();
    public void prueba(){
        System.out.println("Hola");
    }
    
    
}
