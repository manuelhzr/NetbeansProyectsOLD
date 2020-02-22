package multplicacionmatrices;


public class Matrices {
    private int fm1;
    private int cm1;
    private int fm2;
    private int cm2;
    public int[][] matriz1;
    public int[][] matriz2;

    public Matrices() {
    }

    public int getFm1() {
        return fm1;
    }

    public void setFm1(int fm1) {
        this.fm1 = fm1;
    }

    public int getCm1() {
        return cm1;
    }

    public void setCm1(int cm1) {
        this.cm1 = cm1;
    }

    public int getFm2() {
        return fm2;
    }

    public void setFm2(int fm2) {
        this.fm2 = fm2;
    }

    public int getCm2() {
        return cm2;
    }

    public void setCm2(int cm2) {
        this.cm2 = cm2;
    }

    public int getMatriz1(int f, int c) {
        return matriz1[f][c];
    }

    public void setMatriz1(int f, int c, int matriz1) {
        this.matriz1[f][c] = matriz1;
    }

    public int getMatriz2(int f, int c) {
        return matriz2[f][c];
    }

    public void setMatriz2(int f, int c, int matriz2) {
        this.matriz2[f][c] = matriz2;
    }
    
    public void CrearMatrices(){
        matriz1=new int[getFm1()][getCm1()];
        matriz2=new int[getFm2()][getCm2()];
    }
    
    public boolean validarMultiplicacion(){
        if (getCm1()==getFm2()) {
            return true;
        }else{
            return false;
        }
    }
    
    public int[][] Multiplicar(){
        int[][] res=new int[getFm1()][getCm2()];
        for (int f = 0; f < getFm1(); f++) {
            for (int c = 0; c < getCm2(); c++) {
                for (int i = 0; i < getCm1(); i++) {
                    res[f][c]+=getMatriz1(f, i)*getMatriz2(i, c);
                }
            }
        }
        return res;
    }
}
