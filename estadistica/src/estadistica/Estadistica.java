/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadistica;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Estadistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int respuesta;
        Persona[]alumnos=new Persona[100];
        int pos=0;
        do {
            System.out.println("1.Insertar Alumno 2.Mostrar alumnos 3.Mostrar alumnas 4.Mostrar suspensos 5.Mostrar estadistica de suspensos entre alumnos y alumnas 6.Salir");
            respuesta=sc.nextInt();
            switch(respuesta){
                case 1:
                    System.out.println("1.Alumno 2.Alumna");
                    int res=sc.nextInt();
                    System.out.println("Di el nombre");
                    if (res==1) {          
                        alumnos[pos]=new Alumno(sc.next());
                        alumnos[pos].insertarnotas();
                        alumnos[pos].estaAprobado();
                    }
                    else{
                      alumnos[pos]=new Alumna(sc.next());
                      alumnos[pos].insertarnotas();
                      alumnos[pos].estaAprobado();
                    }
                    pos++;
                    break;
                case 2:
                    for (int i = 0; i < alumnos.length; i++) {
                        //El instanceof verifica a que tipo de clase pertenece la posicion del objeto
                        if (alumnos[i] instanceof Alumno) {
                            System.out.println(alumnos[i]);
                        }
                        
                    }
                    break;
                case 3:
                     for (int i = 0; i < alumnos.length; i++) {
                        //El instanceof verifica a que tipo de clase pertenece la posicion del objeto
                        if (alumnos[i] instanceof Alumna) {
                            System.out.println(alumnos[i]);
                        }
                        
                    }
                    break;
                case 4:
                    System.out.println("1.Alumnos 2.Alumnas");
                    int respu=sc.nextInt();
                    for (int i = 0; i < pos; i++) {
                        
                        if (respu==1) {
                            if (alumnos[i] instanceof Alumno && alumnos[i].isSuspenso()) {
                                System.out.println(alumnos[i]);
                            }
                        }
                    }
                break;
                case 5:
                    int contmasc=0;
                    int contfem=0;
                    for (int i = 0; i < pos; i++) {
                        if (alumnos[i].isSuspenso() && alumnos[i] instanceof Alumno) {
                            contmasc++;
                        }
                        else if (alumnos[i].isSuspenso() && alumnos[i] instanceof Alumna){
                            contfem++;
                        }
                    }
                    System.out.println("Alumnos chicos "+contmasc/pos+ " Alumnos chicas "+contfem/pos);
                    break;
                case 6:
                    break;
            }
        } while (respuesta!=6);
    }
    
}
