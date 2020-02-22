/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Nodos.Medico;

/**
 *
 * @author manue
 */
public class ListaMedicos {

    private Medico cabeza;

    public ListaMedicos() {
        this.cabeza = null;
    }

    public Medico getCabeza() {
        return cabeza;
    }

    public void setCabeza(Medico cabeza) {
        this.cabeza = cabeza;
    }
    
    public Medico Ultimo(){
        Medico temp= cabeza;
        while(temp != null){
            if(temp.getSiguiente()==null){
                break;
            }else{
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public void agregar(Medico nuevo){
        if(cabeza==null){
            setCabeza(nuevo);
        }else{
            Ultimo().setSiguiente(nuevo);
        }
    }
    
    public void Eliminar(Medico Eliminar){
        Medico temp=Eliminar;
        Medico anterior;
        if(temp==cabeza){
            cabeza = cabeza.getSiguiente();
        }else{
            anterior=cabeza;
            while(anterior.getSiguiente() != temp){
                anterior = anterior.getSiguiente();
            }
            anterior.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(null);
        }
        
    }
    
    public Medico Buscar(int IDBuscar){
        Medico temp= cabeza;
        while(temp != null){
            if(temp.getID() == IDBuscar){
                break;
            }else{
                temp= temp.getSiguiente();
            }
        }
        return temp;
    }

}
