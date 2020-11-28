package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LeerArchivo {

    private final String RUTA_ARCHIVO = "src\\Archivos\\personas.txt";
    private File archivo;

    public List<Persona> leerArchivo() throws FileNotFoundException, IOException {
        String linea;
        List<Persona> datosPersonas = new ArrayList<>();
        FileReader fichero = new FileReader(RUTA_ARCHIVO);
        BufferedReader leer = new BufferedReader(fichero);
        while ((linea = leer.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linea, "-");
            int id = Integer.parseInt(st.nextToken());
            String nombre = st.nextToken();
            String Sexo = st.nextToken();
            String eps = st.nextToken();
            String fecha = st.nextToken();

            datosPersonas.add(new Persona(id, nombre, Sexo, eps, fecha));
        }
        leer.close();
        return datosPersonas;
    }

    public String leerNodo(Persona actual) {
        return actual.getId() + "-" + actual.getNombre() + "-" + actual.getSexo() + "-" + actual.getEps() + "-" + actual.getFecha();
    }

    public boolean guardarArchivo(Persona Nodo) throws IOException {
        if (!IDExiste(Nodo.getId())) {
            String datos = leerNodo(Nodo);
            archivo = new File(RUTA_ARCHIVO);
            BufferedWriter escribir;
            if (archivo.exists()) {
                escribir = new BufferedWriter(new FileWriter(archivo, true));
                escribir.write(datos);
            } else {
                escribir = new BufferedWriter(new FileWriter(archivo));
                escribir.write(datos);
            }
            escribir.close();
            return true;
        }
        return false;
    }

    private boolean IDExiste(int id) throws FileNotFoundException, IOException {
        String linea;
        FileReader fichero = new FileReader(RUTA_ARCHIVO);
        BufferedReader leer = new BufferedReader(fichero);
        while ((linea = leer.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linea, "-");
            if (String.valueOf(id).equals(st.nextToken())) {
                return true;
            }
        }
        leer.close();
        return false;
    }

    public Persona buscarPersona(int identificacion) throws IOException {
        String linea;
        FileReader fichero = new FileReader(RUTA_ARCHIVO);
        BufferedReader leer = new BufferedReader(fichero);
        while ((linea = leer.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linea, "-");
            int id = Integer.parseInt(st.nextToken());
            String nombre = st.nextToken();
            String Sexo = st.nextToken();
            String eps = st.nextToken();
            String fecha = st.nextToken();

            if (id == identificacion) {
                leer.close();
                return new Persona(id, nombre, Sexo, eps, fecha);
            }
        }
        leer.close();
        return null;
    }
}
