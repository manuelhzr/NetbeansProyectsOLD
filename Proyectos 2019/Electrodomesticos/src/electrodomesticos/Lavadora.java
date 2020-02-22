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
public class Lavadora extends Electrodomestico {

    private String tipo;
    private int capacidad;
    private int tanques;

    private Lavadora[] Arreglo;
    private int posicion;

    public Lavadora(String tipo, int capacidad, int tanques) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.tanques = tanques;
        this.Arreglo = null;
    }

    public Lavadora() {
        Arreglo = new Lavadora[20];
        posicion = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getTanques() {
        return tanques;
    }

    public void setTanques(int tanques) {
        this.tanques = tanques;
    }

    public Lavadora getArreglo(int pos) {
        return Arreglo[pos];
    }

    public void setArreglo(int pos, Lavadora lavadoras) {
        this.Arreglo[pos] = lavadoras;
    }

    @Override
    public boolean Insertar(Object nuevo) {
        Lavadora obj = (Lavadora) nuevo;

        if (posicion < 20) {
            setArreglo(posicion, obj);
            posicion++;
            return true;
        }
        return false;
    }

    @Override
    public int Buscar(int dato) {
        int resultado = -1;
        for (int i = 0; i < posicion; i++) {
            if (getArreglo(i) != null && getArreglo(i).getCodigo() == dato) {
                resultado = i;
            }
        }
        return resultado;
    }

    @Override
    public void Eliminar(int posicion) {
        setArreglo(posicion, null);
    }

    @Override
    public String MostrarTodo() {
        String Datos = "";
        for (int i = 0; i < posicion; i++) {
            if (getArreglo(i) != null) {
                Datos += "Marca: " + getArreglo(i).getMarca() + "\n"
                        + "Codigo: " + getArreglo(i).getPrecioVenta() + "\n"
                        + "Precio Venta: " + getArreglo(i).getPrecioVenta() + "\n"
                        + "Tipo: " + getArreglo(i).getTipo() + "\n"
                        + "Capacidad: " + getArreglo(i).getCapacidad() + "lbs.\n"
                        + "Tanques: " + getArreglo(i).getTanques() + "\n\n";
            }
        }
        return Datos;
    }

    @Override
    public String MostrarPos(int pos) {
        String Datos = "";
        if (getArreglo(pos) != null) {
            Datos += "Marca: " + getArreglo(pos).getMarca() + "\n"
                    + "Codigo: " + getArreglo(pos).getPrecioVenta() + "\n"
                    + "Precio Venta: " + getArreglo(pos).getPrecioVenta() + "\n"
                    + "Tipo: " + getArreglo(pos).getTipo() + "\n"
                    + "Capacidad: " + getArreglo(pos).getCapacidad() + "lbs.\n"
                    + "Tanques: " + getArreglo(pos).getTanques() + "\n\n";
        }
        return Datos;
    }

}
