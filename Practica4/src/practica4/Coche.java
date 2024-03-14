/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author Medac
 */
public class Coche extends Vehiculo {
    public Coche(){
        super();
        nombre="coche";
        posx=2;
        posy=0;
    }
    public void avanzar(){
     if(posy+3<10){
            posy=posy+3;
        }
}
    public  void retroceder(){
        if(posy-3>=0){
            posy=posy-3;
        }
         else if(posy==0){
            System.out.println("No puedes retroceder en la casilla 0");
        }
    }
}
