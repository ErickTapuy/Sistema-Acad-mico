
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

            Estudiante Destudiante = new Estudiante(
                    codigoEstudiante,
                    correoInstitucionalEstudiante,
                    nombreEstudiante,
                    correoPersonalEstudiante,
                    cedulaEstudiante
            );
            boolean agregar = iEstudiantes.agregarEstudiantes(Destudiante);
            if (agregar == true) {
                notificadorMensaje.mostrarMensaje("Estudiante agregado con éxito");
                iEstudiantes.imprimirDato();
            }
        } catch (Exception e) {
            e.printStackTrace();
            notificadorMensaje.mostrarMensaje("Error al agregar el estudiante");
        }
    }

 

}
