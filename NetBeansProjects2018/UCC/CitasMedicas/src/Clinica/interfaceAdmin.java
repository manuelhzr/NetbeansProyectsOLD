/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinica;

/**
 *
 * @author manue
 */
public interface interfaceAdmin {
    pacientes getListaCitas(int p);
    void setListaCitas(int p, pacientes listaCitas);
    Medicos getListaMedicos(int p);
    void setListaMedicos(int p, Medicos listaMedicos);
    boolean agregarCita(pacientes paciente);
    boolean agregarMedico(Medicos medico);
    int buscarMedico(int id);
    int buscarCita(int id);
}
