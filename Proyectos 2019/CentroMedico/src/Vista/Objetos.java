/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Archivos.EscribirArchivo;
import Estructuras.ColaPacientes;
import Estructuras.ListaHistorial;
import Estructuras.ListaMedicos;

/**
 *
 * @author manue
 */
public final class Objetos {
    public static EscribirArchivo archivoPacientes = new EscribirArchivo("D:\\Pacientes.txt");
    public static EscribirArchivo archivoHistorial = new EscribirArchivo("D:\\Historial.txt");
    public static EscribirArchivo archivoMedicos = new EscribirArchivo("D:\\Medicos.txt");
    
    public static ColaPacientes colaPacientes = new ColaPacientes();
    public static ListaHistorial listaHistorial = new ListaHistorial();
    public static ListaMedicos listaMedicos = new ListaMedicos();
}
