/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beca;

/**
 *
 * @author manue
 */
public class poliza {

    private int tipoPoliza;
    private int edad;
    private boolean bebedor;
    private boolean lentes;
    private boolean enfermedad;

    public poliza() {
    }

    public int getTipoPoliza() {
        return tipoPoliza;
    }

    public void setTipoPoliza(int tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isBebedor() {
        return bebedor;
    }

    public void setBebedor(boolean bebedor) {
        this.bebedor = bebedor;
    }

    public boolean isLentes() {
        return lentes;
    }

    public void setLentes(boolean lentes) {
        this.lentes = lentes;
    }

    public boolean isEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(boolean enfermedad) {
        this.enfermedad = enfermedad;
    }

    private float valorPoliza() {
        float valor = 0;
        float valorBase;
        if (tipoPoliza == 1) {
            valorBase = 1200000;
        } else {
            valorBase = 950000;
        }

        valor = valorBase;

        if (bebedor == true) {
            valor += valorBase * 0.15;
        }
        if (lentes == true) {
            valor += valorBase * 0.08;
        }

        if (enfermedad == true) {
            valor += valorBase * 0.05;
        }

        if (edad > 40) {
            valor += valorBase * 0.25;
        }else{
            valor += valorBase * 0.15;
        }
        
        return valor;
    }
}
