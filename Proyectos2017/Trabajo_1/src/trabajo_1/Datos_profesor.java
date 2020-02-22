/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_1;

/**
 *
 * @author elena
 */
public class Datos_profesor {

    public Datos_profesor() {
    }
    
    private int identificacion;
    private String Nombre;
    private String Asignatura;
    private int Telefono;
    
    
    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

}
