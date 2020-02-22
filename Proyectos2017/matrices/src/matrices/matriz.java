/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author Check Personal
 */
public class matriz {
    
    public int getMatriz(int pos_x, int pos_y){
        return matriz[pos_x][pos_y];
    }
    
    public void setMatriz(int pos_x, int pos_y, int val){
        matriz[pos_x][pos_y] = val;
    }
    
    public boolean createdMatriz(){
        boolean validacion = fil > 0 && col > 0;
        if(validacion){
            matriz = new int[fil][col];
        }
        return validacion;
    }
    
    private int fil;
    private int col;
    private int[][] matriz;

    public int getFil() {
        return fil;
    }

    public void setFil(int fil) {
        this.fil = fil;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
