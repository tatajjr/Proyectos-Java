/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatgpt1;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author ivang
 */
public class ChatGPT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       ///Ejercicio palíndromo; palabra que se lee igual de izquierda a derecha que de derecha a izquierda
        int tamaño;
        
        System.out.println("Cuentas letras tiene su palabra: ");
        tamaño=sc.nextInt();
        int tamaño2;
        tamaño2=tamaño;
        System.out.println("Escriba su palabra");
        
        char[] palindromo=new char[tamaño];
        char[] esonoes= new char [tamaño];
        boolean sies=false;
        for (int i = 0; i < tamaño; i++) 
        {
            palindromo[i]=sc.next().charAt(0);
                                         //palindromo=0 o 1 s 2 o    esonoes=0 o 1 s 2 o
                                         //0 h 1 o 2 l 3 a      0 h 1 o 2 l 3 a
        }
        for (int i = 0; i < tamaño; i++) 
        {
           esonoes[tamaño2-1]=palindromo[i] ;   
           tamaño2--;
        }        
        System.out.println(Arrays.toString(palindromo));
        System.out.println(Arrays.toString(esonoes));
        for (int i = 0 ; i < tamaño; i++) 
        {
          if(Arrays.equals(palindromo, esonoes))
          {
              sies=true;
          }
        }
  
          if(sies==true)
          {
           System.out.println("Su palabra es un palíndromo, se lee de la misma forma de izquierda a derecha que de derecha a izquierda.");
          }
          else
          {
           System.out.println("Su palabra no es un palíndromo");
          }
       
       //Forma del Chat GPT 
       /*System.out.println("Escriba una palabra para verificar si es un palíndromo:");
        String palabra = sc.nextLine();
        palabra = palabra.replaceAll("\\s", "").toLowerCase();

        int tamaño = palabra.length();
        boolean esPalindromo = true;

        for (int i = 0; i < tamaño; i++) {
            if (palabra.charAt(i) != palabra.charAt(tamaño - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("Su palabra es un palíndromo, se lee igual de izquierda a derecha y de derecha a izquierda.");
        } else {
            System.out.println("Su palabra no es un palíndromo.");
        }*/
    }
    
}
