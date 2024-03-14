package colleccioneshassrt;

import java.util.HashSet;
import java.util.Iterator;

public class ColleccionesHasSrt {

    public static void main(String[] args) {
         HashSet <Integer> numeros =new HashSet<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(2);
        numeros.add(9);
        
        System.out.println(numeros);
        numeros.add(9);
        System.out.println(numeros);
        
        HashSet <String> nombres=new HashSet<>();
        nombres.add("Juan");
        nombres.add("Pepe");
        nombres.add("Vicente");
        
        System.out.println(nombres);
        
        Iterator <String> it= nombres.iterator();
        while(it.hasNext()){
            System.out.println("Nombre es "+ it.next());
        }
        String prueba="pepe";
        System.out.println(nombres.contains(prueba));
        
        
        
        HashSet <Personas> personas=new HashSet<>();
        personas.add(new Personas("pepe","7w7",18));
        personas.add(new Personas("ivan","7q7",18));
        personas.add(new Personas("kaiko","7e7",18));
        
        System.out.println(personas);
        Personas p2=new Personas("ivan","7q7",18);
        personas.add(p2);
        
        System.out.println(personas);
        
        
        
        
    }
    
}
