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
public class Pila {
    
    static final int cantidadNodos = 100;
    
    private int totalNodos;
    private Competencia tope;

    public Pila() {
        this.totalNodos = 0;
        this.tope = null;
    }

    public int getTotalNodos() {
        return totalNodos;
    }

    public Competencia getTope() {
        return tope;
    }

    public boolean pilaLlena() {
        return getTotalNodos() == cantidadNodos;
    }

    public boolean pilaVacia() {
        return getTotalNodos() == 0;
    }

    public void agregar(Competencia nuevo) {
        if (!pilaLlena()) {
            nuevo.setSiguiente(getTope());
            tope = nuevo;
            totalNodos = totalNodos + 1;
        }
    }

    public String mostrarPila(){
        Competencia actual= getTope();
        String datos="";
        while (actual != null) {            
            datos+=actual.getCompetencia()+"***"+actual.getDistancia()+"***"+actual.getTiempo()+"***"+actual.getVelocidad()+"\n";
            actual = actual.getSiguiente();
        }
        return datos;
    }
    
    
    
    
}
