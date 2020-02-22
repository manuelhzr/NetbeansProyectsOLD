package Clases;

public class PruebaOrden {

    private int vectorDatos[];
    private int numElementos;

    public void setVectorDatos(int p, int dato) {
        vectorDatos[p] = dato;
    }

    public int getVectorDatos(int p) {
        return vectorDatos[p];
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
        this.vectorDatos = new int[numElementos];
    }

    public void llenarArreglo() {
        for (int i = 0; i < numElementos; i++) {
            setVectorDatos(i, (int) (Math.random() * numElementos));
        }
    }

    public void cambiar(int p1, int p2) {
        int temp;
        temp = getVectorDatos(p1);
        setVectorDatos(p1, getVectorDatos(p2));
        setVectorDatos(p2, temp);
    }

    public void ordenarBurbuja() {
        int i, j;
        for (i = 0; i <= getNumElementos() - 1; i++) {
            for (j = 0; j <= (getNumElementos() - i) - 2; j++) {
                if (getVectorDatos(j) > getVectorDatos(j + 1)) {
                    cambiar(j, j + 1);
                }
            }
        }
    }

    public void ordenarIntercambio() {
        int i, j;
        for (i = 0; i <= getNumElementos() - 1; i++) {
            for (j = i + 1; j <= getNumElementos() - 1; j++) {
                if (getVectorDatos(i) > getVectorDatos(j)) {
                    cambiar(i, j);
                }
            }
        }
    }

    public void ordenarShell() {
        int salto, i;

        boolean cambios;
        for (salto = getNumElementos() / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < getNumElementos(); i++) {
                    if (getVectorDatos(i - salto) > getVectorDatos(i) && (i - salto) >= 0) {
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
        menorElemento = getVectorDatos(inicio);
        for (i = inicio + 1; i <= getNumElementos() - 1; i++) {
            if (getVectorDatos(i) < menorElemento) {
                menorElemento = getVectorDatos(i);
                posMenor = i;
            }
        }
        return posMenor;
    }

    public void ordenarSeleccion() {
        for (int i = 0; i <= getNumElementos() - 1; i++) {
            cambiar(i, posicionMenor(i));
        }
    }

    public void Quicksort(int izq, int der) {

        int pivote = vectorDatos[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (vectorDatos[i] <= pivote && i < j) {
                i++;
            }
            while (vectorDatos[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = vectorDatos[i];
                vectorDatos[i] = vectorDatos[j];
                vectorDatos[j] = aux;
            }
        }
        vectorDatos[izq] = vectorDatos[j];
        vectorDatos[j] = pivote;
        if (izq < j - 1) {
            Quicksort(izq, j - 1);
        }
        if (j + 1 < der) {
            Quicksort(j + 1, der);
        }
    }

    public int busquedaLineal(int dato) {
        int i;
        int posicion;
        posicion = -1;
        i = 0;
        while ((i <= getNumElementos() - 1) && (posicion == -1)) {
            if (getVectorDatos(i) == dato) {
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
        der = getNumElementos() - 1;
        posicion = -1;
        while ((izq <= der) && (posicion == -1)) {
            centro = (izq + der) / 2;
            if (dato == (getVectorDatos(centro))) {
                posicion = centro;
            } else {
                if (dato < (getVectorDatos(centro))) {
                    der = centro - 1;
                } else {
                    izq = centro + 1;
                }
            }
        }
        return posicion;
    }

    public String imprimirArreglo() {
        String datos = "";
        for (int i = 0; i < numElementos; i++) {
            datos += vectorDatos[i] + " ";
            if ((i + 1) % 10 == 0) {
                datos += "\n";
            }
        }
        return datos;
    }

    private long tiempoBurbuja() {
        llenarArreglo();
        long tInicio = System.currentTimeMillis();
        ordenarBurbuja();
        return System.currentTimeMillis() - tInicio;
    }

    private long tiempoIntercambio() {
        llenarArreglo();
        long tInicio = System.currentTimeMillis();
        ordenarIntercambio();
        return System.currentTimeMillis() - tInicio;
    }

    private long tiempoShell() {
        llenarArreglo();
        long tInicio = System.currentTimeMillis();
        ordenarShell();
        return System.currentTimeMillis() - tInicio;
    }

    private long tiempoSeleccion() {
        llenarArreglo();
        long tInicio = System.currentTimeMillis();
        ordenarSeleccion();
        return System.currentTimeMillis() - tInicio;
    }

    private long tiempoQuicksort() {
        llenarArreglo();
        long tInicio = System.currentTimeMillis();
        Quicksort(0, numElementos - 1);
        return System.currentTimeMillis() - tInicio;
    }

    public String Tiempos() {
        return "Burbuja: " + tiempoBurbuja() + "\n"
                + "Intercambio: " + tiempoIntercambio() + "\n"
                + "Shell: " + tiempoShell() + "\n"
                + "Seleccion: " + tiempoSeleccion() + "\n"
                + "QuickSort: " + tiempoQuicksort() + "\n";
    }

}
