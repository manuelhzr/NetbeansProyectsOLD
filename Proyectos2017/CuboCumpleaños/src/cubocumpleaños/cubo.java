/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubocumpleaños;

/**
 *
 * @author manue
 */
public class cubo {
    private int D;
    private int M;
    private int A;
    private int[][] cubo;

    public cubo() {
        cubo=new int[3][3];
    }

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getCubo(int f, int c) {
        return cubo[f][c];
    }

    public void setCubo(int f, int c,int cubo) {
        this.cubo[f][c] = cubo;
    }
    
    public int NumeroMagico(){
        int n= 3*(getD()+getM()+getA());
        return n;
    }
    
    public void cubo(){
        setCubo(0, 1, getA());
        setCubo(2, 2, getCubo(0, 1)+getD());
        setCubo(1, 0, getCubo(2, 2)+getD());
        setCubo(2, 0, getCubo(0, 1)+getM());
        setCubo(1, 2, getCubo(2, 0)+getM());
        setCubo(1, 1, getCubo(2, 2)+getM());
        setCubo(0, 0, getCubo(1, 1)+getM());
        setCubo(0, 2, getCubo(1, 0)+getM());
        setCubo(2, 1, getCubo(0, 2)+getM());
    }
    
    
}
