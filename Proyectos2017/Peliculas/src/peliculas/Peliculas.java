/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Peliculas {

    public static void LLenar(Nodo nd, RegistrosPeliculas obj){
        
        String nompelicula=JOptionPane.showInputDialog("Ingrese el nombre de la pelicula");
          nd.setNombrePelicula(nompelicula);
            
            String idPelicula=JOptionPane.showInputDialog("Digite el id de la pelicula:");
            nd.setIdPelicula(idPelicula);
            
            float Duracion=Float.parseFloat(JOptionPane.showInputDialog("Digite la duracion de la pelicula "));
            nd.setDuracion(Duracion);
                        
            String genero=JOptionPane.showInputDialog("Ingrese el genero de la pelicula: ");
            nd.setGenero(genero);
            
        
    }
    
    public static int menu(){
        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("========== SELECCIONE UNA OPCION ==========\n"
                    + "1: Agregar Pelicula\n"
                    + "2: Bucar pelicula por ID\n"
                    + "3: Mostrar peliculas con duracion por encima del promedio\n"
                    + "4: Salir\n"));
        }while(opcion<=0 || opcion>4);
        return opcion;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        RegistrosPeliculas Lista= new RegistrosPeliculas();
        Nodo aux;
        int opc;
        do{
            opc=menu();
            switch(opc){
                case 1:
                    aux=new Nodo();
                    LLenar(aux, Lista);
                    Lista.agregar(aux);
                    break;
                case 2:
                    String id=JOptionPane.showInputDialog("Digite el id de la pelicula a buscar:");
                    Nodo res=Lista.Buscar(id);
                    if (res != null) {
                        JOptionPane.showMessageDialog(null, "Pelicula encontrada\n\n"
                                + "Nombre: " + res.getNombrePelicula() + "\n"
                                + "ID: " + res.getIdPelicula() + "\n"
                                + "Duracion: " + res.getDuracion() + "\n"
                                + "Genero: " + res.getGenero() + "\n");
                    }else{
                        JOptionPane.showMessageDialog(null, "No se encotro la pelicula");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Peliculas con duracion por encima del promedio:\n\n"+Lista.MayorDuracion());
            }
        }while(opc!=4);
        
    }
    
}
