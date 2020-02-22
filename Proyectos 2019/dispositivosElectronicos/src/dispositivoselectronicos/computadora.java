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
public class computadora extends Dispositivos{
    
    private String tipoComputadora;
    private float almacenamiento;
    private float memoria;
    
    private computadora[] ListaComputadoras;
    private int contador=0;

    public computadora() {
        ListaComputadoras=new computadora[50];
    }

    public computadora(String tipoComputadora, float almacenamiento, float memoria) {
        this.tipoComputadora = tipoComputadora;
        this.almacenamiento = almacenamiento;
        this.memoria = memoria;
    }

    public String getTipoComputadora() {
        return tipoComputadora;
    }

    public void setTipoComputadora(String tipoComputadora) {
        this.tipoComputadora = tipoComputadora;
    }

    public float getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public float getMemoria() {
        return memoria;
    }

    public void setMemoria(float memoria) {
        this.memoria = memoria;
    }

    public computadora getListaComputadoras(int pos) {
        return ListaComputadoras[pos];
    }

    public int getContador() {
        return contador;
    }

    public boolean setListaComputadoras(computadora ListaComputadoras) {
        if (contador<50) {
            this.ListaComputadoras[contador] = ListaComputadoras;
            contador++;
            return true;
        }else{
            return false;
        }
    }


}
