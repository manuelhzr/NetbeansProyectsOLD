
package agricula;

import java.util.Date;

public abstract class Factura {
    public int numFact;
    public Date fechaFacturacion;
    public Date fechaPago;
    public String detalle;
    public float monto;

    public Factura() {
    }

    public int getNumFact() {
        return numFact;
    }

    public void setNumFact(int numFact) {
        this.numFact = numFact;
    }

    public Date getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(Date fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public abstract float montos();
      
}
