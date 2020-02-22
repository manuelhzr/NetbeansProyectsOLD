/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivospilas;

import Modelo.LeerArchivo;
import Modelo.Pila;

/**
 *
 * @author JP
 */
public class ArchivosPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vista v = new Vista();

        LeerArchivo archivo1 = new LeerArchivo("src\\Archivos\\peliculas1.txt");
        LeerArchivo archivo2 = new LeerArchivo("src\\Archivos\\peliculas2.txt");
        LeerArchivo archivo3 = new LeerArchivo("src\\Archivos\\peliculas3.txt");
        LeerArchivo archivo4 = new LeerArchivo("src\\Archivos\\peliculas4.txt");
        Pila pila1 = null, pila2 = null, pila3 = null, pila4 = null;

        int menuOption, res;

        do {
            menuOption = v.menu();
            switch (menuOption) {
                case 1:
                    pila1 = v.crearPila(pila1, archivo1);
                    break;
                case 2:
                    pila2 = v.crearPila(pila2, archivo2);
                    break;
                case 3:
                    pila3 = v.ApilarComunes(pila1, pila2);
                    break;
                case 4:
                    v.guardarArchivo(pila3, archivo3);
                    break;
                case 5:
                    pila4= v.CombinarPilas(pila1, pila2);
                    break;
                case 6:
                    v.guardarArchivo(pila4, archivo4);
                    break;
                case 7:
                    
                    do {
                        res = v.menuMostrar("Pila");
                        switch(res){
                            case 1:
                                v.MostrarPila(pila1);
                                break;
                            case 2:
                                v.MostrarPila(pila2);
                                break;
                            case 3:
                                v.MostrarPila(pila3);
                                break;
                            case 4:
                                v.MostrarPila(pila4);
                                break;
                        }
                    } while (res!=5);
                    break;
                case 8:
                    do {                        
                        res=v.menuMostrar("Archivo");
                        switch(res){
                            case 1:
                                v.MostrarArchivo(archivo1);
                                break;
                            case 2:
                                v.MostrarArchivo(archivo2);
                                break;
                            case 3:
                                v.MostrarArchivo(archivo3);
                                break;
                            case 4:
                                v.MostrarArchivo(archivo4);
                                break;
                        }
                    } while (res!=5);
                    break;

            }
        } while (menuOption != 9);

    }

}
