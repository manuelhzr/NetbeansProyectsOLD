/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superm;

/**
 *
 * @author manue
 */
public class Puntos {
    private int[] puntos;
    private int tam;

    public Puntos() {
    }

    public int getPuntos(int pos) {
        return puntos[pos];
    }

    public void setPuntos(int pos, int puntos) {
        this.puntos[pos] = puntos;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
        puntos=new int[tam];
    }
    
    public void iniciar(){
        for (int i = 0; i < getTam(); i++) {
            setPuntos(i, 0);
        }
    }
    
    public void agregar(int pos, int pun){
        setPuntos(pos, getPuntos(pos)+pun);
    }
    
    public boolean bono(int pos){
        return getPuntos(pos)>=1000;
    }
    
    public float promedioPuntos(){
        float prom=0;
        for(int i=0; i<getTam();i++){
            prom+=getPuntos(i);
        }
        prom=prom/getTam();
        return prom;
    }
    
    
    
}
