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
public class Televisor extends Electrodomestico {

    private int tamañoPantalla;
    private String tipoPantalla;
    private String Smart;

    private Televisor[] Arreglo;
    private int posicion;

    public Televisor(int tamañoPantalla, String tipoPantalla, String Smart) {
        this.tamañoPantalla = tamañoPantalla;
        this.tipoPantalla = tipoPantalla;
        this.Smart = Smart;
        this.Arreglo = null;
    }

    public Televisor() {
        Arreglo = new Televisor[20];
        posicion = 0;
    }

    public int getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(int tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public String getSmart() {
        return Smart;
    }

    public void setSmart(String Smart) {
        this.Smart = Smart;
    }

    public Televisor getArreglo(int pos) {
        return Arreglo[pos];
    }

    public void setArreglo(int pos, Televisor Arreglo) {
        this.Arreglo[pos] = Arreglo;
    }

    @Override
    public boolean Insertar(Object nuevo) {
        Televisor obj = (Televisor) nuevo;

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
                        + "Tamaño de pantalla: " + getArreglo(i).getTamañoPantalla() + "\n"
                        + "Tipo de pantalla: " + getArreglo(i).getTipoPantalla() + "lbs.\n"
                        + "SmartTV: " + getArreglo(i).getSmart() + "\n\n";
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
                    + "Tamaño de pantalla: " + getArreglo(pos).getTamañoPantalla() + "\n"
                    + "Tipo de pantalla: " + getArreglo(pos).getTipoPantalla() + "lbs.\n"
                    + "SmartTV: " + getArreglo(pos).getSmart() + "\n\n";
        }
        return Datos;
    }

}
