/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresobjetos;

/**
 *
 * @author manue
 */
public class Estudiantes {
    private int identificacion;
    private String nombres;
    private String apellidos;
    private float nota1;
    private float nota2;
    private float nota3;
    private float definitiva;

//    public Estudiantes() {
//        this.identificacion=0;
//        this.nombres="";
//        this.apellidos="";
//        this.nota1=0;
//        this.nota2=0;
//        this.nota3=0;
//        this.definitiva=0;
//    }

    public Estudiantes(int identificacion, String nombres, String apellidos, float nota1, float nota2, float nota3) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.definitiva=(nota1+nota2+nota3)/3;
    }
    
    

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
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

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(float definitiva) {
        this.definitiva = definitiva;
    }
        
}
