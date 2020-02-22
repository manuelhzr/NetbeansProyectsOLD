/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispositivoselectronicos;

/**
 *
 * @author Asus
 */
public class Dispositivos {
    private String tipoDispositivo;
    private String marca;
    private String modelo;
    private float valAproximado;

    public Dispositivos() {
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getValAproximado() {
        return valAproximado;
    }

    public void setValAproximado(float valAproximado) {
        this.valAproximado = valAproximado;
    }
    
    
}