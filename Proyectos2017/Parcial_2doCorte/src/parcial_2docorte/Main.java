/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_2docorte;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Main {

    
    public static void llenar(Nodo nd){
        String municipio[]={"Sahagun", "Lorica", "Cerete", "Planeta Rica", "Tierralta"};
        String posicion[]={"Portero", "Defenza", "Medio", "Delantero"};
        
        String nom=JOptionPane.showInputDialog("Ingrese el nombre del jugador ");
        nd.setNombre(nom);
        
        int id=Integer.parseInt(JOptionPane.showInputDialog("Digite la identificacion del jugador"));
        nd.setIdentificacion(id);
                
        String mun=JOptionPane.showInputDialog(null, "Seleccione el municipio", "Municipio", 1, null, municipio, municipio[0]).toString();
        nd.setMunicipio(mun);
        
        int edad=0;
        do{
            edad=Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del jugador "));
            if(edad>=8 && edad<=12){
                nd.setCategoria("Infantil");
                JOptionPane.showMessageDialog(null, "Se ha asigando la categoria \"Infantil\"");
            }
            if(edad>=13 && edad<=16){
                nd.setCategoria("Junior");
                JOptionPane.showMessageDialog(null, "Se ha asigando la categoria \"Junior\"");
            }
        }while(edad<8 || edad>16);
        nd.setEdad(edad);
        
        String pos=JOptionPane.showInputDialog(null,"Seleccione la posicion del jugador","Posicion",1,null,posicion,posicion[0]).toString();
        nd.setPosicion(pos);
    }
    
    public static int menu(){
        int opcion;
        do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE UNA OPCION\n\n"
                + "1: Agregar Jugador\n"
                + "2: Agregar Jugador junto a uno existente\n"
                + "3: Realizar busqueda por nombre\n"
                + "4: Realizar busqueda por identificacion\n"
                + "5: Generar informe de cuantos Delanteros se encuentran registrados en cerete en la categoria Infantil\n"
                + "6: Generar informe de cuantos Porteros estan registrados por municipio en la categoria Junior\n"
                + "7: Salir\n"));
        }while(opcion<=0 && opcion>7);
        return opcion;    
    }
    
    public static void mostrar(Nodo nod){
        String datosNodo = "";
        datosNodo = datosNodo+String.valueOf(
            ""+"Nombre: "+nod.getNombre()+"\n"+
               "Identificaion: "+nod.getIdentificacion()+"\n"+
               "Municipio " + nod.getMunicipio()+"\n"+       
               "Edad: "+nod.getEdad()+"\n"+
               "Categoria: "+nod.getCategoria()+"\n"+
               "Posicion: "+nod.getPosicion()+"\n");
            JOptionPane.showMessageDialog(null, "=========== INFORMACÓN DE LOS NODOS DE LA LISTA =========== \n"+ datosNodo);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ligaFutbol Lista=new ligaFutbol();
        Nodo aux;
        int opcion;
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    aux=new Nodo();
                    llenar(aux);
                    Lista.agregarNodo(aux);
                    break;
                case 2:
                    String nom=JOptionPane.showInputDialog("Digite el nombre del jugador al que desea juntar la informacion");
                    Nodo busqueda=Lista.buscarInicio(nom);
                    aux=new Nodo();
                    llenar(aux);
                    Lista.agregarEntreNodos(busqueda, aux);
                    break;
                case 3:                    
                    String bus=JOptionPane.showInputDialog("Ingrese el nombre del jugador a buscar");
                    Nodo res=Lista.buscarInicio(bus);
                    if(res!=null){
                        mostrar(res);
                    }else{
                        JOptionPane.showMessageDialog(null, "No se encontro ningun resultado");
                    }
                    break;
                case 4:
                    int id=Integer.parseInt(JOptionPane.showInputDialog("Digite la identificaion del jugador a buscar"));
                    Nodo nod=Lista.buscarFinal(id);
                    if(nod!=null){
                        mostrar(nod);
                    }else{
                        JOptionPane.showMessageDialog(null, "No se encontro ningun resultado");
                    }
                    break;
                case 5:
                        JOptionPane.showMessageDialog(null, "Cantidad de Delanteros registrados en Cerete en la categoria Infantil: "+Lista.InformeDelanteros());
                        break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Informe de Porteros por municipio:\n\n"+Lista.informePorteros());
            }
        }while(opcion!=7);
    }
    
}
