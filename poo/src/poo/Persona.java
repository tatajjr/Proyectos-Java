/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Medac
 */
public class Persona {
    //atributos o campos
    String nombre;
    int edad;
    String dni;
    Persona(){
    String email;
        
    }
    Persona (String nombre, int edad, String dni){
       this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
    }
    boolean mayorEdad(){
        boolean resp;
        if(edad<18)
        {
            resp=false;
        }
        else
        {
            resp=true;
        }
        
        return resp;
    }
    
    void pintar()
    {
        
        System.out.println("El nombre es " +nombre);
        System.out.println("La edad es " +edad);
        System.out.println("El DNI es " +dni);
    }
    /*
    //constructores Intrínco de los Objetos
    Persona(){
        System.out.println("Has creado a una persona");
    }
    Persona(String nom, int e){
        this.nombre=nom;
       this. edad=e;             
    }
    
    
    //metodos
    void saludar(){
        System.out.println(nombre + " te dice hola");
    }
    void comer(){
        System.out.println("Estoy comiendo");
    }
     void Incrementar(int n)
    {
        edad=edad+n;
    }*/
   
    
}
