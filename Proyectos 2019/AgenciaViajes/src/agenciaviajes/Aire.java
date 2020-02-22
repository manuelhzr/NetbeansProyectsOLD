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
public class Aire extends Viaje {
    private String Aerolinea;
    private String Clase;

    public Aire() {
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    @Override
    public float ValorDistancia() {
        return getDistanciaDestino()*5000;
    }

    @Override
    public float CargoEscala() {
        float cargo =  (float) ((0.5*getNumEscalas())/10);
        return (float) ValorDistancia()*cargo;
    }

    @Override
    public float CargoTipo() {
        if (getClase().equals("Primera Clase")) {
            return (float) (ValorDistancia()*0.2);
        }else{
            return (float) (ValorDistancia()*0.1);
        }
    }
    
    
}
