package com.mycompany.sistemaacademico.trabajador;

public class Trabajadores implements ITrabajadores{
    
    //ATRIBUTOS
    private int totalTrabajadores;
    private Trabajador[] trabajadores;

    //CONSTRUCTOR
    public Trabajadores(int dimension) {
        trabajadores = new Trabajador[dimension];
        totalTrabajadores = 0;
    }

    public boolean agregarTrabajador(Trabajador trabajador) {
        if (totalTrabajadores == trabajadores.length) {
            return false;
        } else {
            trabajadores[totalTrabajadores] = trabajador;
            totalTrabajadores = totalTrabajadores + 1;
            return true;
        }
    }

    public boolean eliminarTrabajador(int id) {
        for (int i = 0; i < totalTrabajadores; i++) {
            if (trabajadores[i].getId() == id) {
                for (int j = i; i < totalTrabajadores - 1; j++) {
                    trabajadores[j] = trabajadores[j + 1];
                }
                trabajadores[totalTrabajadores - 1] = null;
                totalTrabajadores = totalTrabajadores - 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean buscarTrabajador(int id) {
        for (int i = 0; i < totalTrabajadores; i++) {
            if (trabajadores[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void imprimir() {
        if (totalTrabajadores == 0) {
            System.out.println("No hay trabajadores registrados");
        }
        for (int i = 0; i < totalTrabajadores; i++) {
            System.out.println("----- DATOS TRABAJADOR -----");
            System.out.println("NOMBRE: " + trabajadores[i].getNombre());
            System.out.println("CEDULA: " + trabajadores[i].getCedula());
            System.out.println("ID: " + trabajadores[i].getId());
            System.out.println("CORREO PERSONAL: " + trabajadores[i].getCorreoPersonal());
            System.out.println("CORREO INSTITUCIONAL: " + trabajadores[i].getCorreoInstitucional());
            System.out.println("SUELDO: " + trabajadores[i].getSueldo());
            System.out.println("GREMIO: " + trabajadores[i].getGremio());
        }
    }
}
