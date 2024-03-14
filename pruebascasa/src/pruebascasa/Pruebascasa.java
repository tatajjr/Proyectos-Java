/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebascasa;
import java.util.Scanner;
/**
 *
 * @author ivang
 */
public class Pruebascasa {

    /**
     * @param args the command line arguments
     * @return 
     */
    public static boolean main(String[] args) {
        /*boolean isJavaFun = true;
        boolean isFishTasty = false;
            System.out.println(isJavaFun);     // Outputs true
            System.out.println(isFishTasty);   // Outputs false
            System.out.println(1<9);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime de que tipo quieres que sea tu bomba; 1.Bomba de agua 2.Bomba de propulsión 3.Bomba de carbón");
        int tipoBomba=sc.nextInt();
        String tipoFluido,combustible;
       boolean motorEsParaAgua;

    if (tipoBomba == 1){
    motorEsParaAgua = true;
                    }

    else {
        motorEsParaAgua = false;

           }

     return motorEsParaAgua;
}

}
        
    
    

