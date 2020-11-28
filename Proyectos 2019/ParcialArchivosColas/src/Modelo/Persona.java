package Modelo;

public class Persona {

    private final int id;
    private final String nombre;
    private final String sexo;
    private final String eps;
    private final String fecha;

    private Persona siguiente;

    public Persona(int id, String nombre, String sexo, String eps, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.eps = eps;
        this.fecha = fecha;
        this.siguiente = null;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEps() {
        return eps;
    }

    public String getFecha() {
        return fecha;
    }

    public Persona getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Persona siguiente) {
        this.siguiente = siguiente;
    }

}
