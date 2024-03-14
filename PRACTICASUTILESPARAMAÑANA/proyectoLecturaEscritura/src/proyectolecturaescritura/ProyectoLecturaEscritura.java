
package proyectolecturaescritura;
import java.io.*;

public class ProyectoLecturaEscritura {

    public static void main(String[] args) {
     File file=new File("inspector.txt");
     /*
     Meter en un array de char la palabra del fichero y leerlo uno a uno
     try{
         if(file.canRead()){
              FileReader filereader= new FileReader(file);
              int num=filereader.read();
              char []array=new char[10];
              while(num!=-1){
                  int i = 0;
                  char letra= (char) num;
                  array[i]=letra;
              System.out.print(array[i]);
              num=filereader.read();
              i++;            
              }
              
         }
     }
     catch (IOException e){
         System.out.println("Error de leer archivo");
     }*/
     String frase=" ";
     String frase2=" ";
    try{ 
    FileReader filereader=new FileReader(file);
    BufferedReader bufferedReader=new BufferedReader(filereader);
     frase=bufferedReader.readLine();
    while(frase!=null){
        frase2=frase2+frase+'\n';
        frase=bufferedReader.readLine();
    }
        System.out.println(frase2);
        bufferedReader.close();
    }
    catch(IOException e){
        System.out.println("Error de leer archivo");
    }
    
    try{
        FileWriter filewriter=new FileWriter(file,false);
        BufferedWriter bufferwriter=new BufferedWriter(filewriter);
        bufferwriter.write("Hola");
        bufferwriter.newLine();
        bufferwriter.write("que tal");
        bufferwriter.close();
    }
    catch(IOException e1){
        System.out.println("Error de ecritura archivo");
    }
    }
    
}
