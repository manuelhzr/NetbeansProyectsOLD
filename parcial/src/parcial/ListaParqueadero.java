/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author JP
 */
public class ListaParqueadero {

    private Modelo cabeza;
    private final int totalNodos = 10;

    public ListaParqueadero() {
        this.cabeza = null;
    }

    public Modelo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Modelo cabeza) {
        this.cabeza = cabeza;
    }

    private Modelo Ultimo() {
        Modelo temp = cabeza;
        while (temp != null) {
            if (temp.getSiguiente() == null) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }

    private int contarNodos() {
        int Contador = 0;
        Modelo temp = cabeza;
        while (temp != null) {
            Contador++;
            temp = temp.getSiguiente();
        }
        return Contador;
    }

    public boolean agregar(Modelo nuevo) {
        if (contarNodos() <= totalNodos) {
            if (cabeza == null) {
                setCabeza(nuevo);
            } else {
                Ultimo().setSiguiente(nuevo);
            }
            return true;
        }
        
        return false;
    }
    
    public Modelo buscar(int maatricula){
        Modelo temp= cabeza;
        while(temp != null){
            if(temp.getNumMatricula() == maatricula){
                break;
            }else{
                temp= temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public int numeroAvance(Modelo auto){
        Modelo aux = cabeza;
        int cont =0;
        while(aux!=null){
            cont++;
            if (aux == auto) {
                break;
            }
            aux=aux.getSiguiente();
        }
        if (cont<=10) {
            return cont;
        }else{
            return 0;
        }
    }
    
   public void eliminar(Modelo auto){
        Modelo anterior;
        if(auto==cabeza){
            cabeza = cabeza.getSiguiente();
        }else{
            anterior=cabeza;
            while(anterior.getSiguiente() != auto){
                anterior = anterior.getSiguiente();
            }
            anterior.setSiguiente(auto.getSiguiente());
        }
        auto.setSiguiente(null);
    }
   
   public String colaActual(){
       Modelo aux= cabeza;
       String datos="";
       while(aux != null){
           datos+="Matricula: "+aux.getNumMatricula()+"\n"
                + "Tipo de Coche: "+aux.getTipoCoche()+"\n\n";
           aux=aux.getSiguiente();
       }
       return datos;
   }

}
