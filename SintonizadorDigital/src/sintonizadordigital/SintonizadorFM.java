/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintonizadordigital;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class SintonizadorFM {
    //Variables
    private double frecuencia=80;
    
    //Constructores
        SintonizadorFM(){
        
    }
    //Métodos
    void subirbajar(double frecuencia){
        Scanner sc=new Scanner (System.in);
        this.frecuencia=frecuencia;
        boolean bucle=true;
        do {
            System.out.println("¿Quieres subir o bajar la frecuencia?");
        String qhago=sc.next();
        if(qhago.equals("subir"))
        {
            if((frecuencia+0.5)>108)
            {
                frecuencia=80;
            }
            else{
            frecuencia=frecuencia+0.5;
            }
        }
        else if (qhago.equals("bajar"))
        {
            if((frecuencia-0.5)<80)
            {
                frecuencia=108;
            }
            else{
            frecuencia=frecuencia-0.5;
            }
        }
        else{
            System.out.println("Porfavor, baje o suba");
        }
        System.out.println("Ahora estas en la frecuencia " +frecuencia+" Mhz");
        } while (bucle==true);
    }
}
