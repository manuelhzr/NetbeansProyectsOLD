/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JP
 */
public class Pelicula {
    private String nombre;
    private String genero;
    private int duracion;
    private int precio;
    private int valoracion;
    private Pelicula siguiente;

    public Pelicula(String nombre, String genero, int duracion, int precio, int valoracion) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.precio = precio;
        this.valoracion = valoracion;
        this.siguiente = null;
    }    
    
    public Pelicula getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Pelicula siguiente) {
        this.siguiente = siguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public int getValoracion() {
        return valoracion;
    }
    
    
    
}
