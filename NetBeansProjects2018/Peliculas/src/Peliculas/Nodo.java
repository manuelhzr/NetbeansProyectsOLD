package Peliculas;


public class Nodo {
    private Nodo siguiente;
    private String titulo;
    private int puntuacion;
    private int posicion;

    public Nodo() {
        this.siguiente=null;
        this.titulo="";
        this.puntuacion=0;
        this.posicion=0;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    
}
