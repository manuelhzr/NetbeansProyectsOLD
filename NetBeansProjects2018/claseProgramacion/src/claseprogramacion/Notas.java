/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseprogramacion;

/**
 *
 * @author manue
 */
public class Notas {
    private int cantidadNotas;
    private float[] vectorNotas;

    public Notas() {
    }

    public int getCantidadNotas() {
        return cantidadNotas;
    }

    public void setCantidadNotas(int cantidadNotas) {
        this.cantidadNotas = cantidadNotas;
        vectorNotas=new float[cantidadNotas];
    }

    public float getVectorNotas(int pos) {
        return vectorNotas[pos];
    }

    public void setVectorNotas(int pos, float vectorNotas) {
        this.vectorNotas[pos] = vectorNotas;
    }

    
    
    public float promedioNotas(){
        float promedio=0;
        for (int i = 0; i < getCantidadNotas(); i++) {
            promedio+=getVectorNotas(i);
        }
        return promedio/getCantidadNotas();
    }
    
    public float mayorNota(){
        float mayor=0;
        for (int i = 0; i < getCantidadNotas(); i++) {
            if (getVectorNotas(i)>=mayor) {
                mayor=getVectorNotas(i);
            }
        }
        return  mayor;
    }
    
    public float menorNota(){
        float menor=5;
        for (int i = 0; i < getCantidadNotas(); i++) {
            if (getVectorNotas(i)<=menor) {
                menor=getVectorNotas(i);
            }
        }
        return menor;
    }
    
    public float sumaNotas(){
        float suma=0;
        for (int i = 0; i < getCantidadNotas(); i++) {
            suma+=getVectorNotas(i);
        }
        return suma;
    }
}
