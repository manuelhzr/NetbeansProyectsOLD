/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prventa;

/**
 *
 * @author JP
 */
public class Articulo {

    private Articulo sig, ant;
    private String nombre;
    private int cantidad;
    private double precioUnidad;

    public Articulo(String nombre, int cantidad, double precioUnidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;

        sig = null;
        ant = null;
    }

    public void setSig(Articulo sig) {
        this.sig = sig;
    }

    public void setAnt(Articulo ant) {
        this.ant = ant;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Articulo getSig() {
        return sig;
    }

    public Articulo getAnt() {
        return ant;
    }

    public String nombre() {

        return nombre;
    }

    public int cantidad() {

        return cantidad;
    }

    public double precioUnidad() {

        return precioUnidad;
    }

    public void vende(int num) throws NoDisponible {
        if (cantidad >= num) {
            cantidad -= num;
        } else {

            throw new NoDisponible(null);
        }

    }

}
