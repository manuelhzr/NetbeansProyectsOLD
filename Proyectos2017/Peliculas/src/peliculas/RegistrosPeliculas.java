
package peliculas;


public class RegistrosPeliculas {
    public Nodo cabeza;

    public RegistrosPeliculas() {
        cabeza=null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    
    public Nodo Ultimo(){
        Nodo temp= cabeza;
        while(temp != null){
            if(temp.getSiguiente()==null){
                break;
            }else{
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public void agregar(Nodo nuevo){
        if(cabeza==null){
            setCabeza(nuevo);
        }else{
            Ultimo().setSiguiente(nuevo);
        }
    }
    
    public Nodo Buscar(String dato){
        Nodo temp= cabeza;
        while(temp != null){
            if(temp.getIdPelicula().equals(dato)){
                break;
            }else{
                temp= temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public float promedio(){
        Nodo temp=cabeza;
        float promedio=0;
        int divisor=0;
        while(temp!=null){
            promedio+=temp.getDuracion();
            divisor++;
            temp=temp.getSiguiente();
        }
        promedio=promedio/divisor;
        return promedio;
    }
    
    public String MayorDuracion(){
        Nodo temp=cabeza;
        String lista="";
        float Prom= promedio();
        while(temp!=null){
            if(temp.getDuracion()>Prom){
                lista+="Nombre de la Pelicula: "+temp.getNombrePelicula()+"\n"
                        + "ID de la Pelicula: "+temp.getIdPelicula()+"\n"
                        + "Duracion: "+temp.getDuracion()+"\n"
                        + "Genero: "+temp.getGenero()+"\n\n";
            }
        }
        return lista;
    }
    
    
    
}
