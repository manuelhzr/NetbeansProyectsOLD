/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import javax.swing.JOptionPane;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionesEmpresa Vector=new OperacionesEmpresa();
        DatosEmpleados Datos;
        
        int Catidad=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de empleados a registrar"));
        Vector.setCantidadEmpleados(Catidad);
        
        String Ciudad[]={"Bogotá", "Barranquilla", "Cali", "Medellín"};
        
        String Nombre, sexo, ciudad, correo;
        int Id, edad, celular;
        for (int i = 0; i < Catidad; i++) {
            Nombre=JOptionPane.showInputDialog("Digite el nombre del empleado "+(i+1));
            Id=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de identificacion del empleado "+(i+1)));
            sexo=JOptionPane.showInputDialog("Seleccione el sexo del empleado "+(i+1)+"\n F: Femenino\n M: Masculino");
            edad=Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del empleado "+(i+1)));
            ciudad=JOptionPane.showInputDialog(null, "Seleccione la ciudad del empleado "+(i+1), "Ciudad", 1, null, Ciudad, Ciudad[0]).toString();
            correo=JOptionPane.showInputDialog("Digite el correo electronico del empleado "+(i+1));
            celular=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de celular del empleado "+(i+1)));
            
            Datos=new DatosEmpleados();
            Datos.setNombre(Nombre);
            Datos.setIdentificacion(Id);
            Datos.setSexo(sexo.toUpperCase());
            Datos.setEdad(edad);
            Datos.setCiudad(ciudad);
            Datos.setCorreo(correo);
            Datos.setCelular(celular);
            
            Vector.setInformacion(i, Datos);            
        }
                
        boolean Continuar=true;
        int opcion;
        int pregunta;
        while (Continuar==true) {            
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: \n 1: Buscar por identificacion o por numero de celular\n"
                    + "2: Generar listado de empleados por cuidad\n"
                    + "3: Listado de empleados con edades entre 30 y 40 años\n"
                    + "4: Mostrar empleado mas viejo y mas joven por ciudad\n"
                    + "5: Porcentaje de hombres y mujeres menores de 30 años\n"));
            switch(opcion){
                case 1:                    
                    int pos=Vector.busqueda(Integer.parseInt(JOptionPane.showInputDialog("Digite la identificacion o numero de celular que desea buscar: ")));
                    JOptionPane.showMessageDialog(null, Vector.getInformacion(pos).getNombre()+"    "+Vector.getInformacion(pos).getCorreo()+"    "
                            + Vector.getInformacion(pos).getCiudad()+"\n");
                    pregunta=Integer.parseInt(JOptionPane.showInputDialog("Desea salir? \n1: si\n2: no"));
                    Continuar = pregunta != 1;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Listado de empleados por ciudad:\n\n"+Vector.ListadoCiudad());
                    pregunta=Integer.parseInt(JOptionPane.showInputDialog("Desea salir? \n1: si\n2: no"));
                    Continuar = pregunta != 1;
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Listado de empleado con edades entre 30 y 40 años: \n"+Vector.ListadoEdades());
                    pregunta=Integer.parseInt(JOptionPane.showInputDialog("Desea salir? \n1: si\n2: no"));
                    Continuar = pregunta != 1;
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Listado de empleados mas viejos por ciudad: \n"+Vector.Listadoviejos());
                    JOptionPane.showMessageDialog(null, "Listado de empleados mas jovenes por ciudad: \n" +Vector.listadoJoven());
                    pregunta=Integer.parseInt(JOptionPane.showInputDialog("Desea salir? \n1: si\n2: no"));
                    Continuar = pregunta != 1;
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "El porcentaje de empleados menores de 30 años es: \n"+Vector.pocentajeMenores30());
                    pregunta=Integer.parseInt(JOptionPane.showInputDialog("Desea salir? \n1: si\n2: no"));
                    Continuar = pregunta != 1;
            }
        }
    }
    
}
