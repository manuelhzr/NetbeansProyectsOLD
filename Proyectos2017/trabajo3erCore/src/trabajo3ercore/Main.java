/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo3ercore;

import javax.swing.JOptionPane;
 
/**
 *
 * @author manue
 */
public class Main {

    /**
     * @return 
     */
    
    public static int menu(){
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("<<< SELECCIONE UNA OPCION >>>\n"
                    + "1: Ingresar cliente a la cola.\n"
                    + "2: Llamar al siguente cliente.\n"
                    + "3: Mostrar listado de clientes en la cola.\n"
                    + "4: Mostrar listado de personas atendidas en el dia\n"
                    + "5: Salir."));
        }while(op<1 || op>5);
        return op;
    }
    
    public static void Ingresar(Turnos cola, Turnos temp){
        Nodo obj=new Nodo();
        obj.setId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificacion del cliente:")));
        obj.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del cliente"));
        cola.agregar(obj);
        temp.agregar(obj);
    }
    
    public static void SigCliente(Turnos cola){
        if(! cola.colaVacia()){
            int confirm = JOptionPane.showConfirmDialog(null, ("Siguiente cliente.\nNombre: "+cola.valorFinal().getNombre()
                    + "\nIdentificacion: "+cola.valorFinal().getId()+"\n"
                    + "¿Se encuntra el cliente en la sala?"),"Confirmar",0);
            if(confirm==0){
                cola.ComprobarPresencia(true);
                JOptionPane.showMessageDialog(null, "Cliente atendido");
            }else{
                cola.ComprobarPresencia(false);
                JOptionPane.showMessageDialog(null, "El cliente perdio el turno. Ha sido movido al final de la lista");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encuentran clientes en la cola");
        }
    }
    
    public static void MostrarCola(Turnos cola){
        Turnos temp=new Turnos();
        String datos="";
        while(! cola.colaVacia()){
            datos+="--> "+cola.valorFinal().getNombre()+" -> "+cola.valorFinal().getId()+"\n";
            temp.agregar(cola.valorFinal());
            cola.quitar();
        }
        
        JOptionPane.showMessageDialog(null, "----- CLENTES EN EL REGISTRO -----\n\n"+datos+"\n");
        while(! temp.colaVacia()){
            cola.agregar(temp.valorFinal());
            temp.quitar();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Turnos cola=new Turnos();
        Turnos temp=new Turnos();
        
        int opcion;
        
        do{
            opcion=menu();
            switch(opcion){
            case 1:
                Ingresar(cola, temp);
                break;
            case 2:
                SigCliente(cola);
                break;
            case 3:
                MostrarCola(cola);
                break;
            case 4:
                MostrarCola(temp);
                break;
            case 5:
                break;
        }
        }while(opcion!=5);
        
        
 }
    
}
