
package trabajoarchivos;


public class estudiantes {
    private String nombre;
    private String apellido;
    private int id;
    private int telefono;

    public estudiantes(String nombre, String apellido, int id, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public int getTelefono() {
        return telefono;
    }
    
    
}
