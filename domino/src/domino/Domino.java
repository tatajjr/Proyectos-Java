package domino;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Domino {

    public static void main(String[] args) {
        LinkedList <Ficha> lista=new LinkedList();
        LinkedList <Ficha> jug1=new LinkedList();
        LinkedList <Ficha> jug2=new LinkedList();
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <=i; j++) {
                lista.add(new Ficha(i,j));
            }
        }
        
        Collections.shuffle(lista);
        
        for (int i = 0; i < 7; i++) {
            jug1.add(lista.pollFirst());
            jug2.add(lista.pollFirst());
        }
        
      
        
    }
    
}
