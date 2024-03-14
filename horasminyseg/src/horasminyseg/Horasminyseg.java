/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horasminyseg;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Horasminyseg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce los segundos");
        double seg=sc.nextDouble();
        double min=(int)seg/60;
        seg=seg%60;
        double hor=(int)min/60;
        min=min%60;
        System.out.println("Su hora completa es "+hor+"horas" +min+"minutos" +seg+"segundos");
        // TODO code application logic here
    }
    
}
