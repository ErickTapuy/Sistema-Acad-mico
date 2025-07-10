
package com.mycompany.sistemaacademico.Decano;

import com.mycompany.sistemaacademico.PersonalAcademico;


public class Decano extends PersonalAcademico{
    
    //atributos
    private String nivel;
    
    //

    public Decano(String nivel, String dedicacion, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(dedicacion, sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
    @Override
    public String toString() {
        return "Decano{" + "nivel=" + nivel + '}';
    }

    String getNivelJerarquico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
