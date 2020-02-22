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
public class EquipoSonido extends Electrodomestico {

    private int Potencia;
    private int NumAltavoces;
    private String Inalambrico;

    private EquipoSonido[] Arreglo;
    private int posicion;

    public EquipoSonido(int Potencia, int NumAltavoces, String Inalambrico) {
        this.Potencia = Potencia;
        this.NumAltavoces = NumAltavoces;
        this.Inalambrico = Inalambrico;
        this.Arreglo = null;
    }

    public EquipoSonido() {
        Arreglo = new EquipoSonido[20];
        posicion = 0;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    public int getNumAltavoces() {
        return NumAltavoces;
    }

    public void setNumAltavoces(int NumAltavoces) {
        this.NumAltavoces = NumAltavoces;
    }

    public String getInalambrico() {
        return Inalambrico;
    }

    public void setInalambrico(String Inalambrico) {
        this.Inalambrico = Inalambrico;
    }

    public EquipoSonido getArreglo(int pos) {
        return Arreglo[pos];
    }

    public void setArreglo(int pos, EquipoSonido Arreglo) {
        this.Arreglo[pos] = Arreglo;
    }

    @Override
    public boolean Insertar(Object nuevo) {
        EquipoSonido obj = (EquipoSonido) nuevo;

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
                        + "Potencia: " + getArreglo(i).getPotencia() + "\n"
                        + "Numero de altavoces: " + getArreglo(i).getNumAltavoces() + "lbs.\n"
                        + "Inalambrico: " + getArreglo(i).getInalambrico() + "\n\n";
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
                    + "Potencia: " + getArreglo(pos).getPotencia() + "\n"
                    + "Numero de altavoces: " + getArreglo(pos).getNumAltavoces() + "lbs.\n"
                    + "Inalambrico: " + getArreglo(pos).getInalambrico() + "\n\n";
        }
        return Datos;
    }

}
