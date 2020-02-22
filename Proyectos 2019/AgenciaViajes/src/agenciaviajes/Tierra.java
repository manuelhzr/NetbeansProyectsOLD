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
public class Tierra extends Viaje{
    private String Tranportadora;
    private String TipoBus;

    public Tierra() {
    }

    public String getTranportadora() {
        return Tranportadora;
    }

    public void setTranportadora(String Tranportadora) {
        this.Tranportadora = Tranportadora;
    }

    public String getTipoBus() {
        return TipoBus;
    }

    public void setTipoBus(String TipoBus) {
        this.TipoBus = TipoBus;
    }

    @Override
    public float ValorDistancia() {
        return getDistanciaDestino()*1000;
    }

    @Override
    public float CargoEscala() {
        float cargo = (float) ((0.3*getNumEscalas())/10);
        return (float) ValorDistancia()*cargo;
    }

    @Override
    public float CargoTipo() {
        if (getTipoBus().equals("Premium")) {
            return  (float) (ValorDistancia()*0.15);
        }else{
            return  (float) (ValorDistancia()*0.08);
        }
    }
    
   
    
}
