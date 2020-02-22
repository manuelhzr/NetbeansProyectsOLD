/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresobjetos;

/**
 *
 * @author manue
 */
public class Notas {

    private int N;
    private Estudiantes[] VectorNotas;

    private int posAcutal = 0;

    public Notas(int N) {
        this.N = N;
        this.VectorNotas = new Estudiantes[N];
    }

    public Estudiantes getVectorNotas(int p) {
        return VectorNotas[p];
    }

    private void setVectorNotas(int p, Estudiantes VectorNotas) {
        this.VectorNotas[p] = VectorNotas;
    }

    public boolean agregar(Estudiantes nuevoEstudiante) {
        if (posAcutal < N) {
            setVectorNotas(posAcutal, nuevoEstudiante);
            posAcutal++;
            return true;
        }

        return false;
    }
    
    public String Definitivas(){
        String lista="Notas definitivas del curso:\n";
        for (int i = 0; i < posAcutal; i++) {
            lista += getVectorNotas(i).getNombres() + " " + getVectorNotas(i).getDefinitiva() + ".\n";
        }
        
        return lista;
    }

    public String ListadoIDReprobados() {
        String lista = "Identificacion de estudiantes reprobados:\n";

        for (int i = 0; i < posAcutal; i++) {
            if (getVectorNotas(i).getDefinitiva() < 3) {
                lista += getVectorNotas(i).getIdentificacion() + "\n";
            }
        }

        return lista;
    }

    public String cantidadAprobados() {
        int cont = 0;

        for (int i = 0; i < posAcutal; i++) {
            if (getVectorNotas(i).getDefinitiva() >= 3) {
                cont++;
            }
        }

        return "Cantidad de estudiantes aprobados: " + cont;
    }

    public String promedioCurso() {
        float prom = 0;
        for (int i = 0; i < posAcutal; i++) {
            prom += getVectorNotas(i).getDefinitiva();
        }
        prom = prom / posAcutal;

        return "EL promedio del curso es: " + prom;
    }

    public String listadoNombresAProbados() {
        String listado = "Nombres de estudiantes aprobados:\n";

        for (int i = 0; i < posAcutal; i++) {
            if (getVectorNotas(i).getDefinitiva() >= 3) {
                listado += getVectorNotas(i).getNombres() + "\n";
            }
        }

        return listado;

    }

    public String CuadroHonor() {
        String lista = "Cuadro de honor del curso: \n";
        Estudiantes aux;
        for (int i = 1; i < posAcutal; i++) {
            for (int j = 0; j < posAcutal - 1; j++) {
                if (getVectorNotas(j).getDefinitiva() < getVectorNotas(j + 1).getDefinitiva()) {
                    aux = getVectorNotas(j);
                    setVectorNotas(j, getVectorNotas(j + 1));
                    setVectorNotas(j + 1, aux);
                }
            }
        }

        if (posAcutal >= 3) {
            lista += getVectorNotas(0).getNombres() + " " + getVectorNotas(0).getApellidos() + ".\n";
            lista += getVectorNotas(1).getNombres() + " " + getVectorNotas(1).getApellidos() + ".\n";
            lista += getVectorNotas(2).getNombres() + " " + getVectorNotas(2).getApellidos() + ".\n";
        }else{
            for (int i = 0; i < posAcutal; i++) {
                lista += getVectorNotas(i).getNombres() + " " + getVectorNotas(i).getApellidos() + ".\n";
            }
        }

        return lista;

    }

    public String NotasMasBajas() {
        String lista = "Las 3 notas mas bajas son: \n";
        
        Estudiantes aux;
        for (int i = 1; i < posAcutal; i++) {
            for (int j = 0; j < posAcutal - 1; j++) {
                if (getVectorNotas(j).getDefinitiva() > getVectorNotas(j + 1).getDefinitiva()) {
                    aux = getVectorNotas(j);
                    setVectorNotas(j, getVectorNotas(j + 1));
                    setVectorNotas(j + 1, aux);
                }
            }
        }

        if (posAcutal >= 3) {
            lista += getVectorNotas(0).getDefinitiva() + "\n";
            lista += getVectorNotas(1).getDefinitiva() + "\n";
            lista += getVectorNotas(2).getDefinitiva() + "\n";
        } else {
            for (int i = 0; i < posAcutal; i++) {
                lista += getVectorNotas(i).getDefinitiva() + "\n";

            }
        }

        return lista;
    }
}
