package domino;

public class Ficha implements Comparable<Ficha>{
   int derecha;
   int izquierda;
   int peso;
   
   Ficha(int x, int y){
       if (derecha==izquierda) {
           peso=derecha+izquierda+100;
       }
       else{
           peso=derecha+izquierda;
       }
   }

    @Override
    public String toString() {
        return "Ficha{" + "derecha=" + derecha + ", izquierda=" + izquierda + '}';
    }

    @Override
    public int compareTo(Ficha o) {
        return(peso-o.peso);
    }
   
}
