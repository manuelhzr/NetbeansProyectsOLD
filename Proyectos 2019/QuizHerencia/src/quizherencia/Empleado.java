/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizherencia;

/**
 *
 * @author Lenovo
 */
public abstract class Empleado {

    private int ID;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String estudios;
    private int añoVinculacion;

    private final float salarioMinimo = 925148;

    public Empleado() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public int getAñoVinculacion() {
        return añoVinculacion;
    }

    public void setAñoVinculacion(int añoVinculacion) {
        this.añoVinculacion = añoVinculacion;
    }

    public float getSalarioMinimo() {
        return salarioMinimo;
    }

    public abstract float Salario();

}
