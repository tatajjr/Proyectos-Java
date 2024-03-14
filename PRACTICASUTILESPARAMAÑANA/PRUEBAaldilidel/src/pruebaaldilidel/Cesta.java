package pruebaaldilidel;


public class Cesta {
    //Atributos
    protected String productos;
    protected int unidades;
    
    //Costructor
    public Cesta(String productos, int unidades){
        this.productos=productos;
        this.unidades=unidades;
    }
    //Metodos

    public String getProductos() {
        return productos;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    //ToString
    @Override
    public String toString() {
        return "----" + productos + "----" + unidades + "----";
    }
    
}
