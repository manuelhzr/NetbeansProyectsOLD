/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo.instantaneo;

/**
 *
 * @author manue
 */
public class Cubo {
    private int[][] Cubo;
    private int n;

    public Cubo() {
        Cubo=new int[4][4];
    }

    public int getCubo(int f, int c) {
        return Cubo[f][c];
    }

    public void setCubo(int f,int c,int Cubo) {
        this.Cubo[f][c] = Cubo;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void LlenarCubo(){
        Cubo[0][0]=getN()-20;
        Cubo[0][1]=1;
        Cubo[0][2]=12;
        Cubo[0][3]=7;
        Cubo[1][0]=11;
        Cubo[1][1]=8;
        Cubo[1][2]=getN()-21;
        Cubo[1][3]=2;
        Cubo[2][0]=5;
        Cubo[2][1]=10;
        Cubo[2][2]=3;
        Cubo[2][3]=getN()-18;
        Cubo[3][0]=4;
        Cubo[3][1]=getN()-19;
        Cubo[3][2]=6;
        Cubo[3][3]=9;
    }
    
}
