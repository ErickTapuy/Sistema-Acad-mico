package com.mycompany.sistemaacademico.Controlador;

import com.mycompany.sistemaacademico.NotificadorMensaje.NotificadorMensaje;
import com.mycompany.sistemaacademico.Vista.VProfesores;
import com.mycompany.sistemaacademico.profesor.Escalafon;
import com.mycompany.sistemaacademico.profesor.IProfesores;
import com.mycompany.sistemaacademico.profesor.Profesor;
import com.mycompany.sistemaacademico.profesor.Profesores;

public class ControladorProfesores {
    private VProfesores vistaProfesores;
    private IProfesores iProfesores = new Profesores(5);
    private NotificadorMensaje msm;
    private Escalafon escalafon;
    
    public ControladorProfesores(VProfesores vistaProfesores){
       this.vistaProfesores =  vistaProfesores;
       this.msm = new NotificadorMensaje();
       this.escalafon = escalafon;
    }
    
    public Escalafon seleccionarEscalafon (String escalafon) {
        Escalafon tipo = Escalafon.AGREGADO;
        if (escalafon == "Principal") {
            tipo = Escalafon.PRINCIPAL;
        } else if (escalafon == "Auxiliar") {
            tipo = Escalafon.AUXILIAR;
        } else if (escalafon == "Agregado") {
            tipo = Escalafon.AGREGADO;
        }
        return tipo;
    }
    public void procesoAgregar () {
        try {
            String nombre = vistaProfesores.getNombre();
            String cedula = vistaProfesores.getCedula();
            String correoPersonal = vistaProfesores.getCorreoPersonal();
            String correoInstitucional = vistaProfesores.getCorreoInstitucional();
            String sueldo = vistaProfesores.getSueldo();
            String escalafon = vistaProfesores.getEscalafon();
            Escalafon tipoEscalafon = seleccionarEscalafon(escalafon);
            int id = Integer.parseInt(vistaProfesores.getId());
            Profesor profesor = new Profesor(tipoEscalafon, escalafon, id, correoInstitucional, id, nombre, correoPersonal, cedula);
            boolean agregado = iProfesores.agregarProfesor(profesor);
            if(true){
                iProfesores.imprimir();
                msm.mostrarMsm("Profesor agregado");
            }
        } catch (Exception e) {
            msm.mostrarMsm("Profesor no agregado");
        }
    }
    
    public void procesoEliminar () {
        try {
            int id = Integer.parseInt(vistaProfesores.getBuscar());
            boolean buscado = iProfesores.buscarProfesor(id);
            if (buscado != false) {
                iProfesores.eliminarProfesor(id);
                msm.mostrarMsm("Persona externa eliminada");
                iProfesores.imprimir();
            }
        } catch (Exception e) {
            msm.mostrarMsm("Persona externa sin eliminar");
        }
    }
    public void procesoBuscar () {
        try {
            int id = Integer.parseInt(vistaProfesores.getBuscar());
            boolean buscado = iProfesores.buscarProfesor(id);
            if (buscado != false) {
                msm.mostrarMsm("Profesor encontrado");
            }
        } catch (Exception e) {
            msm.mostrarMsm("Profesor no encontrada");
        }
    }
}
