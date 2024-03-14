/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuedo;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class Cuedo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona [] arraypersona= new Persona[6];       
        Scanner sc=new Scanner(System.in);
        System.out.println("Ha habido un asesinato, vamos a morir todos");
        Persona p1=new Persona("Mayordomo","Hall de entrada");
        arraypersona[0]=p1;
        Persona p2=new Persona("Ama de llaves","Dormitorio");
        arraypersona[1]=p2;
        Persona p3=new Persona("Jardinero","Jardin");
        arraypersona[2]=p3;
        Persona p4=new Persona("Cocinero","Cocina");
        arraypersona[3]=p4;
        Persona p5=new Persona("Propietario","Salon");
        arraypersona[4]=p5;
        Persona p6=new Persona("Esposa_Propietario","Baño");
        arraypersona[5]=p6;
        int asesinoo=(int)(Math.random()*6);
        arraypersona[asesinoo].asesino(true);
        System.out.println(asesinoo);
        int turnos=3;
        boolean ganar=false;
     do{   
        System.out.println("1.Dime el asesino");
        System.out.println("2.Elige con quien hablar");
        int opcion=sc.nextInt();
        switch (opcion){
            case 1:
                    System.out.println("¿Quien es?");
                    String ase=sc.next();
                    if (ase.equalsIgnoreCase(arraypersona[asesinoo].getNombre()))
                            {
                        System.out.println("Has ganado");
                        turnos=0;
                        ganar=true;
                }
                    else{
                        System.out.println("Has perdido");
                    }
                break;
            case 2:
                System.out.println("¿Con quien quieres hablar?");
                System.out.println("1.Mayordomo 2.Ama de llave 3.Jardinero 4.Cocinero 5.Propietario 6.Esposa Propietario");
                int hablar=sc.nextInt();
                hablar--;
                arraypersona[hablar].dondeestabas();    
                break;
        }
        int matar=(int)(Math.random()*6);
        if(matar==asesinoo){
            
        }
     }while(turnos>0);
        
    }
    
}
