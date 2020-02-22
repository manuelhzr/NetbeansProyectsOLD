/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author manue
 */
public class NeoCDS {

    private int tam=50;
    private Disco[] ListaDiscos;
    private int posActual = 0;

    public NeoCDS() {
        ListaDiscos = new Disco[tam];
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public Disco getListaDiscos(int pos) {
        return ListaDiscos[pos];
    }

    public void setListaDiscos(int pos, Disco ListaDiscos) {
        this.ListaDiscos[pos] = ListaDiscos;
    }

    public int getPosActual() {
        return posActual;
    }
    
    public void agregar(Disco nuevo){
        if (posActual<50) {
            setListaDiscos(posActual, nuevo);
            posActual++;
        }
    }

    public void llenarAutomatico() {
        setListaDiscos(0, new Disco("Stories", 10, 10000, 'A'));
        setListaDiscos(1, new Disco("Expectations", 14, 15000, 'C'));
        setListaDiscos(2, new Disco("Cage the Elephant", 9, 25000, 'B'));
        setListaDiscos(3, new Disco("Talking Dreams", 5, 7000, 'A'));
        setListaDiscos(4, new Disco("Handclap", 1, 2000, 'D'));
        setListaDiscos(5, new Disco("Evolve", 15, 30000, 'B'));
        setListaDiscos(6, new Disco("Peace Is the Mission", 20, 30000, 'B'));
        setListaDiscos(7, new Disco("In the Name of Love", 1, 1900, 'E'));
        setListaDiscos(8, new Disco("Death of a Bachelor", 7, 10000, 'F'));
        setListaDiscos(9, new Disco("Prayer", 20, 30000, 'B'));
        setListaDiscos(10, new Disco("A Night at the Opera", 14, 35000, 'F'));
        setListaDiscos(11, new Disco("Atlántico", 11, 10000, 'A'));
        posActual = 11;
    }

    public String Imprimir() {
        String lista = "";
        for (int i = 0; i < posActual; i++) {
            if (i < posActual) {
                lista += getListaDiscos(i).getTitulo() + " - " + getListaDiscos(i).getCantidadPistas() + " - " + getListaDiscos(i).getValorCD() + " - " + getListaDiscos(i).getClasificacion()+"\n";
            }
        }
        return lista;
    }

    public int BusquedaLineal(float dato) {
        int i;
        int N = getTam();
        int pos = -1;
        for (i = 0; i < N; i++) {
            if (getListaDiscos(i).getValorCD() == dato) {
                pos = i;
            }
        }
        return pos;
    }

    public int BusquedaBinaria(float dato) {
        int izq = 0;
        int der = getTam() - 1;
        int centro = (izq + der) / 2;
        while ((izq <= der) && (getListaDiscos(centro).getValorCD() >= dato)) {
            if (getListaDiscos(centro).getValorCD() <= dato) {
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
    
    public void burbuja() {
        int i, j;
        Disco temp;
        for (i = 0; i <= getTam() - 1; i++) {
            for (j = 0; j <= (getTam() - i) - 2; j++) {
                if (getListaDiscos(j).getCantidadPistas()>getListaDiscos(j+1).getCantidadPistas()) {
                    temp = getListaDiscos(j);
                    setListaDiscos(j, getListaDiscos(j+1)) ;
                    setListaDiscos(j+1, temp);
                }
            }
        }
    }

    public void intercambio() {
        int i, j;
        Disco temp;
        for (i = 0; i <= getTam() - 1; i++) {
            for (j = i + 1; j <= getTam() - 1; j++) {
                if (getListaDiscos(i).getCantidadPistas() >getListaDiscos(j).getCantidadPistas()) {
                    temp = getListaDiscos(j);
                    setListaDiscos(j, getListaDiscos(i));
                    setListaDiscos(i, temp);
                }
            }
        }
    }

    public void quickSort(int menor, int mayor) {
        if (menor < mayor) {
            int p = particion(menor, mayor);
            quickSort(menor, p - 1);
            quickSort(p + 1, mayor);
        }
    }

    public int particion( int menor, int mayor) {
        Disco pivote = getListaDiscos(menor);
        int i = menor + 1;
        int j = mayor;
        while (i <= j) {
            while (i <= j && getListaDiscos(i).getCantidadPistas() <= pivote.getCantidadPistas()) {
                i++;
            }
            while (i >= j && getListaDiscos(j).getCantidadPistas() >= pivote.getCantidadPistas()) {
                j--;
            }
            if (i < j) {
                setListaDiscos(i, getListaDiscos(j));
            }
        }
        if (j != menor) {
            setListaDiscos(menor, getListaDiscos(j));
            setListaDiscos(j, pivote);
        }

        return j;
    }

}
