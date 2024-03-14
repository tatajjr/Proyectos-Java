package ordenar;
import java.util.Scanner;
import java.util.ArrayList;
public class Ordenar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce texto1");
        String texto1=sc.next();
        ArrayList<Character>arraylista=new ArrayList<>();
        for (int i = 0; i < texto1.length(); i++) {
            arraylista.add(texto1.charAt(i));
        }
        ArrayList<Character>arraylista2=new ArrayList<>();
        System.out.println("Introduce texto2");
        String texto2=sc.next();
        for (int i = 0; i < texto2.length(); i++) {
            arraylista2.add(texto2.charAt(i));
        }
        arraylista.addAll(arraylista2);
        System.out.println(arraylista);
    }
    
}
