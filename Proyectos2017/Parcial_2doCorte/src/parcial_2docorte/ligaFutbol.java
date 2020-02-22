/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_2docorte;

/**
 *
 * @author manue
 */
public class ligaFutbol {
    private Nodo inicio;

    public ligaFutbol() {
        inicio=null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    
    public Nodo ultimoNodo(){
        Nodo temp = getInicio();
            if(temp != null){
                while(temp.getSiguiente() !=  null){
                    temp = temp.getSiguiente();
                }
            }
        return temp;    
    }
    
    public void agregarNodo(Nodo nuevo){
        Nodo temp = ultimoNodo();
        if(temp != null){
            temp.setSiguiente(nuevo);
            nuevo.setAnterior(temp);
            nuevo.setSiguiente(null); 
        }
        else{
        nuevo.setAnterior(null);
        inicio = nuevo;
        }
    }
    
    public void agregarEntreNodos(Nodo nd, Nodo nuevo){
        if(nd.getSiguiente() != null){
            nd.getSiguiente().setAnterior(nuevo);
        }
        nd.setSiguiente(nuevo);
        nuevo.setAnterior(nd);
    }
    
     public Nodo buscarInicio(String nombre){
        Nodo temp = inicio;
        while(temp != null){
            if(temp.getNombre().equals(nombre)){
            break;
        }else{
            temp = temp.getSiguiente();
        }
        }
        return temp;
    }
     
     public Nodo buscarFinal(int identificacion){
        Nodo temp = ultimoNodo();
        while(temp != null){
            if(temp.getIdentificacion()==identificacion){ 
                 break;
            }else{
                temp = temp.getAnterior(); 
            }
        }
        return temp;
    }
     
     public int InformeDelanteros(){
         Nodo aux=inicio;
         int informe=0;
         while(aux!=null){
             if(aux.getCategoria().equals("Infantil") && aux.getPosicion().equals("Delantero") && aux.getMunicipio().equals("Cerete") && aux.getEdad()>10){
                 informe++;
             }
             aux=aux.getSiguiente();
         }
         return informe;
     }
     
     public String informePorteros(){
         Nodo aux=ultimoNodo();
         String informe="";
         int cantSahagun=0, cantLorica=0, cantCerete=0, cantPlanetaRica=0, cantTierralta=0;
         while(aux!=null){
             if(aux.getMunicipio().equals("Sahagun") && aux.getPosicion().equals("Portero") && aux.getCategoria().equals("Junior")){
                 cantSahagun++;
             }
             if(aux.getMunicipio().equals("Lorica") && aux.getPosicion().equals("Portero") && aux.getCategoria().equals("Junior")){
                 cantLorica++;
             }
             if(aux.getMunicipio().equals("Cerete") && aux.getPosicion().equals("Portero") && aux.getCategoria().equals("Junior")){
                 cantCerete++;
             }
             if(aux.getMunicipio().equals("Planeta Rica") && aux.getPosicion().equals("Portero") && aux.getCategoria().equals("Junior")){
                 cantPlanetaRica++;
             }
             if(aux.getMunicipio().equals("Tierralta") && aux.getPosicion().equals("Portero") && aux.getCategoria().equals("Junior")){
                 cantTierralta++;
             }
             aux=aux.getAnterior();
         }
         
         informe+="Sahagun: "+cantSahagun+"\n"
                 + "Lorica: "+cantLorica+"\n"
                 + "Cerete: "+cantCerete+"\n"
                 + "Planeta Rica: "+cantPlanetaRica+"\n"
                 + "Tierralta: "+cantTierralta+"\n";
         
         return informe;
     }
    
}
