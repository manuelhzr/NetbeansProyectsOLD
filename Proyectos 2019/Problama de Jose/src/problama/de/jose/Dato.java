/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problama.de.jose;

/**
 *
 * @author JP
 */
public class Dato {

    private int dato;
    private Dato siguiente;
    private Dato antererior;

    public Dato(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.antererior = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Dato getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Dato siguiente) {
        this.siguiente = siguiente;
    }

    public Dato getAntererior() {
        return antererior;
    }

    public void setAntererior(Dato antererior) {
        this.antererior = antererior;
    }

}
