
package com.mycompany.sistemaacademico.Controlador;

import com.mycompany.sistemaacademico.Decano.Decano;
import com.mycompany.sistemaacademico.Decano.Decanos;
import com.mycompany.sistemaacademico.Decano.IDecanos;
import com.mycompany.sistemaacademico.NotificadorMensaje.NotificadorMensaje;
import com.mycompany.sistemaacademico.Vista.VDecanos;


public class ControladorDecanos {
    
    private VDecanos vistaDecanos;
    private NotificadorMensaje notificarMensaje;
    private IDecanos iDecanos;

    public ControladorDecanos(VDecanos vistaDecano) {
        this.vistaDecanos = vistaDecano;
        this.notificarMensaje = new NotificadorMensaje();
        this.iDecanos = (IDecanos) new Decanos(8);
    }


    public void procesoControladorDecano() {
        try {
            String nombreDecano = vistaDecanos.getNombre();
            String correoPersonalDecano = vistaDecanos.getCorreoPersonal();
            String cedulaDecano = vistaDecanos.getCedula();
            String correoInstitucionalDecano = vistaDecanos.getCorreoInstitucional();
            int idDecano = Integer.parseInt(vistaDecanos.getId());
            String Jerarquico = vistaDecanos.getJerarquico();

            Decano DecanoE = new Decano(Jerarquico, Jerarquico, idDecano, correoInstitucionalDecano, idDecano, nombreDecano, correoPersonalDecano, cedulaDecano);
            boolean agregar = iDecanos.AgregarDecanos(DecanoE);
            if (agregar == true) {
                notificarMensaje.mostrarMensaje("Profesor Agregado Exito");
                iDecanos.MostrarDatosD();
            }
        } catch (Exception e) {
            e.printStackTrace();
            notificarMensaje.mostrarMensaje("Error al agregar el decano");
        }
    }

    public void procesoBuscarDecano() {
        try {
            int idDecano = Integer.parseInt(vistaDecanos.getBuscar());
            Decano decanoBuscado = iDecanos.buscarDecanos(idDecano);
            if(decanoBuscado == null){
                //notificarMensaje.mostrarMensaje("Decano encontrado");
                //vistaDecanos.setNombre(decanoBuscado.getNombre());
                //vistaDecanos.setCedula(decanoBuscado.getCedula());
                //vistaDecanos.setCorreoPersonal(decanoBuscado.getCorreo());
               // vistaDecanos.setCorreoInstitucional(decanoBuscado.getCorreoInstitucional());
                //vistaDecanos.setId(String.valueOf(decanoBuscado.getId()));
                //vistaDecanos.setNivelJerarquico(decanoBuscado.getNivelJerarquico());
            }else{
                notificarMensaje.mostrarMensaje("Decano no encontrado");
            }            
        } catch (Exception e) {
            notificarMensaje.mostrarMensaje("Error en el id.");
        }
    }

    public void procesoControladorEliminarProfesor() {
        try {
            int idDecano = Integer.parseInt(vistaDecanos.getBuscar());
            Decano decanoBuscado = iDecanos.buscarDecanos(idDecano);
            
            if (decanoBuscado != null) {
                iDecanos.eliminarDecanos(idDecano);
                notificarMensaje.mostrarMensaje("Decano eliminado");
            }
        } catch (Exception e) {
            notificarMensaje.mostrarMensaje("Error al eliminar el Decano");
        }
    }

}
