/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipodemotor;
import java.util.Scanner;
/**
 *
 * @author ivang
 */
public class Tipodemotor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int tipobomba=0,tipocombustible=0;
        System.out.println("¿Que tipo de bomba quieres?");
        System.out.println("1.Bomba de agua"+" "+"2.Bomba de propulsión"+" "+"3.Bomba de carbón");
        tipobomba=sc.nextInt();
        if(tipobomba!=1)
        {
        System.out.println("¿Qué tipo de combustible quiere para su bomba?");
            System.out.println("1.Gasolina 2.Diesel 3.Biocombustible");
            tipocombustible=sc.nextInt();
        }
        else{
            System.out.println("Como has escogido bomba de agua, su combustible es el agua!");
        }
       if (tipobomba==2&&tipocombustible==1)
       {
           System.out.println("Enhorabuena,has comprado una Bomba de Propulsion con Gasolina como combustible");
       }
       else if(tipobomba==2&&tipocombustible==2)
               {
                   System.out.println("Enhorabuena,has comprado una Bomba de Propulsion con Diesel como combustible");
               }
       else if(tipobomba==2&&tipocombustible==3)
       {
           System.out.println("Enhorabuena,has comprado una Bomba de Propulsion con Biocombustible como combustible");
       }
       else if (tipobomba==3&&tipocombustible==1)
       {
           System.out.println("Enhorabuena,has comprado una Bomba de Carbón con Gasolina como combustible");
       }
       else if(tipobomba==3&&tipocombustible==2)
               {
                   System.out.println("Enhorabuena,has comprado una Bomba de Carbón con Diesel como combustible");
               }
       else if(tipobomba==3&&tipocombustible==3)
       {
           System.out.println("Enhorabuena,has comprado una Bomba de Carbón con Biocombustible como combustible");
       }
       boolean motoresdeagua;
       if (tipobomba==1)
       {
           motoresdeagua=true;
       }
       else{
           motoresdeagua=false;
       }
        System.out.println("Su bomba es de agua?="+motoresdeagua);
    }
    
}
