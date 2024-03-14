package practica4casa;

public class Carta {
    //Atributos
    protected String nombre;
    protected int estado;
    //Constructores
    public Carta(String nombre, int estado){
        this.nombre=nombre;
        this.estado=estado;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    //Metodos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEstado() {
        return estado;
    }
    
}
