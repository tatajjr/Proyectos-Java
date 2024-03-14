/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;
import java.util.Scanner;
/**
 *
 * @author ivang
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Ejercicio 5.");
        System.out.println("Supermercado Medac.");
        System.out.println("-------------------");
       
        char producto,otro = 's';
        double z=1,x=1.25,c=1.75,total = 0;
        System.out.println("Producto?");
        producto=sc.next().charAt(0);
        if(producto=='z')
        {
            producto=(char) z;
            total=total+z;
            System.out.println("valor: " +z);
        }
        else if(producto=='x')
            {
            producto=(char) x;
            total=total+x;
            System.out.println("valor: " +x);
        }
        else if(producto=='c')
            {
            producto=(char) c;
            total=total+c;
            System.out.println("valor: " +c);
            }
        while(   (!((otro=='n')||(otro=='N')))&&((otro=='s')||(otro=='S'))   )
        {
            System.out.println("¿Introducir otro producto (s/n)?");
            otro=sc.next().charAt(0);
            
            while ((otro=='s')||(otro=='S'))
            {
                System.out.println("Producto?");           
        producto=sc.next().charAt(0);
        
        if(producto=='z')
        {
            producto=(char) z;
            total=total+z;
            System.out.println("valor: " +z);
        }
        else if(producto=='x')
            {
            producto=(char) x;
            total=total+x;
            System.out.println("valor: " +x);
        }
        else if(producto=='c')
            {
            producto=(char) c;
            total=total+c;
            System.out.println("valor: " +c);
            }
        System.out.println("¿Introducir otro producto (s/n)?");
            otro=sc.next().charAt(0);
         
            }
            if (otro=='n'||otro=='N')
            {
                System.out.println("Precio total de la compra:"+total+"euros.");
            }
            
        }
    

    }