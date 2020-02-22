/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_3ercorte;

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
public class Pacientes {
    private String rutaArchivo;
    private int ped=0, rad=0, gin=0;
    File archivo;

    public Pacientes() {
        rutaArchivo="";
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }
    
    public void guardarArchivo(String identificacion, String nombre, String especialidad) throws IOException{
        contarPacientes(especialidad);
        archivo = new File(getRutaArchivo());
        BufferedWriter escribir;
        if(archivo.exists()){
            escribir =new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(especialidad+" "+identificacion+" "+nombre);
            escribir.newLine();
        }else{
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(especialidad+" "+identificacion+" "+nombre);
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
    
    public void contarPacientes(String esp){
        if(esp.equals("Pediatria")){
             ped++;
        }else{
            if(esp.equals("Radiografia")){
                rad++;
            }else{
                if(esp.equals("Ginecologia")){
                    gin++;
                }
            }
        }           
    }
    
    public String listado(){
        String lista="";
        lista+= "Pediatria: "+ped+"\n";
        lista+="Radiografia: "+rad+"\n";
        lista+="Ginecologia: "+gin+"\n";
        
        return lista;
        
    }
    
    
}
