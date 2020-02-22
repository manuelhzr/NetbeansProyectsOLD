
package adminproductos;

import javax.swing.JOptionPane;


public class ParcialListas {

    /**
     * @return 
     */
    
    public static int menu(){
        int op;
        do {
            op=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion\n"
                    + "1: Agregar productos\n"
                    + "2: Realizar compras\n"
                    + "3: Eliminar producto\n"
                    + "4: Mostrar factura\n"
                    + "5: Salir"));
        } while (op<1 || op>5);
        return op;
        
    }
    
    public static void agregar(Nodo nd){
        nd.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del producto"));
        nd.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("ingrese el precio del producto")));
        nd.setStock(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos disponibles")));
    }
    
    public static void Factura(Ventas obj){
        float venta=obj.getTotal();
        float iva=(float) (venta*0.16);
        JOptionPane.showMessageDialog(null, "| producto | cantidad | precio |\n"
                            + "________________________\n"+obj.getLista()+"\n________________________\n"
                            + "|   Subtotal   |"+venta+" |\n"
                            + "|      IVA     |"+iva+"|\n"
                            + "|Total a pagar |"+(venta+iva)+"|");
    }
    

    
    public static void main(String[] args) {
        // TODO code application logic here
        Ventas obj=new Ventas();
        Nodo aux;
        int opcion;
        do {
            opcion=menu();
            switch(opcion){
                case 1:
                    int seguir;
                    do {
                        aux=new Nodo();
                        agregar(aux);
                        obj.agregar(aux);
                        seguir=Integer.parseInt(JOptionPane.showInputDialog("Desea seguir agregando? \n1: Si\n2: No"));
                    } while (seguir==1);
                    break;
                case 2:
                    int seg = 1;
                    while (seg == 1) {
                        boolean compra = obj.Comprar();
                        if (compra == true) {
                            JOptionPane.showMessageDialog(null, "Compra registrada");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra disponible la cantidad de productos ingresada");
                        }
                        
                        seg=Integer.parseInt(JOptionPane.showInputDialog("Desea seguir comprando:\n1: Si\n2: No"));
                    }
                    
                    break;
                case 3:
                    
                    Nodo eliminar=obj.buscar(JOptionPane.showInputDialog("ingrese el nombre del producto a eliminar"));
                    if (eliminar!=null) {
                        obj.eliminar(eliminar);
                        JOptionPane.showMessageDialog(null, "Producto eliminado");
                    }else{
                        JOptionPane.showMessageDialog(null, "El elemento no se encuentra registrado");
                    }
                    
                    break; 
                case 4:
                    Factura(obj);
                    break;
                
            }
        } while (opcion!=5);
        
    }
    
}
