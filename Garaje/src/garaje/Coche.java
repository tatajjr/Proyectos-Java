/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garaje;

/**
 *
 * @author Medac
 */
public class Coche {
    //Atributos
   private  String matricula;
   private String marca;
   //Constructor
   Coche(String matricula, String marca){
       this.matricula=matricula;
       this.marca=marca;
   }
   //Metodos

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
@Override
 public String toString(){
    return "matricula "+matricula+" marca "+marca;
}
}
