/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author manue
 */
public class informacion {
    private String rutaArchivo;
    private File archivo;

    public informacion(String ruta) {
        this.rutaArchivo =ruta;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }
    
    public void guardarArchivo(String Promedio, String mayorSalario, String menorSalario) throws IOException{
        String datos=menorSalario+"\n"+Promedio+"\n"+mayorSalario;
        archivo = new File(getRutaArchivo());
        BufferedWriter escribir;
        if(archivo.exists()){
            escribir =new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(datos);
            escribir.newLine();
        }else{
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(datos);
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
}
