
package com.mycompany.sistemaacademico.Estudiante;


public interface IEstudiantes {
    
    public boolean agregarEstudiante(Estudiante estudiante);
    public void mostrarDatosE();
    public boolean buscarEstudiante();
    public boolean eliminarEstudiante();
    public boolean actualizarEstudiante(int i, Estudiante estudiante);
}
