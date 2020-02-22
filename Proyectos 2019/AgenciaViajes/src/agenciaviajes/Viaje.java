/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes;

/**
 *
 * @author Andrea
 */
public abstract class Viaje {
    private float DistanciaDestino;
    private int numEscalas;

    public Viaje() {
    }

    public float getDistanciaDestino() {
        return DistanciaDestino;
    }

    public void setDistanciaDestino(float DistanciaDestino) {
        this.DistanciaDestino = DistanciaDestino;
    }

    public int getNumEscalas() {
        return numEscalas;
    }

    public void setNumEscalas(int numEscalas) {
        this.numEscalas = numEscalas;
    }
    
    public abstract float ValorDistancia();
    
    public abstract float CargoEscala();
    
    public abstract float CargoTipo();
    
    
}
