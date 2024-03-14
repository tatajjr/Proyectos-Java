/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sentenciasdesalto;

/**
 *
 * @author Medac
 */
public class Sentenciasdesalto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /*for (int i = 0; i <4; i++) 
        {
            if (i==2) 
            {
                continue;
                //break;    
            }
            System.out.println("i" +i);
        }*/
        
        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 4; j++) 
            { 
                
                System.out.print(j+2);   
            }
            System.out.println(i*3);
   
        }
         int a=0;
        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 4; j++) 
            { 
                a=j;                  
            }               
        }
        System.out.println(a);
        
    }
    
}
