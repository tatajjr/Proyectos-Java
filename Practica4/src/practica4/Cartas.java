/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author Medac
 */
public class Cartas {
    //Atributos
    String nombre;
    int par;
    //Constructores
    public Cartas(String nombre,int par){
        this.nombre=nombre;
        this.par=par;
    }
    //Metodos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPar(int par) {
        this.par = par;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPar() {
        return par;
    }
    
}
