/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicarecu;

/**
 *
 * @author Medac
 */
public class Supermercado {
    //Atributos
   String nombre;
    Producto[]listaproducto;

    //Constructores
    public Supermercado(String nombre, Producto[]lista){
        this.nombre=nombre;
        this.listaproducto=lista;
    }
    //Metodos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
}
