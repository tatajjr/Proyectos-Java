/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventana.emergente;

import javax.swing.JOptionPane;

/**
 *
 * @author Medac
 */
public class VentanaEmergente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        JOptionPane.showInputDialog("Introduce el precio de su producto:");*/
       
 
        final double IVA=0.21;
        String texto_num=JOptionPane.showInputDialog("Introduzca el precio de su producto");
        int precioProducto= Integer.parseInt(texto_num);
 
        JOptionPane.showMessageDialog(null,"El precio final del prodcuto ya sumado el IVA es "+(precioProducto+(precioProducto*IVA)));
    }
    
}
