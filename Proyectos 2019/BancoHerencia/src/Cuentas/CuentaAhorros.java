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
public class CuentaAhorros extends Cuenta {

    private float Saldo;
    private int Tarjeta;

    public CuentaAhorros() {
    }

    public CuentaAhorros(float Saldo, int Tarjeta, int Numero, String Propietario, int IDpropietario) {
        super(Numero, Propietario, IDpropietario);
        this.Saldo = Saldo;
        this.Tarjeta = Tarjeta;
    }
    
    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public int isTarjeta() {
        return Tarjeta;
    }

    public void setTarjeta(int Tarjeta) {
        this.Tarjeta = Tarjeta;
    }

}
