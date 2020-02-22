/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;


public class Equipo {
    public Nodo cabeza;

    public Equipo() {
        cabeza=null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    
     public Nodo Ultimo(){
        Nodo temp=getCabeza();
        if(temp != null){
            while(temp.getSiguiente()!= null){
                temp=temp.getSiguiente();
            }
        }
        return temp;
    }
     
     public void agregar(Nodo nuevo){
        Nodo temp= Ultimo();
        if(temp != null){
            temp.setSiguiente(nuevo);
            nuevo.setAnterior(temp);
            nuevo.setSiguiente(null);           
        }else{
            nuevo.setAnterior(null);
            cabeza= nuevo;
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
        if(cabeza == null){
            cabeza=nuevo;            
        }else{
            nuevo.setAnterior(null);
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza=nuevo;
        }
    }
     
     public Nodo buscarCabeza(int id){
        Nodo temp = getCabeza();
        while(temp != null){
            if(temp.getId()== id){
                break;
            }else{
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
     
     public Nodo buscarFinal(String nom){
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
        Nodo temp = cabeza;
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
        if (nd == cabeza) {
            cabeza = cabeza.getSiguiente();
            if (cabeza != null) {
                cabeza.setAnterior(null);
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
     
     public float averagePromedio(){
         Nodo temp=Ultimo();
         float promedio=0;
         int cont=0;
         while(temp!=null){
             promedio+=temp.getAverage();
             cont++;
             
             temp=temp.getAnterior();
         }
         
         promedio=promedio/cont;
         return promedio;
     }
     
     public String mejorJardinero(){
         String reporte="";
         float mejorAverage=0;
         Nodo temp=getCabeza();
         Nodo mejor=null;
         
         while (cabeza!=null) {             
             if (temp.getPosicion().equals("Jardinero") && temp.getAverage()>=mejorAverage) {
                 mejorAverage=temp.getAverage();
                 mejor=temp;
             }
             temp=temp.getSiguiente();
         }
         
         reporte="Nombre: "+mejor.getNombre()+"\nID: "+mejor.getId()+"\nEdad: "+mejor.getEdad();
         return reporte;
     }
    
    
}
