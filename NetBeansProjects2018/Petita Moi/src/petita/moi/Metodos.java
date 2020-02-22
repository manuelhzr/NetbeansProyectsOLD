/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petita.moi;

/**
 *
 * @author Omar
 */
public class Metodos {

    public static void burbuja(datosFactura[] objects) {
        int i, j;
        datosFactura temp;
        for (i = 0; i <= objects.length - 1; i++) {
            for (j = 0; j <= (objects.length - i) - 2; j++) {
                if (objects[j].getNumHoras()>objects[j + 1].getNumHoras()) {
                    temp = objects[j];
                    objects[j] = objects[j + 1];
                    objects[j + 1] = temp;
                }
            }
        }
    }

    public static void intercambio(datosFactura[] objects) {
        int i, j;
        datosFactura temp;
        for (i = 0; i <= objects.length - 1; i++) {
            for (j = i + 1; j <= objects.length - 1; j++) {
                if (objects[i].getNumHoras() >objects[j].getNumHoras()) {
                    temp = objects[j];
                    objects[j] = objects[i];
                    objects[i] = temp;
                }
            }
        }
    }

    public static void quickSort(datosFactura[] objects, int menor, int mayor) {
        if (menor < mayor) {
            int p = particion(objects, menor, mayor);
            quickSort(objects, menor, p - 1);
            quickSort(objects, p + 1, mayor);
        }
    }

    public static int particion(datosFactura[] objects, int menor, int mayor) {
        datosFactura pivote = objects[menor];
        int i = menor + 1;
        int j = mayor;
        while (i <= j) {
            while (i <= j && objects[i].getNumHoras() <= pivote.getNumHoras()) {
                i++;
            }
            while (i >= j && objects[j].getNumHoras() >= pivote.getNumHoras()) {
                j--;
            }
            if (i < j) {
                objects[i] = objects[j];
            }
        }
        if (j != menor) {
            objects[menor] = objects[j];
            objects[j] = pivote;
        }

        return j;
    }

    public static int BusquedaLineal(datosFactura[] objects, int dato) {
        int i;
        int N = objects.length;
        int pos = -1;
        for (i = 0; i < N; i++) {
            if (objects[i].getNumHoras()== dato) {
                pos = i;
            }
        }
        return pos;
    }

    public static int BusquedaBinaria(datosFactura[] objects, int dato) {
        int izq = 0;
        int der = objects.length - 1;
        int centro = (izq + der) / 2;
        while ((izq <= der) && (objects[centro].getNumHoras()>= dato)) {
            if (objects[centro].getNumHoras()<= dato) {
                der = centro - 1;
            } else {
                izq = centro + 1;
            }
        }
        if (izq > der) {
            return -1;
        } else {
            return centro;
        }
    }
}
