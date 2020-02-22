/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_1ercorte;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        banco Vector=new banco();
        Datos_clientes LLenar;
        
        int Clientes=Integer.parseInt(JOptionPane.showInputDialog("Diga el numero de clientes que desea registrar"));
        Vector.setNumero_Clientes(Clientes);
        
        String NombreCliente;
        float Deuda;
        int NumeroDeuda, Celular, DiasDeuda;
        for(int i=0; i<Vector.getNumero_Clientes(); i++){
            NombreCliente=JOptionPane.showInputDialog("Digite el nombre del cliente "+(i+1));
            Deuda=Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de la deuda del cliente "+(i+1)));
            NumeroDeuda=Integer.parseInt("Digite el codigo de la deuda del cliente "+(i+1));
            Celular=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero telefonico del cliente "+(i+1)));
            DiasDeuda=Integer.parseInt(JOptionPane.showInputDialog("Digite los dias que tiene la deuda del cliente "+(i+1)));
            
            LLenar=new Datos_clientes();
            LLenar.setNombreCliente(NombreCliente);
            LLenar.setValorDeuda(Deuda);
            LLenar.setNumeroDeuda(NumeroDeuda);
            LLenar.setNumeroCelular(Celular);
            LLenar.setDiasDeudas(DiasDeuda);
            
            Vector.setVector(i, LLenar);
        }
        
        int Opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion:\n\n"
            + "1: Ordenar y mostrar La deuda mayor y cuantos clientes deben ese valor. \n"
            + "2: Buscar por numero de deuda o por numero de telefono.\n"
            + "3: Generar listado de deudores de mas de 45 dias "));
        
        switch(Opcion){
            case 1:
                Vector.Shell();
                String Ordenar="";
                for(int i=0; i<Vector.getNumero_Clientes(); i++){
                    Ordenar+=Vector.getVector(i).getNombreCliente()+"   "+Vector.getVector(i).getValorDeuda()+"   "
                            + Vector.getVector(i).getNumeroDeuda()+"\n";
                }
                JOptionPane.showMessageDialog(null, Ordenar);
                JOptionPane.showMessageDialog(null, "la deuda mayor es: "+Vector.ValorMayor()+"\n"
                        + "Los clientes que deben esta cantidad son un total de: "+Vector.MaximosDeudores());
                break;
            case 2:
                int Op=Integer.parseInt(JOptionPane.showInputDialog("1: Bucar por numero de deuda.\n"
                        + "2: Bucar por numero telefonico"));
                if(Op==1){
                    int Num=Integer.parseInt(JOptionPane.showInputDialog("ditie el numero de deuda:"));
                    
                    JOptionPane.showMessageDialog(null, "El");
                }
                
        }
        
    }
}
