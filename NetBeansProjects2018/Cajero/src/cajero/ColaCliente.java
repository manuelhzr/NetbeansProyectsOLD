/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 *
 * @author sergio
 */
public class ColaCliente {
   static final int cantidadClientes=15;
   private int totalNodos;
   private Nodo frente;
   private Nodo finalCola;
   
   public ColaCliente(){
       totalNodos=0;
       frente=null;
       finalCola=null;
   }
   
    public int getTotalNodos() {
        return totalNodos;
    }

    public Nodo getFrente() {
        return frente;
    }

    public Nodo getFinalCola() {
        return finalCola;
    }
    
      public boolean colaLLena(){     
          if(getTotalNodos() >= cantidadClientes){    
              return true; 
          }else{       
              return false;       
          }  
      } 
    
     public boolean colaVacia(){   
         if(getTotalNodos() == 0){        
             return true;   
         }else{        
             return false;   
         }  
     } 
    
    public void agregar(Nodo cliente){
        if(! colaLLena()){
            if(getFrente()==null){
                frente=cliente;
            }else{
                getFinalCola().setSiguiente(cliente);
            }
            finalCola=cliente;
            totalNodos=totalNodos+1;
        }
    }
    
    public void quitar(){
       Nodo temp;
       if(! colaVacia()){
           temp=frente;
           frente=temp.getSiguiente();
           if(frente==null){
               finalCola=null;
           }
           temp=null;
           totalNodos=totalNodos-1;
       }
    }
    
     public void limpiarCola() {
        while (!colaVacia()) {
            quitar();
        }
    }
      
}
