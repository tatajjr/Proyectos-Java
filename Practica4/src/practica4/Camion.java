/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author Medac
 */
public class Camion extends Vehiculo {
    public Camion(){
        super();
        nombre="camion";
        posx=0;
        posy=0;
    }
    public void avanzar(){
        if(posy+2<10){
            posy=posy+2;
        }
        else if(posy+2==10){
            posy=10;
        }
    

}
    public  void retroceder(){
        if(posy-2>=0){
            posy=posy-2;
        }
        else if(posy==0){
            System.out.println("No puedes retroceder en la casilla 0");
        }
        

    }
}
