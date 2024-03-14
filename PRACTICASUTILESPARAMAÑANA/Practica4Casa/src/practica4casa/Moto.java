/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4casa;

/**
 *
 * @author ivang
 */
public class Moto extends Vehiculo{
public Moto(){
    nombre="Moto";
    posx=1;
    posy=0;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }
    @Override
    public void avanzar() {
       if(posy+4<=9){
           posy=posy+4;
       }
       else{
           posy=9;
       }
    }

    @Override
    public void retroceder() {
        if (posy-4>=0) {
            posy=posy-4;
        }
        else{
            posy=0;
        }
    }
    
}
