package pruebaaldilidel;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class PRUEBAaldilidel {


    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
       FileWriter filealdi;
       BufferedWriter escribiraldi;
       FileWriter filelidel;
       BufferedWriter escribirlidel;
       int tamañolista=0;
       int contador=0;
       int precioaldi=0;
       int preciolidel=0;
       String producto="";
       String stringpreciolidel="";
       String stringprecioaldi="";
       
       try{
           filealdi=new FileWriter("aldi.txt",false);
           escribiraldi=new BufferedWriter(filealdi);
           filelidel=new FileWriter("lidel.txt",false);
           escribirlidel=new BufferedWriter(filelidel);
           System.out.println("¿Cuantos productos quieres añadir a tu lista?");
           tamañolista=sc.nextInt();
           contador=tamañolista;
           do{
               System.out.println("Introduce nombre del Producto:");
               producto=sc.next();
               escribiraldi.write(producto+" "); escribirlidel.write(producto+" ");
               System.out.println("Introduce el precio de tu producto para el Supermercado ALDI");
               precioaldi=sc.nextInt();
               stringprecioaldi=String.valueOf(precioaldi);
               escribiraldi.write(stringprecioaldi);
               System.out.println("Introduce el precio de tu producto para el Supermercado LIDEL");
               preciolidel=sc.nextInt();
               stringpreciolidel=String.valueOf(preciolidel);
               escribirlidel.write(stringpreciolidel);
               escribiraldi.newLine();
               escribirlidel.newLine();
                       contador--;
           }while(contador>0);
           
          escribiraldi.close();
          escribirlidel.close();
       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
       
       FileReader leeraldi;
       BufferedReader bufferaldi;
       FileReader leerlidel;
       BufferedReader bufferlidel;
       String productosaldi;
       String productoslidel;
       String aux="";
       int auxx=0;
       String [] auxxx=new String[100];
       Producto p1=new Producto( aux,auxx);
       String [] arrayproductosaldi=new String[100];
       String[] arrayproductoslidel=new String[100];
        Producto [] aldi=new Producto [tamañolista];
       Producto [] lidel=new Producto[tamañolista];
       int a=0;

       
       try{
            leeraldi=new FileReader("aldi.txt");
            bufferaldi=new BufferedReader(leeraldi);
            leerlidel=new FileReader("lidel.txt");
            bufferlidel=new BufferedReader(leerlidel);
            productosaldi=bufferaldi.readLine();
            productoslidel=bufferlidel.readLine();
            while((productosaldi!=null)&&(productoslidel!=null)){
                arrayproductosaldi=productosaldi.split(" ");
                arrayproductoslidel=productoslidel.split(" ");
                p1=new Producto(arrayproductosaldi[0],Integer.parseInt(arrayproductosaldi[1]));
                aldi[a]=p1;
                p1=new Producto(arrayproductoslidel[0],Integer.parseInt(arrayproductoslidel[1]));
                lidel[a]=p1;
                
                a++;
                productosaldi=bufferaldi.readLine();
                productoslidel=bufferlidel.readLine();               
            }
         bufferaldi.close();
         bufferlidel.close();
       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
       
       Supermercado Aldi=new Supermercado("Aldi",aldi);
       Supermercado Lidel=new Supermercado("Lidel",lidel);
       Cesta[] arraycesta=new Cesta[20];
       int precioproductoaldi=0;
       int precioproductolidel=0;
       int z=0;
       int preciofinal=0;
       boolean salir=false;
        System.out.println("Bienvenidos a la APP SuperComparator");
        do {
            System.out.println("MENU: 1.COMPARATOR DE PRODUCTOS  2.VER LA CESTA DE LA COMPRA  3.SALIR");
        int respuesta=sc.nextInt();
        switch(respuesta){
        case 1:
            System.out.println("Introduce el nombre del producto");
            String nombreprodu=sc.next();
            for (int i = 0; i < aldi.length; i++) {
                if (aldi[i].getNombre().equalsIgnoreCase(nombreprodu)||lidel[i].getNombre().equalsIgnoreCase(nombreprodu)) {
                   precioproductoaldi=aldi[i].getPrecio();
                   precioproductolidel=lidel[i].getPrecio();
                }

            }
            if(precioproductoaldi>precioproductolidel){
                System.out.println("El producto es mas barato en el Supermercado Lidel");
                System.out.println("¿Quieres añadir el producto a tu cesta? 1.SI  2.NO");
            int respuestaa=sc.nextInt();
            if (respuestaa==1) {
                System.out.println("¿Cuantas unidades?");
                int unidades=sc.nextInt();
                preciofinal=preciofinal+precioproductolidel*unidades;
                Cesta c1= new Cesta(nombreprodu,unidades);
                arraycesta[z]=c1;
                z++;
            }
            else{
                System.out.println("De acuerdo");
            }
            }
            else if(precioproductoaldi<precioproductolidel){
                System.out.println("El producto es mas barato en el Supermercado Aldi");
                System.out.println("¿Quieres añadir el producto a tu cesta? 1.SI  2.NO");         
               int respuestaa=sc.nextInt();
            if (respuestaa==1) {
                System.out.println("¿Cuantas unidades?");
                int unidades=sc.nextInt();
                preciofinal=preciofinal+precioproductoaldi*unidades;
                Cesta c1= new Cesta(nombreprodu,unidades);
                arraycesta[z]=c1;
                z++;
            }
            else{
                System.out.println("De acuerdo");
            }
            }
            else if(precioproductoaldi==0&&precioproductolidel==0){
                System.out.println("Producto no encontrado");
            }
            else if(precioproductoaldi==precioproductolidel){
                System.out.println("Tienen el mismo precio en ambos supermercados");
                System.out.println("¿Quieres añadir el producto a tu cesta? 1.SI  2.NO");
                int respuestaa=sc.nextInt();
            if (respuestaa==1) {
                System.out.println("¿Cuantas unidades?");
                int unidades=sc.nextInt();
                preciofinal=preciofinal+precioproductoaldi*unidades;
                Cesta c1= new Cesta(nombreprodu,unidades);
                arraycesta[z]=c1;
                z++;
            }
            else{
                System.out.println("De acuerdo");
            }
            }  
            break;
        case 2:
            for (int i = 0; i <arraycesta.length; i++) {
                if (arraycesta[i]!=null) {
                    System.out.println(arraycesta[i]);
                }
            }
            System.out.println("El precio final es: "+preciofinal+"euros");
            break;
        case 3:
            salir=true;
            break;
        default:
            System.out.println("Numero introducido no es correcto");
            break;        
    }
        } while (salir==false);
        
    }
}
    