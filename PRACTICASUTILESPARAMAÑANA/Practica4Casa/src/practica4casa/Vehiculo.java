package practica4casa;


public abstract class Vehiculo {
    //Atributos
    protected String nombre;
    protected int posx;
    protected int posy;
    //Constructor
    public Vehiculo(){
    };    
    //Metodos
    public abstract void avanzar();
    public abstract void retroceder();

    @Override
    public String toString() {
        return  nombre;
    }
}
