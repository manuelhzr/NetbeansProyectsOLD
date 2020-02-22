/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colanumeros;

/**
 *
 * @author Juan
 */
public class Cola {
    private Nodo frente;
    private Nodo finalCola;
    private int totalNodos;

    public Cola() {
        this.frente=null;
        this.finalCola=null;
        this.totalNodos=0;
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
    
    public boolean colavacia(){
        return getTotalNodos()<=0;
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
    
    public void LlenarCola(){
        for (int i = 0; i < 100; i++) {
            agregar(new Nodo((int) ((Math.random() * 50) - 25)));
        }
    }
    
    public void ObtenerNegativos(Cola cola){
        Nodo temp = getFrente();
        
        while(temp!=null){
            if (temp.getNumero()<0) {
                Nodo add= new Nodo(temp.getNumero());
                cola.agregar(add);
            }
            temp=temp.getSiguiente();
        }
    }
    
   public void quitar(){
        if(!colavacia()){
            frente=getFrente().getSiguiente();
            if(getFrente()==null){
                setFinalCola(null);
                totalNodos=0;
            }
            totalNodos--;
        }
    }
    
    public Nodo valorFinal(){
        return getFrente();
    }
    
    
}
