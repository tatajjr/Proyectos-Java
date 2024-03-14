package carrera1000km;


public class Carta implements Comparable{
    private String nombre;
    private int kilometro;
    
    //Constructor carta velocidad
    public Carta(String nombre, int kilometro) {
        this.nombre = nombre;
        this.kilometro = kilometro;
    }
    //Constructor cartas ataque
    public Carta(String nombre, boolean ataque){
        this.ataque=ataque;
        this.nombre=nombre;
    }
    
    //Metodos
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setKilometro(int kilometro) {
        this.kilometro = kilometro;
    }

    public void setAtaque(boolean ataque) {
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getKilometro() {
        return kilometro;
    }

    public boolean isAtaque() {
        return ataque;
    }
    private boolean ataque;
    
    public Carta(int num){
        kilometro=num;
    }
    
        @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
