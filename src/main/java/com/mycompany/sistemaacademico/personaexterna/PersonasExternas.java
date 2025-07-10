package com.mycompany.sistemaacademico.personaexterna;

public class PersonasExternas implements IPersonasExternas {

    //ATRIBUTOS
    private int totalPersonasExternas;
    private PersonaExterna[] personaExternas;

    //CONSTRUCTOR
    public PersonasExternas(int dimension) {
        personaExternas = new PersonaExterna[dimension];
        totalPersonasExternas = 0;
    }

    @Override
    public boolean agregarPersonasExternas(PersonaExterna personaExterna) {
        if (totalPersonasExternas == personaExternas.length) {
            return false;
        } else {
            personaExternas[totalPersonasExternas] = personaExterna;
            totalPersonasExternas = totalPersonasExternas + 1;
            return true;
        }
    }

    @Override
    public boolean eliminarPersonasExternas(int id) {
        for (int i = 0; i < totalPersonasExternas; i++) {
            if (personaExternas[i].getId() == id) {
                for (int j = 0; j < totalPersonasExternas - 1; j++) {
                    personaExternas[j] = personaExternas[j + 1];
                }
                personaExternas[totalPersonasExternas - 1] = null;
                totalPersonasExternas = totalPersonasExternas - 1;
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean buscarPersonasExternas(int id) {
        for (int i = 0; i < totalPersonasExternas; i++) {
            if (personaExternas[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void imprimir() {
        if (totalPersonasExternas == 0) {
            System.out.println("No hay personas externas registradas.");
        }
        System.out.println("Lista de personas externas:");
        for (int i = 0; i < totalPersonasExternas; i++) {
            System.out.println("----- DATOS PERSONAS EXTERNAS -----");
            System.out.println("NOMBRE: " + personaExternas[i].getNombre());
            System.out.println("CEDULA: " + personaExternas[i].getCedula());
            System.out.println("ID: " + personaExternas[i].getId());
            System.out.println("CORREO PERSONAL: " + personaExternas[i].getCorreoPersonal());
            System.out.println("DESCRIPCION: " + personaExternas[i].getDescripcion());
        }
    }
}
