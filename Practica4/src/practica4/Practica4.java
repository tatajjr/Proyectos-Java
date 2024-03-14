/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Practica4 {
    public static void rellenar(String [][] a)
    {
        for (int i = 0; i <a.length; i++) 
        {
            for (int j = 0; j <10; j++)
            {
               a[i][j]="_";
            }                     
        }
    }
public static void mostrar(String [][]a, Coche coche, Moto moto, Camion camion)
    {
        a[coche.posx][coche.posy]="coche";
        a[moto.posx][moto.posy]="moto";
        a[camion.posx][camion.posy]="camion";
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(Arrays.toString(a[i]));    
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean finalizar=true;
        Scanner sc= new Scanner (System.in);
        String [][]tablero=new String[3][10];
        
        Coche coche=new Coche();
        Camion camion=new Camion();
        Moto moto=new Moto();   
        rellenar(tablero);
        mostrar(tablero, coche, moto, camion);
        System.out.println("Carta Obetivo:");
        
       String cartas[]=new String[3];
       cartas[0]="Camion Primero y Moto segundo";
       cartas[1]="Camion Segundo y Coche primero";
       cartas[2]="Camion Tercero y moto primero";
        System.out.println("Las cartas objetivos son:");
        for (int i = 0; i < cartas.length; i++) {
           switch(i){
               case 0:
                   int objetivo=(int)(Math.random()*3);
            System.out.println("El objetivo del camion es " +cartas[objetivo]);
                   break;
               case 1:
                   objetivo=(int)(Math.random()*3);
            System.out.println("El objetivo de la moto es "+cartas[objetivo]);
                   break;
               case 2:
                   objetivo=(int)(Math.random()*3);
            System.out.println("El objetivo del coche es "+cartas[objetivo]);
                   break;
           }          
        }
        do {
             System.out.println("Camion coge carta");
        Cartas[] mazo=new Cartas[10];
        for (int i = 0; i <=4; i++) {
                mazo[i]=new Cartas("avanzar",0);
            }
        for (int i = 5; i < mazo.length; i++) {
            mazo[i]=new Cartas("retroceder",1);
        }
       int cartarandom=(int)(Math.random()*10);
       if (mazo[cartarandom].getPar()%2==0){
           System.out.println("Quien quieres que avance 1.Tú 2.Moto 3.Coche");
           int res=sc.nextInt();
          switch (res){
           case 1:
               tablero[camion.posx][camion.posy]="_";
               if ((camion.posy+2)>9){

                   camion.setPosy(9);
               }
               else{
               camion.avanzar();
               }
               if(camion.posy==9){
                  finalizar=false; 
               }
           break;
           case 2:
               tablero[moto.posx][moto.posy]="_";
               if((moto.posy+4)>9){
                   moto.setPosy(9);
               }
               else{
                   moto.avanzar();
               }
               if(moto.posy==9){
                   finalizar=false;
               }
           break;
           case 3:
               tablero[coche.posx][coche.posy]="_";
               if((coche.posy+3)>9){
                   coche.setPosy(9);
               }
               else{
               coche.avanzar();
               }
               if (coche.posy==9) {
                   finalizar=false;              
               }
           break;
            
          }
}
       else{
           System.out.println("Quien quieres que retroceda 1.Tú 2.Moto 3.Coche");
           int res=sc.nextInt();
          switch (res){
           case 1:
               tablero[camion.posx][camion.posy]="_";
               camion.retroceder();
           break;
           case 2:
               tablero[moto.posx][moto.posy]="_";
               moto.retroceder();
           break;
           case 3:
                tablero[coche.posx][coche.posy]="_";
               coche.retroceder();
           break;
            
          }
       }
       System.out.println("Moto coge carta");
        for (int i = 0; i < 4; i++) {
                mazo[i]=new Cartas("avanzar",0);
            }
        for (int i = 5; i < mazo.length; i++) {
            mazo[i]=new Cartas("retroceder",1);
        }
       cartarandom=(int)(Math.random()*10);
       if (mazo[cartarandom].getPar()%2==0){
           System.out.println("Quien quieres que avance 1.Camion 2.Tú 3.Coche");
           int res=sc.nextInt();
          switch (res){
           case 1:
               tablero[camion.posx][camion.posy]="_";
               if ((camion.posy+2)>9){

                   camion.setPosy(9);
               }
               else{
               camion.avanzar();
               }
               if(camion.posy==9){
                  finalizar=false; 
               }
           break;
           case 2:
               tablero[moto.posx][moto.posy]="_";
               if((moto.posy+4)>9){
                   moto.setPosy(9);
               }
               else{
                   moto.avanzar();
               }
               if(moto.posy==9){
                   finalizar=false;
               }
           break;
           case 3:
                tablero[coche.posx][coche.posy]="_";
               if((coche.posy+3)>9){
                   coche.setPosy(9);
               }
               else{
               coche.avanzar();
               }
               if (coche.posy==9) {
                   finalizar=false;              
               }
           break;
            
          }
}
       else{
           System.out.println("Quien quieres que retroceda 1.Camion 2.Tú 3.Coche");
           int res=sc.nextInt();
          switch (res){
           case 1:
               tablero[camion.posx][camion.posy]="_";
               camion.retroceder();
           break;
           case 2:
               tablero[moto.posx][moto.posy]="_";
               moto.retroceder();
           break;
           case 3:
                tablero[coche.posx][coche.posy]="_";
               coche.retroceder();
           break;
            
          }
       }
       System.out.println("Coche coge carta");
        for (int i = 0; i < 4; i++) {
                mazo[i]=new Cartas("avanzar",0);
            }
        for (int i = 5; i < mazo.length; i++) {
            mazo[i]=new Cartas("retroceder",1);
        }
      cartarandom=(int)(Math.random()*10);
       if (mazo[cartarandom].getPar()%2==0){
           System.out.println("Quien quieres que avance 1.Camion 2.Moto 3.Tú");
           int res=sc.nextInt();
          switch (res){
           case 1:
               tablero[camion.posx][camion.posy]="_";
               if ((camion.posy+2)>9){

                   camion.setPosy(9);
               }
               else{
               camion.avanzar();
               }
               if(camion.posy==9){
                  finalizar=false; 
               }
           break;
           case 2:
               tablero[moto.posx][moto.posy]="_";
               if((moto.posy+4)>9){
                   moto.setPosy(9);
               }
               else{
                   moto.avanzar();
               }
               if(moto.posy==9){
                   finalizar=false;
               }
           break;
           case 3:
                tablero[coche.posx][coche.posy]="_";
               if((coche.posy+3)>9){
                   coche.setPosy(9);
               }
               else{
               coche.avanzar();
               }
               if (coche.posy==9) {
                   finalizar=false;              
               }
           break;
            
          }
}
       else{
           if(camion.posy>0&&moto.posy>0&&coche.posy>0){
               System.out.println("Quien quieres que retroceda 1.Camion 2.Moto 3.Tú");
           int res=sc.nextInt();
          switch (res){
           case 1:
               tablero[camion.posx][camion.posy]="_";
               camion.retroceder();
           break;
           case 2:
               tablero[moto.posx][moto.posy]="_";
               moto.retroceder();
           break;
           case 3:
                tablero[coche.posx][coche.posy]="_";
               coche.retroceder();
           break;
            
          }
           }
           else{
               System.out.println("Todavia no se puede retroceder");
           }
       }
       mostrar(tablero, coche, moto, camion);
        } while (finalizar==true);
       if(coche.posy==9){
           System.out.println("Enahorabuena "+coche.getNombre()+" por ganar la carrera.");
       }
       else if(moto.posy==9){
           System.out.println("Enhorabuena "+moto.getNombre()+" por ganar la carrera");
       }
       else{
           System.out.println("Enhorabuena "+coche.getNombre()+" por ganar la carrera");
       }
       
    }
    

}
