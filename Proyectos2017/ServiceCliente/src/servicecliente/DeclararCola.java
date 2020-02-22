
package servicecliente;


public class DeclararCola {
    private int totalNodos;
    private Cliente frente;
    private Cliente finalCola;
    
    
    public void DeclararCola(){
        totalNodos=0;
        frente=null;
        finalCola=null;
    }

    public int getTotalNodos() {
        return totalNodos;
    }

    public Cliente getFrente() {
        return frente;
    }
    public Cliente getFinal(){
        return finalCola;
    }
     public boolean colaVacia(){
     if(getTotalNodos() == 0){
      return true;
            }else{
         return false;
                   }
     }
    
     
    public void agregar(String nom , int id){
        Cliente temp = new Cliente();
        temp.setId(id);
        temp.setNombre(nom);
     if(getFrente()==null){
         frente= temp;
         
     }  else{
         getFinal().setSiguiente(temp);
     } 
     finalCola= temp;
     totalNodos= totalNodos+1;
    }
    
    public void quitar(){
        
        if(!colaVacia()){
            frente = getFrente().getSiguiente();
            if(getFrente()==null){
                finalCola=null;
            }
            totalNodos= totalNodos-1;
        }   
    }
    
}
