/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolas;


public class Cola {
    private Nodo frente;
    private Nodo finalCola;
    private int totalNodos;

    public Cola() {
        frente =null;
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
    
    public boolean colavacia(){
        return getTotalNodos()==0;
    }
    
    public void agregar(Nodo temp){        
        if(getFrente()==null){
            frente=temp;
        }else{
            getFinalCola().sig=temp;            
        }
        setFinalCola(temp);
        totalNodos++;
    }
    
     public void quitar(){
        Nodo temp;
        if(!colavacia()){
            temp=getFrente();
            frente=getFrente().sig;
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
     
     public Nodo buscar(String nom){
        Nodo temp = frente;
        while(temp != null){
            if(temp.nomProducto.equals(nom)){
                break;
            }else{
                temp = temp.sig;
            }
        }
        return temp;
    }
     
     public float promedioPrecios(){
        int cantidad = 0;
        float suma=0;
        Nodo temp = frente;
        while(temp != null){
            cantidad++;
            suma = suma + temp.precio;
            temp = temp.sig;
        }
        if(cantidad > 0){
            return  suma/cantidad;
        }
        else{
            return 0;
        }
    }

    
     
}
