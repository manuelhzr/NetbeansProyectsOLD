/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

/**
 *
 * @author manue
 */
public class datosTaller {

    private int[] cedulaCliente;    //Atributo de la clase
    private String[] nombreCliente; //Atributo de la clase
    private String[] compraRealizada;  //Atributo de la clase
    private float[] valorCompra;    //Atributo de la clase
    private int posicionActual; // Posicion en la que esta almacenando datos actualmente

    public datosTaller() {
        this.cedulaCliente = new int[100];  //Atributo de la clase
        this.nombreCliente = new String[100];   //Atributo de la clase
        this.compraRealizada = new String[100]; //Atributo de la clase
        this.valorCompra = new float[100];  //Atributo de la clase
        this.posicionActual = 0;    //Inicializacion de la posicion en la que se almacenan datos
    }
        // Metodos get y set, para asignar y leer datos de los vectores.
    public int getCedulaCliente(int pos) {
        return cedulaCliente[pos];
    }

    public void setCedulaCliente(int pos, int cedulaCliente) {
        this.cedulaCliente[pos] = cedulaCliente;
    }

    public String getNombreCliente(int pos) {
        return nombreCliente[pos];
    }

    public void setNombreCliente(int pos, String nombreCliente) {
        this.nombreCliente[pos] = nombreCliente;
    }

    public String getCompraRealizada(int pos) {
        return compraRealizada[pos];
    }

    public void setCompraRealizada(int pos, String compraRealizada) {
        this.compraRealizada[pos] = compraRealizada;
    }

    public float getValorCompra(int pos) {
        return valorCompra[pos];
    }

    public void setValorCompra(int pos, float valorCompra) {
        this.valorCompra[pos] = valorCompra;
    }
    
    //Metodo registrarCompra, usa para almacenar una compra en el vector, recibe como parametro los datos que se almacenan cedula, nombre, compra, y valor. Retorna boolean para informar si se pudo registrar la compra o no 
    public boolean registrarCompra(int cedulaCliente, String nombreCliente, String compraRealizada, float valorCompra) {
        if (posicionActual < 100) { // Verifica que la poscion en la que se esta almacenando sea menor que el tamaño del arraglo 
            setCedulaCliente(posicionActual, cedulaCliente); //Agrega los valores pasados por parametro al arreglo correspondiente
            setNombreCliente(posicionActual, nombreCliente);    //Agrega los valores pasados por parametro al arreglo correspondiente
            setCompraRealizada(posicionActual, compraRealizada);    //Agrega los valores pasados por parametro al arreglo correspondiente
            setValorCompra(posicionActual, valorCompra);    //Agrega los valores pasados por parametro al arreglo correspondiente
            posicionActual++;   //Aumenta el valor de la posicion actual, para registrar el siguiente dato.
            return true;//Si toda la operacion fue correcta retorna verdadero para informar el resultado
        } else {
            return false;   //Retorna falso si ya se alcanzo el tamaño maximo del vector.
        }
    }
    //Metodo para verficar que un cliente existe, se usa para saber si al buscar un cliente este existe o  no. Busca por la cedula del cliente.
    private boolean verificarCliente(int cedulaCliente) {
        for (int i = 0; i < posicionActual; i++) { //Recorre hasta la posicon actual en la que se estan agregando datos, osea en la ultima en que se registro.
            if (getCedulaCliente(i) == cedulaCliente) { //Pregunta si la cedula pasada por parametro exite en la posicon que va recorriendo el for actualmente
                return true;    //Si la condicion se da, retorna verdadero para informar que si el cliente si se encuentra
            }
        }
        return false; //si al final no encontro ninguna coincidencia retorna falso para avisar que el cliente no se encuentra registrado
    }
    //Muesta los datos de un cliente almacenado en la pocion que se le pasa por parametro. retornando un Strign con toda la informacion asociada a este cliente
    private String mostrarCliente(int pos) {
        String mostrar = "Cedula: "+getCedulaCliente(pos) + "\n"
                + "Nombre: "+getNombreCliente(pos) + "\n"
                + "Articulo: "+getCompraRealizada(pos) + "\n"
                + "Valor: "+getValorCompra(pos) + "\n\n";
        return mostrar;
    }
    //Metodo para buscar un cliente por numero de cedula y retornar toda su informacion
    public String buscarCliente(int cedulaCliente) {
        String mostrar = "";
        if (verificarCliente(cedulaCliente)) { //Verifica si el cliente a buscar existe o no, para entrar al for, o retornar un Strign vacio
            for (int i = 0; i < posicionActual; i++) {  //Si el cliente existe procede a recorrer el vector.
                if (getCedulaCliente(i) == cedulaCliente) { //Pregunta si el cliente en la poscion actual, es el que se quiere mostrar
                    mostrar += mostrarCliente(i); //almacena en el String la informacion del cliente en caso de qie la condicion anterior se cumpla
                }
            }
        }
        return mostrar; //Al final retorna la variable String vacia, si el cliente no existe, o con la informacion de este si esxiste
    }
    // Metodo para mostrar todas las ventas registradas en los arreglos
    public String mostrarVentas() {
        String ventas = "";
        for (int i = 0; i < posicionActual; i++) { //Recorre el vector hasra la poscion actual, y almacena toda la informacion de estos en una variable String la cual se retornara 
            ventas += mostrarCliente(i);
        }
        return ventas;
    }
     //Muestra el valor de todas las ventas almacenadas en los arraglos, retorna este unico dato en una variable float
    public float totalVentas() {
        float total = 0;
        for (int i = 0; i < posicionActual; i++) {
            total += getValorCompra(i); //Recorre el arreglo y suma toda la informacion el el arreglo de los valores en una variable que luego se retorna 
        }
        return total;
    }

}
