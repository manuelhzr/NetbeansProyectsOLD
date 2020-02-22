/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tornillos;

/**
 *
 * @author manue
 */
public class DatosFactura {
    
    //Esta clase contiene los datos requeridos para agregar una factura aun cliente
    //solo posee los atributos y sus respectivos metodos set y get
    private int idFactura;
    private String fecha;
    private String detalles;
    private float Total;

    public DatosFactura() {
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }
    
    
}
