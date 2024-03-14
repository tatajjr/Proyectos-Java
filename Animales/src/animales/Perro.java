/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author Medac
 */
public class Perro extends Animal{
    //Constructuros
    public Perro(){
        super();
        nombre="perro";
    }
   //Metodos
    @Override
    public void comer() {
        throw new UnsupportedOperationException("Pienso"); 
    }

    @Override
    public void dormir() {
        throw new UnsupportedOperationException("Duermo"); 
    }

    
}
