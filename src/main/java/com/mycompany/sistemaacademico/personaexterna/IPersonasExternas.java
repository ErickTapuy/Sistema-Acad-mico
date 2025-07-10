package com.mycompany.sistemaacademico.personaexterna;

public interface IPersonasExternas {

    public boolean agregarPersonasExternas(PersonaExterna personaExterna);
    public boolean eliminarPersonasExternas(int id);
    public boolean buscarPersonasExternas(int id);
    public void imprimir();
}
