package com.mycompany.sistemaacademico.profesor;

public class Profesores implements IProfesores {
    //ATRIBUTOS
    int totalProfesores;
    private Profesor[] profesores;

    //CONSTRUCTOR
    public Profesores(int dimension) {
        profesores = new Profesor[dimension];
        totalProfesores = 0;
    }

    @Override
    public boolean agregarProfesor(Profesor profesor) {
        if (totalProfesores == profesores.length) {
            return false;
        } else {
            profesores[totalProfesores] = profesor;
            totalProfesores = totalProfesores + 1;
            return true;
        }
    }

    @Override
    public boolean eliminarProfesor(int id) {
        for (int i = 0; i < totalProfesores; i++) {
            if (profesores[i].getId() == id) {
                for (int j = i; i < totalProfesores - 1; j++) {
                    profesores[j] = profesores[j + 1];
                }
                profesores[totalProfesores - 1] = null;
                totalProfesores = totalProfesores - 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean buscarProfesor(int id) {
        for (int i = 0; i < totalProfesores; i++) {
            if (profesores[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void imprimir() {
        if (totalProfesores == 0) {
            System.out.println("No hay profesores registrados");
        }
        for (int i = 0; i < totalProfesores; i++) {
            System.out.println("----- DATOS PROFESORES -----");
            System.out.println("NOMBRE: " + profesores[i].getNombre());
            System.out.println("CEDULA: " + profesores[i].getCedula());
            System.out.println("ID: " + profesores[i].getId());
            System.out.println("CORREO PERSONAL: " + profesores[i].getCorreoPersonal());
            System.out.println("CORREO INSTITUCIONAL: " + profesores[i].getCorreoInstitucional());
            System.out.println("ESCALAFON: " + profesores[i].getEscalafon());
            System.out.println("SUELDO: " + profesores[i].getSueldo());
        }
    }
}
