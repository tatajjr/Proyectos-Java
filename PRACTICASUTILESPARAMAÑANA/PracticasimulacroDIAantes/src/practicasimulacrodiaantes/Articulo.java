package practicasimulacrodiaantes;


public class Articulo {
    //Atributos
    String nombre;
    int precio;
    int cantidad;
    String[] arrayobjeto=new String[100];
    //Constructores
    public Articulo(String []arrayobjeto){
        this.arrayobjeto=arrayobjeto;
    }
    //Metodos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return  "Item:" + arrayobjeto[0] + '\n'+"Precio:" + arrayobjeto[1] +'\n'+ "Cantidad:" +  arrayobjeto[2];
    }
    
}
