/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebacopiaconstructor;

/**
 *
 * @author Medac
 */
public class Persona {
        //Atributos
    private String dni;
    private String nombre;
    static int id=0;
    
    //Constuctores
    public Persona(){
        
    }
    public Persona (String nombre, String dni){
        this.dni=dni;
        this.nombre=nombre;
        id++;
    }
    //Constructor Copia
    public Persona(Persona personas){
        nombre=personas.nombre;
        dni=personas.dni;
        
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    
}
