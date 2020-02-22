
package parcialduvan;

public class Ficheros {
private Nodo cabeza;


public Ficheros(){
    cabeza = null;
}

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    
    public Nodo Ultimo(){
        Nodo temp=cabeza;
        if(temp != null){
            while(temp.getSiguiente()!= null){
                temp=temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public void agregarAcabeza(Nodo nuevo){
        if(cabeza == null){
            cabeza=nuevo;            
        }else{
            nuevo.setAnterior(null);
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza=nuevo;
        }
    }
    public void eliminar(Nodo nd){
        Nodo anterior;
        if(nd==cabeza){
            cabeza = cabeza.getSiguiente();
        }else{
            anterior=cabeza;
            while(anterior.getSiguiente() != nd){
                anterior = anterior.getSiguiente();
            }
            anterior.setSiguiente(nd.getSiguiente());
        }
        nd.setSiguiente(null);
    }
    
     public void limpiar(){
        while(cabeza != null){
            eliminar(cabeza);
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

}
