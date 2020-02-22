/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivospractiva;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

 /*
 * @author manue
 */
public class LeerEscribirArchivo {
    private String rutaArchivo;
    File archivo;

    public LeerEscribirArchivo() {
        rutaArchivo="";
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }
    
    public void guardarArchivo(String dato) throws IOException{
        archivo = new File(getRutaArchivo());
        BufferedWriter escribir;
        if(archivo.exists()){
            escribir =new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(dato);
            escribir.newLine();
        }else{
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(dato);
            escribir.newLine();
        }
        escribir.close();
    }
    
    public String leerArchivo(String rutaArchivo) throws FileNotFoundException, IOException{
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
    
    public int cantidadLineasArchivo() throws FileNotFoundException, IOException{
        int numeroLinea=0;
        String linea;
        FileReader fichero =new FileReader(getRutaArchivo());
        BufferedReader leer =new BufferedReader(fichero);
        while((linea = leer.readLine())!= null){
            numeroLinea++;
        }
        return numeroLinea;
    }
    
}
