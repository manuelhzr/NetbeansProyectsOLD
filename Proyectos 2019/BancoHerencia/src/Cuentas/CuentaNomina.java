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
public class CuentaNomina extends Cuenta {

    private float SalarioMensual;
    private String Empresa;

    public CuentaNomina() {
    }

    public float getSalarioMensual() {
        return SalarioMensual;
    }

    public void setSalarioMensual(float SalarioMensual) {
        this.SalarioMensual = SalarioMensual;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

}
