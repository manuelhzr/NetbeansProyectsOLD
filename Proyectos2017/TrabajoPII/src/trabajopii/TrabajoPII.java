package trabajopii;

import javax.swing.JOptionPane;


public class TrabajoPII {
public static void mostrarVector(DeclararVector obj){
        String datos = "";
        for(int i = 0; i < obj.getTamaño(); i ++){
            datos = datos + String.valueOf(obj.getVectorEstudiantes(i).getCodigo()+"  "+obj.getVectorEstudiantes(i).getNombre()
            +"  "+obj.getVectorEstudiantes(i).getCreditos()+"  "+obj.getVectorEstudiantes(i).getSemestre()+"\n");
            
        }
        JOptionPane.showMessageDialog(null,"======= Datos =============== \n"
                + "Codigo.    Nombre.   Creditos.    Semestre.\n"+datos);
    }
    
    public static void llenar(Inscripcion est){
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite El Codigo de la Materia"));
        est.setCodigo(cod);
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la materia");
        est.setNombre(nombre);
        int credi = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de creditos"));
        est.setCreditos(credi);
         int semestre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el semestre"));
        est.setSemestre(semestre);
    }
    
    
    public static void main(String[] args) {
       DeclararVector obj= new DeclararVector();
       Inscripcion est;
       int numeroElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad materias a inscribir."));
       obj.setTamaño(numeroElementos);
       obj.crearVector();
       for(int i = 0; i < obj.getTamaño(); i++){
           est = new Inscripcion();
           JOptionPane.showMessageDialog(null,"============ Elementos del vector===============\n"
                   + "Ingresa la informacion de la materia "+(i+1));
           llenar(est);
           obj.setVectorEstudiantes(i, est);
            
       }
       mostrarVector(obj);
       obj.ordenarShell();
       mostrarVector(obj);
       obj.seleccion();
       mostrarVector(obj);
       obj.Quicksort(0, obj.getTamaño()-1);
       mostrarVector(obj);
    }
    
    }
    

