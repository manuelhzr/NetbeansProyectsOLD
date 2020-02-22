/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciallistas;

/**
 *
 * @author manue
 */
public class polinomio {
    private Nodo cabeza;
    private float[][] matrizResultado;
    
    int cont=0;
    float x=0;

    public polinomio() {
        cabeza=null;
        matrizResultado=new float[11][2];
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public float getMatrizResultado(int fil, int col) {
        return matrizResultado[fil][col];
    }

    public void setMatrizResultado(int fil, int col, float matrizResultado) {
        this.matrizResultado[fil][col] = matrizResultado;
    }
    
    public void agregar(Nodo nuevo) {
        if (cabeza == null) {
            setCabeza(nuevo);
        } else {
            Ultimo().setSiguiente(nuevo);
        }
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
    
    public void calcular(){
        Nodo temp=getCabeza();
        while(temp!=null){
            setMatrizResultado(cont, 0, x);
            setMatrizResultado(cont, 1, (float) Math.pow(temp.getCoeficiente()*getMatrizResultado(cont, 0), temp.getExponente()));
            x+=0.5;
            cont++;
            temp=temp.getSiguiente();
        }
    }
    
    public String Mostrar(){
        String d="";
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 2; j++) {
                d+=getMatrizResultado(i, j)+"  ";
            }
            d+="\n";
        }
        return d;
    }
    
    
}
