package carrera1000km;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class Carrera1000km {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        LinkedList<Carta> mazo=new LinkedList<>();
        
        //Crear cartas
        for (int i = 0; i < 2; i++) {
           mazo.add(new Carta("25 KM ", 25)); 
           mazo.add(new Carta("50 KM ", 50)); 
            mazo.add(new Carta("75 KM ", 75));
            mazo.add(new Carta("150 KM ", 150));
            mazo.add(new Carta("200 KM ", 200));
        }
  
        for (int i = 0; i < 6; i++) {
            mazo.add(new Carta("100 KM ", 100));
        }
        
        for (int i = 0; i < 8; i++) {
            mazo.add(new Carta("SEMAFORO VERDE",false));
            mazo.add(new Carta("SEMAFORO ROJO",true));
            mazo.add(new Carta("GASOLINA",false));
            mazo.add(new Carta("SIN GASOLINA",true));
        }
        
        //Mezclar mazo
        Collections.shuffle(mazo);
        System.out.println(mazo);
        
        
        //Crear mesa
        Mesa mesa= new Mesa();
        
        //Crear Jugadores
        Jugador j1=new Jugador();
        Jugador j2=new Jugador();
        
        //Repartir cartas a jugadores
        for (int i = 0; i < 6; i++) {
            j1.getLista().add(mazo.pollFirst());
            j2.getLista().add(mazo.pollFirst());
        }
        
        //Jugabilidad
        int turnos=0;
        do {
            System.out.println("------------------------------------- Turno: "+turnos+"-------------------------------------");
            
            jugarjugadores(1,j1,mesa,mazo);
            jugarjugadores(2,j2,mesa,mazo);

            turnos++;
        } while (j1.getKMtotales()<1000&&j2.getKMtotales()<1000);
     
        }
     private static void jugarjugadores(int num, Jugador j, Mesa mesa, LinkedList<Carta>mazo){
            Scanner sc=new Scanner(System.in);
            System.out.println("Turno jugador "+num);
            System.out.println("Cartas de la mesa");
            System.out.println(mesa);
            
            System.out.println("Cartas del jugador "+ num+":                                                 Kilometros "+j.getKMtotales());
            System.out.println("Robando carta...");
            j.getLista().add(mazo.pollFirst());
            System.out.println(j.getLista());
            
            System.out.println("Posicion de la carta que quieres jugar: ");
            int posicioncarta=sc.nextInt();
            
            //Guardamos y borramos la carta utilizada
            Carta cartaelegida=j.getLista().get(posicioncarta); j.getLista().remove(posicioncarta);
            if (num==1) {
               mesa.getCartasjugadas1().add(cartaelegida);
         }
            else{
                  mesa.getCartasjugadas2().add(cartaelegida);
            }
          
    }
    
}
