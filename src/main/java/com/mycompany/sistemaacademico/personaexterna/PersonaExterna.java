package com.mycompany.sistemaacademico.personaexterna;

import com.mycompany.sistemaacademico.Persona.Persona;

public class PersonaExterna extends Persona {

    private String descripcion;

    public PersonaExterna(String descripcion, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "PersonaExterna{" + super.toString() + "descripcion=" + descripcion + '}';
    }
}
