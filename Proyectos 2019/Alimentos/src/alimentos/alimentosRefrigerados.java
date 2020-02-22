/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentos;

/**
 *
 * @author manue
 */
public class alimentosRefrigerados extends Alimento{
    protected String codigoOrganismo;
    private String temperaturaMantenimiento;
    
    private int pos;
    private alimentosRefrigerados[] Lista;

    public alimentosRefrigerados() {
        this.Lista = new alimentosRefrigerados[30];
        this.pos=0;
    }

    public alimentosRefrigerados(String valor1, String valor2) {
        this.codigoOrganismo = valor1;
        this.temperaturaMantenimiento = valor2;
        setValor(11500);
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public String getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(String temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public alimentosRefrigerados getLista(int p) {
        return Lista[p];
    }

    private void setLista(int p, alimentosRefrigerados Lista) {
        this.Lista[p] = Lista;
    }
    
    public void insertarLista(alimentosRefrigerados alimento){
        if (pos<30) {
            setLista(pos, alimento);
            pos++;
        }
    }
    
    public float obtenerTotal(){
        float total=0;
        for (int i = 0; i < pos; i++) {
            total += getLista(i).getValor();
        }
        return total;
    }
    
}
