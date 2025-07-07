package com.mycompany.sistemaacademico.profesor;

import com.mycompany.sistemaacademico.PersonalAcademico;

public class Profesor extends PersonalAcademico {

    private Escalafon escalafon;

    public Profesor(Escalafon escalafon, String dedicacion, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(dedicacion, sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.escalafon = escalafon;
    }

    public Escalafon getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(Escalafon escalafon) {
        this.escalafon = escalafon;
    }

    @Override
    public String toString() {
        return "Profesor{" + super.toString() + "escalafon=" + escalafon + '}';
    }
}
