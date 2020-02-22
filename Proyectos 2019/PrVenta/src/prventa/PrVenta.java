/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prventa;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author JP
 */
public class PrVenta {

    public static int menu() {
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("<<< SELECCIONE UNA OPCION >>>\n"
                    + "1: Ingresar un articulo a la lista.\n"
                    + "2: Buscar un articulo.\n"
                    + "3: Vender un articulo.\n"
                    + "4: Escribir articulos de los que queden menos de n unidades en un archivo\n"
                    + "5: Salir."));
        } while (op < 1 || op > 5);
        return op;
    }

    public static void Insertar(Tienda lista) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del articulo:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de unidades: "));
        double precioUnidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor unitario: "));
        Articulo nuevo = new Articulo(nombre, cantidad, precioUnidad);
        lista.inserta(nuevo);
        JOptionPane.showMessageDialog(null, "Articulo agregado");
    }

    public static void Buscar(Tienda lista) throws NoExiste {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del articulo a buscar: ");
        try {
            Articulo res = lista.busca(nombre);

            JOptionPane.showMessageDialog(null, "Datos encontrados:\n"
                    + "Nombre: " + res.nombre() + ".\n"
                    + "Numero de unidades: " + res.cantidad() + ".\n"
                    + "Valor unitario: " + res.precioUnidad() + ".\n");
        } catch (NoExiste e) {
            JOptionPane.showMessageDialog(null, "No se encontro el articulo");
        }
    }

    public static void Vender(Tienda lista) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del articulo a vender: ");
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de unidades a vender: "));

        try {
            double total = lista.vende(nombre, num);
            JOptionPane.showMessageDialog(null, "Venta realizada.\nTotal de la venta: " + total + ".");
        } catch (NoDisponible e) {
            JOptionPane.showMessageDialog(null, "No se encuentran unidades disponibles.\nArticulo eliminado de la lista.");
        } catch (NoExiste ex) {
            JOptionPane.showMessageDialog(null, "No se encontro el articulo");
        }
    }

    public static void Escribir(Tienda lista) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor minimo de unidadea a escribir en el archivo:"));
        String ruta = "D:\\Archivo.txt";

        try {
            lista.escribePedido(ruta, num);
            JOptionPane.showMessageDialog(null, "DAtos escritos en el archivo");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir archivo");
        }
    }

    public static void main(String[] args) throws NoExiste {
        // TODO code application logic here
        Tienda lista = new Tienda("Tienda");

        int op;

        do {
            op = menu();

            switch (op) {
                case 1:
                    Insertar(lista);
                    break;
                case 2:
                    Buscar(lista);
                    break;
                case 3:
                    Vender(lista);
                    break;
                case 4:
                    Escribir(lista);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }

        } while (op != 5);

    }

}
