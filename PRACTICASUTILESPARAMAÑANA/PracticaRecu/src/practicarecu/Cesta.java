/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicarecu;

/**
 *
 * @author Medac
 */
public class Cesta {
    //Atributos
    protected String producto;
    protected int unidades;
    //Constructor
    public Cesta(String pro, int uni){
        this.producto=pro;
        this.unidades=uni;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }

    //Metodos
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getProducto() {
        return producto;
    }

    public int getUnidades() {
        return unidades;
    }

    @Override
    public String toString() {
        return "----" + producto + "----" + unidades;
    }
    
}
