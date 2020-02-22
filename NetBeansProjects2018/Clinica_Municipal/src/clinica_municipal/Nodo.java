/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_municipal;

/**
 *
 * @author julia
 */
public class Nodo {
    
    private int Identificacion_Paciente;
    private String Nombre_Paciente;
    private String Correo_Paciente;
    private String Nombre_Medico;
    private String Fecha;
    private String Tipo_Especialidad;
    private Nodo Siguiente;
    
    public void Paciente(){
        Identificacion_Paciente = 0;
        Nombre_Paciente = "";
        Correo_Paciente = "";
        Nombre_Medico = "";
        Fecha = "";
        Tipo_Especialidad = "";
        Siguiente = null;
    }

    public int getIdentificacion_Paciente() {
        return Identificacion_Paciente;
    }

    public void setIdentificacion_Paciente(int Id) {
        Identificacion_Paciente = Id;
    }

    public String getNombre_Paciente() {
        return Nombre_Paciente;
    }

    public void setNombre_Paciente(String Nom) {
        Nombre_Paciente = Nom;
    }

    public String getCorreo_Paciente() {
        return Correo_Paciente;
    }

    public void setCorreo_Paciente(String Correo) {
        Correo_Paciente = Correo;
    }

    public String getNombre_Medico() {
        return Nombre_Medico;
    }

    public void setNombre_Medico(String Nom_Med) {
        Nombre_Medico = Nom_Med;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    
    public String getTipo_Especialidad() {
        return Tipo_Especialidad;
    }

    public void setTipo_Especialidad(String Tipo) {
        Tipo_Especialidad = Tipo;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Sig) {
        Siguiente = Sig;
    }
    
    
}
