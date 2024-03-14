/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colleccioneshassrt;

import java.util.Objects;

/**
 *
 * @author Medac
 */
public class Personas {
    String nombre;
    int edad;
    String dni;
   Personas(String nombre, String dni, int edad){
       this.dni=dni;
       this.edad=edad;
       this.nombre=nombre;
   }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + this.edad;
        hash = 53 * hash + Objects.hashCode(this.dni);
        return hash;
//int a=(int)(Math.random()*10);
//return a;
    }

//    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personas other = (Personas) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + '}';
    }
}
