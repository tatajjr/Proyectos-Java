package carrera1000km;

import java.util.LinkedList;

public class Jugador {
    //Atributos
    private LinkedList<Carta> lista=new LinkedList<>();
    private int KMtotales;
    
    //Constructor
    
    //Metodos
    public void Avanzar(Carta carta){
        KMtotales+=carta.getKilometro();
    }
    
    public LinkedList<Carta> getLista() {
        return lista;
    }

    public void setLista(LinkedList<Carta> lista) {
        this.lista = lista;
    }

    public void setKMtotales(int KMtotales) {
        this.KMtotales = KMtotales;
    }

    
    public int getKMtotales() {
        return KMtotales;
    }

    @Override
    public String toString() {
        return "Jugador{" + "lista=" + lista + ", KMtotales=" + KMtotales + '}';
    }
    
    
}
