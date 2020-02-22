package Clases;


public class BANCO {
    private CUENTA[] listacuenta;
    private int Nelementos=0;
    private String Nombregerente;
    private String Direccion;
    private String telefono;
    private String correo;

    public BANCO() {
        this.Nelementos=0;
    }

    public CUENTA getListacuenta(int pos) {
        return listacuenta[pos];
    }

    public void setListacuenta(int pos, CUENTA listacuenta) {
        this.listacuenta[pos] = listacuenta;
    }

    public int getNelementos() {
        return Nelementos;
    }

    public void setNelementos(int Nelementos) {
        this.Nelementos = Nelementos;
        listacuenta=new CUENTA[Nelementos];
        for (int i = 0; i < Nelementos; i++) {
            listacuenta[i]= null;
        }
    }

    public String getNombregerente() {
        return Nombregerente;
    }

    public void setNombregerente(String Nombregerente) {
        this.Nombregerente = Nombregerente;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public int Buscar(int numCuenta){
        int pos=-1;
        for (int i = 0; i < getNelementos(); i++) {
            if (getListacuenta(i) != null) {
                if (getListacuenta(i).getNrocuenta() == numCuenta) {
                    pos = i;
                }
            }
            
        }
        return pos;
    }
    
    public boolean Eliminarcuenta(int pos){
        boolean resultado=false;
        if (pos>=0) {
            setListacuenta(pos, null);
            resultado=true;
        }
        return resultado;
    }
    
    public boolean Insertarcuenta(CUENTA obj){
        boolean resultado=false;
        for (int i = 0; i < getNelementos(); i++) {
            if (getListacuenta(i)==null) {
                setListacuenta(i, obj);
                resultado=true;
                break;
            }
        }
        return resultado;
    }
    
    public float ConsultarcuentaS(int numcuenta){
        float saldo=0;
        for (int i = 0; i < getNelementos(); i++) {
            if (getListacuenta(i) != null) {
                if (getListacuenta(i).ConsultarSaldo(numcuenta) != -1) {
                    saldo = getListacuenta(i).ConsultarSaldo(numcuenta);
                }
            }
            
        }
        return saldo;
    }
    
    public MOVIMIENTO[] ConsultarcuentaM(int numcuenta){
        MOVIMIENTO vect[]=null;
        for (int i = 0; i < getNelementos(); i++) {
            if (getListacuenta(i) != null) {
                if (getListacuenta(i).consultarTransacciones(numcuenta) != null) {
                    vect = getListacuenta(i).consultarTransacciones(numcuenta);
                }
            }
            
        }
        return vect;
    }
}
