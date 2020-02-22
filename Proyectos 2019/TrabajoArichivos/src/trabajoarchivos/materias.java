
package trabajoarchivos;


public class materias {
    private int ID;
    private String nombre;
    private String horario;

    public materias(int ID, String nombre, String horario) {
        this.ID = ID;
        this.nombre = nombre;
        this.horario = horario;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }
    
    
}
