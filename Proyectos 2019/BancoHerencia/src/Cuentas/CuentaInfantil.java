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
public class CuentaInfantil extends Cuenta {

    private String Representante;
    private int IDrepresentante;

    public CuentaInfantil() {
    }

    public CuentaInfantil(String Representante, int IDrepresentante, int Numero, String Propietario, int IDpropietario) {
        super(Numero, Propietario, IDpropietario);
        this.Representante = Representante;
        this.IDrepresentante = IDrepresentante;
    }

    public String getRepresentante() {
        return Representante;
    }

    public void setRepresentante(String Representante) {
        this.Representante = Representante;
    }

    public int getIDrepresentante() {
        return IDrepresentante;
    }

    public void setIDrepresentante(int IDrepresentante) {
        this.IDrepresentante = IDrepresentante;
    }

}
