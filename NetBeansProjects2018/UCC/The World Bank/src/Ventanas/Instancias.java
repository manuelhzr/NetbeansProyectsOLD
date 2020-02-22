package Ventanas;

import Clases.BANCO;


public final class Instancias extends BANCO{  // Se hace la clase final para aplicar el singleton 
                                                //El extends es para el delegaton, como java no soporta herencia multiple se extiende la funcionalidad usando la segunda clase, en este caso son varias que a la vez sirven para implementar el patron facade
    
    private Principal principal;
    private DatosBanco datosbanco;  // TODAS ESTAS INSTANCIAS SON EL FACADE. Permiten acceder a otras clases a travez de una sola clase que sirve como puente.
    private Consultas consultas;
    private Eliminar eliminar;
    private RealizarTransaccion realizartransaccion;
    private RegistrarCliente registrarcliente;
    
    private static Instancias obj=new Instancias(); //el singleton solo permite una instancia de la clase. la cual se hace aqui mismo, en la misma clase, y se hace estatica para que sea accesible desde cualquier lugar del programa

    private Instancias() { // constructor privado, para evitar instancias, tambien del singleton, solo permite intanciar en la misma clase
        principal= new Principal();
        datosbanco=new DatosBanco();
        consultas=new Consultas();
        eliminar=new Eliminar();
        realizartransaccion=new RealizarTransaccion();
        registrarcliente=new RegistrarCliente();
        
    }

    public Principal getPrincipal() {
        return principal;
    }

    public DatosBanco getDatosbanco() {
        return datosbanco;
    }

    public Consultas getConsultas() {
        return consultas;
    }

    public Eliminar getEliminar() {
        return eliminar;
    }

    public RealizarTransaccion getRealizartransaccion() {
        return realizartransaccion;
    }

    public RegistrarCliente getRegistrarcliente() {
        return registrarcliente;
    }
    
    public static Instancias getInstance(){ // se retorna la instacia con un metodo estatico con el cual se accede a ella 
        return obj;
    }
    
    
    
}
