/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_2;

/**
 *
 * @author manue
 */
public class ProgramaDepartamental {
    private Nodo cabeza;

    public ProgramaDepartamental() {
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
    
    public void agregarEntre(Nodo existente, Nodo Nuevo){
       Nuevo.setSiguiente(existente.getSiguiente());
       existente.setSiguiente(Nuevo);
   }
    
    public void agregarCabeza(Nodo nuevo){
       nuevo.setSiguiente(cabeza);
       setCabeza(nuevo);
   }
    
    public Nodo Buscar(int dato){
        Nodo temp= cabeza;
        while(temp != null){
            if(temp.getNumeroRegistro() == dato){
                break;
            }else{
                temp= temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public Nodo Buscar(String dato){
        Nodo temp= cabeza;
        while(temp != null){
            if(temp.getNombre().equals(dato)){
                break;
            }else{
                temp= temp.getSiguiente();
            }
        }
        return temp;
    }
    
     public void Ordenar(){
        Nodo temp1 = cabeza;
        Nodo temp2= temp1.getSiguiente();
        
        while(temp2!=null){
            if(temp1.getPeso()<temp2.getPeso()){
                agregarEntre(temp2, temp1);
                Eliminar(temp1);
                
            }
            temp1=temp2;
            temp2=temp2.getSiguiente();
        }
    }
     
     public void Eliminar(Nodo nd){
        Nodo temp=nd;
        Nodo anterior;
        if(temp==cabeza){
            cabeza = cabeza.getSiguiente();
        }else{
            anterior=cabeza;
            while(anterior.getSiguiente() != temp){
                anterior = anterior.getSiguiente();
            }
            anterior.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(null);
        }
        
    }
   
     public String ListadoMunicipios(){
         String Listado="", Sahagun="", Monteria="", Lorica="";
         int cantSahagun=0, cantMonteria=0, cantLorica=0;
         Nodo temp=cabeza;
         while(temp!=null){
            
                 if (temp.getMunicipio().equals("Sahagun")) {
                     cantSahagun++;
                     Sahagun += "Nombre: "+temp.getNombre() +"\n"
                             + "Numero de registro: " + temp.getNumeroRegistro() + "\n"
                             + "Edad: " + temp.getEdad() + "\n"
                             + "Peso: " + temp.getPeso() + "\n"
                             + "Talla: " + temp.getTalla() + "\n\n";
                 }
                 if (temp.getMunicipio().equals("Monteria")) {
                     cantMonteria++;
                     Monteria += "Nombre: "+temp.getNombre() +"\n"
                             + "Numero de registro: " + temp.getNumeroRegistro() + "\n"
                             + "Edad: " + temp.getEdad() + "\n"
                             + "Peso: " + temp.getPeso() + "\n"
                             + "Talla: " + temp.getTalla() + "\n\n";
                 }
                 if (temp.getMunicipio().equals("Lorica")) {
                     cantLorica++;
                     Lorica += "Nombre: "+temp.getNombre() +"\n"
                             + "Numero de registro: " + temp.getNumeroRegistro() + "\n"
                             + "Edad: " + temp.getEdad() + "\n"
                             + "Peso: " + temp.getPeso() + "\n"
                             + "Talla: " + temp.getTalla() + "\n\n";
                 }                 
             
             temp = temp.getSiguiente();
         }
             
         Listado+="Sahagun:\n Numero de niños: "+cantSahagun+"\n Listado: \n"+Sahagun;
         Listado+="\nMonteria:\n Numero de niños: "+cantMonteria+"\n Listado: \n"+Monteria;
         Listado+="\nLorica:\n Numero de niños: "+cantLorica+"\n Listado: \n"+Lorica;
         
         return Listado;
     }
     
     public String ListadoBajosPeso(){
         String Listado = "", Sahagun = "", Monteria = "", Lorica = "";
         int cantSahagun = 0, cantMonteria = 0, cantLorica = 0;
         Nodo temp = cabeza;
         while (temp != null) {
             if ((temp.getEdad() >= 2 && temp.getEdad() <= 3 && temp.getPeso() < 15) || (temp.getEdad() >= 4 && temp.getEdad() <= 6 && temp.getPeso() < 25)) {
                 if (temp.getMunicipio().equals("Sahagun")) {
                     cantSahagun++;
                     Sahagun += "Nombre: "+temp.getNombre() +"\n"
                             + "Numero de registro: " + temp.getNumeroRegistro() + "\n"
                             + "Edad: " + temp.getEdad() + "\n"
                             + "Peso: " + temp.getPeso() + "\n"
                             + "Talla: " + temp.getTalla() + "\n\n";
                 }
                 if (temp.getMunicipio().equals("Monteria")) {
                     cantMonteria++;
                     Monteria += "Nombre: "+temp.getNombre() +"\n"
                             + "Numero de registro: " + temp.getNumeroRegistro() + "\n"
                             + "Edad: " + temp.getEdad() + "\n"
                             + "Peso: " + temp.getPeso() + "\n"
                             + "Talla: " + temp.getTalla() + "\n\n";
                 }
                 if (temp.getMunicipio().equals("Lorica")) {
                     cantLorica++;
                     Lorica += "Nombre: "+temp.getNombre() +"\n"
                             + "Numero de registro: " + temp.getNumeroRegistro() + "\n"
                             + "Edad: " + temp.getEdad() + "\n"
                             + "Peso: " + temp.getPeso() + "\n"
                             + "Talla: " + temp.getTalla() + "\n\n";
                 }

             }
             temp = temp.getSiguiente();
         }
         Listado+="Sahagun:\n Numero de niños: "+cantSahagun+"\n Listado: \n"+Sahagun;
         Listado+="\nMonteria:\n Numero de niños: "+cantMonteria+"\n Listado: \n"+Monteria;
         Listado+="\nLorica:\n Numero de niños: "+cantLorica+"\n Listado: \n"+Lorica;
         
         return Listado;
     } 
     
     public String BajosTalla(){
         Nodo temp=cabeza;
         String lista;
         int cantSahagun=0, cantMonteria=0, cantLorica=0;
         while(temp!=null){
             if(temp.getEdad()>=4 && temp.getEdad()<=6 && temp.getTalla() <1){
                 if(temp.getMunicipio().equals("Sahagun")){
                     cantSahagun++;
                 }
                 if(temp.getMunicipio().equals("Monteria")){
                     cantMonteria++;
                 }
                 if(temp.getMunicipio().equals("Lorica")){
                     cantLorica++;
                 }
                 
             }
             temp=temp.getSiguiente();
         }
         lista="Sahagun: "+cantSahagun+"\nMonteria: "+cantMonteria+"\nLorica: "+cantLorica;
         return lista;
     }
     
     public boolean validarRepresentante(String nombre){
         Nodo temp=cabeza;
         int cont=0;
         boolean valido;
         while(temp!=null){
             if(temp.getNombre().equals(nombre)){
                 cont ++;
             }
             temp=temp.getSiguiente();
         }
         valido = cont <= 2;
         return valido;
     }
     
     public String ListadoOrdenado(){
         Nodo temp = cabeza;
         String listado = "";
         while (temp != null) {
             listado += "Edad: " + temp.getEdad() + "\n"
                     + "Nombre: " + temp.getNombre() + "\n"
                     + "Numero de registro: " + temp.getNumeroRegistro() + "\n" 
                     + "Peso: " + temp.getPeso() + "\n"
                     + "Talla: " + temp.getTalla() + "\n\n";
             temp = temp.getSiguiente();
         }
         return listado;
     }
    
}
