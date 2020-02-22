
package agricula;

import java.util.Date;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Date fecha=new Date();
        String tipoFact[]= {"Contado", "Credito"};
        String tipo=JOptionPane.showInputDialog(null,"Seleccione el tipo de pago","pago",1,null,tipoFact,tipoFact[0]).toString();
        
        if(tipo.equals("Contado")){
            facturaContado Fact=new facturaContado();
            Fact.setDetalle(JOptionPane.showInputDialog("Ingrese el Producto a comprar"));
            Fact.setMonto(Float.parseFloat(JOptionPane.showInputDialog("Digite el valor del producto")));
            Fact.setNumFact(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de factura")));
            fecha.setDate(Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia de compra")));
            fecha.setMonth(Integer.parseInt(JOptionPane.showInputDialog("ingrese el mes de compra")));
            Fact.setFechaFacturacion(fecha);
            int dia=Fact.getFechaFacturacion().getDate(), mes= Fact.getFechaFacturacion().getMonth();
            JOptionPane.showMessageDialog(null, "El valor del producto es: "+Fact.getMonto()+"\n"
                    + "La fecha de facturacion es: Dia: "+dia +" Mes: "+mes+"\n"
                            + "Numero de factura: "+Fact.getNumFact()+"\n"
                    + "El descuento aplicado es: "+Fact.montos()+"\n"
                    + "El total a pagar es: "+(Fact.getMonto()-Fact.montos()));
            
        }else{
            facturaCredito Fact=new facturaCredito();
            Fact.setDetalle(JOptionPane.showInputDialog("Ingrese el Producto a comprar"));
            Fact.setMonto(Float.parseFloat(JOptionPane.showInputDialog("Digite el valor del producto")));
            Fact.setNumFact(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de factura")));
            fecha.setDate(Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia de compra")));
            fecha.setMonth(Integer.parseInt(JOptionPane.showInputDialog("ingrese el mes de compra")));
            Fact.setFechaFacturacion(fecha);
            fecha.setDate(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de pago")));
            fecha.setMonth(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de pago")));
            Fact.setFechaPago(fecha);
            
            int dia=Fact.getFechaFacturacion().getDate(), mes= Fact.getFechaFacturacion().getMonth();
            
            JOptionPane.showMessageDialog(null, "El valor del producto es: "+Fact.getMonto()+"\n"
                    + "La fecha de facturacion es: Dia: "+dia +" Mes: "+mes+"\n"
                    + "Numero de factura: "+Fact.getNumFact()+"\n"
                    + "El monto extra aplicado es: "+Fact.montos()+"\n"
                    + "El monto extra por demora en el pago es: "+Fact.multaFecha()+"\n"
                    + "El total a pagar es: "+(Fact.getMonto()+Fact.montos()+Fact.multaFecha()));
        }
    }
    
}
