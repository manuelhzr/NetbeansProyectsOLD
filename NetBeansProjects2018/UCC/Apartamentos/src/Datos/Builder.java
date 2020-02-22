/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author manue
 */
public abstract class Builder {
    protected casa Casa;

    public casa getCasa() {
        return Casa;
    }
    
    public void crearCasa(){
        this.Casa = new casa();
    }
    
    public abstract void buildLargo();
    
    public abstract void buildAncho();
    
    public abstract void buildTipo();
    
    public abstract void buildColor();
    
    public abstract void buildValor();
    
    public abstract void buildComprador();
}
