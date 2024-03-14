package segundaguerramundial;

import java.io.*;

public class SegundaGuerraMundial {


    public static void main(String[] args) {
        File palabra=new File("palabra.txt");
//        char[] arraypalabra=new char[10];
 FileReader palabrareader;
 BufferedReader palabrabuffer;
 String palabraleida;
        long letra=0;
         char [] caracteres={};
        try{
          palabrareader = new FileReader(palabra);
           palabrabuffer =new BufferedReader(palabrareader);
            palabraleida=palabrabuffer.readLine();

            
            
            letra=palabraleida.length();
            
          caracteres=palabraleida.toCharArray();
           
           caracteres[(int)letra-1]=':';
           
            System.out.println(caracteres);
        }
        catch(IOException e){
            System.out.println("Error palabra no leida");
        }
        
        //Decodificador
        caracteres[(int)letra-1]='h';
        System.out.println(caracteres);
        
                
}
    
}
