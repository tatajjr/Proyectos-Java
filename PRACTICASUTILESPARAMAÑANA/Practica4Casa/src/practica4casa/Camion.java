package practica4casa;

public class Camion extends Vehiculo {
public Camion(){
    nombre="Camion";
    posx=2;
    posy=0;
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

    public String getNombre() {
        return nombre;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }
    @Override
    public void avanzar() {
         if(posy+2<=9){
           posy=posy+2;
       }
         else{
             posy=9;
         }
    }

    @Override
    public void retroceder() {
          if (posy-2>=0) {
            posy=posy-2;
        }
          else{
              posy=0;
          }
    }
    
}
