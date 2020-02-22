/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolsos;

/**
 *
 * @author manue
 */
public class CantCuero {
    private float x;

    public CantCuero() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    
    public float Base(){
        return getX()*(getX()/3);
    }
    
    public float Caras(){
        return (getX()*(getX()/2))*2;
    }
    
    public float BandasLaterales(){
        return ((getX()/2)*(getX()/3))*2;
    }
    
    public float Correa(){
        return (getX()*2)*(getX()/6);
    }
    
    public float Total(){
        return Base()+Caras()+BandasLaterales()+Correa();
    }
}
