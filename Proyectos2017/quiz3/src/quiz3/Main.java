/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Main {

    /**
     * @return 
     */
    
    public static int Menu(){
        int opcion;
        do{
            opcion= Integer.parseInt(JOptionPane.showInputDialog(">>> SELECCIONE UNA OPCION <<<\n"
                    + "1: Registrar vehiculo\n"
                    + "2: Generar listado de vehiculos para revision de suspension\n"
                    + "3: Generar listado de vehiculos para revision de motor\n"
                    + "4: Generar listado de vehiculos para revision electrica\n"
                    + "5: Salir"));
        }while(opcion<1 || opcion>5);
        return opcion;
    }
    
    public static void Registrar(Taller cola){
        Nodo vehiculo=new Nodo();
        String servicio[]={"Revision de Suspension", "Revision de Motor", "Revision Electrica"};
        
        vehiculo.setMatricula(JOptionPane.showInputDialog("Ingrese la matricula del vehiculo."));
        vehiculo.setTipoServicio(JOptionPane.showInputDialog(null,"Seleccione un tipo de servicio","Servicio",1,null,servicio,servicio[0]).toString());
        cola.agregar(vehiculo);
    }
    
    public static void ListaServicio(Taller cola, String tipoServ){
        Taller Servicio=new Taller();
        Taller temp=new Taller();
        while (! cola.colaVacia()) {            
            if(cola.valorFinal().getTipoServicio().equals(tipoServ)){
                Servicio.agregar(cola.valorFinal());
            }
            temp.agregar(cola.valorFinal());
            cola.eliminar();
        }
        while (! temp.colaVacia()) {            
            cola.agregar(temp.valorFinal());
            temp.eliminar();
        }
        Listado(Servicio, tipoServ);
    }
    
    public static void Listado(Taller colaServicio, String tipoServ){
        String listado="";
        while(! colaServicio.colaVacia()){
            listado+="--> "+colaServicio.valorFinal().getMatricula()+"\n";
            colaServicio.eliminar();
        }
        JOptionPane.showMessageDialog(null, "Los vehiculos en loca para el servicio de \""+tipoServ+"\" son:\n"+listado);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Taller cola=new Taller();
        int opcion;
        do{
            opcion=Menu();
            switch(opcion){
                case 1:
                    Registrar(cola);
                    break;
                case 2:
                    ListaServicio(cola, "Revision de Suspension");
                    break;
                case 3:
                    ListaServicio(cola, "Revision de Motor");
                    break;
                case 4:
                    ListaServicio(cola, "Revision Electrica");
                    break;
                case 5:
                    break;
            }
        }while(opcion!=5);
    }
     
}
