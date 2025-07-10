
package com.mycompany.sistemaacademico;

import com.mycompany.sistemaacademico.Empleado.Empleado;


public class PersonalAcademico extends Empleado{
    
    //atributos
    private String dedicacion;
    
    //

    public PersonalAcademico(String dedicacion, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.dedicacion = dedicacion;
    }

    @Override
    public String toString() {
        return "PersonalAcademico{" + "dedicacion=" + dedicacion + '}';
    }
    
    
}
