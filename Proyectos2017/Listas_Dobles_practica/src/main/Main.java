package main;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Main {
    
    public static void llenar(Nodo nod){
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite CODIGO del Estudiante: "));
        nod.setCodigo(cod);
        String nom = JOptionPane.showInputDialog("Digite NOMBRE del Estudiante: ");
        nod.setNombre(nom);
        for (int i = 0; i < 3; i++) {
            float n = Float.parseFloat(JOptionPane.showInputDialog("Digite La NOTA " + (i+1)));
            nod.setNota(i, n);
        }        
    }
    
    public static void mostrar(Nodo nod){
        String datosNodo = "";
        datosNodo = datosNodo+String.valueOf(
            ""+"CODIGO: "+nod.getCodigo()+"\n"+
               "NOMBRE: "+nod.getNombre()+"\n"+
               "NOTAS parciales " + Arrays.toString(nod.mostrarNotas())+"\n"+       
               "Definitiva: "+ nod.notaDefinitiva());
            JOptionPane.showMessageDialog(null, "=========== INFORMACÓN DE LOS NODOS DE LA LISTA =========== \n"+ datosNodo);
    }
    
    public static void listar(Nodo nod){
        Nodo temp = nod;
        while(temp != null){
            mostrar(temp);
            temp = temp.getSiguiente();
        }
    }
    
    public static void listarDesteFinal(Nodo nod){
        Nodo temp = nod;
        while(temp != null){
            mostrar(temp);
            temp = temp.getAnterior();
        }
    }
    
    public static void mostrarNotasMayores(Nodo nod, ListaEnlazadaDoble lis){
        nod = lis.getInicio();
        float cont = 0;
            while(nod != null){                
                for (int i = 0; i < 3; i++) {
                    if(nod.getNota(i) > cont){
                    cont = nod.getNota(i);
                    }
                } 
            JOptionPane.showMessageDialog(null, "La nota mayor de " + nod.getNombre() + " es: "+ cont);     
            nod = nod.getSiguiente();
            cont = 0;
            }
    }
    
    public static int menu(){
    int opcion = 0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("=========== SELECCIONE UNA OPCIÓN DEL MENÚ =========== \n"+
                "1. Agregar un Nodo a la Lista \n"+
                "2. Mostrar Nodos de la Lista \n"+
                "3. Cantidad de Nodos de la Lista \n"+
                "4. Buscar por Código del Estudiante \n"+
                "5. Buscar por Nombre del Estudiante \n"+
                "6. Eliminar Nodo de la Lista \n"+
                "7. Informe: Promedio General y Máxima Nota \n"+
                "8. Borrar toda la Lista \n"+
                "9. Agregar un Nodo por la Cabeza \n"+
                "10. Agregar Entre Dos Nodos \n"+
                "11. Mostrar la mayor nota de cada alumno \n"+   
                "12. Salir"+
                "\n \n Seleccione una opción del 1 al 12:"
            ));
        }while(opcion <= 0 || opcion > 12);
    return opcion;
    }
    
    public static void main(String[] args) {
        ListaEnlazadaDoble lis = new ListaEnlazadaDoble();
        int opcion, cod;
        String nom;
        Nodo aux;
            do{
            opcion = menu();
                switch(opcion) {
                case 1:
                    aux = new Nodo();
                    aux.crearVectorNotas();
                    llenar(aux);
                    lis.agregarNodo(aux);
                    break;
                    
                case 2:
                    if(lis.getInicio() != null){
                        listarDesteFinal(lis.ultimoNodo()); 
                    }else{
                        JOptionPane.showMessageDialog(null, "La Lista Está Vacía....");
                    }
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, "========= NÚMERO DE NODOS DE LA LISTA =========\n"+lis.contarNodos()+" Nodos");
                    break;
                    
                case 4:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Digite CODIGO del Estudiante a Buscar: "));
                    aux = lis.buscar(cod);
                        if(aux != null){
                            mostrar(aux);
                        }else{
                            JOptionPane.showMessageDialog(null, "La información del estudiante No se encuentra en la lista");
                        }
                    break;
                    
                case 5:
                    nom = JOptionPane.showInputDialog("Digite NOMBRE del Estudiante a Buscar: ");
                    aux = lis.buscar(nom);
                        if(aux != null){
                            mostrar(aux);
                        }else{
                            JOptionPane.showMessageDialog(null, "La información del estudiante No se encuentra en la lista");
                        }
                    break;
                    
                case 6:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Digite CODIGO del Estudiante a Eliminar: "));
                    aux = lis.buscar(cod);
                        if(aux != null){
                            lis.eliminar(aux);
                            JOptionPane.showMessageDialog(null, "La información fue eliminada correctamente....");
                        }else{
                            JOptionPane.showMessageDialog(null, "El código del estudiante NO EXISTE en la Lista");
                        }
                    break;
                    
                case 7:
                    JOptionPane.showMessageDialog(null, "========= INFORME PROMEDIO GENERAL Y MÁXIMA NOTA ========= \n\n"+
                    "Promedio General: "+lis.promedioGeneral()+"\n y Máxima Nota: "+lis.maximaDefinitiva());
                    break;
                    
                case 8:
                    lis.limpiar();
                    JOptionPane.showMessageDialog(null, "La Lista Está Vacía....");
                    break;
                    
                case 9:
                    aux = new Nodo();
                    aux.crearVectorNotas();
                    llenar(aux);
                    lis.agregarAcabeza(aux);
                    break;
                
                case 10:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("CODIGO del Estudiante Despues del que Quiere Agregar el Nuevo Nodo: "));
                    Nodo nd = lis.buscar(cod);
                        if(nd != null){
                            aux = new Nodo();
                            aux.crearVectorNotas();
                            llenar(aux);
                            lis.agregarEntreNodos(nd, aux);
                        }else{
                            JOptionPane.showMessageDialog(null, "El código del estudiante NO EXISTE en la Lista");
                        }
                    break;
                    
                case 11:
                    aux = new Nodo();
                    aux = lis.getInicio();
                    while(aux != null){
                        JOptionPane.showMessageDialog(null, "La mayor nota de " + aux.getNombre() +" es: " + lis.notaMayorEstudiante(aux));
                        aux = aux.getSiguiente();
                    }
                   //                    mostrarNotasMayores(aux, lis);
                    break;
                    
                    case 12:
                    break;
                }
            }while(opcion != 12);
    }
}
    

