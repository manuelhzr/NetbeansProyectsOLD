/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerordenamiento;

/**
 *
 * @author juan
 */
public class PruebaOrden {

    private int arreglo[];
    private int tamaño;

    public void setArreglo(int p, int dato) {
        arreglo[p] = dato;
    }

    public int getArreglo(int p) {
        return arreglo[p];
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;

    }

    public void crearVector() {
        arreglo = new int[tamaño];
    }

    public void LlenarAleatorio() {
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    public String MostrarDatos() {
        String datos = "";
        int cont = 0;
        for (int i = 0; i < tamaño; i++) {
            datos += arreglo[i] + " ";
            cont++;
            if (cont == 10) {
                datos += "\n";
                cont = 0;
            }
        }
        return datos;
    }

    public void cambiar(int p1, int p2) {
        int temp;
        temp = getArreglo(p1);
        setArreglo(p1, getArreglo(p2));
        setArreglo(p2, temp);
    }

    public void ordenarBurbuja() {
        int i, j;
        for (i = 0; i <= getTamaño() - 1; i++) {
            for (j = 0; j <= (getTamaño() - i) - 2; j++) {
                if (getArreglo(j) > getArreglo(j + 1)) {
                    cambiar(j, j + 1);
                }
            }
        }
    }

    public void ordenarIntercambio() {
        int i, j;
        for (i = 0; i <= getTamaño() - 1; i++) {
            for (j = i + 1; j <= getTamaño() - 1; j++) {
                if (getArreglo(i) > getArreglo(j)) {
                    cambiar(i, j);
                }
            }
        }
    }

    public void ordenarShell() {
        int salto, i;

        boolean cambios;
        for (salto = getTamaño() / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < getTamaño(); i++) {
                    if (getArreglo(i - salto) > getArreglo(i) && (i - salto) >= 0) {
                        cambiar(i, i - salto);
                        cambios = true;

                    }
                }
            }
        }
    }

    public int posicionMenor(int inicio) {
        int i;
        int posMenor;
        int menorElemento;
        posMenor = inicio;
        menorElemento = getArreglo(inicio);
        for (i = inicio + 1; i <= getTamaño() - 1; i++) {
            if (getArreglo(i) < menorElemento) {
                menorElemento = getArreglo(i);
                posMenor = i;
            }
        }
        return posMenor;
    }

    public void ordenarSeleccion() {
        for (int i = 0; i <= getTamaño() - 1; i++) {
            cambiar(i, posicionMenor(i));
        }
    }

    public void ordenarQuicksort(int izq, int der) {
        int datoAct = arreglo[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (arreglo[i] <= datoAct && i < j) {
                i++;
            }
            while (arreglo[j] > datoAct) {
                j--;
            }
            if (i < j) {
                aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
            }
        }
        arreglo[izq] = arreglo[j];
        arreglo[j] = datoAct;
        if (izq < j - 1) {
            ordenarQuicksort(izq, j - 1);
        }
        if (j + 1 < der) {
            ordenarQuicksort(j + 1, der);
        }
    }

    public int busquedaLineal(int dato) {
        int i;
        int posicion;
        posicion = -1;
        i = 0;
        while ((i <= getTamaño() - 1) && (posicion == -1)) {
            if (getArreglo(i) == dato) {
                posicion = i;
            } else {
                i = i + 1;
            }
        }
        return posicion;
    }

    public int busquedaBinaria(int dato) {
        int posicion, izq, der, centro;
        ordenarIntercambio();
        izq = 0;
        der = getTamaño() - 1;
        posicion = -1;
        while ((izq <= der) && (posicion == -1)) {
            centro = (izq + der) / 2;
            if (dato == (getArreglo(centro))) {
                posicion = centro;
            } else {
                if (dato < (getArreglo(centro))) {
                    der = centro - 1;
                } else {
                    izq = centro + 1;
                }
            }
        }
        return posicion;
    }

    public long T_ordenarBurbuja() {
        long tI = System.currentTimeMillis();
        ordenarBurbuja();
        long tF = System.currentTimeMillis();
        return tF - tI;
    }

    public long T_ordenarIntercambio() {
        long tI = System.currentTimeMillis();
        ordenarIntercambio();
        long tF = System.currentTimeMillis();
        return tF - tI;
    }

    public long T_ordenarShell() {
        long tI = System.currentTimeMillis();
        ordenarShell();
        long tF = System.currentTimeMillis();
        return tF - tI;
    }

    public long T_ordenarSeleccion() {
        long tI = System.currentTimeMillis();
        ordenarSeleccion();
        long tF = System.currentTimeMillis();
        return tF - tI;
    }

    public long T_ordenarQuicksort() {
        long tI = System.currentTimeMillis();
        ordenarQuicksort(0, tamaño - 1);
        long tF = System.currentTimeMillis();
        return tF - tI;
    }

}
