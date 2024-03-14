/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package señoranillos;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class SeñorAnillos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Aragon a1=new Aragon();
        Legolas l1= new Legolas();
        Gimli g1=new Gimli();
        Orco orco=new Orco();
        Jugador[] jugadores={a1,l1,g1};
            Carta[] mazo=new Carta[10];
            for (int i = 0; i < mazo.length; i++) {
              
                int ataque=(int)(Math.random()*10);
                int vida=(int)(Math.random()*10);
                mazo[i]=new Carta(ataque,vida);
            }
            do {
                for (int i = 0; i < jugadores.length; i++) {
                    int random=(int)(Math.random()*10);
                    jugadores[i].robarCarta(mazo[random]);
                    
                    jugadores[i].verCarta();
                    System.out.println("Que quieres hacer    1.Usar Carta   2.Atacar");
                    int res=sc.nextInt();
                    
                    switch(res){
                        case 1:
                            System.out.println("Que posicion de carta quieres usar");
                            int resp=sc.nextInt();
                            jugadores[i].usarCarta(resp);
                            break;
                        case 2:
                            orco.setVida(orco.getVida()-jugadores[i].getAtaque());
                            break;
                        default:
                            System.out.println("Mete un  numero que valga");
                            break;
                    }
                    
                }
                int rand=(int)(Math.random()*3);
                jugadores[rand].setVida(jugadores[rand].getVida()-orco.getAtaque());
        } while (jugadores[0].getVida()>0||jugadores[1].getVida()>0||jugadores[2].getVida()>0||orco.getVida()>0);
    }
    
}
