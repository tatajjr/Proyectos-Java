/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starwars;

/**
 *
 * @author Medac
 */
public class Darthvader {
    //Atributos
    boolean lado_oscuro;
    int habilidad_pilotar;
    int habilidad_espadalaser;
    int poder_fuerza;
    int habilidad_convencer;
    
    //Constructor
    public Darthvader(){
        lado_oscuro=true;
        habilidad_pilotar=5;
        habilidad_espadalaser=4;
        poder_fuerza=5;
        habilidad_convencer=4;
    }
   
    //Metodos
    public void hablar(){
        System.out.println("Hola, yo soy tu padre");
    }
    
}
