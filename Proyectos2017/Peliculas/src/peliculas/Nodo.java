/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas;


public class Nodo {
    
  public String idPelicula;
  public String NombrePelicula;
  public float Duracion;
  public String Genero;
  public Nodo Siguiente;

    public Nodo() {
        idPelicula="";
        NombrePelicula="";
        Duracion=0;
        Genero="";
        Siguiente=null;
    }

    public String getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(String idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombrePelicula() {
        return NombrePelicula;
    }

    public void setNombrePelicula(String NombrePelicula) {
        this.NombrePelicula = NombrePelicula;
    }

    public float getDuracion() {
        return Duracion;
    }

    public void setDuracion(float Duracion) {
        this.Duracion = Duracion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
  
  
}
