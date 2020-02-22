/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresparalelos;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class VectoresParalelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vectores obj=new Vectores(); //declaracion e instanciacion del objeto de la clase vectores
        
        int tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de viviendas a registrar"));    //solicita el ingreso del tamaño de los arreglos
        obj.setTam(tam);    //asigna el tamaño ingresado a la variable tam de la clase Vectores
        float costo=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el coto por kilovatio")); //Solicita el costo de cada kilovatio
        obj.setCostoKvatio(costo); //asigna el valor de los kilovatios a su respectiva variable en la clase Vectores
        
        for (int i = 0; i < obj.getTam(); i++) { //ciclo para ingresar los datos de cada vivienda y agregarlos al vector correspondiente
            int cod=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la vivienda "+(i+1)));
            obj.setCodigoVivienda(i, cod);
            String dir=JOptionPane.showInputDialog("Ingrese la direccion de la vivienda "+(i+1));
            obj.setDireccion(i, dir);
            float vatios=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los kilovatios consumidos por la vivienda "+(i+1)));
            obj.setKvatios(i, vatios);
        }// fin del ciclo
        
        int busqueda=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la vivienda a consultar")); //solicita un cofigo de una vivienda para realizar una busqueda
        int res=obj.buscar(busqueda); //asigana el resultado de la busqueda a una variable, usa el respectio metodo de buscar en la clase Vectores
        if (res>=0) { // si el resultado es mayor o igual a cero muestra los datos de esa vivienda, ya que si encontro una vivienda con el codigo engresado
            JOptionPane.showMessageDialog(null, "Vivienda "+obj.getCodigoVivienda(res)+"\n"
                    + "Direccion: "+obj.getDireccion(res)+"\n"
                    + "Valor a pagar: "+obj.Total(res)+"\n");
        }else{  //si la condicion anterior no se da, significa que el metodo de buscar retorno -1 por lo que no encontro ningun resultado, procede a mostrar un mensaje informado lo ocurrido
            JOptionPane.showMessageDialog(null, "La vivienda a buscar no se encuentra registrada");
        }
        
        JOptionPane.showMessageDialog(null, "El total recaudado por la empresa es: "+obj.FacturacionTotal()); //Muesta el total faccturado por la emptresa
        
        JOptionPane.showMessageDialog(null, "Facturacion por viviendas"); //En adelante se procede a mostrar la facturacion para cada vivienda registrada en los arreglos
        
        for (int i = 0; i < obj.getTam(); i++) {
            JOptionPane.showMessageDialog(null, "Vivienda "+obj.getCodigoVivienda(i)+"\n"
                    + "Direccion: "+obj.getDireccion(i)+"\n"
                    + "Valor a pagar: "+obj.Total(i)+"\n");
        }
    }
    
}
