package practica4casa;
import java.util.Scanner;

public class Practica4Casa {
    public static void Mostrar(Vehiculo[][]pista){
        for (int i = 0; i < pista.length; i++) {
            for (int j = 0; j < pista[0].length; j++) {
                if(pista[i][j]!=null){
                    System.out.print(pista[i][j]);
                }               
                else{
                System.out.print("._");
            }
            }
            System.out.println("");
          
        } 
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Coche coche=new Coche();
        Moto moto=new Moto();
        Camion camion=new Camion();
        System.out.println("Bienvenido a MEDAUTO");
        System.out.println("Sorteando cartas objetivo...");
        String[] cartasobjetivo=new String[3];
        cartasobjetivo[0]="Camion primero y Moto segundo";
        cartasobjetivo[1]="Camion segundo y Coche primero";
        cartasobjetivo[2]="Camion tercero y Moto primero";
       int cartarandon=(int)(Math.random()*3);
        System.out.println("El objetivo del cohe es: "+cartasobjetivo[cartarandon]);
        int cartarandon2=0;
        do {
             cartarandon2=(int)(Math.random()*3);
        } while (cartarandon==cartarandon2);
        System.out.println("El objetivo de la moto es: "+cartasobjetivo[cartarandon2]);
        int cartarandon3=0;
        do{
            cartarandon3=(int)(Math.random()*3);
        }while((cartarandon==cartarandon3)||(cartarandon2==cartarandon3));
        System.out.println("El objetivo del camion es: "+cartasobjetivo[cartarandon3]);
        Vehiculo[][]pista=new Vehiculo[3][10];
        pista[coche.posx][coche.posy]=coche;
        pista[moto.posx][moto.posy]=moto;
        pista[camion.posx][camion.posy]=camion;         
       Mostrar(pista);
       Carta[] arraycarta=new Carta[10];
        for (int i = 0; i <arraycarta.length; i++) {
            if (i%2==0) {
                arraycarta[i]=new Carta("avance",0);
            }
            else{
                arraycarta[i]=new Carta("retroceda",1);
            }
        }
        for (int i = 0; i < 10; i++) {
          
        }
        boolean ganar=true;
        do {
            for (int i = 0; i < 3; i++) {
                if (i==0) {
                    System.out.println(pista[coche.posx][coche.posy]+" coge carta");
                }
                else if(i==1){
                    System.out.println(pista[moto.posx][moto.posy]+" coge carta");
                }
                else{
                    System.out.println(pista[camion.posx][camion.posy]+" coge carta");
                }
                        int randoncarta=(int)(Math.random()*1);
                        System.out.println("¿Quien quieres que "+arraycarta[randoncarta]+" 1.Coche  2.Moto  3.Camion");
                        int res=sc.nextInt();
                        switch(res){
                            case 1:
                                if (arraycarta[randoncarta].getEstado()%2==0) {
                                    pista[coche.posx][coche.posy]=null;
                                    coche.avanzar();
                                    pista[coche.posx][coche.posy]=coche;
                                    if (coche.posy==9) {
                                        ganar=false;
                                    }
                                }
                                else{
                                    pista[coche.posx][coche.posy]=null;
                                    coche.retroceder();
                                    pista[coche.posx][coche.posy]=coche;
                                }
                                break;
                            case 2:
                                 if (arraycarta[randoncarta].getEstado()%2==0) {
                                     pista[moto.posx][moto.posy]=null;
                                    moto.avanzar();
                                    pista[moto.posx][moto.posy]=moto;
                                    if (moto.posy==9) {
                                        ganar=false;
                                    }
                                }
                                else{
                                    pista[moto.posx][moto.posy]=null;
                                    moto.retroceder();
                                    pista[moto.posx][moto.posy]=moto;
                                }
                                break;
                            case 3:
                                 if (arraycarta[randoncarta].getEstado()%2==0) {
                                     pista[camion.posx][camion.posy]=null;
                                    camion.avanzar();                                   
                                    pista[camion.posx][camion.posy]=camion;
                                    if (camion.posy==9) {
                                        ganar=false;
                                    }
                                }
                                else{
                                     pista[camion.posx][camion.posy]=null;
                                    camion.retroceder();
                                    pista[camion.posx][camion.posy]=camion;
                                }
                                break;
                                default:
                                    System.out.println("Numero incorrecto, pierdes el turno");
                                    break;
                                   
                        }
                        Mostrar(pista);
                      
            }
        } while (ganar);
    }
    
}
