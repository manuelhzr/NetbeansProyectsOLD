/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author manue
 */
public class Historial {

    private String fechaCita;
    private int IDPaciente;
    private int IDMedico;
    private String especialidadConsulta;
    private Historial siguiente;

    public Historial(String fechaCita, int IDPaciente, int IDMedico, String especialidadConsulta) {
        this.fechaCita = fechaCita;
        this.IDPaciente = IDPaciente;
        this.IDMedico = IDMedico;
        this.especialidadConsulta = especialidadConsulta;
        this.siguiente = null;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public int getIDPaciente() {
        return IDPaciente;
    }

    public int getIDMedico() {
        return IDMedico;
    }

    public String getEspecialidadConsulta() {
        return especialidadConsulta;
    }

    public Historial getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Historial siguiente) {
        this.siguiente = siguiente;
    }

}
