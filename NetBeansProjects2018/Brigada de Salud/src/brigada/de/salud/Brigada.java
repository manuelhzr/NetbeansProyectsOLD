/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brigada.de.salud;

import java.time.LocalDate;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter; 
import java.io.IOException; 

/**
 *
 * @author manue
 */
public class Brigada {
    private String nombre;
    private String eps;
    private String sexo;
    private LocalDate nacimiento;
    private float peso;
    private float estatura;
    private float glucosa;
    private float hemoglobina;
    
    File archivo;
    private String rutaArchivo;

    public Brigada() {
        rutaArchivo="D:\\Datos.txt";
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(float glucosa) {
        this.glucosa = glucosa;
    }

    public float getHemoglobina() {
        return hemoglobina;
    }

    public void setHemoglobina(float hemoglobina) {
        this.hemoglobina = hemoglobina;
    }
    
    public int edad(){
        LocalDate hoy=LocalDate.now();
        
        return hoy.getYear()-getNacimiento().getYear();
    }
    
    public float IMC(){
        return (float) (getPeso()/Math.pow(getEstatura(), 2));
    }
    
    public String clasificacionIMC(){
        float imc=IMC();
        
        if (imc<16) {
            return "Infrapeso";
        }else{
            if (imc>=16 && imc<25) {
                return "Normal";
            }else{
                if (imc>=25 && imc<30) {
                    return "Sobrepeso";
                }else{
                    return "Obesidad";
                }
            }
        }
    }
    
    public String nivelGlucosa(){
        float g=getGlucosa();
        if (g>=70 && g<=100) {
            return "Optimo";
        }else{
            if (g>100 && g<=125) {
                return "Prediabetes";
            }else{
                return "Diabetico";
            }
        }
    }
    
    public String nivelHemoglobina(){
        float H=getHemoglobina();
        String sex=getSexo();
        
        if (sex.equals("Masculino")) {
            if (H<13) {
                return "Bajo";
            }else{
                if (H>=13 && H<=17) {
                    return "Optimo";
                }else{
                    return "Alto";
                }
            }
        }else{
            if (H<12) {
                return "Bajo";
            }else{
                if (H>=12 && H<=15) {
                    return "Optimo";
                }else{
                    return "Alto";
                }
            }
        }
        
    }
    
    public void guardarDatos() throws IOException {
        String datos="Nombre: "+nombre+"\tEPS: "+eps+"\tSexo: "+sexo+"\tFecha Nac: "+nacimiento.toString()+"\tPeso: "+peso+"\tEstatura: "+estatura+"\tGlucosa: "+glucosa+"\tHemoglobina: "+hemoglobina+"\tEdad: "+edad()+"\tIMC: "+IMC()+"\tClasificacion: "+clasificacionIMC()+"\tNv glucosa: "+nivelGlucosa()+"\tNv Hemoglobina: "+nivelHemoglobina();
        archivo = new File(getRutaArchivo());
        BufferedWriter escribir;
        if (archivo.exists()) {
            escribir = new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(datos);
            escribir.newLine();
        } else {
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(datos);
            escribir.newLine();
        }
        escribir.close();
    }
    
}