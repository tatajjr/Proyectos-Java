package chat;

import java.io.*;
import java.util.Arrays;

public class Chat {

    public static void main(String[] args) {
        FileReader insultosreader;
        BufferedReader insultosbuffer;
        String frase = " ";
        String palabra = "";
        FileReader frasereader;
        BufferedReader frasebuffer;
        String[] stringdefrase = new String[100];
        String[] palabras = new String[22];
       String stringdeinsultos = "";
        try {
            frasereader = new FileReader("frase.txt");
            frasebuffer = new BufferedReader(frasereader);
            frase = frasebuffer.readLine();
            stringdefrase = frase.split(" ");

            System.out.println(Arrays.toString(stringdefrase));
            frasebuffer.close();
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }

        try {
            insultosreader = new FileReader("insultos.txt");
            insultosbuffer = new BufferedReader(insultosreader);
            palabra = insultosbuffer.readLine();
           
            while (palabra != null) {
             stringdeinsultos=stringdeinsultos+palabra+";";
                
                
                palabra = insultosbuffer.readLine();
            }
            palabras=stringdeinsultos.split(";");         

            insultosbuffer.close();
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
       
        int b = 1;
        for (int i = 0; i < stringdefrase.length; i++) {
            for (int j = 0; j < palabras.length; j = j + 2) {
                if (stringdefrase[i].equalsIgnoreCase(palabras[j])) {
                    stringdefrase[i]=palabras[b];
                    b=b+2;
                }               
            }

        }
        System.out.println(Arrays.toString(stringdefrase));
    }

}
