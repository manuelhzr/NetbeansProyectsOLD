/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoria_indices_negativos;

/**
 *
 * @author Manuel
 */
public class Indices {
    private int[] Vector;

    public Indices() {
        Vector= new int[10];
    }

    public void setVector(int pos, int Val) {
        Vector[pos]=Val;
    }
    
    public int CalcularSumatoria(){
        int Sumatoria=0;
            for(int i=0; i<=9; i++){
                if(Vector[i]<0){
                    Sumatoria += i;
                }
            }
        return Sumatoria;
    }
}
