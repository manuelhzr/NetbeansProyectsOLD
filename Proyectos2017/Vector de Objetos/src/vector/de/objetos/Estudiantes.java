
package vector.de.objetos;

public class Estudiantes {
    
    private String nombre;
    private int codigo;
    private float nota;

    public Estudiantes() {
        this.nombre = "";
        this.codigo = 0;
        this.nota = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
    
}
