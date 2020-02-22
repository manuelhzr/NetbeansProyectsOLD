package Peliculas;

public class Lista {
    private Nodo Cabeza;

    public Lista() {
        this.Cabeza=null;
    }

    public Nodo getCabeza() {
        return Cabeza;
    }

    public void setCabeza(Nodo Cabeza) {
        this.Cabeza = Cabeza;
    }
    
    public boolean ListaLlena(){
        if (this.Cabeza!=null) {
            return true;
        }else{
            return false;
        }
    }
    
    public Nodo UltimoNodo(){
        Nodo temp= this.Cabeza;
        while(temp != null){
            if(temp.getSiguiente()==null){
                break;
            }else{
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public void Agregar(Nodo nuevo){
        if(this.Cabeza==null){
            setCabeza(nuevo);
        }else{
            UltimoNodo().setSiguiente(nuevo);
        }
    }
    
    public void CrearLista(String Titulo[], int Puntuacion[]){
        Nodo Aux;
        for (int i = 0; i < 50; i++) {
            if (Puntuacion[i]!=0) {
                Aux=new Nodo();
                Aux.setPosicion(i);
                Aux.setPuntuacion(Puntuacion[i]);
                Aux.setTitulo(Titulo[i]);
                
                Agregar(Aux);
                
            }
        }
    }
    
}
