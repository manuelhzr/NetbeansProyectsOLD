package puntuacionpeliculas;


public class NodoLista {
    private int indice;
    private String nombre;
    private int puntuacion;
    private NodoLista siguiente;

    public NodoLista() {
        indice=0;
        nombre="";
        puntuacion=0;
        siguiente=null;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
