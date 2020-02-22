/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_2;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Main {

    
    public static void LLenar(Nodo nd, ProgramaDepartamental obj){
        String[] municipio={"Sahagun", "Monteria", "Lorica"};
        String nomRepresentante=JOptionPane.showInputDialog("Ingrese el nombre del representante");
        if(obj.validarRepresentante(nomRepresentante)==true){
            nd.setNombreRepresentante(nomRepresentante);
            
            int idRepresentante=Integer.parseInt(JOptionPane.showInputDialog("Digite la identificacion del representante:"));
            nd.setIdRepresentante(idRepresentante);
            
            String muni=JOptionPane.showInputDialog(null,"Seleccione su municipio","Municipio",1,null,municipio,municipio[0]).toString();
            nd.setMunicipio(muni);
                        
            String nombre=JOptionPane.showInputDialog("Ingrese el nombre del niño:");
            nd.setNombre(nombre);
            
            int numRegistro=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de registro del niño:"));
            nd.setNumeroRegistro(numRegistro);
            
            int edad=Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del niño:"));
            nd.setEdad(edad);
            
            float talla=Float.parseFloat(JOptionPane.showInputDialog("Digite la talla del niño:"));
            nd.setTalla(talla);
            
            float peso=Float.parseFloat(JOptionPane.showInputDialog("Digite la peso del niño"));
            nd.setPeso(peso);
            
        }else{
            JOptionPane.showMessageDialog(null, "El representante ya ha registrado el maximo de niños permitidos");
        }
    }
    
    public static int menu(){
        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("========== SELECCIONE UNA OPCION ==========\n"
                    + "1: Agregar niño\n"
                    + "2: Agregar un niño junto a uno ya registrado\n"
                    + "3: Agregar un niño al principio de la lista\n"
                    + "4: Buscar niño por numero de registro civil\n"
                    + "5: Ordenar la informacion teniendo en cuenta el peso\n"
                    + "6: Eliminar la informacion de un niño y su representante\n"
                    + "7: Generar listado por municipios con la informacion registrada\n"
                    + "8: Generar listado de niños bajos de peso\n"
                    + "9: Mostrar cantidad de niños bajos de talla\n"
                    + "10: Salir\n"));
        }while(opcion<=0 || opcion>10);
        return opcion;
    }
    
       
    public static void main(String[] args) {
        // TODO code application logic here
        ProgramaDepartamental Lista=new ProgramaDepartamental();
        int opcion;
        Nodo aux;
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    aux =new Nodo();
                    LLenar(aux, Lista);
                    Lista.agregar(aux);
                    break;
                case 2:
                    Nodo anterior;
                    String nom=JOptionPane.showInputDialog("ingrese el nombre del niño al que desea juntarle informacion");
                    anterior=Lista.Buscar(nom);
                    aux=new Nodo();
                    LLenar(aux, Lista);
                    Lista.agregarEntre(anterior, aux);
                    break;
                case 3:
                    aux=new Nodo();
                    LLenar(aux, Lista);
                    Lista.agregarCabeza(aux);
                    break;
                case 4:
                    int num=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de registro del niño que desea buscar"));
                    Nodo resultado=Lista.Buscar(num);
                    if(resultado!=null){
                        JOptionPane.showMessageDialog(null, "La informacion del niño encontrada es:\n"
                                + "Nombre del representante: " + resultado.getNombreRepresentante() + "\n"
                                + "Identificacion del representante: " + resultado.getIdRepresentante() + "\n\n"
                                + "Nombre: " + resultado.getNombre() + "\n"
                                + "Edad: " + resultado.getEdad() + "\n"
                                + "Municipio: " + resultado.getMunicipio() + "\n"
                                + "Talla: " + resultado.getTalla() + "\n"
                                + "Peso: " + resultado.getPeso());
                    }else{
                        JOptionPane.showMessageDialog(null, "No se encontro ningun registro que coincida con la informacion ingresada");
                    }
                    break;
                case 5:
                    
                    Lista.Ordenar();
                    JOptionPane.showMessageDialog(null, "===== LISTA ORDENADA POR EDAD ====="+Lista.ListadoOrdenado());
                    break;
                case 6:
                    String info=JOptionPane.showInputDialog("Ingrese el nombre del niño que desea eliminar ");
                    Nodo Eliminar=Lista.Buscar(info);
                    Lista.Eliminar(Eliminar);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "===== LISTADO POR MUNICIPIOS =====\n\n"+Lista.ListadoMunicipios());
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "===== LISTADO DE NIÑOS BAJOS DE PESO =====\n\n"+Lista.ListadoBajosPeso());
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "===== CANTIDAD DE NIÑOS BAJOS DE TALLA =====\n\n"+Lista.BajosTalla());
                    break;
                    
            }
        }while(opcion!=10);
    }
    
}
