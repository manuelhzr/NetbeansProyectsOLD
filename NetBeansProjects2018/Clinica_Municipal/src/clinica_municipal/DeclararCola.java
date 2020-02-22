/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_municipal;

/**
 *
 * @author julia
 */
public class DeclararCola {

    static final int cantidad_nodos = 60;
    private int Total_Nodos;
    private Nodo Frente;
    private Nodo FinalCola;

    public void Cola() {
        Total_Nodos = 0;
        Frente = null;
        FinalCola = null;
    }

    public int getTotal_Nodos() {
        return Total_Nodos;
    }

    public Nodo getFrente() {
        return Frente;
    }

    public Nodo getFinal() {
        return FinalCola;
    }

    public boolean colaLlena() {
        if (getTotal_Nodos() >= cantidad_nodos) {
            return true;
        } else {
            return false;
        }
    }

    public boolean colaVacia() {
        if (getTotal_Nodos() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar(Nodo temp) {
        if (!colaLlena()) {
            if (getFrente() == null) {
                Frente = temp;
            } else {
                getFinal().setSiguiente(temp);
            }
            FinalCola = temp;
            Total_Nodos = Total_Nodos + 1;
        }
    }

    public void quitar() {
        Nodo temp;
        if (!colaVacia()) {
            temp = getFrente();
            Frente = getFrente().getSiguiente();
            if (getFrente() == null) {
                FinalCola = null;
            }
            temp = null;
            Total_Nodos = Total_Nodos - 1;
        }
    }

    public Nodo valorFrente() {
        return getFrente();
    }

    public Nodo ValorFinal() {
        return getFinal();
    }

    public void limpiarCola() {
        while (!colaVacia()) {
            quitar();
        }
    }

    public int NumeroCitas(String esp) {
        Nodo temp;
        DeclararCola aux=new DeclararCola();
        int cont = 0;

        while (!colaVacia()) {
            temp = getFrente();
            if (temp.getTipo_Especialidad().equals(esp)) {
                cont++;
            }
            aux.agregar(valorFrente());
            quitar();
        }
        
        while(!aux.colaVacia()){
            agregar(aux.valorFrente());
            aux.quitar();
        }
        
        return cont;
    }
}
