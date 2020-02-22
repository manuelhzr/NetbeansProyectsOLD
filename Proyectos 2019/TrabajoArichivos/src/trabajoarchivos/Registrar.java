


package trabajoarchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;



public class Registrar {
    private String rutaArchivo;
    private File archivo;

    public Registrar(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }
    
    public void guardarArchivo(estudiantes estudiante) throws IOException{
        
        archivo = new File(getRutaArchivo());
        BufferedWriter escribir;
        if(archivo.exists()){
            escribir =new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(estudiante.getNombre()+"\t"+estudiante.getApellido()+"\t"+estudiante.getId()+"\n"+estudiante.getTelefono());
            escribir.newLine();
        }else{
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(estudiante.getNombre()+"\t"+estudiante.getApellido()+"\t"+estudiante.getId()+"\n"+estudiante.getTelefono());
            escribir.newLine();
        }
        escribir.close();
    }
    
    
    
    public void guardarArchivo(materias materia) throws IOException{
        
        archivo = new File(getRutaArchivo());
        BufferedWriter escribir;
        if(archivo.exists()){
            escribir =new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(materia.getHorario()+"\t"+materia.getNombre()+"\t"+materia.getHorario());
            escribir.newLine();
        }else{
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(materia.getHorario()+"\t"+materia.getNombre()+"\t"+materia.getHorario());
            escribir.newLine();
        }
        escribir.close();
    }
    
    public String LeerDatos() throws FileNotFoundException, IOException{
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
    
    public String BuscarID(int id) throws FileNotFoundException, IOException{
        String linea;
        String verDatosArchivo="";
        FileReader fichero =new FileReader(rutaArchivo);
        BufferedReader leer=new BufferedReader(fichero);
        while((linea = leer.readLine())!=null){
            StringTokenizer token = new StringTokenizer(linea, "\t");
            if (token.nextToken().equals(String.valueOf(id))) {
                verDatosArchivo += String.valueOf(linea+"\n");
            }
            
        }
        leer.close();
        return verDatosArchivo;
    }
      
}
