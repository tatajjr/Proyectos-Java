/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package señoranillos;
/**
 *
 * @author Medac
 */
public abstract class Jugador {
    //Atributos
    protected int vida;
    protected int ataque;
    protected boolean vivo;
    protected int size;
    Carta[]cartas;

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public boolean isVivo() {
        return vivo;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }
    //Constructores
    public Jugador(){
        size=0;
        vivo=true;
        cartas=new Carta[100];
    }
    //Metodos
    public void robarCarta(Carta carta){
        cartas[size]=carta;
        size++;
    }
   public void verCarta(){
       for (int i = 0; i < cartas.length; i++) {
           if(cartas[i]!=null){
               System.out.println(cartas[i]+"pos"+i);
           }
       }
   }
   public void usarCarta(int entero){
       vida=cartas[entero].getVida();
       ataque=cartas[entero].getAtaque();
   }
}
