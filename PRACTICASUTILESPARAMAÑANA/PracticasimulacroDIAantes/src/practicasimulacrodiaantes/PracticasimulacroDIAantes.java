package practicasimulacrodiaantes;
import java.io.*;
import java.util.Arrays;
public class PracticasimulacroDIAantes {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader leerinventario;
        BufferedReader bufferinventario;
        String productos="";
        String fraseproductos="";
        String []aux=new String[100];
        Articulo a1=new Articulo(aux);
        try{
            leerinventario=new FileReader("inventario.txt");
            bufferinventario=new BufferedReader(leerinventario);
            productos=bufferinventario.readLine();
            while(productos!=null){
                a1=new Articulo(productos.split(":"));
                 System.out.println(a1);
                 productos=bufferinventario.readLine();
            }      
            bufferinventario.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        try{
         FileReader leerextra=new FileReader(new File("extra.txt"));
          BufferedReader bufferextra=new BufferedReader(leerextra);
            String extra=bufferextra.readLine();
            while(extra!=null){
                if(extra.contains("/")){
                throw new ExcepcionBarra("No puede contener el caracter '/' ");
            }  
                                extra=bufferextra.readLine();

                                
            }
            bufferextra.close();
        }
         catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(ExcepcionBarra e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
 