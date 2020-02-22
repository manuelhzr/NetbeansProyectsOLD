/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomioslistas;

/**
 *
 * @author JP
 */
public class Lista {

    private Nodo cabeza;
    private float[][] MatrizDatos;

    public Lista() {
        cabeza = null;
        MatrizDatos = new float[11][2];
        llenarX();
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public float getMatrizDatos(int f, int c) {
        return MatrizDatos[f][c];
    }

    public void setMatrizDatos(int f, int c, float MatrizDatos) {
        this.MatrizDatos[f][c] = MatrizDatos;
    }

    public Nodo Ultimo() {
        Nodo temp = getCabeza();
        while (temp != null) {
            if (temp.getSiguiente() == null) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }

    public void agregar(Nodo nuevo) {
        if (cabeza == null) {
            setCabeza(nuevo);
        } else {
            Ultimo().setSiguiente(nuevo);
        }
    }

    private void llenarX() {
        float x = 0;
        for (int i = 0; i < 11; i++) {
            setMatrizDatos(i, 0, x);
            setMatrizDatos(i, 1, 0);
            x += 0.5;
        }
    }
    
    public void Polinomio(){
        int cont=0;
        Nodo aux=cabeza;
        while(aux!=null && cont <11){
            setMatrizDatos(cont, 1, (float) Math.pow(aux.getCoeficiente()*getMatrizDatos(cont, 0), aux.getExponente()));
            cont++;
            aux=aux.getSiguiente();
        }
    }
    
    @Override
    public String toString(){
        String verDatosMatriz="";
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 2; j++) {
                verDatosMatriz+=getMatrizDatos(i, j)+"  -  ";
            }
            verDatosMatriz+="\n";
        }
        return verDatosMatriz;
        
    }
}
