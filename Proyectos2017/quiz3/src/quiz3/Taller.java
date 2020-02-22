/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3;

/**
 *
 * @author manue
 */
public class Taller {
    private int totalNodos;
    private Nodo frente;
    private Nodo finalcola;

    public Taller() {
        totalNodos=0;
        frente=null;
        finalcola=null;
    }

    public int getTotalNodos() {
        return totalNodos;
    }

    public void setTotalNodos(int totalNodos) {
        this.totalNodos = totalNodos;
    }

    public Nodo getFrente() {
        return frente;
    }

    public void setFrente(Nodo frente) {
        this.frente = frente;
    }

    public Nodo getFinalcola() {
        return finalcola;
    }

    public void setFinalcola(Nodo finalcola) {
        this.finalcola = finalcola;
    }
    
    public boolean colaVacia(){
        return getTotalNodos()==0;
    }
    
    public void agregar(Nodo vehiculo){
        if(getFrente()==null){
            setFrente(vehiculo);
        }else{
            getFinalcola().setSiguiente(vehiculo);
        }
        setFinalcola(vehiculo);
        totalNodos++;
    }
    
    public void eliminar(){
        Nodo temp;
        if(!colaVacia()){
            temp=getFrente();
            frente=getFrente().getSiguiente();
            if(getFrente()==null){
                setFinalcola(null);
            }
            temp=null;
            totalNodos--;
        }
    }
    
    public Nodo valorFinal(){
        return getFrente();
    }
    
    
    
    
}
