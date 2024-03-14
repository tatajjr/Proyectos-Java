package agendasantiago;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class AgendaSANTIAGO {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean salir=true;
        FileWriter fileagenda;
        BufferedWriter escribiragenda;
        FileReader readeragenda;
        BufferedReader leeragenda;
        boolean existe=false;
        boolean encontrado=false;
        String frase="";
        String frasecompleta="";
        String [] arrayfrase=new String[100];
        int contadorfor=0;
        do {
             System.out.println("MENU:   1.NUEVO CONTACTO  2.BUSCAR POR NOMBRE  3.MOSTRAR TODOS  4.SALIR");
        int opcion=sc.nextInt();
        switch(opcion){
        case 1:
            try{
                fileagenda=new FileWriter("agenda.txt",true);
                escribiragenda=new BufferedWriter(fileagenda);
                readeragenda=new FileReader("agenda.txt");
                leeragenda=new BufferedReader(readeragenda);           
                System.out.println("Añadir nombre:");
                String nombre=sc.next();              
                frase=leeragenda.readLine();
                
                if(frase!=null){
                            while(frase!=null)
                            {
                            frasecompleta=frasecompleta+frase+" ";
                            arrayfrase=frasecompleta.split(" ");
                            frase=leeragenda.readLine();
                            }
                            for (int i = 0; i < arrayfrase.length; i=i+2) {
                             if (arrayfrase[i].equalsIgnoreCase(nombre)) {                       
                                existe=true;
                            }                   
                        }
                            if (existe==true) {
                                System.out.println("Ya existe el Contacto");     
                                existe=false; 
                            }
                            else{
                        escribiragenda.write(nombre+" ");
                        System.out.println("Añadir telefono:");
                        int telefono=sc.nextInt();    
                        escribiragenda.write(Integer.toString(telefono));
                        escribiragenda.newLine();
                        }               
                }
                else{
                        escribiragenda.write(nombre+" ");
                        System.out.println("Añadir telefono:");
                        int telefono=sc.nextInt();    
                        escribiragenda.write(Integer.toString(telefono));
                        escribiragenda.newLine();
                }                
                escribiragenda.close();
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
            break;
        case 2:
            System.out.println("Introduzca el nombre a buscar:");
            String nombre=sc.next();
            try{
                readeragenda=new FileReader("agenda.txt");
                leeragenda=new BufferedReader(readeragenda);
                frase=leeragenda.readLine();
                
                while(frase!=null){
                    frasecompleta=frasecompleta+frase+" ";
                    arrayfrase=frasecompleta.split(" ");
                    frase=leeragenda.readLine();
                }
                for (int i = 0; i < arrayfrase.length; i++) {
                    if (arrayfrase[i].equalsIgnoreCase(nombre)) {
                       encontrado=true;
                       contadorfor=i;
                    }
                }
                if(encontrado==true){
                     System.out.println("Contacto----------------------------------------------");
                        System.out.println("Nombre: "+ nombre+ "  Telefono: "+arrayfrase[contadorfor+1]);  
                        System.out.println("------------------------------------------------------");
                        encontrado=false;
                }
                else{
                    System.out.println("Lo sentimos, no se ha encontrado a "+nombre+" en la lista de contactos.");
                }
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
             

            break;
        case 3:
            
            break;
        case 4:
            salir=false;
            break;
        default:
            System.out.println("Respuesta no válida");
            break;          
    }
        } while (salir);
       
    }
    
}
