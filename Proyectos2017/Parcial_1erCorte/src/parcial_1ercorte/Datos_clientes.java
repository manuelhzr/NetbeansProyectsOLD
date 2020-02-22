/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_1ercorte;

/**
 *
 * @author Manuel
 */
public class Datos_clientes {

    public Datos_clientes() {
    }
    
    private String NombreCliente;
    private float ValorDeuda;
    private int NumeroDeuda;
    private int NumeroCelular;
    private int DiasDeudas;

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public float getValorDeuda() {
        return ValorDeuda;
    }

    public void setValorDeuda(float ValorDeuda) {
        this.ValorDeuda = ValorDeuda;
    }

    public int getNumeroDeuda() {
        return NumeroDeuda;
    }

    public void setNumeroDeuda(int NumeroDeuda) {
        this.NumeroDeuda = NumeroDeuda;
    }

    public int getNumeroCelular() {
        return NumeroCelular;
    }

    public void setNumeroCelular(int NumeroCelular) {
        this.NumeroCelular = NumeroCelular;
    }

    public int getDiasDeudas() {
        return DiasDeudas;
    }

    public void setDiasDeudas(int DiasDeudas) {
        this.DiasDeudas = DiasDeudas;
    }
    
}
