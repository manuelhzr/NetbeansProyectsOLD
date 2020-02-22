/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author manue
 */
public class Disco {
    private String Titulo;
    private int CantidadPistas;
    private float valorCD;
    private char Clasificacion;

    public Disco(String Titulo, int CantidadPistas, float valorCD, char Clasificacion) {
        this.Titulo = Titulo;
        this.CantidadPistas = CantidadPistas;
        this.valorCD = valorCD;
        this.Clasificacion = Clasificacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getCantidadPistas() {
        return CantidadPistas;
    }

    public void setCantidadPistas(int CantidadPistas) {
        this.CantidadPistas = CantidadPistas;
    }

    public float getValorCD() {
        return valorCD;
    }

    public void setValorCD(float valorCD) {
        this.valorCD = valorCD;
    }

    public char getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(char Clasificacion) {
        this.Clasificacion = Clasificacion;
    }
    
    
}