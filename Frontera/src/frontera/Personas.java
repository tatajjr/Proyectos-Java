/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontera;
import java.util.Scanner;
/**
 *
 * @author ivang
 */
public class Personas {
    //Atributos
    private String dni;
    private String nombre;
    
    //Constuctores
    Personas(){
        
    }
    public Personas (String nombre, String dni){
        this.dni=dni;
        this.nombre=nombre;
    }
    //Constructor Copia
    public Personas(Personas personas){
        nombre=personas.nombre;
        dni=personas.dni;
        
    }
    
    //Métodos
   
   
   @Override
public String toString(){
    return"Nombre: "+ nombre+"Dni "+dni;
}

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

 
    
    
}
