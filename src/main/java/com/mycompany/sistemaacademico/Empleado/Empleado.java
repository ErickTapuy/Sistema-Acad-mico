
package com.mycompany.sistemaacademico.Empleado;

import com.mycompany.sistemaacademico.PersonaInstitucional;

public class Empleado extends PersonaInstitucional{
    
    //atributos
    private double sueldo;
    
    //

    public Empleado(double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "sueldo=" + sueldo + '}';
    }
    
    
}
