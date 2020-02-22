
package agricula;


public class facturaCredito extends Factura{

    public facturaCredito() {
    }

    @Override
    public float montos() {
        float total=0;
        total+=monto*0.03;
        total+=monto*0.16;
        return total;
    }
    
    public float multaFecha(){
        float multa=0;
        if(fechaPago.after(fechaFacturacion)){
            multa=(float) (monto*0.05);
        }
        return multa;
    }
    
}
