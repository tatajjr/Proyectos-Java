/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battleroyale;


public class Jugador {
    //Atributos
    private String nombre;
    private int vida;
    //Constructores
    public Jugador(){
        
    }
    public Jugador(String nombre){
        this.nombre=nombre;
        vida=5;
    }
    //Metodos
    
    public String getnombre(){return nombre;}
    
    public int getvida(){return vida;}
    
    public void Lucha(Jugador jugador){
        int v=jugador.getvida();
        jugador.setvida(v-1);       
    }
    public void setvida(int vida){
        this.vida=vida;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
@Override
public String toString(){
    return"nombre "+ nombre+" vida "+vida;
}
}
    
    

