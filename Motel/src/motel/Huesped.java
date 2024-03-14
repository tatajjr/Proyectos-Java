/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motel;

/**
 *
 * @author Medac
 */
public class Huesped {
    //Atributos
    private String Nombre;
    private int Nºnoche;
    private int precio=50;
    //Constructores
    public Huesped(String Nombre, int Nºnoche){
        this.Nombre=Nombre;
        this.Nºnoche=Nºnoche;
    }
    //Métodos

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNºnoche(int Nºnoche) {
        this.Nºnoche = Nºnoche;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getNºnoche() {
        return Nºnoche;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
  
 @Override
 public String toString(){
    return"Nombre= "+Nombre+"NºNoches="+Nºnoche;
}
}
