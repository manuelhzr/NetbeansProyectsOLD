
package servicecliente;


public class Cliente {
    private String nombre;
    private int id;
    private Cliente siguiente;
    
    public void Cliente(){
        nombre="";
        id=0;
        siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public Cliente getSiguiente() {
        return siguiente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSiguiente(Cliente siguiente) {
        this.siguiente = siguiente;
    }
    
}
