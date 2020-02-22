package main;
public class ListaEnlazadaDoble {

    private Nodo inicio;
    
    public ListaEnlazadaDoble(){
        inicio = null;
    }
    
    public void setInicio(Nodo nd){
        inicio = nd;
    }
    
    public Nodo getInicio(){
        return inicio;
    }
    
    public Nodo ultimoNodo(){
        Nodo temp = getInicio();
            if(temp != null){
                while(temp.getSiguiente() !=  null){
                    temp = temp.getSiguiente();
                }
            }
        return temp;    
    } 
    
    public int contarNodos(){
        Nodo temp = getInicio();
        int cont = 0;
            while(temp != null){
                temp = temp.getSiguiente();
                cont++;
            }
        return cont;     
    }
    
    public void agregarNodo(Nodo nuevo){
        Nodo temp = ultimoNodo();
        if(temp != null){
            temp.setSiguiente(nuevo);
            nuevo.setAnterior(temp);
            nuevo.setSiguiente(null); 
        }
        else{
        nuevo.setAnterior(null);
        inicio = nuevo;
        }
    } 
    
    public void agregarEntreNodos(Nodo nd, Nodo nuevo){
        if(nd.getSiguiente() != null){
            nd.getSiguiente().setAnterior(nuevo);
        }
        nd.setSiguiente(nuevo);
        nuevo.setAnterior(nd);
    }
    
    public void agregarAcabeza(Nodo nuevo){
        if(inicio == null){
            inicio = nuevo;
        }else{
            nuevo.setAnterior(null);
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }
        
    public Nodo buscar(int cod){
        Nodo temp = inicio;
        while(temp != null){
            if(temp.getCodigo() == cod){
            break;
        }else{
            temp = temp.getSiguiente();
        }
        }
        return temp;
    }
    
    public Nodo buscar(String nom){
        Nodo temp = ultimoNodo();
        while(temp != null){
            if(temp.getNombre().equals(nom)){ 
                 break;
            }else{
                temp = temp.getAnterior(); 
            }
        }
        return temp;
    }
    
    public Nodo anterior(Nodo nd){
        Nodo temp = inicio;
        while(temp != null){
            if(temp.getSiguiente() == nd){
                break;
            }else{
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public void eliminar(Nodo nd){
        Nodo ante;
        if(nd == inicio){ 
            inicio = inicio.getSiguiente();
        if(inicio != null)
            inicio.setAnterior(null);
        }else{ 
            ante = anterior(nd);
            ante.setSiguiente(nd.getSiguiente());
            if(nd.getSiguiente()!= null){
            nd.getSiguiente().setAnterior(ante);
            }
        }
        nd.setAnterior(null);
        nd.setSiguiente(null);
    }
    
    public void limpiar(){
        while(inicio != null){
            eliminar(inicio);
        }
        inicio = null;
    }
    
    public float promedioGeneral(){
        int cantidad = 0;
        float suma = 0;
        Nodo temp = inicio;
        while(temp != null){
            cantidad++;
            suma = suma + temp.notaDefinitiva();
            temp = temp.getSiguiente();
        }
        if(cantidad > 0){
             return suma/cantidad;
        }else{
             return 0;
        }
    }
    
    public float maximaDefinitiva(){
        float max = 0;
        float def;
        Nodo temp = ultimoNodo();
        while(temp != null){
            def = temp.notaDefinitiva();
            if(def > max){
                max = def;
            }
            temp = temp.getAnterior();
        }
        return max;
    }
    
    public float notaMayorEstudiante(Nodo temp){
        float cont = 0;
        for (int i = 0; i < 3; i++) {
            if(temp.getNota(i) > cont){
                cont = temp.getNota(i);
            }
        }
        return cont;
    }
}
    

