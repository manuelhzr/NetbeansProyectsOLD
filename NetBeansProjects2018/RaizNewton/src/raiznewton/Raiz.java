/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raiznewton;

/**
 *
 * @author manue
 */
public class Raiz {
    private float x;

    public Raiz() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    
    public boolean validar(float val){
        if (val!=0) {
            setX(val);
            return true;
        }else{
            return false;
        }
    }
    
    public float Raiz(){
        float rad=1/getX();
        float res=1;
        
        for (int i = 1; i < 30; i++) {
            res=res-((res*res-rad)/(2*res));
        }
        
        return res;
    }
}
