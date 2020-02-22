/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prventa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author JP
 */
public class Tienda {

    private String nombreTienda;
    Articulo inicio;

    public Tienda(String nombre) {
        this.nombreTienda = nombre;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    private Articulo Ultimo() {
        Articulo temp = inicio;
        if (temp != null) {
            while (temp.getSig() != null) {
                temp = temp.getSig();
            }
        }
        return temp;
    }

    public void inserta(Articulo a) {
        Articulo temp = Ultimo();
        if (temp != null) {
            temp.setSig(a);
            a.setAnt(temp);
            a.setSig(null);
        } else {
            a.setAnt(null);
            inicio = a;
        }
    }

    public Articulo busca(String nombre) throws NoExiste {
        Articulo temp = inicio;
        while (temp != null) {
            if (temp.nombre().equals(nombre)) {
                break;
            } else {
                temp = temp.getSig();
            }
        }
        if (temp != null) {
            return temp;
        } else {
            throw new NoExiste(null);
        }

    }

    private Articulo anterior(Articulo nd) {
        Articulo temp = inicio;
        while (temp != null) {
            if (temp.getSig() == nd) {
                break;
            } else {
                temp = temp.getSig();
            }
        }
        return temp;
    }

    private void eliminar(Articulo a) {
        Articulo ante;
        if (a == inicio) {
            inicio = inicio.getSig();
            if (inicio != null) {
                inicio.setAnt(null);
            }
        } else {
            ante = anterior(a);
            ante.setSig(a.getSig());
            if (a.getSig() != null) {
                a.getSig().setAnt(ante);
            }
        }
        a.setAnt(null);
        a.setSig(null);
    }

    public double vende(String nombre, int num) throws NoExiste, NoDisponible {
        Articulo articulo = busca(nombre);
        if (articulo != null) {
            try {
                if (articulo.cantidad() != 0) {
                    articulo.vende(num);
                    return num*articulo.precioUnidad();
                } else {
                    eliminar(articulo);
                    throw new NoDisponible(null);
                }
            } catch (NoDisponible e) {
                  throw new NoDisponible(e);
            }
        } else {
            throw new NoExiste(null);
        }
    }

    private void guardarDatos(Articulo dato, String nombreFichero) throws IOException {
        File archivo = new File(nombreFichero);
        BufferedWriter escribir;
        if (archivo.exists()) {
            escribir = new BufferedWriter(new FileWriter(archivo, true));
            escribir.write("Nombre: "+dato.nombre()+" Unidades: "+dato.cantidad()+" Precio: "+dato.precioUnidad());
            escribir.newLine();
        } else {
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(nombreTienda);
            escribir.newLine();
            escribir.write("Nombre: "+dato.nombre()+" Unidades: "+dato.cantidad()+" Precio: "+dato.precioUnidad());
            escribir.newLine();
        }
        escribir.close();
    }

    public void escribePedido(String nombreFichero, int min) throws IOException {
        Articulo aux=inicio;
        while (aux != null) {
            if (aux.cantidad()<min) {
                guardarDatos(aux, nombreFichero);
            }
            aux=aux.getSig();
        }
    }

}
