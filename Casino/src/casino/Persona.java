/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casino;

/**
 *
 * @author Medac
 */
public class Persona {
    //Atributo
    private String Nombre;
    
    
    
//Metodos
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getFichas() {
        return fichas;
    }
    private int fichas;
}
