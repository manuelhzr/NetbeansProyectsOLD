
package agricula;


public class facturaContado extends Factura{

    public facturaContado() {
    }

    @Override
    public float montos() {
        float  descuento = (float) (monto * 0.1);
        return descuento;
    }
   
}
