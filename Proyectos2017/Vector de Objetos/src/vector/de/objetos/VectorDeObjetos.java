
package vector.de.objetos;

import javax.swing.JOptionPane;


public class VectorDeObjetos {
    public static void mostrarVector(DeclaraVector obj){
        String datos = "";
        for(int i = 0; i < obj.getTamaño(); i ++){
            datos = datos + String.valueOf("Codigo: "+obj.getVectorEstudiantes(i).getCodigo()+" Nombre: "+obj.getVectorEstudiantes(i).getNombre()
            +" Nota: "+obj.getVectorEstudiantes(i).getNota()+"\n");
            
        }
        JOptionPane.showMessageDialog(null,"======= Datos =============== \n"+datos);
    }
    
    public static void llenar(Estudiantes est){
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite El Codigo del Estudiante"));
        est.setCodigo(cod);
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        est.setNombre(nombre);
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota"));
        est.setNota(nota);
    }
    
    public static void main(String[] args) {
        DeclaraVector obj= new DeclaraVector();
       Estudiantes est;
       int numeroElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del vecotr"));
       obj.setTamaño(numeroElementos);
       obj.crearVector();
       for(int i = 0; i < obj.getTamaño(); i++){
           est = new Estudiantes();
           JOptionPane.showMessageDialog(null,"============ Elementos del vector===============\n"
                   + "Ingresa la informacion del estudiante "+(i+1));
           llenar(est);
           obj.setVectorEstudiantes(i, est);
            
       }
       mostrarVector(obj);
    }
    
}
