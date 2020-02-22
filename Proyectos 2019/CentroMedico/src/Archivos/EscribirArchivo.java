/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Nodos.Historial;
import Nodos.Medico;
import Nodos.Paciente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author manue
 */
public class EscribirArchivo {

    private String rutaArchivo;
    private File archivo;

    public EscribirArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public void guardarArchivo(Historial datos) throws IOException {
        archivo = new File(rutaArchivo);
        BufferedWriter escribir;
        if (archivo.exists()) {
            escribir = new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(datos.getFechaCita() + "\t" + datos.getIDPaciente() + "\t" + datos.getIDMedico() + "\t" + datos.getEspecialidadConsulta());
            escribir.newLine();
        } else {
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(datos.getFechaCita() + "\t" + datos.getIDPaciente() + "\t" + datos.getIDMedico() + "\t" + datos.getEspecialidadConsulta());
            escribir.newLine();
        }
        escribir.close();
    }

    public void guardarArchivo(Medico datos) throws IOException {
        archivo = new File(rutaArchivo);
        BufferedWriter escribir;
        if (archivo.exists()) {
            escribir = new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(datos.getID() + "\t" + datos.getNombre() + "\t" + datos.getEspecialidad() + "\t" + datos.getTelefono());
            escribir.newLine();
        } else {
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(datos.getID() + "\t" + datos.getNombre() + "\t" + datos.getEspecialidad() + "\t" + datos.getTelefono());
            escribir.newLine();
        }
        escribir.close();
    }

    public void guardarArchivo(Paciente datos) throws IOException {
        archivo = new File(rutaArchivo);
        BufferedWriter escribir;
        if (archivo.exists()) {
            escribir = new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(datos.getID() + "\t" + datos.getNombre() + "\t" + datos.getEdad() + "\t" + datos.getSexo() + "\t" + datos.getCelular());
            escribir.newLine();
        } else {
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(datos.getID() + "\t" + datos.getNombre() + "\t" + datos.getEdad() + "\t" + datos.getSexo() + "\t" + datos.getCelular());
            escribir.newLine();
        }
        escribir.close();
    }

    public String leerArchivo() throws FileNotFoundException, IOException {
        String linea;
        String verDatosArchivo = "";
        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);
        while ((linea = leer.readLine()) != null) {
            verDatosArchivo += String.valueOf(linea + "\n");
        }
        leer.close();
        return verDatosArchivo;
    }

    public boolean validarID(int id) throws FileNotFoundException, IOException {
        String linea;

        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);

        while ((linea = leer.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(linea, "\t");
            if (token.nextToken().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public String consultarInformacion(int id) throws FileNotFoundException, IOException {
        String linea;

        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);

        while ((linea = leer.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(linea, "\t");
            if (token.nextToken().equals(id)) {
                return linea;
            }
        }
        return "";
    }
    
    public String consultarID(int id) throws FileNotFoundException, IOException {
        String linea;
        String info="";

        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);

        while ((linea = leer.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(linea, "\t");
            if (token.nextToken().equals(id)) {
                info+= linea+"\n";
            }
        }
        return info;
    }

    public String pacientes60() throws FileNotFoundException, IOException {
        String listado = "";
        String linea;

        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);

        while ((linea = leer.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(linea, "\t");
            int edad;
            char sexo;
            token.nextToken();
            token.nextToken();
            edad = Integer.parseInt(token.nextToken());
            sexo = token.nextToken().charAt(0);
            

            if (edad >= 50 && sexo == 'M') {
                listado += linea+"\n";
            }

        }

        return listado;

    }
    
    public String MujeresMayores50() throws FileNotFoundException, IOException {
        String listado = "";
        String linea;

        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);

        while ((linea = leer.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(linea, "\t");
            int edad;
            char sexo;
            token.nextToken();
            token.nextToken();
            edad = Integer.parseInt(token.nextToken());
            sexo= token.nextToken().charAt(0);

            if (edad >= 50 && sexo =='F') {
                listado += linea+"\n";
            }

        }

        return listado;

    }

}
