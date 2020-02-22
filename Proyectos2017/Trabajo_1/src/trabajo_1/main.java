/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_1;


import javax.swing.JOptionPane;

/**
 *
 * @author elena
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones Vector=new Operaciones();
        Datos_profesor Obj;
        
        int Identificacion;
        String Nombre;
        String Asignatura;
        int Telefono;
        
        int Tamano= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de profesores a registrar"));
            Vector.setTam(Tamano);
        
        for (int i = 0; i < Tamano; i++) {
            Nombre= JOptionPane.showInputDialog("Digite el nombre del docente "+(i+1));
            Identificacion=Integer.parseInt(JOptionPane.showInputDialog("digite la identificacion del docente " +(i+1)));
            Telefono=Integer.parseInt(JOptionPane.showInputDialog("digite el telefono del docente " +(i+1)));
            Asignatura=JOptionPane.showInputDialog("digite el nombre de la asignatura dictada por el docente " +(i+1));
            
            Obj=new Datos_profesor();
            Obj.setNombre(Nombre);
            Obj.setIdentificacion(Identificacion);
            Obj.setTelefono(Telefono);
            Obj.setAsignatura(Asignatura);
            
            Vector.setVector(i, Obj);
        }
        
        String[] Opciones= {"Buscar la informacion del docente por identificacion",
                "Buscar la informacion del docente por Telefono",
                "Ordenar alfabeticamente por nombre",
                "Ordenar alfabeticamente por asignaturas"};
        
        String Seleccion;
        Seleccion = JOptionPane.showInputDialog(null, "Escoja una opcion", "Opciones", 3, null, Opciones, Opciones[0]).toString();
        
        
        int Dato;
        int posicion;
        switch(Seleccion){
            case "Buscar la informacion del docente por identificacion":
                
                Dato=Integer.parseInt(JOptionPane.showInputDialog("Digite la identificacion del docente a buscar"));
                posicion=Vector.BusquedaBinaria(Dato);
                    if(posicion>=0){
                        JOptionPane.showMessageDialog(null, "los datos del profesor son: \n"
                                + "Nombre: "+Vector.getVector(posicion).getNombre()+"\n"
                                + "Identificacion: "+Vector.getVector(posicion).getIdentificacion()+"\n"
                                + "Telefono: "+Vector.getVector(posicion).getTelefono()+"\n"
                                + "Asignatura: "+Vector.getVector(posicion).getAsignatura()+"\n");
                    }else{
                        JOptionPane.showMessageDialog(null, "El termino de busqueda no coincide con los datos almacenados");
                    } break;
            case "Buscar la informacion del docente por Telefono":
                Dato=Integer.parseInt(JOptionPane.showInputDialog("Dijite el telefono del docente a buscar"));
                    if(Dato>=0){
                        posicion=Vector.busquedaSecuencia(Dato);
                        if(posicion>=0){
                            JOptionPane.showMessageDialog(null, "los datos del profesor son: \n"
                                + "Nombre: "+Vector.getVector(posicion).getNombre()+"\n"
                                + "Identificacion: "+Vector.getVector(posicion).getIdentificacion()+"\n"
                                + "Telefono: "+Vector.getVector(posicion).getTelefono()+"\n"
                                + "Asignatura: "+Vector.getVector(posicion).getAsignatura()+"\n");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "El termino de busqueda no coincide con los datos almacenados");
                    } break;
            case "Ordenar alfabeticamente por nombre":
                Vector.OrdenarBurbuja();
                String Mostrar="";
                for(int i=0; i<Tamano; i++){
                    Mostrar= Mostrar + Vector.getVector(i).getNombre()+"    "+ Vector.getVector(i).getIdentificacion()+"    "
                            + Vector.getVector(i).getTelefono()+"   "+ Vector.getVector(i).getAsignatura()+"\n";
                }
                JOptionPane.showMessageDialog(null, Mostrar);
                break;
            case "Ordenar alfabeticamente por asignaturas":
                Vector.OrdenarSeleccion();
                String Mensaje="";
                for(int i=0; i<Tamano; i++){
                    Mensaje=Mensaje + Vector.getVector(i).getAsignatura()+"    "+ Vector.getVector(i).getNombre()+"    "
                            + Vector.getVector(i).getIdentificacion()+ "     "+ Vector.getVector(i).getTelefono()+"\n";
                }
                JOptionPane.showMessageDialog(null, Mensaje);
            break;                
        }

        
    }
    
}
