/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import javax.swing.JOptionPane;


public class Quiz {

    public static int menu(){
        int opcion;
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE UNA OPCION DEL MENU\n"
                    + "1: Agregar un jugador al final\n"
                    + "2: Agregar un jugador al inicio\n"
                    + "3: Agregar un jugador entre dos ya existentes\n"
                    + "4: Buscar jugador por identificacion\n"
                    + "5: Bucar jugador por nombre\n"
                    + "6: Eliminar un jugador\n"
                    + "7: Mostrar el average promedio del equipo\n"
                    + "8: Mostrar el mejor jardinero del equipo\n"
                    + "9: Salir"));
        } while (opcion<1 || opcion>9);
        return opcion;
    }
    
    public static void Agregar(Nodo nod){
        String Pos[]={"Lanzador", "Receptor", "Primera base", "Segunda base", "Shortstop", "Jardinero"};
        
        int id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del jugador"));
        nod.setId(id);
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre del jugador");
        nod.setNombre(nombre);
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del jugador"));
        nod.setEdad(edad);
        String Posicion=JOptionPane.showInputDialog(null, "Seleccione la posicion de juego", "Posicion", 3, null, Pos, Pos[0]).toString();
        nod.setPosicion(Posicion);
        float average=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el average del jugador"));
        nod.setAverage(average);
        
    }
    
    public static void mostrar(Nodo nd){
        String lis="Nomre: "+nd.getNombre()+"\n"
                + "ID: "+nd.getId()+"\n"
                + "Edad: "+nd.getEdad()+"\n"
                + "Posicion: "+nd.getPosicion()+"\n"
                + "Average: "+nd.getAverage()+"\n";
        
        JOptionPane.showMessageDialog(null, lis);
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Equipo obj=new Equipo();
        Nodo aux;
        
        int opcion;
        
        do {
            opcion=menu();
            
            switch(opcion){
                case 1:
                    aux=new Nodo();
                    Agregar(aux);
                    obj.agregar(aux);
                    JOptionPane.showMessageDialog(null, "Jugador agregado");
                    break;
                case 2: 
                    aux=new Nodo();
                    Agregar(aux);
                    obj.agregarAcabeza(aux);
                    JOptionPane.showMessageDialog(null, "Jugador agregado");
                    break;
                case 3:
                    int id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del jugador para agregar un nodo junto al el"));
                    Nodo res=obj.buscarCabeza(id);
                    if (res!=null) {
                        aux=new Nodo();
                        Agregar(aux);
                        obj.agregarEntreNodos(res,aux);
                        JOptionPane.showMessageDialog(null, "Jugador agregado");
                    }else{
                        JOptionPane.showMessageDialog(null, "El jugador no existe");
                    }
                    break;
                case 4:
                    int ide=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del jugador a buscar"));
                    Nodo busqueda=obj.buscarCabeza(ide);
                    if (busqueda!=null) {
                        mostrar(busqueda);
                    }else{
                        JOptionPane.showMessageDialog(null, "El jugador no existe");
                    }
                    break;
                case 5:
                    String Nombre=JOptionPane.showInputDialog("Ingrese el nombre del jugador a buscar");
                    Nodo busqueda2=obj.buscarFinal(Nombre);
                    if (busqueda2!=null) {
                        mostrar(busqueda2);
                    }else{
                        JOptionPane.showMessageDialog(null, "El jugador no existe");
                    }
                    break;
                case 6:
                    String eliminar=JOptionPane.showInputDialog("Ingrese el nombre del jugador a borrar");
                    Nodo result=obj.buscarFinal(eliminar);
                    if (result!=null) {
                        obj.eliminar(result);
                        JOptionPane.showMessageDialog(null, "Jugador eliminado");
                    }else{
                        JOptionPane.showMessageDialog(null, "El jugador no existe");
                    }
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "El average promedio es: "+obj.averagePromedio());
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "El mejor jardinero es: \n"+obj.mejorJardinero());
                    break;
                    
            }
            
        } while (opcion!=9);
        
    }
    
}
