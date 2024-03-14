/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motel;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Motel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Huesped [] arrayhuesped=new Huesped[20];
        int i=0;
        boolean fin=true;
        do {
            System.out.println("1.Inserte Huesped 2.Nº Habitaciones libre  3.Calcula precio por nombre del Huesped  4.Elimina huesped por nombre  5.Buscar Huesped por Nombre  6.Buscar Huesped por nºhabitacion  7.Salir");
        int opcion=sc.nextInt();
        switch (opcion){
            case 1:
                if(i<20)
                {
                    System.out.println("Introduce el nombre:");
                String nombre1=sc.next();
                System.out.println("Introduce el Nº de noches:");
                int noches=sc.nextInt();
                Huesped h=new Huesped(nombre1,noches);
                arrayhuesped[i]=h;
                i++;
                }
                else{
                    System.out.println("El hotel esta lleno, Lo sentimos.");
                }              
                break;
            case 2:
                int libre=0;
                for (int a = 0; a < arrayhuesped.length; a++) {
                 if(arrayhuesped[a]==null){
                     libre++;                   
                 }                
                }
                System.out.println("Quedan "+libre+" habitaciones.");
                break;
            case 3:
                System.out.println("Introduzca su nombre para calcular el precio de su estancia en nuestro Motel.");
                String nombre1=sc.next();
                    for (int a = 0; a < arrayhuesped.length; a++) 
                    {
                        if (nombre1.equals(arrayhuesped[a].getNombre()))
                        {
                            System.out.println("El precio su estacia es "+(arrayhuesped[a].getNºnoche()*50)+"€");
                            a=arrayhuesped.length;
                        }
                        else
                        {
                            System.out.println("No hay ningun usuario regitrado con ese nombre");
                        }
                    }
                break;
            case 4:
                System.out.println("Introduzca su nombre para darse de baja.");
                 String nombre2=sc.next();
                    for (int a = 0; a <arrayhuesped.length; a++) 
                    {
                        if (nombre2.equals(arrayhuesped[a].getNombre()))
                        {
                            arrayhuesped[a]=null;
                            i--;
                            a=arrayhuesped.length;
                        }
                        else
                        {
                            System.out.println("No hay ningun usuario registrado con ese nombre.");
                        }
                        a=arrayhuesped.length;
                    }
                break;
            case 5:
                System.out.println("Introduzca su nombre para mostrar su informacion");
                 String nombre3=sc.next();
                    for (int a = 0; a <arrayhuesped.length; a++) 
                    {
                        if(arrayhuesped[a]!=null){
                             if (nombre3.equals(arrayhuesped[a].getNombre()))
                        {
                            System.out.println(arrayhuesped[a]);
                            a=arrayhuesped.length;
                        }
                        }
                       
                        else
                        {
                            System.out.println("No hay ningun usuario registrado con ese nombre.");
                            a=arrayhuesped.length;
                        }
                    }
                break;
            case 6:
                System.out.println("Introduzca el numero de una habitacion, 20 habitaciones (de la Habitacion nº0 hasta la nº19)");
                int numero=sc.nextInt();
                if (arrayhuesped[numero] != null) {
                    System.out.println("En esta habitacion esta alojado "+arrayhuesped[numero].getNombre());
                   break;
                }
                else{
                    System.out.println("No hay nadie alojado en esa habitacion");
                }
                
                break;
            case 7:
                fin=false;
                    break;
            default:
                System.out.println("Introduce un numero valido por favor");
                break;
        }
        } while (fin);
        System.out.println("Hasta pronto!!");
        }
    }
    

