package practica4casa;

public class Coche extends Vehiculo{
public Coche(){
    nombre="Coche";
    posx=0;
    posy=0;
}

    public String getNombre() {
        return nombre;
    }

    public int getPosx() {
        return posx;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getPosy() {
        return posy;
    }
    @Override
    public void avanzar() {
        if (posy+3<=9) {
            posy=posy+3;
        }
        else{
            posy=9;
        }
       
    }

    @Override
    public void retroceder() {
        if (posy-3>=0) {
            posy=posy-3;
        }
        else{
            posy=0;
        }
    }
    
    
}
