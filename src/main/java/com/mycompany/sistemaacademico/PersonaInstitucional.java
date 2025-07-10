/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;

import com.mycompany.sistemaacademico.Persona.Persona;


public class PersonaInstitucional extends Persona{
    
    //atributos
    private String correoInstitucional;
    
    
    //

    public PersonaInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    

    @Override
    public String toString() {
        return "PersonaInstitucional{" + "correoInstitucional=" + correoInstitucional + '}';
    }
    
    
}
