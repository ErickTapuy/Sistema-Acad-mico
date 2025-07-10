
package com.mycompany.sistemaacademico.Estudiante;


public interface IEstudiantes {
    
    public boolean agregarEstudiantes(Estudiante estudiante);
    public void mostrarDatosE();
    public boolean buscarEstudiante(int codigo);
    public boolean eliminarEstudiante(int codigo);
}
