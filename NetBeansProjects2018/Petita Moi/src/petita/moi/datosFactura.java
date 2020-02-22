/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petita.moi;

/**
 *
 * @author manue
 */
public class datosFactura {
    private int Codigo;
    private String Cliente;
    private String TipoVehiculo;
    private int numHoras;
    private float Valor;

    public datosFactura() {
        Codigo=0;
        Cliente="";
        TipoVehiculo="";
        numHoras=0;
        Valor=0;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    
    
    
}
