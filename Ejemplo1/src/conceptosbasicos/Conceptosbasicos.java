/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

/**
 *
 * @author Medac
 */
public class Conceptosbasicos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //System.out.println("Hola Aula5");
        float a=5,b=2,suma=(a+b);
        float div=(a/b);
        double c=1.56,x=((a+b)*c);
        System.out.println(a);
        System.out.println(b);
        System.out.println("La suma es: "+suma);
        System.out.println("C multiplicado por la suma de a y b es: "+c);
        System.out.println(x);
        System.out.println("La division entre a y b es: " +div);
        //Cálculo de ºFarhrenheit a ºCelcius
        double gradoc=40,faren=(gradoc*9/5+(32));
        System.out.println("Los grados Fahrenheit son: "+faren);
        //Para escribir letras, en este caso la inicial de mi nombre
        char letra1='I',letra2='b'; 
        System.out.println("La inicial de mi nombre es: "+letra1);
        System.out.println(letra1-letra2);
        //Datos booleanos
        boolean respuesta=true;
        System.out.println(respuesta);
        //and=&&(los dos tienen que ser true).
        //or=||(con que uno sea true, funciona).
        //not ! devuelve el valor contrario de la variable.
        boolean booleano1=true, booleano2=false;
        boolean resultado;
        resultado=booleano1&&booleano2;
        System.out.println("El resultado 1 es: "+resultado);
        resultado=booleano1||booleano2;
        System.out.println("El resultado 2 es: "+resultado);
        resultado=!booleano1;
        System.out.println("El resultado 3 es: "+resultado);
        resultado=!booleano2;
        System.out.println("El resultado 4 es: "+resultado);
        //operadores relacionales
        int num1=5, num2=8;
        System.out.println("¿Es igual?: "+(num1==num2));
        char letra3='a',letra4='a';
        System.out.println("¿Es igual?: "+(letra3==letra4));
        
        //Resto de operaciones que puedo hacer con los numeros, libreria math
        System.out.println(Math.sqrt(25));
        
        //Casting porque double es mayor que int
        double num=8.3;
        int result=(int)num;
        System.out.println(result);
        //No castign porque int es menor que double
        int nume=8;
        double result1=nume;
        System.out.println(nume);
        //Casting con char
        char let='a';
        int res=let;
        System.out.println(res);
        //Casting de int a char
        /*esto es un un comentario
        tipo examen*/
        int numer=20;
        char resul=(char)numer;
        System.out.println(resul);
        
        
        // TODO code application logic here
    }
    
}
