package Clinica;

public class pacientes extends personas{
    private String medico;
    private String fecha;

    public pacientes(String medico, String fecha, String nombre, int ID, String especialidad) {
        super(nombre, ID, especialidad);
        this.medico=medico;
        this.fecha=fecha;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
