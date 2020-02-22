/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizacion;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Organizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ORG obj=new ORG();
        Socio soc;
        Trabajador trab;
        
        int tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad participantes a registrar"));
        
        obj.setCant(tam);
        
        String tp[]={"Socio","Trabajador"};
        String tipo;
        for (int i = 0; i < tam; i++) {
            tipo = JOptionPane.showInputDialog(null, "Seleccione la categoria de intregante", "Tipo", 3, null, tp, tp[0]).toString();
            switch (tipo) {
                case "Socio":
                    soc = new Socio();
                    soc.setCategoria(tipo);
                    soc.setCedula(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cedula")));
                    soc.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
                    soc.setMunicpioRes(JOptionPane.showInputDialog("Ingrese el municipio de residencia"));
                    soc.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion"));
                    soc.setAñoNacimiento(JOptionPane.showInputDialog("Ingrese fecha de nacimiento"));
                    soc.setSueldoB(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo basico")));

                    obj.setSocio(i, soc);
                    obj.setTrabajador(i, null);
                    break;
                case "Trabajador":
                    trab = new Trabajador();
                    Asalariado asal;
                    Voluntario vol;
                    Departamento dep = new Departamento();
                    trab.setCategoria(tipo);
                    String sc[] = {"Asalariado", "Voluntario"};
                    String Subcategoria = JOptionPane.showInputDialog(null, "Seleccione una subcategoria", "Subcategoria", 3, null, sc, sc[0]).toString();
                    trab.setCategoria(Subcategoria);
                    do {
                        trab.setCedula(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cedula")));
                    } while (obj.ValidarTrabajador(trab.getCedula()) == true);

                    trab.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
                    trab.setAñoNacimiento(JOptionPane.showInputDialog("Ingrese fecha de nacimiento"));
                    trab.setArea(JOptionPane.showInputDialog("Ingrese el area de trabajo"));
                    trab.setNivelAcademico(JOptionPane.showInputDialog("Ingrese el nivel academico"));
                    do {
                        dep.setID(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del departamento")));
                    } while (obj.validarDepartamento(dep.getID()) == false);
                    dep.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del departamento"));
                    trab.setDepartamento(dep);

                    switch (Subcategoria) {
                        case "Asalariado":
                            asal = new Asalariado();
                            asal.setCostoHoras(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el coato de las horas")));
                            asal.setHorasTrabajas(Integer.parseInt(JOptionPane.showInputDialog("ingrese las horas trabajadas")));
                            trab.setAsal(asal);
                            trab.setVol(null);
                            break;
                        case "Voluntario":
                            vol = new Voluntario();
                            vol.setHorasSemanales(Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas dedicadas a las semana")));
                            trab.setVol(vol);
                            trab.setAsal(null);
                            break;

                    }
                    obj.setTrabajador(i, trab);
                    obj.setSocio(i, null);
                    break;
            }
        }
        
        String dat="";
        tipo = JOptionPane.showInputDialog(null, "Seleccione la categoria a mostrar", "Tipo", 3, null, tp, tp[0]).toString();
        for (int i = 0; i < tam; i++) {
            switch (tipo) {
                case "Socio":
                    dat+="Nombre: "+obj.getSocio(i).getNombre()+"\n"
                            + "Cedula: "+obj.getSocio(i).getCedula()+"\n"
                            + "Direccion: "+obj.getSocio(i).getDireccion()+"\n"
                            + "Salario: "+obj.getSocio(i).sueldoNeto()+"\n\n";
                    break;
                case "Trabajador":
                    dat+="Nombre: "+obj.getTrabajador(i).getNombre()+"\n"
                            + "Cedula: "+obj.getTrabajador(i).getCedula()+"\n"
                            + "Subcategoria: "+obj.getTrabajador(i).getSubCategoria()+"\n"
                            + "Departamento: "+obj.getTrabajador(i).getDepartamento().getNombre()+"\n"
                            + "Fecha de nacimiento: "+obj.getTrabajador(i).getAñoNacimiento()+"\n"
                            + "Nivel academico: "+obj.getTrabajador(i).getNivelAcademico()+"\n";
                    
                    if (obj.getTrabajador(i).getSubCategoria().equals("Asalariado")) {
                        dat+="Salario: "+obj.getTrabajador(i).getAsal().Salario()+"\n\n";
                    }else{
                        dat+="Horas dedicadas: "+obj.getTrabajador(i).getVol().getHorasSemanales()+"\n\n";
                    }
                    break;
            }
        }
        
        JOptionPane.showMessageDialog(null, dat);
        
        
    
    }
    
}
