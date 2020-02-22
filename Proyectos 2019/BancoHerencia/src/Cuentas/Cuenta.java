/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

/**
 *
 * @author manue
 */
public  class Cuenta {
    private int Numero;
    private String Propietario;
    private int IDpropietario;

    public Cuenta() {
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }

    public int getIDpropietario() {
        return IDpropietario;
    }

    public void setIDpropietario(int IDpropietario) {
        this.IDpropietario = IDpropietario;
    }
    
    
}
