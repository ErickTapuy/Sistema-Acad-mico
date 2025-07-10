
package com.mycompany.sistemaacademico.Decano;


public class Decanos {
    private Decano[] decanos;
    private int totalDecanos;

    public Decanos(int dimension) {
        decanos = new Decano[dimension];
        totalDecanos = 0;

    }

    
    public boolean AgregarDecanos(Decano decano) {
        if (totalDecanos == decanos.length) {
            return false;
        } else {
            decanos[totalDecanos] = decano;
            totalDecanos = totalDecanos + 1;
            return true;
        }
    }

    
    public void MostarDatosD() {
        for (int i = 0; i < totalDecanos; i++) {
            System.out.println("------DECANO------" + "|" + (i + 1) + "|");
            System.out.println("Nombre :" + decanos[i].getNombre());
            System.out.println("Id :" + decanos[i].getId());
            System.out.println("Cedula :" + decanos[i].getCedula());
            System.out.println("Correo personal :" + decanos[i].getCorreoPersonal());
            System.out.println("Correo institucional :" + decanos[i].getCorreoInstitucional());
            System.out.println("Nivel jerarquico: " + decanos[i].getNivelJerarquico());
            System.out.println(" ");

        }
    }

    public boolean eliminarDecanos(int id) {
        for (int i = 0; i < totalDecanos; i++) {
            if (decanos[i].getId() == id) {
                for (int j = i; j < totalDecanos - 1; j++) {
                    decanos[j] = decanos[j + 1];
                }
                decanos[totalDecanos - 1] = null;
                totalDecanos--;
                return true;
            }
        }
        return false;
    }
    
    public Decano buscarDecanos(int id) {
        for (int i = 0; i < totalDecanos; i++) {
            if (decanos[i] != null && decanos[i].getId() == id) {
                return decanos[i];
            }
        }
        return null;
    }
}
