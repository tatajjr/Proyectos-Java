 package practicarecu;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.util.InputMismatchException;

public class PracticaRecu {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        File aldii=new File("aldi.txt");
        File lidell=new File("lidel.txt");
      
           String añadirprodu=" ";
           String añadirprecioaldi=" ";
           String añadirpreciolidel=" ";
           String produ=" ";
           String precio=" ";
           int cantidadlista=0;
           int pre=0;
           String produu=" ";
           String precioo=" ";
           int pree=0;
           int aba=0;
           int a=0;
           int b=0;
           int u=0; 
           double preciofinal=0;
           double cuentafinal=0;
           double cuenta=0;
            int respuesta=0;
            int contador=0;
           try{
        FileWriter aldifilewriter=new FileWriter(aldii,false);
        BufferedWriter aldiwriter=new BufferedWriter(aldifilewriter);
        FileWriter lidelfilewriter=new FileWriter(lidell,false);
        BufferedWriter lidelwriter=new BufferedWriter(lidelfilewriter);
                System.out.println("Cuantos producto quieres añadir a tu lista");
                cantidadlista=sc.nextInt();
                contador=cantidadlista;
                do {
                   System.out.println("¿Que producto quieres añadir?");
               añadirprodu=sc.next();
        aldiwriter.write(añadirprodu); lidelwriter.write(añadirprodu);
        aldiwriter.newLine(); lidelwriter.newLine();
               System.out.println("Que precio le quieres poner en el Aldi");
               añadirprecioaldi=sc.next();
               aldiwriter.write(añadirprecioaldi);
               aldiwriter.newLine();
               System.out.println("Que precio le quieres poner en el Lidel");
               añadirpreciolidel=sc.next();
               lidelwriter.write(añadirpreciolidel);
               lidelwriter.newLine();      
               contador--;
               } while (contador>0);
               
        
        aldiwriter.close(); lidelwriter.close();
    }
    catch(IOException e1){
        System.out.println("Error de ecritura archivo");
    }
             Producto [] aldi=new Producto[cantidadlista];
        Producto [] lidel=new Producto[cantidadlista];
        try{
            
          FileReader aldifilereader= new FileReader(aldii);
          BufferedReader aldibuffer=new BufferedReader(aldifilereader);
         produ=aldibuffer.readLine();
          precio=aldibuffer.readLine();
          
         while(produ!=null&&precio!=null){
          
         pre=Integer.parseInt(precio);
        Producto p1=new Producto(produ,pre);   
        
        aldi[a]=p1;
        a++;
        produ=aldibuffer.readLine();
        precio=aldibuffer.readLine();
         }          
        
        }
        catch(IOException e1){
            System.out.println("Error de lectura");
        }
    try{
        
        FileReader lidelfilereader=new FileReader(lidell);
        BufferedReader lidelbuffer=new BufferedReader(lidelfilereader);
        produu=lidelbuffer.readLine();
        precioo=lidelbuffer.readLine();
        while(produu!=null&&precioo!=null){      
            
        pree=Integer.parseInt(precioo);
        Producto p2=new Producto(produu,pree);      
        
       lidel[b]=p2;
       b++;
        produu=lidelbuffer.readLine();
        precioo=lidelbuffer.readLine();
        }
    }
    catch(IOException e2){
            System.out.println("Error de lectura");
        }
    catch(Exception e3){
            System.out.println("Error de lectura 4");
        }
        
                 
        

        System.out.println(Arrays.toString(aldi));
        System.out.println(Arrays.toString(lidel));
        
       Supermercado Aldi=new Supermercado("ALDI",aldi);
       Supermercado Lidel=new Supermercado("LIDEL",lidel);
       Cesta[]array=new Cesta[20];
       
        System.out.println("Bienvenido a SUPERCOMPARATOR");
        boolean salir=false;
        do {
            try{
                System.out.println("¿Qué quieres hacer?   1.Comparar Productos   2.Ver Cesta    3.Salir");
             respuesta=sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Error por dar un valor que no es el esperado");
                salir=true;
            }
            
            switch(respuesta){
                case 1:
                   
                    boolean comprar=true;
                    double precioaldi=0;
                     double preciolidel=0;
                    System.out.println("Introduzca el nombre del producto");
                    String nombreprodu=sc.next(); 
                    
                    for (int i = 0; i < aldi.length; i++) {
                        if(aldi[i].getNombre().equalsIgnoreCase(nombreprodu)){
                     precioaldi=aldi[i].getPrecio();
                                
                        }
                       
                    }
                     for (int i = 0; i < lidel.length; i++) {
                        if(lidel[i].getNombre().equalsIgnoreCase(nombreprodu)) {
                            preciolidel=lidel[i].getPrecio();
                        }
                     
                    }
                     if (precioaldi>preciolidel) {
                         System.out.println("El producto es mas barato en el supermercado " +Lidel.getNombre());
                         System.out.println(preciolidel);
                        preciofinal=preciolidel;
                    }
                     else if(preciolidel>precioaldi){
                         System.out.println("El producto es mas barato en el supermercado "+Aldi.getNombre());
                         preciofinal=precioaldi;
                     }
                     else {
                         System.out.println("Lo sentimos, no se ha encontrado el producto");
                         comprar=false;
                     } 
                     
                     if (comprar) {
                         System.out.println("¿Vas a querer comprar el producto por "+ preciofinal+ "€ ? 1.SI   2.NO");
                         int res=sc.nextInt();
                         switch(res){
                             case 1:
                                    System.out.println("¿Cuantas unidades?");
                                     u=sc.nextInt();                                   
                                    array[aba]=new Cesta(nombreprodu,u);
                                    aba++;
                                    cuenta=preciofinal*u;
                                    
                                 break;
                             case 2:
                                 System.out.println("De acuerdo");
                                 break;
                             default:
                                 System.out.println("Respuesta no valida");
                                 break;
                         }
                         cuentafinal=cuentafinal+cuenta;
                    }
                    break;
                case 2:
                    for (int i = 0; i < array.length; i++) {
                        if (array[i]!=null) {
                            System.out.println(array[i]);
                        }
                    }
                    System.out.println("La cuenta total es de: "+cuentafinal+"€");
                    break;
                case 3:
                    salir=true;
                    break;             
            }
        } while (salir==false);
       
       
       
    }
    
}
