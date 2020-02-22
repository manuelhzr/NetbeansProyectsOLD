/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrerauniversitaria;

/**
 *
 * @author Diego
 */
public class Aspirante {
    private int puntaje;
    private String carrera;
    private int identificacion;
    private String nombre;
    private int edad;
    private String institucion;

    public Aspirante(int puntaje, String carrera) {
        this.puntaje = puntaje;
        this.carrera = carrera;
        this.identificacion = 0;
        this.nombre= null;
        this.edad =0;
        this.institucion= null;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    
    
    
    
}
