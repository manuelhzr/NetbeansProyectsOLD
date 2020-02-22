/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo.casi.instantaneo;



public class Cubo {
    private int[][] Mat;
    private int n;

    public Cubo() {
        Mat=new int[4][4];
    }

    public int getMat(int f, int c) {
        return Mat[f][c];
    }

    public void setMat(int f, int c,int cubo) {
        this.Mat[f][c] = cubo;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void Iniciar(){
        Mat[0][0]=9;
        Mat[0][1]=2;
        Mat[0][2]=12;
        Mat[0][3]=7;
        Mat[1][0]=4;
        Mat[1][1]=15;
        Mat[1][2]=1;
        Mat[1][3]=10;
        Mat[2][0]=3;
        Mat[2][1]=8;
        Mat[2][2]=6;
        Mat[2][3]=13;
        Mat[3][0]=14;
        Mat[3][1]=5;
        Mat[3][2]=11;
        Mat[3][3]=0;
    }
    
    public void Exacta(){
        int C=(getN()-30)/4;
       
            for (int fil = 0; fil < 4; fil++) {
                for (int col = 0; col < 4; col++) {
                    setMat(fil, col, getMat(fil, col)+C);
                }
            }
        
    }
    
    public void Inexacta(){
        int C=(getN()-30)/4;
        int res=(getN()-30)%4;
        
        if(res!=0){
            for (int fil = 0; fil < 4; fil++) {
                for (int col = 0; col < 4; col++) {
                    if (getMat(fil, col)>11) {
                        setMat(fil, col, getMat(fil, col)+C+res);
                    }else{
                        setMat(fil, col, getMat(fil, col)+C);
                    }
                }
            }
        }
    }
    
}
