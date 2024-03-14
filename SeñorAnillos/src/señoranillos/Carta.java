/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package señoranillos;

/**
 *
 * @author Medac
 */
public class Carta {
    //Atributos
    int vida;
    int ataque;
    //Metodos
    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    //Constructores
    public Carta(int vida, int ataque){
        this.ataque=ataque;
        this.vida=vida;
    }
    @Override
    public String toString(){
        return"La vida es " +vida+" y el ataque es "+ataque;
    }

  
}
