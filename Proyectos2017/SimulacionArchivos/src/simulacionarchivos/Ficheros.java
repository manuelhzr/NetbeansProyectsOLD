/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacionarchivos;

/**
 *
 * @author manue
 */
public class Ficheros {
    private int Identificador;
    private String nombre;
    private String Permisos;

    public Ficheros() {
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPermisos() {
        return Permisos;
    }

    public void setPermisos(String Permisos) {
        this.Permisos = Permisos;
    }
    
    
}
