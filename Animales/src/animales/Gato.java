/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author Medac
 */
public class Gato extends Animal{
    //Constructores
    public Gato(){
        super();
        nombre="gato";
    }
    //Metodos
    @Override
    public void comer() {
        throw new UnsupportedOperationException("Atun"); 
    }

    @Override
    public void dormir() {
        throw new UnsupportedOperationException("Duermo"); 
    }
    
}
