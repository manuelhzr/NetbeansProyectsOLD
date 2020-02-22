/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresp;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class VectoresP {

   public static void mostrarVector(Productos vec){
        String datosVector = "";
        for(int i=0; i<=vec.getTamano()-1; i++){
            datosVector = datosVector+String.valueOf("CODIGO: "+vec.getCodigoProducto(i)+"  "+"NOMBRE: "+vec.getNombreProducto(i)+"   "+"PRECIO: "+vec.getPrecioProducto(i)+"   "+"CANTIDAD: "+vec.getCantidad(i)+"\n");
        }

        JOptionPane.showMessageDialog(null, "=========== PRODUCTOS REGISTRADOS EN EL VECTOR ===========\n\n"+datosVector);
    }
   
   public static int menu(){
        int opcion = 0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("=====SELECCIONE UNA OPCIÓN DEL MENÚ =====\n\n"
		+"1. Registrar información de los productos \n"
		+"2. Mostar los productos más costosos \n"
		+"3. Mostrar los productos registrados \n"
                +"4. Mostrar productos que valgan mas de 2500 y sean menos de 5\n"
                +"5. Buscar informacion por codigo\n"
                +"6. Mostrar total ganado por la tienda\n"
		+"7. Salir"
		+ "\n \n Seleccione una opción del 1 al 4"));
        }while(opcion <= 0 || opcion > 7);
        return opcion;
    }

               public static void productosMayorPrecio(Productos vec){
        String datosVector = "";
                for(int i=0; i<=vec.getTamano()-1; i++){
                    if(vec.getPrecioProducto(i) == vec.mayorPrecio()){
                        datosVector= datosVector+String.valueOf("NOMBRE: "+vec.getNombreProducto(i)+"\n");
                    } 
                }
        JOptionPane.showMessageDialog(null, "=========== PRODUCTOS MAS COSTOSOS EN EL VECTOR ===========\n"+datosVector);  
    }



    public static void main(String[] args) {
        // TODO code application logic here
         Productos vec = new Productos();
        int opcion;
        do{
            opcion = menu();

            switch(opcion) {
            case 1:
                int numeroElementos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el Número de Productos a Registrar:"));
                vec.setTamano(numeroElementos); 
                vec.crearVectores();
                for(int i=0; i<=vec.getTamano()-1; i++){
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el Código del Producto "+i+": "));
                    String nombre = JOptionPane.showInputDialog(null, "Digite el Nombre del Producto "+i+": ");
                    float precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el Precio del Producto "+i+": "));
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de Productos "+i+": "));
                    vec.setCodigoProducto(i, codigo);
                    vec.setNombreProducto(i, nombre); 
 		    vec.setPrecioProducto(i, precio);
                    vec.setCantidad(i, cantidad);
                }

                JOptionPane.showMessageDialog(null,"Productos Registrados.... ");
                mostrarVector(vec);
                break;
            case 2:
                productosMayorPrecio(vec);
                break;
            case 3:
                mostrarVector(vec);
                break;
            case 4: 
                JOptionPane.showMessageDialog(null, vec.Mayores2500());
                break;
            case 5:
                int cod=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del producto a buscar"));
                int res=vec.Buscar(cod);
                if (res!=-1) {
                    JOptionPane.showMessageDialog(null, "Producto: "+vec.getNombreProducto(res)+" Precio: "+vec.getPrecioProducto(res)+" Cantidad: "+vec.getCantidad(res));
                }else{
                    JOptionPane.showMessageDialog(null, "El producto no se encuentraregistrado");
                }
                break;
            case 6:
                float vect[]=vec.totalCobro();
                for (int i = 0; i < vec.getTamano(); i++) {
                    JOptionPane.showMessageDialog(null, "Producto "+(i+1)+" "+vec.getNombreProducto(i)+": "+vect[i]);
                }
                break;
            case 7:
                break;
                
            }
        }while(opcion != 7);
    }   

    
    
}
