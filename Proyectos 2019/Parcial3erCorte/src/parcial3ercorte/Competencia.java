/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3ercorte;

/**
 *
 * @author omar
 */
public class Competencia {
    private String competencia;
    private float distancia;
    private float tiempo;
    private float velocidad;

    public Competencia(String competencia, float distancia, float tiempo, float velocidad) {
        this.competencia = competencia;
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.velocidad = velocidad;
        calcularVelocidad();
    }

    public String getCompetencia() {
        return competencia;
    }

    public float getDistancia() {
        return distancia;
    }

    public float getTiempo() {
        return tiempo;
    }

    public float getVelocidad() {
        return velocidad;
    }
    
    private void calcularVelocidad(){
        float horas = getTiempo()/60;
        
        velocidad = getDistancia()/horas;
        
    }
}
