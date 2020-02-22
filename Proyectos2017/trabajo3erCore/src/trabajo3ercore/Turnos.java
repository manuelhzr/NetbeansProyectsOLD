/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo3ercore;

/**
 *
 * @author manue
 */
public class Turnos {
    private Nodo frente;
    private Nodo finalCola;
    private int totalNodos;

    public Turnos() {
        this.frente=null;
        finalCola=null;
        totalNodos=0; 
    }

    public Nodo getFrente() {
        return frente;
    }

    public void setFrente(Nodo frente) {
        this.frente = frente;
    }

    public Nodo getFinalCola() {
        return finalCola;
    }

    public void setFinalCola(Nodo finalCola) {
        this.finalCola = finalCola;
    }

    public int getTotalNodos() {
        return totalNodos;
    }

    public void setTotalNodos(int totalNodos) {
        this.totalNodos = totalNodos;
    }
    
    public boolean colaVacia(){
        return getTotalNodos()==0;
    }
    
    public void agregar(Nodo temp){        
        if(getFrente()==null){
            frente=temp;
        }else{
            getFinalCola().setSiguiente(temp);            
        }
        setFinalCola(temp);
        totalNodos++;
    }
    
    public void quitar(){
        Nodo temp;
        if(!colaVacia()){
            temp=getFrente();
            frente=getFrente().getSiguiente();
            if(getFrente()==null){
                setFinalCola(null);
            }
            temp=null;
            totalNodos--;
        }
    }
    
    public Nodo valorFinal(){
        return getFrente();
    }
    
    public void ComprobarPresencia(boolean confim){
        if(confim == true){
            quitar();
        }else{
            agregar(valorFinal());
            quitar();
        }
    }
    
}
