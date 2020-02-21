/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
    
    private String leerPila(Pila pila){
        String datos="";
        Pelicula actual= pila.getTope();
        while(actual != null){
            //Pelicula actual= pila.getTope();
            datos+=actual.getNombre()+"***"+actual.getGenero()+"***"+actual.getDuracion()+"***"+actual.getPrecio()+"***"+actual.getValoracion();
            actual = actual.getSiguiente();
            if (actual!=null) {
                datos+="\n";
            }
        }
        return datos;
    }
    
    public void guardarArchivo(Pila pila) throws IOException {
        String datos = leerPila(pila);
        archivo = new File(rutaArchivo);
        BufferedWriter escribir;
        if (archivo.exists()) {
            escribir = new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(datos);
        }else{
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(datos);
        }
        escribir.close();
    }
    
    public Pila CrearPila() throws FileNotFoundException, IOException{
        Pila nueva = new Pila();
        
        String linea;
        FileReader fichero =new FileReader(rutaArchivo);
        BufferedReader leer=new BufferedReader(fichero);
        while((linea = leer.readLine())!=null){
            StringTokenizer tokenizer = new StringTokenizer(linea, "***");
            String nombre = tokenizer.nextToken();
            String genero = tokenizer.nextToken();
            int duracion = Integer.parseInt(tokenizer.nextToken());
            int precio = Integer.parseInt(tokenizer.nextToken());
            int valoracion = Integer.parseInt(tokenizer.nextToken());
            
            nueva.agregar(new Pelicula(nombre, genero, duracion, precio, valoracion));
            
        }
        leer.close();
        
        return nueva;
    }
    
}
