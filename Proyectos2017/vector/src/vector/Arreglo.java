/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

/**
 *
 * @author manue
 */
public class Arreglo {
    private int []Arreglo;
    int tam;

    public Arreglo() {
    }

    public int getArreglo(int pos) {
        return Arreglo[pos];
    }

    public void setArreglo(int pos, int val) {
        this.Arreglo[pos] = val;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
        Arreglo=new int[tam];
    }
    public int mayor(){
    int mayor= Arreglo[0];
        for (int i = 0; i <= getTam()-1; i++) {
            if (Arreglo[i]>=mayor){
            
            }
        }
    return mayor;
    }
    public float promedio(){
    float promedio=0;
        for (int i = 0; i <= getTam()-1; i++) {
            promedio=promedio+Arreglo[i];
            
        }
            promedio=promedio/tam;
            return promedio;
    }
    public int menorpromedio(){
    float promedio=promedio();
    int contador=0;
        for (int i = 0; i <=getTam()-1; i++) {
            if (Arreglo[i]<promedio){
                contador++;
            }
        }
    
    return contador;
    }
    public void ordenar(){
        int temp;
        for (int j = 0; j < getTam()-1; j++) {
            for (int i = 0; i < getTam()-1; i++) {
                if (Arreglo[i]>Arreglo[i+j]) {
                    temp=Arreglo[i];
                    Arreglo[i]=Arreglo[i+j];
                    Arreglo[i+j]=temp;
                }
                
            }
            
        }
    
    }
    
}
