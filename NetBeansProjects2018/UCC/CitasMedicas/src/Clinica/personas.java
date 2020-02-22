package Clinica;

public abstract class personas implements Cloneable{
    private String nombre;
    private int Id;
    private String Especialidad;

    public personas(String nombre, int Id, String Especialidad) {
        this.nombre = nombre;
        this.Id = Id;
        this.Especialidad = Especialidad;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

}
