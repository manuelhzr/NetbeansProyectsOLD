/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticos;

/**
 *
 * @author manue
 */
public abstract class Electrodomestico {

    private String marca;
    private int codigo;
    private float precioVenta;

    public Electrodomestico() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public abstract boolean Insertar(Object nuevo);

    public abstract int Buscar(int dato);

    public abstract void Eliminar(int posicion);

    public abstract String MostrarTodo();

    public abstract String MostrarPos(int pos);

}
