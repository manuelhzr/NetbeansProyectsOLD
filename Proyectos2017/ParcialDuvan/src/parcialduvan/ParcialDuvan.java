
package parcialduvan;

import javax.swing.JOptionPane;

public class ParcialDuvan {
    public static void llenar(Nodo nod){
        String cod = JOptionPane.showInputDialog("Digite el identificador del fichero: ");
        nod.setIdentificador(cod);
        String nom= JOptionPane.showInputDialog("Digite el nombre del Fichero: ");
        nod.setNombre(nom);
        String ext=JOptionPane.showInputDialog("Digite la extencion del fichero (doc, txt o pdf: ");
        nod.setExtencion(ext);
        int peso=Integer.parseInt(JOptionPane.showInputDialog("Digite el peso del fichero en kb"));
        nod.setPeso(peso);
        
    }
    
    public static void mostrar(Nodo nod){
    String datosNodo="";
    datosNodo = datosNodo + String.valueOf(""+"Id: "+nod.getIdentificador()+"   " +"Nombre: "+nod.getNombre()+" "+"Extencion: "
            + "Peso: "+nod.getPeso());
    JOptionPane.showMessageDialog(null, "============ Datos =============== \n \n"
            + datosNodo);
}
    
    public static void listar(Nodo nod){
        Nodo temp = nod;
        while(temp!=null){
            mostrar(temp);
            temp = nod.getSiguiente();
        }
    }
    public static void listar(Nodo nod){
        Nodo temp = nod;
        while(temp!=null){
            mostrar(temp);
            temp = nod.getSiguiente();
        }
    }
    public static int llave(){
        int menu=0;
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("==========================================\n"
                    + "1. Ingresar Fichero Nuevo por Cabeza\n"
                    + "2. Ingresar Fichero Nuevo por Cola\n"
                    + "3. Ver todos los ficheros\n"
                    + "4. ver cuantos ficheros tienen extencion doc y pdf\n"
                    + "5. Generar Listado con los Ficheros .txt \n"
                    + "6. Eliminar todo\n\n\n\n"
                    + "7. Salir"));
            
        }while(menu < 0 || menu > 7);
        return menu;
    }
    
    public static void main(String[] args) {
        
        Ficheros obj =new Ficheros();
        Nodo aux;
        
        int llave;
        
        do{
            llave = llave();
            switch(llave){
                case 1:
                    JOptionPane.showMessageDialog(null, "Agregar fichero por la cabeza");
                    aux = new Nodo();
                    llenar(aux);
                    obj.agregarAcabeza(aux);
                    mostrar(aux);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Ingresar Fichero por la cola");
                    aux = new Nodo();
                    llenar(aux);
                    if(obj.getCabeza() == obj.Ultimo()){
                    obj.agregarEntreNodos(obj.getCabeza(), aux);
                    }else{
                        obj.agregarEntreNodos(obj.Ultimo(), aux);
                    }
                    mostrar(aux);
                    break;
                    
                case 3:
                   if(obj.getCabeza()!= null){
                       listar(obj.getCabeza());
                   }else{
                       JOptionPane.showMessageDialog(null, "la lista está vacia...");
                   }
                    break;
                case 4:
                    
                    JOptionPane.showMessageDialog(null, "Numero de archivos .pdf y .doc");
                   break;
                case 5:
                    break;
                case 6:
                    obj.limpiar();
                    JOptionPane.showMessageDialog(null, "Elminado...");
                    break;
            }
            
        }while(llave!= 7);
        
        
    }
    
}
