package com.mycompany.sistemaacademico.trabajador;

import com.mycompany.sistemaacademico.Empleado;

public class Trabajador extends Empleado {

    //ATRIBUTOS
    private String gremio;

    //CONSTRUCTOR

    public Trabajador(String gremio, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.gremio = gremio;
    }
    
    
    //METODOS GETTERS Y SETTERS
    public String getGremio() {
        return gremio;
    }
    
    public void setGremio(String gremio) {    
        this.gremio = gremio;
    }

    @Override
    public String toString() {
        return "PersonalServicios{" + super.toString() + "gremio=" + gremio + '}';
    }

}
