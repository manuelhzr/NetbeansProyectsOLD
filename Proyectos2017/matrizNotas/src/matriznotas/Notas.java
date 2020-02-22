/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriznotas;

/**
 *
 * @author manue
 */
public class Notas {
    private int n;
    private String nombres[];
    private float notas[][];

    public Notas() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
        nombres=new String[n];
        notas=new float[n][3];
    }

    public String getNombres(int p) {
        return nombres[p];
    }

    public void setNombres(int p, String v) {
        this.nombres[p] = v;
    }

    public float getNotas(int f, int c) {
        return notas[f][c];
    }

    public void setNotas(int f, int c, float notas) {
        this.notas[f][c] = notas;
    }
    
    public int buscar(String n){
        int pos=-1;
        for(int i=0; i<getN(); i++){
            if(getNombres(i).equals(n)){
                pos=i;
            }
        }
        return pos;
    }
    
}
