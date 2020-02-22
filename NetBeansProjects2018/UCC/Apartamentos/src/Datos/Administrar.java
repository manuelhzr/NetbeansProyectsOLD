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
public class Administrar {
    private Builder  builder;
    
    public void constructCasa(){
        builder.crearCasa();
        builder.buildLargo();
        builder.buildAncho();
        builder.buildTipo();
        builder.buildColor();
        builder.buildValor();
        builder.buildComprador();

    }

    public casa getCasa() {
        return builder.getCasa();
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    
    
    
}
