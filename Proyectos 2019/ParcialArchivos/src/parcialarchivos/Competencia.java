/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialarchivos;

/**
 *
 * @author JP
 */
public class Competencia {
    private String competencia;
    private int distancia;
    private float tiempo;
    private float velocidad;
    private Competencia siguiente;

    public Competencia(String competencia, int distancia, float tiempo) {
        this.competencia = competencia;
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.velocidad = distancia/(tiempo/60);
        this.siguiente = null;
    }

    public String getCompetencia() {
        return competencia;
    }

    public int getDistancia() {
        return distancia;
    }

    public float getTiempo() {
        return tiempo;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public Competencia getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Competencia siguiente) {
        this.siguiente = siguiente;
    }
    
}
