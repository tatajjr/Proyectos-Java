/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1string;

/**
 *
 * @author Medac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto1="HOLA ";
          String texto2="QUE TAL";
          String texto3=texto1 + texto2;
          String texto4="HOLAS";
          System.out.println(texto1);
          System.out.println(texto2);
          System.out.println(texto3);
          System.out.println(texto1.equals(texto4));
          System.out.println(texto3.length());
          System.out.println(texto1.indexOf('H'));
          System.out.println(texto3.indexOf('A'));
          System.out.println(texto2.charAt(2));
          System.out.println(texto1.substring(0,2));
          System.out.println(texto1.toUpperCase());
          //equalsIgnoreCase IGNORA MAYUSCULAS
          //compareto COMPARA STRINGS
          //Valueof CONVIERTE NUMERO A STRING
          //replace(char-,char-) 
          String palabra=String.valueOf(5);
          System.out.println(palabra);
    }
    
}
