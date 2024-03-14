package pruebaaldilidel;

public class Producto {
    //Atributos
    protected String nombre;
    protected int precio;
    //Constructores
    public Producto(String nombre, int precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    //Metodos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
    
}
