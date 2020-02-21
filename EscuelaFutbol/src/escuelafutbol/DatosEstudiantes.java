/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelafutbol;

/**
 *
 * @author manuel
 */
public class DatosEstudiantes {
    private int[] id;
    private String [] nombre;
    private int[] edad;
    private String[] posicion;
    private int tam;

    public DatosEstudiantes(int tamaño) {
        this.tam = tamaño;
        id = new int[tamaño];
        nombre = new String[tamaño];
        edad = new int[tamaño];
        posicion = new String[tamaño];
    }

    public int getId(int pos) {
        return id[pos];
    }

    public void setId(int pos, int identificacion) {
        this.id[pos] = identificacion;
    }

    public String getNombre(int pos) {
        return nombre[pos];
    }

    public void setNombre(int pos, String nombre) {
        this.nombre[pos] = nombre;
    }

    public int getEdad(int pos) {
        return edad[pos];
    }

    public void setEdad(int pos, int edad) {
        this.edad[pos] = edad;
    }

    public String getPosicion(int pos) {
        return posicion[pos];
    }

    public void setPosicion(int pos, String posicion) {
        this.posicion[pos] = posicion;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
    public String Categorias(){
        String listaEstudiantes="Categoria Infantil:\n";
        for (int i = 0; i < getTam(); i++) {
            if (getEdad(i)<=12) {
                listaEstudiantes+=getNombre(i)+"\n";
            }
        }
        
        listaEstudiantes+="\nCategoria Junior:\n";
        for (int i = 0; i < getTam(); i++) {
            if (getEdad(i)>=13) {
                listaEstudiantes+=getNombre(i)+"\n";
            }
        }
        return listaEstudiantes;
    }
    
    public float promedioCatInfantil(){
        float prom=0;
        int cont=0;
        for (int i = 0; i < getTam(); i++) {
            if (getEdad(i)<=12 && getPosicion(i).equals("Defensa")) {
                prom+=getEdad(i);
                cont++;
            }
        }
        return (float) (prom/cont);
    }
    
    private int menorEdad(){
        int menor=getEdad(0);
        
        for (int i = 0; i < getTam(); i++) {
            if (getEdad(i)<=menor) {
                menor=getEdad(i);
            }
        }
        return menor;
    }
    
    public String jugadorMenor(){
        int menor=menorEdad();
        String datos="";
        for (int i = 0; i < getTam(); i++) {
            if (getEdad(i)==menor) {
                datos+="Nombre: "+getNombre(i)+" Posicion: "+getPosicion(i)+"\n";
            }
        }
        return datos;
    }
    
    public int cantidadDelanteros(){
        int cant=0;
        for (int i = 0; i < getTam(); i++) {
            if (getPosicion(i).equals("Delantero")) {
                cant++;
            }
        }
        return cant;
    }
    
    public String informacionDelanteros(){
        String informacion="";
        for (int i = 0; i < getTam(); i++) {
            if (getPosicion(i).equals("Delantero")) {
                informacion+="Nombre: "+getNombre(i)+" Identificacion: "+getId(i)+" Edad: "+getEdad(i)+"\n";
            }
        }
        return informacion;
    }
       
    
}
