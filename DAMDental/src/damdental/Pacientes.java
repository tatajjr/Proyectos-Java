package damdental;

import java.util.Arrays;

public class Pacientes {
    //Atributos
    protected Paciente[]verpacientes;
    //Constructor
    public Pacientes(Paciente [] verpacientes){
        this.verpacientes=verpacientes;
    }
    
    //Metodos

    public Paciente[] getVerpacientes() {
        return verpacientes;
    }

    public void setVerpacientes(Paciente[] verpacientes) {
        this.verpacientes = verpacientes;
    }

   
    
    //ToString 

    @Override
    public String toString() {
        return "Pacientes{" + "verpacientes=" + Arrays.toString(verpacientes) + '}';
    }


  
    
}
