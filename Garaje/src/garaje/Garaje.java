/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garaje;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Garaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      Coche [][] parking=new Coche[5][5];
        do {
            System.out.println("1.Insertar  2.Ver  3.Buscar  4.Sacar  5.Salir");
            int menu=sc.nextInt();
            switch (menu){
            case 1 :
                System.out.println("Matricula");
                String matricula1=sc.next();
                System.out.println("Marca");
                String marca1=sc.next();
                Coche c=new Coche(matricula1,marca1);
                for(int i=0; i<parking.length;i++){
                    for (int j = 0; j < parking[i].length; j++) {
                        if (parking[i][i]==null) {
                            System.out.println("Fila "+i+"Columna "+j);
                        }
                    }
                }
                System.out.println("Indica la fila y col");
                int fila=sc.nextInt();
                int col=sc.nextInt();
                parking[fila][col]=c;
                
                break;
        }
        } while (true);
    }
    
}
