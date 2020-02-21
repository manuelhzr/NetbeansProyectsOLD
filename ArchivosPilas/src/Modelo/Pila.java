/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JP
 */
public class Pila {

    static final int cantidadNodos = 100;

    private int totalNodos;
    private Pelicula tope;

    public Pila() {
        this.totalNodos = 0;
        this.tope = null;
    }

    public int getTotalNodos() {
        return totalNodos;
    }

    public Pelicula getTope() {
        return tope;
    }

    public boolean pilaLlena() {
        return getTotalNodos() == cantidadNodos;
    }

    public boolean pilaVacia() {
        return getTotalNodos() == 0;
    }

    public void agregar(Pelicula nuevo) {
        if (!pilaLlena()) {
            nuevo.setSiguiente(getTope());
            tope = nuevo;
            totalNodos = totalNodos + 1;
        }
    }

    public void quitar() {
        Pelicula temp;
        if (!pilaVacia()) {
            temp = getTope();
            tope = tope.getSiguiente();
            temp = null;
            totalNodos--;
        }
    }

    public Pila elementosComun(Pila pila2) {
        Pila nueva = new Pila();
        Pelicula pilaAux = getTope();
        while (pilaAux != null) {
            Pelicula aux = pila2.getTope();
            while (aux != null) {
                if (pilaAux.getNombre().equals(aux.getNombre())) {
                    nueva.agregar(new Pelicula(aux.getNombre(), aux.getGenero(), aux.getDuracion(), aux.getPrecio(), aux.getValoracion()));
                }
                aux = aux.getSiguiente();
            }
            pilaAux = pilaAux.getSiguiente();
        }
        return nueva;
    }

    public Pila combinarPilas(Pila pila) {
        Pila nueva = new Pila();
        
        Pelicula cabeza2=pila.getTope();
        while (cabeza2 != null) {
            Pelicula auxTope= getTope();
            boolean repetido = false;
            while (auxTope!=null) {
                if (cabeza2.getNombre().equals(auxTope.getNombre())) {
                    repetido=true;
                }
                auxTope=auxTope.getSiguiente();
            }
            if (!repetido) {
                nueva.agregar(new Pelicula(cabeza2.getNombre(), cabeza2.getGenero(), cabeza2.getDuracion(), cabeza2.getPrecio(), cabeza2.getValoracion()));
            }
            cabeza2 = cabeza2.getSiguiente();
        }
        
        Pelicula pilaAux = getTope();
        while (pilaAux != null) {
//            Pelicula pilaAux = pilaAux.getTope();
            nueva.agregar(new Pelicula(pilaAux.getNombre(), pilaAux.getGenero(), pilaAux.getDuracion(), pilaAux.getPrecio(), pilaAux.getValoracion()));
            pilaAux= pilaAux.getSiguiente();
        }

        return nueva;
    }
    
    public String mostrarPila(){
        Pelicula actual= getTope();
        String datos="";
        while (actual != null) {            
            datos+=actual.getNombre()+"***"+actual.getGenero()+"***"+actual.getDuracion()+"***"+actual.getPrecio()+"***"+actual.getValoracion()+"\n";
            actual = actual.getSiguiente();
        }
        return datos;
    }
    
}
