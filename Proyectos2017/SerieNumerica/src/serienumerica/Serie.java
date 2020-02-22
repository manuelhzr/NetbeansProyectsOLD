/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serienumerica;


public class Serie {
    private int n;

    public Serie() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public float sumatoria(){
        float suma=0;
        float aux1=12;
        float aux2=7;
        float div=6;
        for(int i=1; i<=n;i++){
            suma=suma+i/div;
            div=div+aux2;
            aux2=aux2+aux1;
            aux1=aux1+5;
        }
        return suma;
    }
}
