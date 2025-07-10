package com.mycompany.sistemaacademico.trabajador;

public interface ITrabajadores {

    public boolean agregarTrabajador(Trabajador trabajador);
    public boolean eliminarTrabajador(int id);
    public boolean buscarTrabajador(int id);
    public void imprimir();
}
