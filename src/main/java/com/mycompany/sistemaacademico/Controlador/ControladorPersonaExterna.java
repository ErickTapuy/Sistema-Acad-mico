package com.mycompany.sistemaacademico.Controlador;

import com.mycompany.sistemaacademico.NotificadorMensaje.NotificadorMensaje;
import com.mycompany.sistemaacademico.Vista.VPersonaExterna;
import com.mycompany.sistemaacademico.personaexterna.IPersonasExternas;
import com.mycompany.sistemaacademico.personaexterna.PersonasExternas;

public class ControladorPersonaExterna {
    private VPersonaExterna vistaPersonaExterna;
    private IPersonasExternas iPersonasInvitadas = new PersonasExternas(5);
    private NotificadorMensaje msm;
    
    public ControladorPersonaExterna(VPersonaExterna vistaPersonaExterna){
       this.vistaPersonaExterna =  vistaPersonaExterna;
       this.msm = new NotificadorMensaje();
    }
    
    public void procesoAgregar () {
        try {
            String nombre = vistaPersonaExterna.getNombre();
            String cedula = vistaPersonaExterna.getCedula();
            String correoPersonal = vistaPersonaExterna.getCorreoPersonal();
            String descripcion = vistaPersonaExterna.getDescripcion(); 
            int id = Integer.parseInt(vistaPersonaExterna.getId());
            PersonasExternas externos = new PersonasExternas(nombre, cedula, id, correoPersonal, descripcion);
            if(true){
                IPersonasExternas.imprimir();
                msm.mostrarMsm("Persona externa agregada");
            }
        } catch (Exception e) {
            msm.mostrarMsm("Persona externa no agregada");
        }
    }
    
    public void procesoEliminar () {
        try {
            int id = Integer.parseInt(vistaPersonaExterna.getBuscar());
            boolean buscado = iPersonasInvitadas.buscarPersonasExternas(id);
            if (buscado != false) {
                iPersonasInvitadas.eliminarPersonasExternas(id);
                msm.mostrarMsm("Persona externa eliminada");
                iPersonasInvitadas.imprimir();
            }
        } catch (Exception e) {
            msm.mostrarMsm("Persona externa sin eliminar");
        }
    }
    public void procesoBuscar () {
        try {
            int id = Integer.parseInt(vistaPersonaExterna.getBuscar());
            boolean buscado = iPersonasInvitadas.buscarPersonasExternas(id);
            if (buscado != false) {
                msm.mostrarMsm("Persona externa encontrada");
            }
        } catch (Exception e) {
            msm.mostrarMsm("Persona externa no encontrada");
        }
    }
}
