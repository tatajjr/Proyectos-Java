/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajedrez;

/**
 *
 * @author Medac
 */
public abstract class Pieza {
    //Atributos
    protected String nombre;
    protected int posx;
    protected int posy;
    protected String equipo;
    //Constructores
    public Pieza(){
        
    }
    //Metodos
    public abstract  void Mover();{
    
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
    public String toString() {
        return super.toString(); 
    }

  

    

   
    
}
