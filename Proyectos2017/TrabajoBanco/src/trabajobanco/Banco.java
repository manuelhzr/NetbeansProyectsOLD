/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobanco;

/**
 *
 * @author manue
 */
public class Banco {
    private int Nelementos;
    private String gerente;
    private String direccion;
    private String correo;
    private String Telefono;
    private Cuenta[] listaCuenta;

    public Banco() {
    }

    public int getNelementos() {
        return Nelementos;
    }

    public void setNelementos(int Nelementos) {
        this.Nelementos = Nelementos;
        listaCuenta =new Cuenta[Nelementos];
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Cuenta getListaCuenta(int pos) {
        return listaCuenta[pos];
    }

    public void setListaCuenta(int pos, Cuenta listaCuenta) {
        this.listaCuenta[pos] = listaCuenta;
    }
    
    public int busqueda(int parametro){
        int res=-1;
        for (int i = 0; i < getNelementos(); i++) {
            if (getListaCuenta(i).getDatoscliente().getIdcliente()==parametro) {
                res=i;
            }
        }
        return res;
    }
    
    public boolean eliminar(int pos){
        boolean el=false;
       if(pos>=0){
           setListaCuenta(pos, null);
           el=true;
       }
       return el;
    }
    
    public void insertarcuenta(int pos, Cuenta cuent){
        setListaCuenta(pos, cuent);
    }
    
    public float consultarsaldo(int pos){
        return getListaCuenta(pos).getSaldo();
    }
    
    public Movimiento consultarmovimiento(int pos, int id){
        return getListaCuenta(pos).consultarMov(id);
    }
    
}
