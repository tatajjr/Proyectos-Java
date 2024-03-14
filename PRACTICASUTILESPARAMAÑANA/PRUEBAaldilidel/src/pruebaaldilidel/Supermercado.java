package pruebaaldilidel;


public class Supermercado {
        //Atributos
        protected String nombre;
        protected Producto [] listadeproductos;
        
        //Constructores
        public Supermercado(String nombre, Producto[]listadeproductos){
            this.nombre=nombre;
            this.listadeproductos=listadeproductos;
        }

        //Metodos
        public void setNombre(String nombre) {
        this.nombre = nombre;
        }
    public void setListadeproductos(Producto[] listadeproductos) {
        this.listadeproductos = listadeproductos;
        }

    public String getNombre() {
        return nombre;
        }

    public Producto[] getListadeproductos() {
        return listadeproductos;
        }
        //ToString

    @Override
    public String toString() {
        return "Supermercado{" + "nombre=" + nombre + ", listadeproductos=" + listadeproductos + '}';
    }
    
    
}
