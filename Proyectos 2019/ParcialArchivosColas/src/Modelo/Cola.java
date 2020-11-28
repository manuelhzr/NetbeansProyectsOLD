package Modelo;

public class Cola {

    static final int CANTIDAD_NODOS = 100;

    private int totalNodos;
    private Persona frente;
    private Persona finalCola;

    public Cola() {
        this.totalNodos = 0;
        this.frente = null;
        this.finalCola = null;
    }

    public int getTotalNodos() {
        return totalNodos;
    }

    public Persona getFrente() {
        return frente;
    }

    public Persona getFinalCola() {
        return finalCola;
    }

    public boolean colaLlena() {
        return getTotalNodos() >= CANTIDAD_NODOS;
    }

    public boolean colaVacia() {
        return getTotalNodos() == 0;
    }

    public void agregar(Persona nuevo) {
        if (!colaLlena()) {
            if (getFrente() == null) {
                frente = nuevo;
            } else {
                getFinalCola().setSiguiente(nuevo);
            }
            finalCola = nuevo;
            totalNodos++;
        }
    }

    public void quitar() {
        Persona temp;
        if (!colaVacia()) {
            temp = getFrente();
            frente = frente.getSiguiente();
            if (getFrente() == null) {
                finalCola = null;
            }
            temp = null;
            totalNodos--;
        }
    }

    public String mostrarPrimera() {
        return frente.getId() + "-" + frente.getNombre() + "-" + frente.getSexo() + "-" + frente.getEps() + "-" + frente.getFecha();
    }

}
