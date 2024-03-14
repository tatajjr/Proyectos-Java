/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author Medac
 */
public class Moto extends Vehiculo {
    public Moto(){
        super();
        nombre="moto";
        posx=1;
        posy=0;
    }
    public void avanzar(){
     if(posy+4<10){
            posy=posy+4;
        }
   }
    public  void retroceder(){
        if(posy-4>=0){
            posy=posy-4;
        }
        else if(posy==0){
            System.out.println("No puedes retroceder en la casilla 0");
        }
    }
}
