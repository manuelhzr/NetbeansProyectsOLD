/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresparalelos;

/**
 *
 * @author manue
 */
public class Vectores {
    private int tam;    //Variable para almacenar el tamaño de los arreglos
    private float costoKvatio;  //Variable para almacenar el costo por kilovatio
    private int[] codigoVivienda;   //Arreglo para almacenar los codigos de las viviendas
    private String[] Direccion;   //Arreglo para almacenar las direcciones de las viviendas
    private float[] Kvatios;    //Arreglo para almacenar los kilovatios consumidos por vivienda

    public Vectores() {
        //Constructor de la clase
    }

    public int getTam() {   //Metodo get del tamaño retorna el tamaño de los arreglos
        return tam;
    }

    public void setTam(int tam) {   //metodo set del tamaño
        this.tam = tam;   //Asigna un valor pasado como parametro a la variable tamaño
        codigoVivienda=new int[tam];    //
        Direccion=new String[tam];      //  Incializa cada uno de los vectores con el tamaño pasado como parametro
        Kvatios=new float[tam];         //
    }
        //Metodos set y get Asigan y retornan valores a cada uno de los vectores de la clase
    public int getCodigoVivienda(int pos) {
        return codigoVivienda[pos];
    }

    public void setCodigoVivienda(int pos, int codigoVivienda) {
        this.codigoVivienda[pos] = codigoVivienda;
    }

    public String getDireccion(int pos) {
        return Direccion[pos];
    }

    public void setDireccion(int pos, String Direccion) {
        this.Direccion[pos] = Direccion;
    }

    public float getKvatios(int pos) {
        return Kvatios[pos];
    }

    public void setKvatios(int pos, float Kvatios) {
        this.Kvatios[pos] = Kvatios;
    }

    public float getCostoKvatio() {
        return costoKvatio;
    }

    public void setCostoKvatio(float costoKvatio) {
        this.costoKvatio = costoKvatio;
    }
    
    public float Subtotal(int pos){   //Metodo para calcula el subtotal de una factura en cierta posicion mandada como parameto
        float sub;
        sub=getKvatios(pos)*getCostoKvatio(); //Asigna el subtotal = el costo por de kilovatios por la cantidad de kilovatios consumidos por la vienda en la posicion mandada como parametro
        return sub; //retorna el producto de la anterior operacion
    }
    
    public float Subsidio(int pos){     //metodo para calcular el subsidio otorgado a cada vivienda
        float sub=(float) (Subtotal(pos)*0.1); // saca el subsidio tomando el subtotal y multiplicandolo por 0.1, que equivale al 10%
        return sub; //retorna el producto de la operacion anterior
    }
    
    public float IVA(int pos){   //Metodo para calcular el iva pagado por cada vivienda
        float iva;
        iva=(float) (Subtotal(pos)*0.16);   //saca el subsidio tomando el subtotal y multiplicandolo por 0.16, que equivale al 16%
        return iva; //retorna el producto de la operacion anterior
    }
    
    public int buscar(int codigovivienda){ //Metodo para buscar una vivienda por codigo
        int pos=-1; //variable para retornar la posicion en caso de que se encuentre, si no se encuentra retornara -1, que no es una posicion valida en un arreglo y se asumira que no hubo ningun resultado en la busqueda
        for (int i = 0; i < getTam(); i++) { //ciclo para recorrer el arreglo
            if (getCodigoVivienda(i)==codigovivienda) { 
                pos=i; //Si el codigo de la vivienda en la posicion i es igual al pasado como parametro de busqueda la variable pos se hara igual a i los que significa que en esa poscion se encuentra la vivienda a buscar
            }
        }
        return pos; //retorna la variable que guarda la poscion
    }
    
    public float Total(int pos){ //Metodo para mostrar el total de facturacion de una vivienda dada su posicion en el arreglo
        float total=(Subtotal(pos)-Subsidio(pos))+IVA(pos);     //Iguala la variable total a el subtotal menos el subsudio mas el iva, para tener el total a facturar de la vivienda dada
        return total;   //Retorna el tota calculado anteriormente
    }
    
    public float FacturacionTotal(){    //Metodo para mostar el total facturado por toda en la empresa
        float factura=0; //Variable que almacena el total
        for (int i = 0; i < getTam(); i++) {    //ciclo para recorrer el arreglo
            factura+=(Subtotal(i)-Subsidio(i))+IVA(i); //a la variable factura le va sumando el subtotal menos el subsudio mas el iva de cada una de las viviendas para obtner un total de las facturas de todas la viviendas
        }
        return factura; //REtorna el total calculado anteriormente 
    }
    
}
