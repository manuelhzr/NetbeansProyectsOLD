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
public class Facturas {
    private Cliente[] clientes; //vector de objetos tipo cliente para almecenar los datos y las facturas de cada cliente
    private int tam;//tamaño del arreglo clientes

    public Facturas() {
    }
    // metodos set y get para el arreglo cliente y para el tamaño
    public Cliente getClientes(int pos) {
        return clientes[pos];
    }

    public void setClientes(int pos, Cliente clientes) {
        this.clientes[pos] = clientes;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
        clientes=new Cliente[tam];
        
    }
    
    //metodo para buscar un cliente, se le pasa como parametro de busqueda un numero que representa la idenficacion de un cliente para realizar la busqueda y retorna la posicion en la que se encuentra guardado en el arreglo
    public int buscar(int num){
        int pos=-1;
        for (int i = 0; i < getTam(); i++) {
            if (getClientes(pos).getCedula()==num) {
                pos=i;
            }
        }
        return pos;
    }
    
    //comprueba si un cliente ya se encuentra registrado, para hacer la comprobacion se le pasa un numero de cedula y retorna verdadero en caso de el cliente ya se encuentre registrado, falso si se da lo contrario
    public boolean comprobarRegistro(int cedula){
        boolean existe=false;
        for (int i = 0; i < getTam(); i++) {
            if (getClientes(i).getCedula()==cedula) {
                existe=true;                
            }
        }
        return existe;
    }
   //muesta el valor total de todas la facturas registradas para cada cliente
    public float FacturacionTotal(){
        float factura=0;
        for (int i = 0; i < getTam(); i++) {
            factura+=getClientes(i).Facturatotal();
        }
        return factura;
    }
    //retorna todos los datos del cliente y sus facturas registrados en la posicion indicada como parametro
    public String DatosCliente(int pos){
        String Datos="";
        Datos+="Nombre "+getClientes(pos).getNombre()+"\nCedula: "+getClientes(pos).getCedula()+"\nDireccion: "+getClientes(pos).getDireccion()+"\nTelefono: "+getClientes(pos).getTelefono()+"\n\n";
        Datos+=getClientes(pos).FacturaCliente();
        return Datos;
    }
    
}
