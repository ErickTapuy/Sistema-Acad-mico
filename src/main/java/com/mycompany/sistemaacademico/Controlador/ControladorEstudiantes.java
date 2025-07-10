
package com.mycompany.sistemaacademico.Controlador;

import com.mycompany.sistemaacademico.Estudiante.Estudiante;
import com.mycompany.sistemaacademico.Estudiante.Estudiantes;
import com.mycompany.sistemaacademico.Estudiante.IEstudiantes;
import com.mycompany.sistemaacademico.NotificadorMensaje.NotificadorMensaje;
import com.mycompany.sistemaacademico.Vista.VEstudiantes;


public class ControladorEstudiantes {
    
    private VEstudiantes vistaEstudiantes;
    private NotificadorMensaje notificadorMensaje;
    private IEstudiantes iEstudiantes;

    public ControladorEstudiantes (VEstudiantes vistaEstudiante) {
        this.vistaEstudiantes = vistaEstudiantes;
        this.notificadorMensaje = new NotificadorMensaje();
        this.iEstudiantes = new Estudiantes(10);
    }
    
    
    public void procesoControladorEstudiantes() {
        try {
            String nombreEstudiante = vistaEstudiantes.getNombre();
            String correoPersonalEstudiante = vistaEstudiantes.getCorreoPersonal();
            String cedulaEstudiante = vistaEstudiantes.getCedula();
            String correoInstitucionalEstudiante = vistaEstudiantes.getCorreoInstitucional();
            int codigoEstudiante = Integer.parseInt(vistaEstudiantes.getCodigo());

            Estudiante estudianteD = new Estudiante( codigoEstudiante, correoInstitucionalEstudiante, 0, nombreEstudiante, correoPersonalEstudiante, cedulaEstudiante);
            boolean agregar = iEstudiantes.agregarEstudiantes(estudianteD);
            if (agregar == true) {
                notificadorMensaje.mostrarMensaje("Estudiante agregado con éxito");
                iEstudiantes.mostrarDatosE();
            }
        } catch (Exception e) {
            e.printStackTrace();
            notificadorMensaje.mostrarMensaje("Error al agregar el estudiante");
        }
    }
    
    
    public void procesoBuscarEstudiantes() {
        try {
            int iDEstudiante = Integer.parseInt(vistaEstudiantes.getBuscar());
            boolean estudianteBuscado = iEstudiantes.buscarEstudiante(iDEstudiante);
            if (estudianteBuscado == true) {
                 notificadorMensaje.mostrarMensaje("Estudiante encontrado");
                // vistaEstudiantes.setCedula(estudianteBuscado.getCedula());
                // vistaEstudiantes.setCodigo(String.valueOf(estudianteBuscado.getCodigo()));
                // vistaEstudiantes.setCorreoPersonal(estudianteBuscado.getCorreo());
                 //vistaEstudiantes.setCorreoInstitucional(estudianteBuscado.getCorreoInstitucional());
                 //vistaEstudiantes.setId(String.valueOf(estudianteBuscado.getId()));
                 //vistaEstudiantes.setNombre(estudianteBuscado.getNombre());
                
                
            }else{
                notificadorMensaje.mostrarMensaje("Estudiante no encontrado");
            }
        } catch (Exception e) {
            notificadorMensaje.mostrarMensaje("Error al buscar el estudiante verifique que el codigo este correcto");
        }
    }

    public void procesoEliminarEstudiantes() {
        try {
            int iDEstudiante = Integer.parseInt(vistaEstudiantes.getBuscar());
            boolean estudianteD = iEstudiantes.buscarEstudiante(iDEstudiante);
            if (estudianteD == true) {
                iEstudiantes.eliminarEstudiante(iDEstudiante);
                notificadorMensaje.mostrarMensaje("Estudiante eliminado");
            }
        } catch (Exception e) {
            notificadorMensaje.mostrarMensaje("Error al eliminar el estudiante");
        }
    }

}
