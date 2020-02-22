/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superm;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class SuperM {

    /**
     * @return 
     */
    public static int menu(){
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion\n"
                    + "1 Guardar puntos de usuario por ID\n"
                    + "2 consultar puntos de usuario por ID\n"
                    + "3 Modificar la cantidad de puntos a un usuario\n"
                    + "4 Conocer el promedio de puntos de todos los usuarios\n"
                    + "5 Salir\n"));
        }while(op<1 && op>5);
        return op;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Puntos obj=new Puntos();
        obj.setTam(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de usuarios a trabajar")));
        int pos, val, op;
        do{
        op=menu();
        switch(op){
            case 1:
                pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del usuario a registrar"));
                val=Integer.parseInt(JOptionPane.showInputDialog("Ingreselos puntos a registrar"));
                obj.agregar(pos, val);
                if(obj.bono(pos)==true){
                    JOptionPane.showMessageDialog(null, "\"Felicidades\" Tiene derecho a un bono de regalo");
                }
                break;
            case 2:
                pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del cliente a consultar"));
                JOptionPane.showMessageDialog(null, "Los puntos del cliiente indicado son: "+obj.getPuntos(pos));
                break;
            case 3:
                pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del cliente a modificar"));
                val=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad de puntos"));
                obj.setPuntos(pos, val);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El promedio de los puntos de todos los clientes es: "+obj.promedioPuntos());
                
        }
        }while(op!=5);

    }
    
}
