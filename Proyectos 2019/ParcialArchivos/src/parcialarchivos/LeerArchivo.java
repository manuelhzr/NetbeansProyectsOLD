/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialarchivos;

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
 * @author JP
 */
public class LeerArchivo {

    private String rutaArchivo;
    private File archivo;

    public LeerArchivo(String nombreArchivo) {
        this.rutaArchivo = nombreArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public void guardarArchivo(String datos) throws IOException {
        archivo = new File(rutaArchivo);
        BufferedWriter escribir;
        if (archivo.exists()) {
            escribir = new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(datos);
        } else {
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(datos);
        }
        escribir.close();
    }
    
    public String leerArchivo() throws FileNotFoundException, IOException{
        String linea;
        String verDatosArchivo="";
        FileReader fichero =new FileReader(rutaArchivo);
        BufferedReader leer=new BufferedReader(fichero);
        while((linea = leer.readLine())!=null){
            verDatosArchivo += String.valueOf(linea+"\n");
        }
        leer.close();
        return verDatosArchivo;
    }

    public Pila apilarDatos(float tiempo, float velocidad) throws FileNotFoundException, IOException {
        String linea;
        Pila pila = new Pila();
        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);
        while ((linea = leer.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(linea, "***");
            Competencia actual = new Competencia(tokenizer.nextToken(),
                    Integer.parseInt(tokenizer.nextToken()),
                    Float.parseFloat(tokenizer.nextToken()));

            if (actual.getTiempo() > tiempo && actual.getVelocidad() < velocidad) {
                pila.agregar(actual);
            }

        }
        leer.close();
        return pila;
    }

    public void Reporte(LeerArchivo reporte) throws FileNotFoundException, IOException {
        float tiempo = 10000;
        float velocidad = 0;
        Competencia menorTiempo = null;
        Competencia mayorVelocidad = null;
        String linea;
        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);
        while ((linea = leer.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(linea, "***");
            Competencia actual = new Competencia(tokenizer.nextToken(),
                    Integer.parseInt(tokenizer.nextToken()),
                    Float.parseFloat(tokenizer.nextToken()));

            if (actual.getTiempo() < tiempo) {
                tiempo = actual.getTiempo();
                menorTiempo = actual;
            }

            if (actual.getVelocidad() > velocidad) {
                velocidad = actual.getVelocidad();
                mayorVelocidad = actual;
            }

        }
        leer.close();

        if (menorTiempo != null) {
            String datos = menorTiempo.getCompetencia() + "***" + menorTiempo.getDistancia() + "***" + menorTiempo.getTiempo()+"\n";
            reporte.guardarArchivo(datos);
        }
        
        if (mayorVelocidad != null) {
            String datos2 = mayorVelocidad.getCompetencia() + "***" + mayorVelocidad.getDistancia() + "***" + mayorVelocidad.getTiempo()+"\n";
            reporte.guardarArchivo(datos2);
        }

    }

}
