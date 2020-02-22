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
public class impresora extends Dispositivos{
    
    private String tipoImpresora;
    private String conectividad;
    
    private impresora[] ListaImpresoras;
    private int contador=0;

    public impresora() {
        ListaImpresoras = new impresora[50];
    }

    public impresora(String tipoImpresora, String conectividad) {
        this.tipoImpresora = tipoImpresora;
        this.conectividad = conectividad;
    }

    public String getTipoImpresora() {
        return tipoImpresora;
    }

    public void setTipoImpresora(String tipoImpresora) {
        this.tipoImpresora = tipoImpresora;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    public impresora getListaImpresoras(int pos) {
        return ListaImpresoras[pos];
    }

    public int getContador() {
        return contador;
    }

    public boolean setListaImpresoras(impresora ListaImpresoras) {
        if (contador<50) {
            this.ListaImpresoras[contador] = ListaImpresoras;
            contador++;
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
