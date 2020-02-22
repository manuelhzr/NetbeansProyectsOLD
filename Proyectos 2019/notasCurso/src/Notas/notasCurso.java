package Notas;

public class notasCurso {

    private int tamaño;
    private datosEst[] vector;

    public notasCurso() {
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
        vector = new datosEst[tamaño];
    }

    public datosEst getVector(int pos) {
        return vector[pos];
    }

    public void setVector(int pos, datosEst vector) {
        this.vector[pos] = vector;
    }

    public void calularDefinitiva() {
        for (int i = 0; i < getTamaño(); i++) {
            getVector(i).setDefinitiva((getVector(i).getN1() + getVector(i).getN2() + getVector(i).getN3()) / 3);
        }
    }

    public String listaReprobados() {
        String l = "";

        for (int i = 0; i < getTamaño(); i++) {
            if (getVector(i).getDefinitiva() < 3) {
                l = l + "ID: " + getVector(i).getId() + " Nota: " + getVector(i).getDefinitiva() + "\n";
            }
        }
        return l;
    }

    public int numAprobados() {
        int cont = 0;
        for (int i = 0; i < getTamaño(); i++) {
            if (getVector(i).getDefinitiva() >= 3) {
                cont++;
            }
        }
        return cont;
    }

    public float promGeneral() {
        float prom = 0;

        for (int i = 0; i < getTamaño(); i++) {
            prom += getVector(i).getDefinitiva();
        }

        return prom / getTamaño();
    }

    public String nombresAprobados() {
        String l = "";

        for (int i = 0; i < getTamaño(); i++) {
            if (getVector(i).getDefinitiva() >= 3) {
                l = l + "Nombre: " + getVector(i).getNombre() + " Nota: " + getVector(i).getDefinitiva() + "\n";
            }
        }

        return l;
    }

    public String cuadroHonor() {
        int j;
        datosEst aux;
        for (int i = 1; i < getTamaño(); i++) {
            aux = getVector(i);
            j = i - 1;
            while ((j >= 0) && (getVector(j).getDefinitiva() < aux.getDefinitiva()) ) {
                setVector(j + 1, getVector(j));
                j--;
            }
            setVector(j + 1, aux);
        }
        
        String l="";
        
        for (int i = 0; i < 3; i++) {
            l+=getVector(i).getDefinitiva()+"\n";
        }
        
        return l;
        
    }

    public String mayoresPromedio(){
        String l="";
        float prom=promGeneral();
        
        for (int i = 0; i < getTamaño(); i++) {
            if (getVector(i).getDefinitiva()>=prom) {
                l+=getVector(i).getDefinitiva()+"\n";
            }
        }
        return l;
    }

}
