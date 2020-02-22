/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector2;

/**
 *
 * @author manue
 */
public class arreglos {
    private int[] a, b;
    private int tam;

    public arreglos() {
    }

    public int getA(int pos) {
        return a[pos];
    }

    public void setA(int pos, int a) {
        this.a[pos] = a;
    }

    public int getB(int pos) {
        return b[pos];
    }

    public void setB(int pos,int b) {
        this.b[pos] = b;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
        a=new int[tam];
        b=new int[tam];
    }
    
    public boolean iguales(){
        boolean res=true;
        for (int i = 0; i < getTam(); i++) {
            if (a[i]!=b[i]) {
                res=false;
            }
        }
        return res;
    }
    
    public boolean encontrar(int pos){
        int val=a[pos];
        boolean res = false;
        for (int i = 0; i < getTam(); i++) {
            if (b[i]==val) {
                res= true;
            }
        }
        return res;
    }
    
}
