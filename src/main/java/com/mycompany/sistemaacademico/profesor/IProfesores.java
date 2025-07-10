package com.mycompany.sistemaacademico.profesor;

public interface IProfesores {
    
    public boolean agregarProfesor(Profesor profesor);
    public boolean eliminarProfesor(int id);
    public boolean buscarProfesor(int id);
    public void imprimir();
}
