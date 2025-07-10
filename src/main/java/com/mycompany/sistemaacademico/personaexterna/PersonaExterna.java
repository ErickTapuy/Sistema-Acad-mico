package com.mycompany.sistemaacademico.personaexterna;

import com.mycompany.sistemaacademico.Persona;

public class PersonaExterna extends Persona {

    //ATRIBUTO
    private String descripcion;

    //CONSTRUCTOR

    public PersonaExterna(String descripcion, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.descripcion = descripcion;
    }

    //METODOS GETTERS Y SETTERS

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    //METODOS

    @Override
    public String toString() {
        return "PersonaExterna{" + super.toString() + "descripcion=" + descripcion + '}';
    }
}
