/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoria_elementos;

/**
 *
 * @author Manuel
 */
public class Vectores {
    private int[] Vector;

    public Vectores() {
        Vector=new int[10];
    }

    public void setVector(int Pos, int Val) {
        Vector[Pos]=Val;
    }
    
    public int Sumatoria(){
        int Sumatoria=0;
            for(int i=0; i<=9; i++){
                Sumatoria+=Vector[i];
            }
            return Sumatoria;
    }
}
