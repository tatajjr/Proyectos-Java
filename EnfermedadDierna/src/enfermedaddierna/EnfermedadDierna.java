package enfermedaddierna;
import java.io.*;
import java.util.Arrays;

public class EnfermedadDierna {


    public static void main(String[] args) {
        System.out.println("afsdaf");
            FileReader adnreader;
            BufferedReader adnbuffer;
            String frase="";
            String [] arrayfrase=new String [100];
            try{
                adnreader=new FileReader("adn.txt");
                adnbuffer=new BufferedReader(adnreader);
                frase=adnbuffer.readLine();
                while(frase!=null){
                    arrayfrase=frase.split("");
                    frase=adnbuffer.readLine();
                }
                System.out.println(Arrays.toString(arrayfrase));
                for (int i = 0; i < arrayfrase.length; i++) {
                    if (arrayfrase[i]=="A") {
                        
                        
                    }
                }
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
            
            
    }
    
}
