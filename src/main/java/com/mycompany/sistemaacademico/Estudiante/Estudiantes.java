
package com.mycompany.sistemaacademico.Estudiante;

/**
 *
 * @author Dell
 */
public class Estudiantes implements IEstudiantes{
    
    private Estudiante[] estudiantes;
    private int totalEstudiantes;

    public Estudiantes(int dimension) {
        estudiantes = new Estudiante[dimension];
        totalEstudiantes = 0;
    }

    
    public boolean agregarEstudiantes(Estudiante estudiante) {
        if (totalEstudiantes == estudiantes.length) {
            return false;
        } else {
            estudiantes[totalEstudiantes] = estudiante;
            totalEstudiantes = totalEstudiantes + 1;
            return true;
        }
    }

  
    public void mostrarDatosE() {
        for (int i = 0; i < totalEstudiantes; i++) {
            System.out.println("------Estudiante------" + "|" + (i + 1) + "|");
            System.out.println("Nombre: " + estudiantes[i].getNombre());
            System.out.println("Cedula: " + estudiantes[i].getCedula());
            System.out.println("Correo personal: " + estudiantes[i].getCorreoPersonal());
            System.out.println("Correo institucional: " + estudiantes[i].getCorreoInstitucional());
            System.out.println("Codigo: " + estudiantes[i].getCodigo());
            System.out.println(" ");
        }
    }

    public boolean eliminarEstudiante(int id) {
        for (int i = 0; i < totalEstudiantes; i++) {
            if (estudiantes[i].getId() == id) {
                for (int j = i; j < totalEstudiantes - 1; j++) {
                    estudiantes[j] = estudiantes[j + 1];
                }
                estudiantes[totalEstudiantes - 1] = null;
                totalEstudiantes--;
                return true;
            }
        }
        return false;
    }

    public boolean buscarEstudiante(int codigo) {
        for (int i = 0; i < totalEstudiantes; i++) {
            if (estudiantes[i].getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizarEstudiante(int id, Estudiante estudiante) {
        for (int i = 0; i < totalEstudiantes; i++) {
            estudiantes[i] = estudiante;
            mostrarDatosE();
            return true;
        }
        return false;
    }

}
