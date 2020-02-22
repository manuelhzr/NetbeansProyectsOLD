/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobanco;

/**
 *
 * @author manue
 */
public class Movimiento {
    private int idmoviento;
    private String fecha;
    private float valor;
    private String tipo;
    private String quienRealiza;

    public Movimiento() {
    }

    public int getIdmoviento() {
        return idmoviento;
    }

    public void setIdmoviento(int idmoviento) {
        this.idmoviento = idmoviento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getQuienRealiza() {
        return quienRealiza;
    }

    public void setQuienRealiza(String quienRealiza) {
        this.quienRealiza = quienRealiza;
    }
    
    
}
