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
public class Medico {

    private int ID;
    private String nombre;
    private String especialidad;
    private int telefono;
    private Medico siguiente;

    public Medico(int ID, String nombre, String especialidad, int telefono) {
        this.ID = ID;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.siguiente = null;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setSiguiente(Medico siguiente) {
        this.siguiente = siguiente;
    }

    public Medico getSiguiente() {
        return siguiente;
    }
    
    

}
