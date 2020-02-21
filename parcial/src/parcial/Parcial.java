/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author JP
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaParqueadero parqueadero= new ListaParqueadero();
        Vista v= new Vista(parqueadero);
        int op;
        do {
            op=v.menu();
            switch(op){
                case 1:
                    v.agregar();
                    break;
                case 2:
                    v.salida();
                    break;
                case 3:
                    v.estadoActual();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
            
        } while (op!=4);
        
        
    }
    
}
