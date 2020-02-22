/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author manue
 */
public class Vector {
    private int tam;
    private int Vector[];

    public Vector() {
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
        Vector=new int[tam];
    }

    public int getVector(int pos) {
        return Vector[pos];
    }

    public void setVector(int pos, int vector) {
        this.Vector[pos] = vector;
    }
    
    public void Aleatorio(){
        for (int i = 0; i < getTam(); i++) {
            setVector(i, (int) (Math.random() * 10));
            System.out.println(getVector(i));
        }
    }
    
    public int pares(){
        int pares=0;
        for (int i = 0; i < getTam(); i++) {
            if (getVector(i)%2==0) {
                pares++;
            }
        }
        return pares;
    }
    
    public int Impares(){
        int impares=0;
        for (int i = 0; i < getTam(); i++) {
            if (getVector(i)%2!=0) {
                impares++;
            }
        }
        return impares;
    }
    
    public int sumaMitades(){
        int cant=getTam()/2;
        int suma=0;
        if (getTam()%2==0) {
            for (int i = 0; i < cant; i++) {
                suma+=getVector(i);
            }
            
        }
        if (getTam()%2!=0){
            for (int i = cant; i < getTam(); i++) {
                suma+=getVector(i);
            }
        }
        return suma;
    }
    
}
