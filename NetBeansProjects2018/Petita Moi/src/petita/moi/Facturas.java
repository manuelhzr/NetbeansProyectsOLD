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
public class Facturas {
    private datosFactura[] Facturas;

    public Facturas() {
        Facturas=new datosFactura[50];
    }

    public datosFactura[] getFacturas() {
        return Facturas;
    }

    public void setFacturas(int p, datosFactura Facturas) {
        this.Facturas[p] = Facturas;
    }
    
    public datosFactura getPos(int pos){
        return Facturas[pos];
    }
    
    public void datosPredefinidos(){
        datosFactura dat=new datosFactura();
        dat.setCliente("Luis");dat.setCodigo(1);dat.setNumHoras(4);dat.setTipoVehiculo("Auto");
        Facturas[0]=dat;
        
        dat=new datosFactura();
        dat.setCliente("Miguel");dat.setCodigo(2);dat.setNumHoras(4);dat.setTipoVehiculo("Camioneta");
        Facturas[1]=dat;
        
        dat=new datosFactura();
        dat.setCliente("Maria");dat.setCodigo(3);dat.setNumHoras(8);dat.setTipoVehiculo("Auto");
        Facturas[2]=dat;
        
        dat=new datosFactura();
        dat.setCliente("jose");dat.setCodigo(4);dat.setNumHoras(12);dat.setTipoVehiculo("Bus");
        Facturas[3]=dat;
        
        dat=new datosFactura();
        dat.setCliente("Roberto");dat.setCodigo(5);dat.setNumHoras(4);dat.setTipoVehiculo("Auto");
        Facturas[4]=dat;
        
        dat=new datosFactura();
        dat.setCliente("Alverto");dat.setCodigo(6);dat.setNumHoras(3);dat.setTipoVehiculo("Camioneta");
        Facturas[5]=dat;
        
        dat=new datosFactura();
        dat.setCliente("Diego");dat.setCodigo(7);dat.setNumHoras(14);dat.setTipoVehiculo("Bus");
        Facturas[6]=dat;
        
        dat=new datosFactura();
        dat.setCliente("Andres");dat.setCodigo(8);dat.setNumHoras(7);dat.setTipoVehiculo("Bus");
        Facturas[7]=dat;
        
        dat=new datosFactura();
        dat.setCliente("Alejandro");dat.setCodigo(9);dat.setNumHoras(10);dat.setTipoVehiculo("Auto");
        Facturas[8]=dat;
        
        dat=new datosFactura();
        dat.setCliente("Daniel");dat.setCodigo(10);dat.setNumHoras(4);dat.setTipoVehiculo("Camioneta");
        Facturas[9]=dat;
        
        dat=new datosFactura();
        dat.setCliente("Ernesto");dat.setCodigo(11);dat.setNumHoras(13);dat.setTipoVehiculo("Camioneta");
        Facturas[10]=dat;
        
        dat=new datosFactura();
        dat.setCliente("Manuel");dat.setCodigo(12);dat.setNumHoras(18);dat.setTipoVehiculo("Bus");
        Facturas[11]=dat;
    }
}
