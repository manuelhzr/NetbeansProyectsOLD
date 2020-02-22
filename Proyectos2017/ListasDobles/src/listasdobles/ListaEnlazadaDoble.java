/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdobles;

/**
 *
 * @author manue
 */
public class ListaEnlazadaDoble {
    private Nodo Cabeza;

    public ListaEnlazadaDoble() {
        Cabeza=null;
    }

    public Nodo getCabeza() {
        return Cabeza;
    }

    public void setCabeza(Nodo Cabeza) {
        this.Cabeza = Cabeza;
    }
    
    public Nodo Ultimo(){
        Nodo temp=Cabeza;
        if(temp != null){
            while(temp.getSiguiente()!= null){
                temp=temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public int contarNodos(){
        int Cantidad=0;
        Nodo temp= Cabeza;
        while(temp != null){
            Cantidad++;
            temp=temp.getSiguiente();
        }
        return Cantidad;
    }
    
    public void agregar(Nodo nuevo){
        Nodo temp= Ultimo();
        if(temp != null){
            temp.setSiguiente(nuevo);
            nuevo.setAnterior(temp);
            nuevo.setSiguiente(null);           
        }else{
            nuevo.setAnterior(null);
            Cabeza= nuevo;
        }        
    }
    
    public void agregarEntreNodos(Nodo nd, Nodo nuevo){
        nuevo.setSiguiente(nd.getSiguiente());
        if(nd.getSiguiente() != null){
            nd.getSiguiente().setAnterior(nuevo);
        }
        nd.setSiguiente(nuevo);
        nuevo.setAnterior(nd);
    }
    
    public void agregarAcabeza(Nodo nuevo){
        if(Cabeza == null){
            Cabeza=nuevo;            
        }else{
            nuevo.setAnterior(null);
            nuevo.setSiguiente(Cabeza);
            Cabeza.setAnterior(nuevo);
            Cabeza=nuevo;
        }
    }
    
    public Nodo buscar(int cod){
        Nodo temp = Cabeza;
        while(temp != null){
            if(temp.getCodigo()== cod){
                break;
            }else{
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public Nodo buscar(String nom){
        Nodo temp= Ultimo();
        while(temp != null){
            if(temp.getNombre().equals(nom)){
                break;
            }else{
                temp = temp.getAnterior();
            }
        }
        return temp;
    }
    
    public Nodo anterior(Nodo nd) {
        Nodo temp = Cabeza;
        while (temp != null) {
            if (temp.getSiguiente() == nd) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public void eliminar(Nodo nd) {
        Nodo ante;
        if (nd == Cabeza) {
            Cabeza = Cabeza.getSiguiente();
            if (Cabeza != null) {
                Cabeza.setAnterior(null);
            }
        } else {
            ante = anterior(nd);
            ante.setSiguiente(nd.getSiguiente());
            if (nd.getSiguiente() != null) {
                nd.getSiguiente().setAnterior(ante);
            }
        }
        nd.setAnterior(null);
        nd.setSiguiente(null);
    }
    
    public void limpiar(){
        while(Cabeza != null){
            eliminar(Cabeza);
        }
        Cabeza = null;
    }
    
    public float promedioGeneral(){
        int cantidad = 0;
        float suma=0;
        Nodo temp = Cabeza;
        while(temp != null){
            cantidad++;
            suma = suma + temp.Definitiva();
            temp = temp.getSiguiente();
        }
        if(cantidad > 0){
            return  suma/cantidad;
        }
        else{
            return 0;
        }
    }
    
    public float maximaDefinitiva(){
        float max=0;
        float def;
        Nodo temp = Ultimo();
        while(temp != null){
            def= temp.Definitiva();
            if(def > max){
                max = def;
            }
            temp = temp.getAnterior();
        }
        return max;
    }
    
}
