/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Asus
 */
public class MOVIMIENTO {
    private int Idmoviento;
    private String fecha;
    private float Valor;
    private String Tipo;
    private String QuienRealiza;

    public MOVIMIENTO() {
    }

    public int getIdmoviento() {
        return Idmoviento;
    }

    public void setIdmoviento(int Idmoviento) {
        this.Idmoviento = Idmoviento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getQuienRealiza() {
        return QuienRealiza;
    }

    public void setQuienRealiza(String QuienRealiza) {
        this.QuienRealiza = QuienRealiza;
    }
    
    
}
