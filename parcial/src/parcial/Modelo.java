/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author JP
 */
public class Modelo {
    private int numMatricula;
    private String tipoCoche;
    private Modelo siguiente;

    public Modelo(int numMatricula, String tipoCoche) {
        this.numMatricula = numMatricula;
        this.tipoCoche = tipoCoche;
        this.siguiente = null;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(String tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    public Modelo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Modelo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
