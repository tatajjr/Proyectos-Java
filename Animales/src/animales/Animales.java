/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales;

/**
 *
 * @author Medac
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro rocky=new Perro();
        rocky.dormir();
        rocky.comer();
        Gato aslam=new Gato();
        aslam.dormir();
        aslam.comer();
        
        //Polimorfismo; capacidad de almacenar en un array objetos de clases distintas que vienen todos del mismo padre
        Animal[] array={rocky,aslam};
        
    }
    
}
