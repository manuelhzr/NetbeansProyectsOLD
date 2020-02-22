/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author manue
 */
public class ListaEnlazada {
    private Nodo Cabeza;

    public ListaEnlazada() {
        this.Cabeza = null;
    }

    public Nodo getCabeza() {
        return Cabeza;
    }

    public void setCabeza(Nodo Cabeza) {
        this.Cabeza = Cabeza;
    }
    
    public Nodo Ultimo(){
        Nodo temp= Cabeza;
        while(temp != null){
            if(temp.getSiguiente()==null){
                break;
            }else{
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public int contarNodos(){
        int Contador =0;
        Nodo temp= Cabeza;
        while(temp != null){
            Contador ++;
            temp=temp.getSiguiente();
        }
        return Contador;
    }
    
    public void agregar(Nodo nuevo){
        if(Cabeza==null){
            setCabeza(nuevo);
        }else{
            Ultimo().setSiguiente(nuevo);
        }
    }
    
    public Nodo buscar(int cod){
        Nodo temp= Cabeza;
        while(temp != null){
            if(temp.getCodigo() == cod){
                break;
            }else{
                temp= temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public void eliminar(Nodo nd){
        Nodo anterior;
        if(nd==Cabeza){
            Cabeza = Cabeza.getSiguiente();
        }else{
            anterior=Cabeza;
            while(anterior.getSiguiente() != nd){
                anterior = anterior.getSiguiente();
            }
            anterior.setSiguiente(nd.getSiguiente());
        }
        nd.setSiguiente(null);
    }
    
    public float promedioGeneral(){
        int cantidad = 0;
        float suma=0;
        Nodo temp = Cabeza;
        while(temp != null){
            cantidad++;
            suma = suma + temp.definitiva();
            temp = temp.getSiguiente();
        }
        if(cantidad>0){
            return suma/cantidad;
        }else{
            return 0;
        }
    }
    
    public float maximaDefinitiva(){
        float def, max;
        max=0;
        Nodo temp= Cabeza;
        while(temp != null){
            def = temp.definitiva();
            if(def > max){
                max = def;
            }
            temp = temp.getSiguiente();
        }
        return max;
    }
    
    public void limpiar(){
        while(Cabeza != null){
            eliminar(Cabeza);
        }
    }
    
   public void agregarEntrenodos(Nodo nd, Nodo Nuevo){
       Nuevo.setSiguiente(nd.getSiguiente());
       nd.setSiguiente(Nuevo);
   }
   
   public void agregarCabeza(Nodo nuevo){
       nuevo.setSiguiente(Cabeza);
       setCabeza(nuevo);
   }
    
}
