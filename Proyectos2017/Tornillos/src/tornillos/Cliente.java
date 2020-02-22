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
public class Cliente {
    
    //atributos del cliente,son todos los datos requeridos por el programa
    private int cedula;
    private String nombre;
    private String direccion;
    private int telefono;
    private DatosFactura[] Factura;// vector para almacenar las facturas registradas para cada cliente
    private int tam;
    private int posactual;

    public Cliente() {
        posactual=0;
        
    }
    //Metodos set y get para cada atributo
    public int getPosactual() {
        return posactual;
    }

    public void setPosactual(int posactual) {
        this.posactual = posactual;
    }
    
    

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public DatosFactura getFactura(int pos) {
        return Factura[pos];
    }

    public void setFactura(int pos, DatosFactura Factura) {
        this.Factura[pos] = Factura;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
        Factura=new DatosFactura[tam];
    }
    //retorna el valor de todas las facturas registradas para el cliente
    public float Facturatotal(){
        float total=0;
        for (int i = 0; i < posactual; i++) {
            total+=getFactura(i).getTotal();
        }
        return total;
    }
    
    //este metodo retorna los datos de todas las facturas registradas para un cliente
    public String FacturaCliente(){
        String Fact="";
        for (int i = 0; i < getPosactual(); i++) {
            Fact+="ID factura "+getFactura(i).getIdFactura()+"\nFecha "+getFactura(i).getFecha()+"\nDetalles "+getFactura(i).getDetalles()+"\nValor "+getFactura(i).getTotal()+"\n\n";
         
        }
        return Fact;
    }
    
    //metodo para registrrar una factura aun cliente 
    public boolean agregarfactura(DatosFactura factura){
        if (getPosactual()<getTam()) {
            setFactura(getPosactual(), factura);
            setPosactual(getPosactual()+1);
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
