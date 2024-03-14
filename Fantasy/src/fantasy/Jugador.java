/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fantasy;

/**
 *
 * @author Medac
 */
public class Jugador {
    //Atributos
    private String nombre;
    private String posicion;
    private double precio;
    //Constructores
    public Jugador(String nombre, String posicion, double precio){
        this.nombre=nombre;
        this.posicion=posicion;
        this.precio=precio;
    }
    //Metodos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public double getPrecio() {
        return precio;
    }
    
    @Override
public String toString(){
    return"Nombre="+ nombre+" Posicion="+posicion+ " Precio="+precio;
}
}
