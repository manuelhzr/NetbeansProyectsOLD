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
public class Paciente {
    private int ID;
    private String nombre;
    private int edad;
    private char sexo;
    private int celular;
    private Paciente siguiente;

    public Paciente(int ID, String nombre, int edad, char sexo, int celular) {
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.celular = celular;
        this.siguiente = null;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public int getCelular() {
        return celular;
    }

    public void setSiguiente(Paciente siguiente) {
        this.siguiente = siguiente;
    }
    
    public Paciente getSiguiente() {
        return siguiente;
    }
    
    
}
