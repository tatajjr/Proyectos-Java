package damdental;
import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
public class DAMDental {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean salir=true;
        String frasesondaje="";
        String [] arraysondaje=new String[100];
        int id=0;
        String nombre="";
        String apellido="";
        int edad=0;
        String stringedad="";
        int a=1;
        Paciente[] paciente1=new Paciente[100];
       FileWriter filepaciente;
       BufferedWriter escribirpaciente;
       FileReader fileid;
       BufferedReader leerid;
       String frasefinal="Te han sangrado los dientes ";
       String stringid="";
       String leerfrase="";
       int ideleida=0;
       int ide=0;
       Pacientes listapacientes=new Pacientes(paciente1);
       FileWriter config;
       BufferedWriter escribirconfig;
       FileReader leerpaciente;
       BufferedReader bufferpaciente;
       
       FileReader leersondaje;
       BufferedReader buffersondaje;
        do {
             System.out.println("MENU:   1.CREAR PACIENTE    2.VER PACIENTES     3.SONDAJE    4.SALIR");
        int respuesta=sc.nextInt();
        switch(respuesta){
            case 1:
                id++;
                System.out.println("Nombre:");
                nombre=sc.next();
                System.out.println("Apellido:");
                apellido=sc.next();
                System.out.println("Edad:");
                try{
                    edad=sc.nextInt();
                }
                catch(InputMismatchException e){
                    System.out.println("No has convertido la edad a un entero");
                     salir=false;
                }
                
                 try{
           filepaciente=new FileWriter("paciente.txt",true);
           escribirpaciente=new BufferedWriter(filepaciente);
          
           
           fileid=new FileReader("config.txt");
           leerid=new BufferedReader(fileid);
           stringid=leerid.readLine();
           config=new FileWriter("config.txt",false);
           escribirconfig=new BufferedWriter(config);
           
           if(stringid!=null){
               ide=Integer.parseInt(stringid);
               id=ide+1;
               stringid=Integer.toString(id);
               config.write(stringid);
           }
           else{
               stringid=Integer.toString(id);
              config.write(stringid);
           }

           escribirpaciente.write(id+" ");
           escribirpaciente.write(nombre+" ");
           escribirpaciente.write(apellido+" ");
           stringedad=Integer.toString(edad);
           escribirpaciente.write(stringedad);
           escribirpaciente.newLine();
           Paciente paciente2=new Paciente(id,nombre,apellido,edad);
           paciente1[id]=paciente2;
           a++;
           
           
           escribirpaciente.close();    
          config.close();
           leerid.close();
       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
                  listapacientes=new Pacientes(paciente1);
                 
                 
                break;
            case 2:
                try{
               leerpaciente=new FileReader("paciente.txt");
               bufferpaciente=new BufferedReader(leerpaciente);
               leerfrase=bufferpaciente.readLine();
               while(leerfrase!=null){
                   System.out.println(leerfrase);
                   leerfrase=bufferpaciente.readLine();               
               }
               bufferpaciente.close();
                }
                catch(IOException e){
                    System.out.println(e.getMessage());
                }

              
                
                break;
            case 3:
                try{
                 leersondaje=new FileReader("sondaje.txt");
                buffersondaje=new BufferedReader(leersondaje);
                frasesondaje=buffersondaje.readLine();
                arraysondaje=frasesondaje.split(" ");
                    for (int i = 0; i < arraysondaje.length;i++) {
                        if (arraysondaje[i].contains("+")) {
//                            System.out.println("Te ha sangrado el diente "+arraysondaje[i]);
                            String texto=arraysondaje[i];
                            String texto2=texto.substring(1);
                            frasefinal=frasefinal+" "+texto2+" ";
                            
                        }
                    }
                    System.out.println(frasefinal);
                    
                    buffersondaje.close();
                }
                catch(IOException e){
                    System.out.println(e.getMessage());
                }
             
                break;
            case 4:
                salir=false;
                break;
            default:
                System.out.println("Respuesta no valida");
                break;
        }
        } while (salir);
       
      
    }
    
}
