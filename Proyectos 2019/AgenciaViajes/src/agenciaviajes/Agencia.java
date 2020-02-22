/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes;

/**
 *
 * @author Andrea
 */
public class Agencia {

    public Agencia() {
    }
    
    public float CalcularAire(Aire servicio){
        float valor=servicio.ValorDistancia();
        valor = valor+servicio.CargoEscala();
        valor=valor+servicio.CargoTipo();
        return valor;
    }
    
    public float CalcularTierra(Tierra servicio){
        float valor=servicio.ValorDistancia();
        valor= valor+servicio.CargoEscala();
        valor=valor+servicio.CargoTipo();
        return valor;
    }
}
