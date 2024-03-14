/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasimulacro;
import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class PracticaSimulacro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader leerarchivo;
        BufferedReader bufferarchivo;
        String frase="";

        boolean comentado=false;

        try{
            leerarchivo=new FileReader("simulacro.txt");
            bufferarchivo=new BufferedReader(leerarchivo);
            frase=bufferarchivo.readLine();

            while(frase!=null){          
                  
                if(!frase.contains("/")&&!frase.contains("/*")&&!frase.contains("*/")&&!comentado){
                    System.out.println(frase);
                }
                else if(frase.contains("/*") ){
                    comentado=true;
                }
                else if(frase.contains("*/")){
                    comentado=false;
                }
                if(!frase.endsWith(";")||!frase.endsWith("{")||frase.endsWith("{")){
                throw new Excepcionpuntoycoma("Se ha producido un error porque falta añadir el punto y coma al final de la frase");
            }
                  frase=bufferarchivo.readLine();
        }
                    }
        
       catch(IOException e){
           System.out.println("Error de lectura");
       }
        catch(Excepcionpuntoycoma e){
            System.out.println(e.getMessage());
        }

    }
    
}
