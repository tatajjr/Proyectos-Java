/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuedo;

/**
 *
 * @author Medac
 */
public class Persona {
    //Atributo
    private String Nombre;
    private String lugar;
    private boolean asesino=false;
    //Constructores
    public Persona (String Nombre, String lugar){
        this.Nombre=Nombre;
        this.lugar=lugar;
        
    }
    //Metodos
    public void asesino(boolean asesino){
        this.asesino=asesino=true;       
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setAsesino(boolean asesino) {
        this.asesino = asesino;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public boolean isAsesino() {
        return asesino;
    }
    public void dondeestabas(){
        if (asesino==false) {
            System.out.println("Estaba en "+lugar);
        }
        else{
            String[]lugares={"Hall","Dormitorio","Jardin","Cocina","Salon","Baño"};
        int luga=(int)(Math.random()*6);
        String lugardementira=lugares[luga];
        System.out.println(lugardementira);
        
    }
    }
}
