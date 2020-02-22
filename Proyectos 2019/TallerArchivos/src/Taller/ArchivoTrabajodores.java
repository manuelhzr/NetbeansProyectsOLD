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
import java.util.StringTokenizer;

/**
 *
 * @author manue
 */
public class ArchivoTrabajodores {
    private String rutaArchivo;
    private File archivo;

    public ArchivoTrabajodores(String ruta) {
        this.rutaArchivo =ruta;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }
    
    public void guardarArchivo(trabajador insertar) throws IOException{
        insertar.calcularSalario();
        archivo = new File(getRutaArchivo());
        BufferedWriter escribir;
        if(archivo.exists()){
            escribir =new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(insertar.getNombre()+"\t"+insertar.getHoras()+"\t"+insertar.getSalario());
            escribir.newLine();
        }else{
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(insertar.getNombre()+"\t"+insertar.getHoras()+"\t"+insertar.getSalario());
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
    
    private float promedioSalarios() throws FileNotFoundException, IOException{
        int cont=0;
        float prom=0;
        
        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);
        String linea;

        while ((linea = leer.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(linea, "\t");
            token.nextToken();
            token.nextToken();
            prom+= Float.parseFloat(token.nextToken());
            cont++;
            
        }
        
        return prom/cont;
        
    }
    
    private float salarioMayor() throws FileNotFoundException, IOException{
        
        
        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);
        String linea;
        
        int cont=0;
        while ((linea = leer.readLine()) != null) {
            cont++;
        }
        leer = new BufferedReader(fichero);
        
        float numeros[] = new float[cont];
        
        int c =0;
        while ((linea = leer.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(linea, "\t");
            token.nextToken();
            token.nextToken();
            numeros[c]+= Float.parseFloat(token.nextToken());
            c++;
            
        }
        
        float mayor=0;
        for (int i = 0; i < cont; i++) {
            if (numeros[i]>=mayor) {
                mayor=numeros[i];
            }
        }
        
        return mayor;
        
    }
    
    private float salarioMenor() throws FileNotFoundException, IOException{
        
        
        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);
        String linea;
        
        int cont=0;
        while ((linea = leer.readLine()) != null) {
            cont++;
        }
        leer = new BufferedReader(fichero);
        
        float numeros[] = new float[cont];
        
        int c =0;
        while ((linea = leer.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(linea, "\t");
            token.nextToken();
            token.nextToken();
            numeros[c]+= Float.parseFloat(token.nextToken());
            c++;
            
        }
        
        float menor=numeros[0];
        for (int i = 0; i < cont; i++) {
            if (numeros[i]<=menor) {
                menor=numeros[i];
            }
        }
        
        return menor;
        
    }
    
    public void agregarInfo(informacion archivo) throws FileNotFoundException, IOException{
        archivo.guardarArchivo(String.valueOf(promedioSalarios()), String.valueOf(salarioMayor()) , String.valueOf(salarioMenor()));
    }
    
}
