/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolas;

import javax.swing.JOptionPane;


public class EjercicioColas {

    /**
     * @return 
     */
    
    public static int menu(){
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("<<< SELECCIONE UNA OPCION >>>\n"
                    + "1: Registrar Producto.\n"
                    + "2: Mostrar los productos.\n"
                    + "3: Buscar producto.\n"
                    + "4: Mostrar promedio de precios.\n"
                    + "5: Salir."));
        }while(op<1 || op>5);
        return op;
    }
    
    public static void Ingresar(Cola ob){
        String id=JOptionPane.showInputDialog("Ingrese el id deñ producto");
        String nom=JOptionPane.showInputDialog("Ingrese el nombre del producto");
        Float precio=Float.parseFloat(JOptionPane.showInputDialog("ingrese el precio del producto"));
        Nodo obj=new Nodo(id, nom, precio);
        ob.agregar(obj);
    }
    
    public static void MostrarCola(Cola co){
        Cola temp=new Cola();
        String datos="";
        while(! co.colavacia()){
            datos+="--> "+co.valorFinal().nomProducto+" -> "+co.valorFinal().idProducto+" -> "+co.valorFinal().precio+"\n";
            temp.agregar(co.valorFinal());
            co.quitar();
        }
        JOptionPane.showMessageDialog(null, "----- Productos registrados -----\n\n"+datos+"\n");
        while(! temp.colavacia()){
            co.agregar(temp.valorFinal());
            temp.quitar();
        }
    }
    
    public static void Bucar(Cola co){
        String Dato=JOptionPane.showInputDialog("Ingrese el nombre del producto a buscar");
        Nodo res=co.buscar(Dato);
        if(res!=null){
        JOptionPane.showMessageDialog(null, "Resultado \n"
                + "Nombre Producto "+res.nomProducto+"\n"
                + "ID "+res.idProducto+"\n"
                + "Precio "+res.precio);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Cola Productos=new Cola();
        int opcion;
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    Ingresar(Productos);
                    break;
                case 2:
                    MostrarCola(Productos);
                    break;
                case 3:
                    Bucar(Productos);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "El promedio de los precios es: "+Productos.promedioPrecios());
                    break;
                case 5:
                    break;
            }
        }while(opcion!=5);
    }
    
}
