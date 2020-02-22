/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import javax.swing.JOptionPane;

/**
 *
 * @author sergio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar cliente a la lista de espera \n"
                    + "2. Atencion de cliente \n"
                    + "3. Orden de Atencion \n"
                    + "4. Vaciar la Cola \n"
                    + "5. Salir"
                    + "\n \n Seleccione una opción del 1 al 5"));
        } while (opcion <= 0 || opcion > 5);
        return opcion;
    }
    
    public static void llenar(Nodo nod, int cond) {
        int Id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificacion del cliente: "));
        nod.setId(Id);
        String nom = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        nod.setNombre(nom);
        if (cond==1 || cond==2) {
            nod.setCondicion("Normal");
        }else{
            if (cond==3) {
                nod.setCondicion("Discapacitado");
            }else{
                nod.setCondicion("Titular");
                nod.setNumCuenta(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la cuenta")));
            }
        }
        String trans[] = {"Retiro", "Consulta", "Consignacion"};
        nod.setTransacciones(JOptionPane.showInputDialog(null, "Escoja el tipo de transaccion a realizar: ", "Transaccion", 3, null, trans, trans[0]).toString());
       
    }
    
    public static void mostrarCola(ColaCliente cola) {
        ColaCliente temp = new ColaCliente();
        String verDatosCola = "";
        while (!cola.colaVacia()) {
            verDatosCola = verDatosCola + String.valueOf("------------------------------\nNombre: " + cola.getFrente().getNombre()+ "\n"
                    + "ID: "+cola.getFrente().getId()+ "\n"
                    + "Transaccion: "+cola.getFrente().getTransacciones()+ "\n"
                    + "Condicion: "+cola.getFrente().getCondicion()+ "\n");
            if (cola.getFrente().getCondicion().equals("Titular")) {
                verDatosCola+="Numero de cuenta: "+cola.getFrente().getNumCuenta()+"\n";
            }
            temp.agregar(cola.getFrente());
            cola.quitar();
        }
        JOptionPane.showMessageDialog(null, "=== ELEMENTOS DE LA DE COLA ===" + "\n" + verDatosCola + "\n");
        while (!temp.colaVacia()) {
            cola.agregar(temp.getFrente());
            temp.quitar();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ColaCliente cola=new ColaCliente();
        Nodo aux;
        int cont=1;
        int op;
        
        do {
            op=menu();
            
            switch(op){
                case 1:
                    aux=new Nodo();
                    llenar(aux, cont);
                    cola.agregar(aux);
                    cont++;
                    if (cont>4) {
                        cont=1;
                    }
                    JOptionPane.showMessageDialog(null, "Cliente agregado a la cola");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "El cliente con id: "+cola.getFrente().getId()+". Ha sido atendido");
                    cola.quitar();
                    break;
                case 3:
                    mostrarCola(cola);
                    break;
                case 4:
                    cola.limpiarCola();
                    JOptionPane.showMessageDialog(null, "Se ha vaciado la cola");
                    break;
            }
        } while (op!=5);
        
    }
    
}
