/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1_ivangomez;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Practica1_Ivangomez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ejercicio 1 (1.25 puntos):
    Realiza un programa que reciba la inicial del nombre y 
    la edad de una persona mayor de edad  por teclado 
    (hay que controlar esa condición) y nos diga cuántos años 
    le quedan para jubilarse (suponemos que la edad de jubilación es de 65 años).
    Además, si ya está jubilado, nos debe decir cuántos años lleva jubilado.*/
        
        System.out.println("---------------------------------------------------------");
        System.out.println("Ejercicio 1.");
        
        Scanner sc=new Scanner(System.in);
       char inicial;
       int edad;
        System.out.println("Introduzca la inicial de su nombre.");
         inicial=sc.next().charAt(0);
        System.out.println("Introduzca su edad.");
        edad=sc.nextInt();
        if (edad<65)
        {
            System.out.println("Le quedan "+ (65- edad)+" años para jubilarse.");            
        }
        else
        {
            System.out.println("Lleva "+ (edad-65)+ " años jubilado.");
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Ejercicio 2.");
        /*Ejercicio 2 (1.25 puntos):
    Escriba un programa que lea desde teclado una cantidad en euros e imprima su 
    equivalente en dólares americanos con el formato del siguiente ejemplo:
    1 euros equivalen a 1.16 dólares americanos
    Hay que tener en cuenta que el valor del dólar es algo que cambia con frecuencia 
    y se busca hacer pocos cambios en el código para arreglar el programa.*/
        int euros;
        System.out.println("Introduza una cantidad en euros.");
        euros=sc.nextInt();
        System.out.println("Su equivalente en dólares son: "+(euros*1.16)+"$");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Ejercicio 3.");
        /*Ejercicio 3 (2 puntos):
    Realiza un programa que muestre la siguiente sucesión de números: 3, 6, 9, 12, ..., 99,
    y, a continuación, imprima por pantalla la suma total de todos esos números.*/
        int resultado=1;
        int i;
        for(i=3;i<100;i=i+3)
        {
            System.out.println(i);
            resultado=resultado+i;
        }
            System.out.println("La suma de todos estos número es: "+resultado);
        /*Ejercicio 4 (2.5 puntos):
    Realiza un programa que lea 10 calificaciones por teclado y a continuación, 
    imprima cuántos suspensos hay[1] (notas menores a 5), cuántos aprobados hay (notas entre 5 y 6), 
    cuántos notables hay (notas entre 7 y 8) y cuanto sobresalientes hay (notas superiores a 9).*/
         System.out.println("-------------------------------------------------------------------------");
        System.out.println("Ejercicio 4.");
       
        int nota1,nota2,nota3,nota4,nota5,nota6,nota7,nota8,nota9,nota10;
        int suspenso=0,aprobado=0,notable=0,sobresaliente=0;
        System.out.println("Introduzca 10 calificaciones:");
        nota1=sc.nextInt();
        nota2=sc.nextInt();
        nota3=sc.nextInt();
        nota4=sc.nextInt();
        nota5=sc.nextInt();
        nota6=sc.nextInt();
        nota7=sc.nextInt();
        nota8=sc.nextInt();
        nota9=sc.nextInt();
        nota10=sc.nextInt();
             switch (nota1)
       {
           case 0:
              
              suspenso=suspenso+1;
              break;
           case 1:
              
              suspenso=suspenso+1;
              break;
           case 2:
              
              suspenso=suspenso+1;
              break;
           case 3:
              
              suspenso=suspenso+1;
              break;
          case 4:
              
              suspenso=suspenso+1;
              break;
          case 5:
              aprobado=aprobado+1;
               break;
               case 6:
              aprobado=aprobado+1;
               break;
               case 7:
              notable=notable+1;
               break;
               case 8:
              notable=notable+1;
               break;
               case 9:
              sobresaliente=sobresaliente+1;
               break;
               case 10:
              sobresaliente=sobresaliente+1;
               break;
              
              
           
       }
                 switch (nota2)
       {
           case 0:
              
              suspenso=suspenso+1;
              break;
           case 1:
              
              suspenso=suspenso+1;
              break;
           case 2:
              
              suspenso=suspenso+1;
              break;
           case 3:
              
              suspenso=suspenso+1;
              break;
          case 4:
              
              suspenso=suspenso+1;
              break;
          case 5:
              aprobado=aprobado+1;
               break;
               case 6:
              aprobado=aprobado+1;
               break;
               case 7:
              notable=notable+1;
               break;
               case 8:
              notable=notable+1;
               break;
               case 9:
              sobresaliente=sobresaliente+1;
               break;
               case 10:
              sobresaliente=sobresaliente+1;
               break;
              
              
           
       }
                     switch (nota3)
       {
           case 0:
              
              suspenso=suspenso+1;
              break;
           case 1:
              
              suspenso=suspenso+1;
              break;
           case 2:
              
              suspenso=suspenso+1;
              break;
           case 3:
              
              suspenso=suspenso+1;
              break;
          case 4:
              
              suspenso=suspenso+1;
              break;
          case 5:
              aprobado=aprobado+1;
               break;
               case 6:
              aprobado=aprobado+1;
               break;
               case 7:
              notable=notable+1;
               break;
               case 8:
              notable=notable+1;
               break;
               case 9:
              sobresaliente=sobresaliente+1;
               break;
               case 10:
              sobresaliente=sobresaliente+1;
               break;
              
              
           
       }
                         switch (nota4)
       {
           case 0:
              
              suspenso=suspenso+1;
              break;
           case 1:
              
              suspenso=suspenso+1;
              break;
           case 2:
              
              suspenso=suspenso+1;
              break;
           case 3:
              
              suspenso=suspenso+1;
              break;
          case 4:
              
              suspenso=suspenso+1;
              break;
          case 5:
              aprobado=aprobado+1;
               break;
               case 6:
              aprobado=aprobado+1;
               break;
               case 7:
              notable=notable+1;
               break;
               case 8:
              notable=notable+1;
               break;
               case 9:
              sobresaliente=sobresaliente+1;
               break;
               case 10:
              sobresaliente=sobresaliente+1;
               break;
              
              
           
       }
                             switch (nota5)
       {
           case 0:
              
              suspenso=suspenso+1;
              break;
           case 1:
              
              suspenso=suspenso+1;
              break;
           case 2:
              
              suspenso=suspenso+1;
              break;
           case 3:
              
              suspenso=suspenso+1;
              break;
          case 4:
              
              suspenso=suspenso+1;
              break;
          case 5:
              aprobado=aprobado+1;
               break;
               case 6:
              aprobado=aprobado+1;
               break;
               case 7:
              notable=notable+1;
               break;
               case 8:
              notable=notable+1;
               break;
               case 9:
              sobresaliente=sobresaliente+1;
               break;
               case 10:
              sobresaliente=sobresaliente+1;
               break;
              
              
           
       }
                             
                                         switch (nota6)
       {
           case 0:
              
              suspenso=suspenso+1;
              break;
           case 1:
              
              suspenso=suspenso+1;
              break;
           case 2:
              
              suspenso=suspenso+1;
              break;
           case 3:
              
              suspenso=suspenso+1;
              break;
          case 4:
              
              suspenso=suspenso+1;
              break;
          case 5:
              aprobado=aprobado+1;
               break;
               case 6:
              aprobado=aprobado+1;
               break;
               case 7:
              notable=notable+1;
               break;
               case 8:
              notable=notable+1;
               break;
               case 9:
              sobresaliente=sobresaliente+1;
               break;
               case 10:
              sobresaliente=sobresaliente+1;
               break;
              
              
           
       }
                                             switch (nota7)
       {
           case 0:
              
              suspenso=suspenso+1;
              break;
           case 1:
              
              suspenso=suspenso+1;
              break;
           case 2:
              
              suspenso=suspenso+1;
              break;
           case 3:
              
              suspenso=suspenso+1;
              break;
          case 4:
              
              suspenso=suspenso+1;
              break;
          case 5:
              aprobado=aprobado+1;
               break;
               case 6:
              aprobado=aprobado+1;
               break;
               case 7:
              notable=notable+1;
               break;
               case 8:
              notable=notable+1;
               break;
               case 9:
              sobresaliente=sobresaliente+1;
               break;
               case 10:
              sobresaliente=sobresaliente+1;
               break;
              
              
           
       }
                                                 switch (nota8)
       {
           case 0:
              
              suspenso=suspenso+1;
              break;
           case 1:
              
              suspenso=suspenso+1;
              break;
           case 2:
              
              suspenso=suspenso+1;
              break;
           case 3:
              
              suspenso=suspenso+1;
              break;
          case 4:
              
              suspenso=suspenso+1;
              break;
          case 5:
              aprobado=aprobado+1;
               break;
               case 6:
              aprobado=aprobado+1;
               break;
               case 7:
              notable=notable+1;
               break;
               case 8:
              notable=notable+1;
               break;
               case 9:
              sobresaliente=sobresaliente+1;
               break;
               case 10:
              sobresaliente=sobresaliente+1;
               break;
              
              
           
       }
                                                     switch (nota9)
       {
           case 0:
              
              suspenso=suspenso+1;
              break;
           case 1:
              
              suspenso=suspenso+1;
              break;
           case 2:
              
              suspenso=suspenso+1;
              break;
           case 3:
              
              suspenso=suspenso+1;
              break;
          case 4:
              
              suspenso=suspenso+1;
              break;
          case 5:
              aprobado=aprobado+1;
               break;
               case 6:
              aprobado=aprobado+1;
               break;
               case 7:
              notable=notable+1;
               break;
               case 8:
              notable=notable+1;
               break;
               case 9:
              sobresaliente=sobresaliente+1;
               break;
               case 10:
              sobresaliente=sobresaliente+1;
               break;
              
              
           
       }
                                                         switch (nota10)
       {
           case 0:
              
              suspenso=suspenso+1;
              break;
           case 1:
              
              suspenso=suspenso+1;
              break;
           case 2:
              
              suspenso=suspenso+1;
              break;
           case 3:
              
              suspenso=suspenso+1;
              break;
          case 4:
              
              suspenso=suspenso+1;
              break;
          case 5:
              aprobado=aprobado+1;
               break;
               case 6:
              aprobado=aprobado+1;
               break;
               case 7:
              notable=notable+1;
               break;
               case 8:
              notable=notable+1;
               break;
               case 9:
              sobresaliente=sobresaliente+1;
               break;
               case 10:
              sobresaliente=sobresaliente+1;
               break;
              
              
           
       }
             System.out.println("Hay "+suspenso+ " suspensos");
             System.out.println("Hay "+aprobado+ " aprobados");
             System.out.println("Hay "+notable+ " notables");
             System.out.println("Hay "+sobresaliente+ " sobresalientes");

        /*Ejercicio 5.
        Realiza un programa que gestione la compra de los productos de un supermercado de la siguiente forma:
Se pide la inicial del producto y su precio.
-Después de introducir el producto y su correspondiente precio, se preguntará si deseamos continuar introduciendo más productos:
Si la respuesta es “s” (tanto mayúscula como minúscula), volvemos a pedir otro producto.
Si la respuesta es “n” (tanto mayúscula como minúscula), el programa finalizará.
En caso contrario, se vuelve a preguntar si desea introducir otro producto.
-Al terminar de introducir todos los productos mostraremos: el importe total de la compra*/
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
            
        };
        
            
        
        
        
        
    }
    
}
