/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadromagico;

/**
 *
 * @author manue
 */
public class Cubo {
    private int tam;
    private int[][] cubo;
    private int[] pares;
    private int[] impares;

    public Cubo() {
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
        cubo = new int[tam][tam];
        tamVec();
        llenarVectores();
        iniciarcubo();
    }

    public int getCubo(int f, int c) {
        return cubo[f][c];
    }

    public void setCubo(int f, int c, int v) {
        cubo[f][c]=v;
    }
    
    private void iniciarcubo(){        
        for(int i=0; i<getTam(); i++){
            for (int j = 0; j < getTam(); j++) {
                setCubo(i, j, 0);
            }
        }
    }
    
    private void tamVec(){
        int con=getTam()*getTam();
        int tamp=0, tami=0;
        for(int i=con; i>0; i--){
            if(i%2==0){
                tamp++;
            }else{
                tami++;
            }
        }
        pares=new int [tamp];
        impares=new int[tami];
    }
    
    private void llenarVectores(){
        int pa=0, im=0;
        for(int i= (getTam()*getTam()); i>0; i--){
            if(i%2==0){
                pares[pa]=i;
                pa++;
            }else{
                impares[im]=i;
                im++;
            }
        }
    }
    
    private void LLenarpares(){
        int x=0;
        for(int fil=0; fil<getTam(); fil++){
            for(int col=getTam()-1; col>=0; col--){
                if(fil%2==0 && col%2==0){
                    setCubo(fil, col, pares[x]);
                    x++;
                }
            }
        }
    }
    
    private void llenarImpares() {
        int x=impares.length-1;
        for (int fil=0; fil<getTam(); fil++) {
            for (int col=getTam()-1; col>=0; col--) {
                if(getCubo(fil, col)==0){
                    setCubo(fil, col, impares[x]);
                    x--;
                }
            }
        }
    }
    
    public String Mostrar(){
        LLenarpares();
        llenarImpares();
        String res="";
        for(int f=0; f<getTam(); f++){
            for(int c=0; c<getTam(); c++){
                res+="|"+getCubo(f, c)+"| ";
            }
            res+="\n";
        }
        return res;
    }
    
    
}
