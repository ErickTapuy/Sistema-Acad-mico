package com.mycompany.sistemaacademico.Controlador;

import com.mycompany.sistemaacademico.NotificadorMensaje.NotificadorMensaje;
import com.mycompany.sistemaacademico.Vista.VTrabajador;
import com.mycompany.sistemaacademico.trabajador.ITrabajadores;
import com.mycompany.sistemaacademico.trabajador.Trabajadores;

public class ControladorTrabajador {
    private VTrabajador vistaTrabajador;
    private ITrabajadores iTrabajadores = new Trabajadores(5);
    private NotificadorMensaje msm;
    
    public ControladorTrabajador(VTrabajador vistaTrabajador){
       this.vistaTrabajador =  vistaTrabajador;
       this.msm = new NotificadorMensaje();
    }
    
    public void procesoAgregar () {
        try {
            String nombre = vistaTrabajador.getNombre();
            String cedula = vistaTrabajador.getCedula();
            int id = Integer.parseInt(vistaTrabajador.getId());
            String correoPersonal = vistaTrabajador.getCorreoPersonal();
            String correoInstitucional = vistaTrabajador.getCorreoInstitucional();
            String sueldo = vistaTrabajador.getSueldo(); 
            String gremio = vistaTrabajador.getGremio();
            Trabajadores trabajador = new Trabajadores(gremio, sueldo, nombre, cedula, correoInstitucional, correoPersonal, id);
            boolean agregado = iTrabajadores.agregarTrabajador(trabajador);
            if (true) {
                iTrabajadores.imprimir();
                msm.mostrarMsm("Trabajador agregado");
            }
        } catch (Exception e) {
            msm.mostrarMsm("Trabajador no agregado");
        }
    }
    public void procesoEliminar () {
        try {
            int id = Integer.parseInt(vistaTrabajador.getBuscar());
            boolean buscado = iTrabajadores.buscarTrabajador(id);
            if (buscado != false) {
                iTrabajadores.eliminarTrabajador(id);
                msm.mostrarMsm("Trabajador eliminado");
                iTrabajadores.imprimir();
            }
        } catch (Exception e) {
            msm.mostrarMsm("Trabajador no eliminado");
        }
    }
    public void procesoBuscar () {
        try {
            int id = Integer.parseInt(vistaTrabajador.getBuscar());
            boolean buscado = iTrabajadores.buscarTrabajador(id);
            if (buscado != false) {
                msm.mostrarMsm("Trabajador encontrado");
            }
        } catch (Exception e) {
            msm.mostrarMsm("Trabajador no encontrado");
        }
    }
}
