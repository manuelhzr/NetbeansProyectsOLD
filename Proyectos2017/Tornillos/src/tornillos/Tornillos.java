/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tornillos;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Tornillos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Facturas obj=new Facturas();
        DatosFactura fact;
        Cliente client;
        int op, pos=0, cedula, res;
        int tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el maximo de clientes a registrar"));
        
        do{
            
            //caso para mostrar un menu de opciones, el cualse repetira hasta que se le ingrese una opcion valida
            do{
                op=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion\n"
                    + "1 Registrar factura\n"
                    + "2 mostrar facturas de un cliente\n"
                    + "3 mostrar el total facturado de la empresa\n"
                    + "4 salir"));
            }while(op<1 || op>4);
            
            //switch para tomar acciones segun la opcion ingresada en el menu
            switch(op){
                case 1:
                    //solicita el numero de cedula del cliente al que se le va a registrar la factura, si el cliente existe, procede a registrar los datos de la factura
                    cedula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente para registrar factura"));
                    res=obj.buscar(cedula);
                    if (res!=-1) {
                        fact=new DatosFactura();
                        fact.setIdFactura(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la factura")));
                        fact.setDetalles(JOptionPane.showInputDialog("Ingrese los detalles"));
                        fact.setFecha(JOptionPane.showInputDialog("Ingrese la fecha"));
                        fact.setTotal(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto de la factura")));
                        obj.getClientes(res).agregarfactura(fact);
                    } else {
                        //si el cliente no exite permite registrarlo y agragar la factura
                        JOptionPane.showMessageDialog(null, "El cliente no exite, debe agregarlo");
                        client=new Cliente();
                        if (pos < tam) {
                            int idc=Integer.parseInt(JOptionPane.showInputDialog("ingrese ek numero de cedula del cliente"));
                            if (obj.comprobarRegistro(idc)==false) {
                                client.setCedula(idc);
                                client.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del cliente"));
                                client.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion"));
                                client.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Ingrse el numero de telefono")));
                                client.setTam(tam);
                                
                                obj.setClientes(pos, client);
                                
                                fact = new DatosFactura();
                                fact.setIdFactura(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la factura")));
                                fact.setDetalles(JOptionPane.showInputDialog("Ingrese los detalles"));
                                fact.setFecha(JOptionPane.showInputDialog("Ingrese la fecha"));
                                fact.setTotal(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto de la factura")));
                                
                                obj.getClientes(pos).agregarfactura(fact);
                                pos++;
                                
                            }else{
                                JOptionPane.showMessageDialog(null, "El numero de cedula ya se encuentra registrado");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Ya no se pueden registrar mas clientes");
                        }
                    }
                    break;
                case 2:
                    //muestra los datos de un cliente especifico, buscandolo por su numero de cedula
                    cedula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente a buscar los datos"));
                    res=obj.buscar(cedula);
                    if (res!=-1) {
                        obj.DatosCliente(res);
                    }else{
                        JOptionPane.showMessageDialog(null, "El cliente no se encuentra registrado");
                    }
                    break;
                case 3:
                    //muestra la facturacion total de la empresa.
                    obj.FacturacionTotal();
                    break;
                case 4:
                    break;    
                    
            }
            
        }while(op!=4);
    }
    
}
