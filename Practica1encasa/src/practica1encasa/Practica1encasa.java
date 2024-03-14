/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1encasa;
import java.util.Scanner;
/**
 *
 * @author ivang
 */
public class Practica1encasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Que ejercicio quieres hacer?");
        System.out.println("----------------------------------------");
        System.out.println("Ejercicio 1:Inicial del nombre y la edad");
        System.out.println("----------------------------------------------------");
        System.out.println("Ejercico 2:Euros e imprima su equivalente en dólares");
        System.out.println("----------------------------------------------------");
        System.out.println("Ejercico 3:Sucesión de números: 3, 6, 9, 12, ..., 99");
        System.out.println("----------------------------------------");
        System.out.println("Ejercico 4:10 calificaciones por teclado");
        System.out.println("-----------------------------");
        System.out.println("Ejercico 5:Supermercado Medac");
        System.out.println("**********************************");
        System.out.println("Introduzca el número del ejercicio");
        int ejercicio=sc.nextInt();
       
        switch (ejercicio)
                {
                    case 1:
                        int edad;
                        char inicial;
                        System.out.println("Dime la inicial de tu nombre");
                        inicial=sc.next().charAt(0);
                        System.out.println("Dime tu edad");
                        edad=sc.nextInt();
                        if(edad<65)
                        {
                            System.out.println("Te faltan "+(65-edad)+" años para jubilarte.");
                        }
                        else if(edad>65)
                        {
                            System.out.println("LLevas "+(edad-65)+" años jubilado.");
                        }
                    break;
                    case 2:
                        int euros;
                        
                        System.out.println("Introduce una cantidad en euros para pasarla a dólares estuadounidenses:");
                        euros=sc.nextInt();
                        double dolar=euros*1.16;
                        System.out.println("Ahora mismo "+euros+" euros son "+dolar+" dólares.");
                    break;
                    case 3:
                        int suma=1;
                        for(int a = 3;a<100;a=a+3)
                        {
                            System.out.println(a);
                            suma=suma+a;
                        }
                        System.out.println("La suma de toda esta sucesión de números es "+suma);
                    break;
                    case 4:
                        
                        
                        int suspenso=0,aprobado=0,not=0,sob=0;  
                        System.out.println("Ingrese 10 calificaciones");  
                        int a=0;
                        while (a<11)
                        {   
                        
                        double nota=sc.nextDouble();
                        
                        switch ((int)nota)
                                {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                suspenso++;
                                break;
                            case 5:
                            case 6:
                                aprobado++;
                                break;
                            case 7:
                            case 8:
                                not++;
                                break;
                            case 9:
                            case 10:
                                sob++;
                                break;
                             default:
                                System.out.println("Calificación no válida. Debe estar entre 0 y 10.");
                            
                            break;   
                                }  
                       a++;
                    
                        }
                        System.out.println("Hay "+ suspenso+" Suspensos");
                        System.out.println("Hay "+ aprobado+" Aprobados");
                        System.out.println("Hay "+ not+" Notables");
                        System.out.println("Hay "+ sob+" Sobresalientes");
                    break;
                    case 5:
  
                        System.out.println("Supermercado Medac.");
                        System.out.println("-------------------");
       
                        char producto,otro = 's';
                        double z=0,x=0,c=0,total = 0,precio=0;
                     
                        while((otro=='s')||(otro=='S'))
                        {
                        System.out.println("Producto?");           
                        producto=sc.next().charAt(0);
        
                            System.out.println("Precio:");
                            precio=sc.nextDouble();
                            total=total+precio;
                        
                        System.out.println("valor: " +precio);
                        System.out.println("¿Introducir otro producto (s/n)?");
                        otro=sc.next().charAt(0);
                        
                        while (!((otro=='s')||(otro=='S')||(otro=='n')||(otro=='N')))
                        {
                        System.out.println("¿Introducir otro producto (s/n)?");
                        otro=sc.next().charAt(0);
              
                        }
                        if (otro=='n'||otro=='N')
                        {
                        System.out.println("Precio total de la compra:"+total+"euros.");
                        }
                        }
                    
   
                }
    }
}



   
