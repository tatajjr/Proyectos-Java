package carrera1000km;

import java.util.LinkedList;
import java.util.logging.Logger;

public class Mesa {
    
    private LinkedList<Carta> cartasjugadas1=new LinkedList<>();
     private LinkedList<Carta> cartasjugadas2=new LinkedList<>();
     
//Metodos

    public LinkedList<Carta> getCartasjugadas1() {
        return cartasjugadas1;
    }

    public LinkedList<Carta> getCartasjugadas2() {
        return cartasjugadas2;
    }

    public void setCartasjugadas1(LinkedList<Carta> cartasjugadas1) {
        this.cartasjugadas1 = cartasjugadas1;
    }

    public void setCartasjugadas2(LinkedList<Carta> cartasjugadas2) {
        this.cartasjugadas2 = cartasjugadas2;
    }
     
    public void jugarCarta1(Carta carta){
        cartasjugadas1.add(carta);
    }
       public void jugarCarta2(Carta carta){
        cartasjugadas2.add(carta);
    }
     
     
     
    @Override
    public String toString() {
        return "" +cartasjugadas1 + '\n'+
                cartasjugadas2+"";
    }
     
    
}
