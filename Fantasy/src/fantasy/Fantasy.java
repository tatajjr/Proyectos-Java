/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasy;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Fantasy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
       Jugador j1=new Jugador("Kroos","Centrocampista",170000);
       Jugador j2=new Jugador("Modric","Centrocampista",220000);
       Jugador j3=new Jugador("Ceballos","Centrocampista",40000);
       Jugador j4=new Jugador("Alaba","Defensa",70000);
       Jugador j5=new Jugador("Camavinga","Defensa",130000);
       Jugador j6=new Jugador("Courtuais","Portero",200000);
       Jugador j7=new Jugador("CR7","Delantero",90000);
       Jugador j8=new Jugador("Benzema","Delantero",900000);
       Jugador j9=new Jugador("Marcelo","Defensa",50000);
       Jugador j10=new Jugador("Ramos","Defensa",100000);
       Jugador j11=new Jugador("Xavi Alonso","Centrocampista",80000);
       Jugador j12=new Jugador("Casillas","Portero",100000);
       Jugador j13=new Jugador("Bale","Delantero",150000);
       Jugador j14=new Jugador("Isco","Centrocampista",110000);
       Jugador j15=new Jugador("Messi","Delantero",99000);
       Jugador j16=new Jugador("Gavi","Centrocampista",90000);
       Jugador j17=new Jugador("Pedri","Centrocampista",100000);
       Jugador j18=new Jugador("Touchameni","Centrocampista",130000);
       Jugador j19=new Jugador("Oblak","Portero",60000);
       Jugador j20=new Jugador("Morata","Delantero",110000);
       Jugador j21=new Jugador("Oyarzabal","Delantero",180000);
       Jugador j22=new Jugador("Vinicius","Delantero",900000);
       
       Jugador[]arrayjugar=new Jugador[22];
       arrayjugar[0]=j1;
       arrayjugar[1]=j2;
       arrayjugar[2]=j3;
       arrayjugar[3]=j4;
       arrayjugar[4]=j5;
       arrayjugar[5]=j6;
       arrayjugar[6]=j7;
       arrayjugar[7]=j8;
       arrayjugar[8]=j9;
       arrayjugar[9]=j10;
       arrayjugar[10]=j11;
       arrayjugar[11]=j12;
       arrayjugar[12]=j13;
       arrayjugar[13]=j14;
       arrayjugar[14]=j15;
       arrayjugar[15]=j16;
       arrayjugar[16]=j17;
       arrayjugar[17]=j18;
       arrayjugar[18]=j19;
       arrayjugar[19]=j20;
       arrayjugar[20]=j21;
       arrayjugar[21]=j22;
       
        System.out.println("¿Quieres jugar? 1.Si 2.No");
        int respuesta=sc.nextInt();
        if(respuesta==1)
        {
            Jugador[]arrayplantilla=new Jugador[11];
            
           int porteros=1;
           int defensas=1;
           int centrocampistas=1;
           int delanteros=1;
                for (int i = 0; i < arrayplantilla.length; i++) 
            {
                int posi=(int)(Math.random()*22);
                 if(arrayjugar[posi]!=null)
                 {
                    // arrayplantilla[i]=arrayjugar[posi];
                     if(arrayjugar[posi].getPosicion().equals("Portero")){
                         
                         if(porteros<3){
                             arrayplantilla[i]=arrayjugar[posi];
                               arrayjugar[posi]=null;
                               porteros++;
                         }
                         else
                         {
                             i--;
                         }
                     }
                     else if(arrayjugar[posi].getPosicion().equals("Defensa")){
                  
                          if(defensas<7){
                              
                             arrayplantilla[i]=arrayjugar[posi];
                               arrayjugar[posi]=null;
                                      defensas++;
                         }
                         else
                         {
                             i--;
                         }
                     }
                     else if(arrayjugar[posi].getPosicion().equals("Centrocampista")){
                      
                          if(centrocampistas<7){
                              System.out.println("centrocampista"+centrocampistas);
                             arrayplantilla[i]=arrayjugar[posi];
                               arrayjugar[posi]=null;
                                centrocampistas++;
                         }
                         else
                         {
                          
                             i--;
                         }
                     }
                     else if(arrayjugar[posi].getPosicion().equals("Delantero")){
                         
                          if(delanteros<4){                             
                             arrayplantilla[i]=arrayjugar[posi];
                               arrayjugar[posi]=null;
                               delanteros++;
                         }
                         else
                         {
                             i--;
                         }
                     }
                   
                  }
                 else
                 {
                     i--;
                 }
                
            
                
                 
        } 
       System.out.println("Tu equipo tiene "+porteros+" porteros, "+defensas+" defensas, "+centrocampistas+" centrocampistas y " +delanteros+" delanteros");
         boolean salir=true;
         do {
        System.out.println("1.Mostrar Plantilla  2.Cambiar Jugador  3.Valor del equipo  4.Salir");
       int opcion=sc.nextInt();
         switch (opcion){
             case 1:
                 for (int i = 0; i < arrayplantilla.length; i++) {
                     System.out.println("Pos: "+i+ " "+arrayplantilla[i]);
                 }
                 break;
             case 2:
                 System.out.println("Todos los jugadores disponibles:");
                 for (int i = 0; i < arrayjugar.length; i++) {
                     if (arrayjugar[i]!=null) {
                          System.out.println("Pos "+i+ " "+arrayjugar[i]);
                     }                   
                     
                 }
                 System.out.println("Tu plantilla:");
                  for (int i = 0; i < arrayplantilla.length; i++) {
                     System.out.println("Pos: "+i+ " "+arrayplantilla[i]);
                 }
                  System.out.println("Elige la posicion del jugador disponible");
                  int nuevo=sc.nextInt();
                  System.out.println("Elige la posicion del jugador que quieres cambiar de tu plantilla");
                  int actual=sc.nextInt();
                  Jugador jaux;
                  jaux=arrayjugar[nuevo];
                  arrayjugar[nuevo]=arrayplantilla[actual];
                  arrayplantilla[actual]=jaux;
                   System.out.println("Tu plantilla:");
                  for (int i = 0; i < arrayplantilla.length; i++) {
                     System.out.println("Pos: "+i+ " "+arrayplantilla[i]);
                 }
                 break;
             case 3:                
                 double valortotal=0;
                 for (int i = 0; i < arrayplantilla.length; i++) 
                 {
                     
                valortotal=arrayplantilla[i].getPrecio()+valortotal;    
                
                 }
                 System.out.println("El valor de mercado de tu equipo es de: " +valortotal+" euros");                
                 break;
             case 4:
                 salir=false;
                 break;
             default:
                 System.out.println("Porfavor introduzca una opción válida para jugar");
                 break;
         }           
        } while (salir);
      }
        else if(respuesta==2){
            System.out.println("Pues nada, no se juega. Hasta pronto!!!");
        }
        else{
            System.out.println("Menudo inutil estas hecho");
        }
    }    
}
