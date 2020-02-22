/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problama.de.jose;

/**
 *
 * @author JP
 */
public class ListaNumeros {

    private Dato inicio;
    private Dato finalCola;
    private int totalDatos;
    private int n1;

    public ListaNumeros() {
        this.inicio = null;
        this.finalCola = null;
        this.totalDatos = 0;
    }

    public Dato getInicio() {
        return inicio;
    }

    public void setInicio(Dato inicio) {
        this.inicio = inicio;
    }

    public Dato getFinalCola() {
        return finalCola;
    }

    public void setFinalCola(Dato finalCola) {
        this.finalCola = finalCola;
    }

    public int getTotalDatos() {
        return totalDatos;
    }

    public void setTotalDatos(int totalDatos) {
        this.totalDatos = totalDatos;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public boolean ColaVacia() {
        return getTotalDatos() == 0;
    }

    public void agregar(Dato temp) {
        if (getInicio() == null) {
            inicio = temp;
        } else {
            getFinalCola().setSiguiente(temp);
        }
        setFinalCola(temp);
        totalDatos++;
    }

    public void quitar() {
        Dato temp;
        if (!ColaVacia()) {
            temp = getInicio();
            inicio = getInicio().getSiguiente();
            if (getInicio() == null) {
                setFinalCola(null);
            }
            temp = null;
            totalDatos--;
        }
    }

    public Dato valorFinal() {
        return getInicio();
    }

    public void llenarCola(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Dato nuevo = new Dato((int) (Math.random() * 10));
            agregar(nuevo);
        }
    }

    public int random() {
        return (int) (Math.random() * 8) + 2;
    }

    public void CalculoDeJose() {

        if (n1 <= getTotalDatos()) {
            int pos = 1;
            int posAct = 1;
            ListaNumeros colaTemp = new ListaNumeros();
            int aux = 0;
            while (pos <= getTotalDatos()) {
                if (pos != posAct) {
                    colaTemp.agregar(valorFinal());
                }
                quitar();
                posAct++;
                pos = (1 + aux++) * n1;
                System.out.println(pos);

            }
            setInicio(null);
            setFinalCola(null);
            setTotalDatos(colaTemp.getTotalDatos());
            while (!colaTemp.ColaVacia()) {
                agregar(colaTemp.valorFinal());
                colaTemp.quitar();
            }
            
        }
    }

}
