/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estadistica;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public  class Persona {
    //Atributos
    protected String nombre;
    protected double [] notas;
    protected boolean suspenso=false;
    //Constructores
    public Persona(String nombre){
        this.nombre=nombre;
        notas=new double[6];
    }
    //Metodos
    public void insertarnotas(){
        Scanner sc=new Scanner(System.in);
          String []nombres={"PROGRAMACIÓN","LLMM","BBDD","FOL","SYS","ENTORNOS"};
        for (int i = 0; i < notas.length; i++) 
        {
            System.out.println("Introduce la nota de "+nombres[i] );
            notas[i]=sc.nextDouble();
        }
    }
    public void estaAprobado(){
        for (int i = 0; i < notas.length; i++) 
        {
            if (notas[i]<5) {
                suspenso=true;              
            }
           
        }
        if(suspenso){
           }
    }
   @Override
   public String toString(){
       String res="";
       for (int i = 0; i < notas.length; i++) {
           res=res+notas[i]+"||";
       }
       return nombre+" "+res;
   }

    boolean isSuspenso() {
        return suspenso;
    }
}
