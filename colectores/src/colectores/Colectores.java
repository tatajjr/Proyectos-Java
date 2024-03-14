package colectores;

import java.util.LinkedList;
import java.util.ArrayList;
public class Colectores {


    public static void main(String[] args) {
        LinkedList<String> arraylink=new LinkedList<>();
        arraylink.add("Pepe");
        arraylink.add("Juan");
        arraylink.add(1,"Elena");
        arraylink.remove(0);
        arraylink.addFirst("Antonio");
        arraylink.addLast("Silvia");
        System.out.println(arraylink);
        
        
        ArrayList<Persona>personas=new ArrayList<>();
        personas.add(new Persona("Juan",18));
        personas.add(new Persona("Pepe",20));
        personas.add(new Persona());
        personas.add(new Persona("Elena", 25));
        System.out.println(personas);
        
//        for (int i = 0; i < personas.size(); i++) {
//            if(personas.getNombre()==null){
//                personas.setNombre()="Emilio";
//                personas.setEdad()=24;
//            }
//        }

        
    }
    
}
