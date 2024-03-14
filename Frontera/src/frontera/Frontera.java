/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frontera;
import java.util.Scanner;
/**
 *
 * @author ivang
 */
public class Frontera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        Personas [] arraypersona=new Personas[100];
        boolean salir=true;
        do {
            System.out.println("1.Crear Persona  2.Mostrar Persona  3.Buscar DNI  4.Buscar Nombre  5.Salir");
            int opcion=sc.nextInt();
            switch (opcion){
                case 1 :  //Crear Persona
                System.out.println("Introduce Nombre");
                String nombre=sc.next();
                System.out.println("Introduce dni");
                String dni=sc.next();
                Personas p1=new Personas(nombre,dni);
                arraypersona[i]=p1;
                i++;
                break;
                case 2 ://Mostrar todo
                    for (int a = 0; a < i; a++) 
                    {
                        System.out.println(arraypersona[a]);
                    }
                    break;
                case 3 ://Buscar por DNI
                    System.out.println("Introduce el dni");
                    String dni1=sc.next();
                    for (int a = 0; a < i; a++) 
                    {
                        if (dni1.equals(arraypersona[a].getDni())) 
                        {
                            System.out.println("La persona con dni "+dni1+" es " +arraypersona[a].getNombre());
                        }
                    }
                    break;
                case 4 ://Buscar por Nombre
                    System.out.println("Introduce su nombre");
                    String nombre1=sc.next();
                    for (int a = 0; a < i; a++) 
                    {
                        if (nombre1.equals(arraypersona[a].getNombre()))
                        {
                            System.out.println("El dni de " +nombre1+" es "+arraypersona[a].getDni());
                        }
                    }
                    case 5 :
            salir=false;
            break;
                }       
        } while (salir==true);
        System.out.println("Has salido del progama.");
    
        
        
    }
    
}
