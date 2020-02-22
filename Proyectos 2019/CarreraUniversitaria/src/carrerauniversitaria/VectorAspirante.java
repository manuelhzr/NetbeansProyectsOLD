/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrerauniversitaria;

/**
 *
 * @author Diego
 */
public class VectorAspirante {
    private int tam;
    private Aspirante[] arregloAspirantes;

    public VectorAspirante(int tam) {
        this.tam = tam;
        this. arregloAspirantes= new Aspirante[tam];
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public Aspirante getArregloAspirantes(int pos) {
        return arregloAspirantes[pos];
    }

    public void setArregloAspirantes(int pos, Aspirante arregloAspirantes) {
        this.arregloAspirantes[pos] = arregloAspirantes;
    }
    
    public boolean validarAdmitido(int pos){
        String carrera= arregloAspirantes[pos].getCarrera();
        int puntaje = arregloAspirantes[pos].getPuntaje();
        if (puntaje >= 370 && (carrera.equals("Ingenieria de Sistemas") || carrera.equals("Ingenieria Industrial") || carrera.equals("Ingenieria Mecanica") || carrera.equals("Ingenieria Ambiental") || carrera.equals("Ingenieria Agronomica"))) {
            return true;            
        }else if (puntaje >=340 &&(carrera.equals("Licenciatura en Educacion Artistica") || carrera.equals("Licenciatura en Educacion Infantil") || carrera.equals("Licenciatura en Lenguas Extranjeras") || carrera.equals("Licenciatura en Informativa") || carrera.equals("Licenciatura en Educacion Fisica") || carrera.equals("Licenciatura en Ciencias Sociales") ||carrera.equals("Licenciatura en Ciencias Naturales"))) {
            return true;
        }else if (puntaje>=300 &&(carrera.equals("Quimica") || carrera.equals("Matematicas") || carrera.equals("Geografia") || carrera.equals("Estadistica") || carrera.equals("Derecho") || carrera.equals("Fisica") || carrera.equals("Acuicultura") || carrera.equals("Biologia") || carrera.equals("Bacteriologia") || carrera.equals("Enfermeria")) ) {
            return true;
        }else if (puntaje >= 310 && (carrera.equals("Administracion en Finanzas y Negocios Internacionales") || carrera.equals("Tecnologia en Regencia de Farmacia"))) {
            return true;
        }else return false;
    }
    
    public void RegistroAdmitidos(int pos, int identificacion, String nombre,int edad,String institucion){
        arregloAspirantes[pos].setIdentificacion(identificacion);
        arregloAspirantes[pos].setNombre(nombre);
        arregloAspirantes[pos].setEdad(edad);
        arregloAspirantes[pos].setInstitucion(institucion);
    }
    
    public int EstudiantesCarrera(String carrera){
        int cantidad=0;
        for (int i = 0; i < tam; i++) {
            if (arregloAspirantes[i].getCarrera().equals(carrera)) {
                cantidad++;
            }
        }
        return cantidad;
    }
    
}
