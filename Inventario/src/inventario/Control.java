/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;


/**
 *
 * @author saray
 */
public class Control {

    private Producto[] listaProductos;
    private int posicion;

    private final int TAMAÑO = 100;

    public Control() {
        this.listaProductos = new Producto[TAMAÑO];
        this.posicion = 0;
    }

    public Producto getListaProductos(int p) {
        return listaProductos[p];
    }

    public void setListaProductos(int p, Producto listaProductos) {
        this.listaProductos[p] = listaProductos;
    }

    public int getPosicion() {
        return posicion;
    }

    public boolean registrarProducto(Producto nuevo) {
        if (posicion < TAMAÑO && validarCodigo(nuevo.getCodigo())) {
            this.listaProductos[posicion++] = nuevo;
            return true;
        }
        return false;
    }

    private boolean validarCodigo(int codigo) {
        for (int i = 0; i < posicion; i++) {
            if (codigo == this.listaProductos[i].getCodigo() ) {
                return false;
            }
        }
        return true;
    }

    public Producto buscar(int codigo) {
        Producto resultado = null;
        for (int i = 0; i < posicion; i++) {
            if (codigo == this.listaProductos[i].getCodigo()) {
                resultado = this.listaProductos[i];
                break;
            }
        }
        return resultado;
    }
    
    public int buscarCod(int codigo) {
        int resultado = 0;
        for (int i = 0; i < posicion; i++) {
            if (codigo == this.listaProductos[i].getCodigo()) {
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    public String busqueda(int codigo) {
        String datos = "Producto no encontrado";
        Producto resultado = buscar(codigo);
        if (resultado != null) {
            datos="Codigo: "+resultado.getCodigo()+"\n"
                    + "Nombre: "+resultado.getNombre()+"\n"
                    + "Cantidad: "+resultado.getCantidad()+"\n"
                    + "Precio por Unidad: "+resultado.getPrecioUnitario()+"\n"
                    + "Precio del Lote: "+resultado.getPrecioLote()+"\n";
        }
        return datos;
    }
    
    public double totalPrecios(){
        double total=0;
        
        for (int i = 0; i < posicion; i++) {
            total += listaProductos[i].getPrecioLote();
        }
     return total;   
    }

}
