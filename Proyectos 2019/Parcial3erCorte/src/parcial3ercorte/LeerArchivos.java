/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3ercorte;

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
 * @author omar
 */
public class LeerArchivos {
    private String rutaArchivo;
    private File archivo;

    public LeerArchivos(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }
    
    
    
    private void guardarArchivo(Competencia nuevo) throws IOException{
        archivo = new File(getRutaArchivo());
        BufferedWriter escribir;
        if(archivo.exists()){
            escribir =new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(nuevo.getCompetencia()+"***"+nuevo.getDistancia()+"***"+nuevo.getTiempo()+"***"+nuevo.getVelocidad());
            escribir.newLine();
        }else{
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(nuevo.getCompetencia()+"***"+nuevo.getDistancia()+"***"+nuevo.getTiempo()+"***"+nuevo.getVelocidad());
            escribir.newLine();
        }
        escribir.close();
    }
    
    public void guardarArchivo(String nuevo) throws IOException{
        archivo = new File(getRutaArchivo());
        BufferedWriter escribir;
        if(archivo.exists()){
            escribir =new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(nuevo);
            escribir.newLine();
        }else{
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(nuevo);
            escribir.newLine();
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
    
    public void GuardarCompetencias(LeerArchivos archivoOBJ) throws FileNotFoundException, IOException{
        String linea;
        FileReader fichero =new FileReader(rutaArchivo);
        BufferedReader leer=new BufferedReader(fichero);
        while((linea = leer.readLine())!=null){
            StringTokenizer token = new StringTokenizer(linea, "***");
            Competencia aux = new Competencia(token.nextToken(), Float.parseFloat(token.nextToken()), Float.parseFloat(token.nextToken()), Float.parseFloat(token.nextToken()));
            archivoOBJ.guardarArchivo(aux);
        }
        leer.close();
    }
    
    public void MenorDuracion( LeerArchivos archivoReporte) throws FileNotFoundException, IOException{
        String linea;
        float menor=100000;
        FileReader fichero =new FileReader(rutaArchivo);
        BufferedReader leer=new BufferedReader(fichero);
        while((linea = leer.readLine())!=null){
            StringTokenizer token = new StringTokenizer(linea, "***");
            token.nextToken();
            token.nextToken();
            float aux = Float.parseFloat(token.nextToken());
            if (aux< menor) {
                menor= aux;
            }
        }
        leer.close();
        archivoReporte.guardarArchivo(String.valueOf(menor));
    }
    
    public void MayorVelocidad( LeerArchivos archivoReporte) throws FileNotFoundException, IOException{
        String linea;
        float mayor=10;
        FileReader fichero =new FileReader(rutaArchivo);
        BufferedReader leer=new BufferedReader(fichero);
        while((linea = leer.readLine())!=null){
            StringTokenizer token = new StringTokenizer(linea, "***");
            token.nextToken();
            token.nextToken();
            token.nextToken();
            float aux = Float.parseFloat(token.nextToken());
            if (aux> mayor) {
                mayor= aux;
            }
        }
        leer.close();
        archivoReporte.guardarArchivo(String.valueOf(mayor));
    }

    
}
