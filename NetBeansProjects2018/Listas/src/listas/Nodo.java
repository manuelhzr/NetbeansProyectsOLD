/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author manue
 */
public class Nodo {
    private int codigo;
    private String nombre;
    private float nota1;
    private float nota2;
    private float nota3;
    private Nodo siguiente;

    public Nodo() {
        this.codigo = 0;
        this.nombre = "";
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.siguiente = null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    public float definitiva(){
        return (getNota1()+ getNota2()+ getNota3())/3;
    }
    
}
