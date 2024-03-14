/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package battleroyale;

/**
 *
 * @author Medac
 */
public class BATTLEROYALE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j1=new Jugador("Alfonso");
        Jugador j2=new Jugador("Monico");
        do {
            int a=(int)(Math.random()*2);
            if (a==0)//Jugador 1 le pega al jugador 2
            {
                j1.Lucha(j2);
            }
            else//Jugador 2 le pega a jugador 1
            {
                j2.Lucha(j1);
            }
         System.out.println("La vida de "+j1.getnombre()+ " es " +j1.getvida()+" , la vida de "+j2.getnombre()+" es " +j2.getvida());
        } while (j1.getvida()>0&&j2.getvida()>0);    
        if(j1.getvida()==0){
            System.out.println("Ha ganado "+ j2.toString());
        }
        else{
            System.out.println("Ha ganado " +j1.toString());
        }
    }
}
