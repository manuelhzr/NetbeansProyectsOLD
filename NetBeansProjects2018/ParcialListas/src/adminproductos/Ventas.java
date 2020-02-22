
package adminproductos;

import javax.swing.JOptionPane;

public class Ventas {
    private Nodo cabeza;
    private float total;
    private String lista="";

    public Ventas() {
        cabeza=null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }
    
    public Nodo Ultimo(){
        Nodo temp= getCabeza();
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
    
    public int contarNodos(){
        int Contador =0;
        Nodo temp= cabeza;
        while(temp != null){
            Contador ++;
            temp=temp.getSiguiente();
        }
        return Contador;
    }
    
    public String[] listar(){
        String[] lista =new String[contarNodos()];
        int pos=0;
       Nodo temp=getCabeza();
       while(temp!=null){
           lista[pos]=temp.getNombre();
           pos++;
           temp=temp.getSiguiente();
       }
       return lista;
    }
    
    public Nodo buscar(String prod){
        Nodo temp= cabeza;
        Nodo res=null;
        while(temp != null){
            if(temp.getNombre().equals(prod)){
                res=temp;
                break;
            }else{
                temp= temp.getSiguiente();
            }
        }
        return res;
    }
    
    public boolean Comprar(){
        String productos[]=listar();
        String res = JOptionPane.showInputDialog(null, "Seleccione el prodcuto a comprar", "Comprar", 0, null, productos, productos[0]).toString();
        Nodo prod=buscar(res);
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a comprar"));
        boolean r;
        if (prod!=null) {
            if (prod.getStock()>=cant) {
                setTotal(getTotal()+(cant*prod.getPrecio()));
                prod.setStock(prod.getStock()-cant);
                setLista(getLista()+"| "+prod+" | "+cant+" | "+(cant*prod.getPrecio())+" |\n");
                r= true;
            }else{
                r= false;
            }
        }else{
            r= false;
        }
        return r;
    }
    
    
    public void eliminar(Nodo nd){
        Nodo anterior;
        if(nd==cabeza){
            cabeza = cabeza.getSiguiente();
        }else{
            anterior=cabeza;
            while(anterior.getSiguiente() != nd){
                anterior = anterior.getSiguiente();
            }
            anterior.setSiguiente(nd.getSiguiente());
        }
        nd.setSiguiente(null);
    }
    
    
}
