/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonalsecundaria;

/**
 *
 * @author manue
 */
public class Diagonal {
    private int tam;
    private int[][] matriz;

    public Diagonal() {
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
        matriz=new int[tam][tam];
    }

    public int getMatriz(int f, int c) {
        return matriz[f][c];
    }

    public void setMatriz(int f, int c, int matriz) {
        this.matriz[f][c] = matriz;
    }
    
    public int SumadiagonalSec(){
        int suma=0;
        
        int c=getTam()-1;
        
        for (int f = 0; f < getTam(); f++) {
            suma+=getMatriz(f, c);
            c--;
        }
        
        return suma;
        
    }
    
    
}
