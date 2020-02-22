/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialprog2;


public class videoStation {
    private datosPeliculas[] vector;
    private int tam;

    public videoStation() {
    }

    public datosPeliculas getVector(int pos) {
        return vector[pos];
    }

    public void setVector(int pos, datosPeliculas vector) {
        this.vector[pos] = vector;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
        vector=new datosPeliculas[tam];
    }
    
    
    
    public void burbuja() {
        int i, j;
        datosPeliculas temp;
        for (i = 0; i <= getTam() - 1; i++) {
            for (j = 0; j <= (getTam() - i) - 2; j++) {
                if (getVector(j).getDuracion()>getVector(j + 1).getDuracion()) {
                    temp = getVector(j);
                    setVector(j,getVector(j+1));
                    setVector(j+1, temp);
                }
            }
        }
    }
    
    public int BusquedaBinaria(String dato) {
        int izq = 0;
        int der = getTam() - 1;
        int centro = (izq + der) / 2;
        while ((izq <= der) && (getVector(centro).getTitulo().compareTo(dato)>=0)) {
            if (getVector(centro).getTitulo().compareTo(dato)<= -1) {
                der = centro - 1;
            } else {
                izq = centro + 1;
            }
        }
        if (izq > der) {
            return -1;
        } else {
            return centro;
        }
    }
    
    public float promedioDuracion(){
        float prom=0;
        int cont=0;
        for (int i = 0; i < getTam(); i++) {
            if (getVector(i)!=null) {
                prom+=getVector(i).getDuracion();
                cont++;
            }
        }
        return prom/cont;
    }
    
    
}
