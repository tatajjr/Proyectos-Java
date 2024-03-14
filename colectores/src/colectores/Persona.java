/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colectores;

/**
 *
 * @author Medac
 */
public class Persona {
    //Atributos
    String nombre;
    int edad;
    //Constructoresz
    Persona(){
        
    }
    Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
