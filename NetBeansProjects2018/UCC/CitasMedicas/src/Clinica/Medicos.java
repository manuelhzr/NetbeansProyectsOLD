package Clinica;

public class Medicos extends personas{
    
    private int tarjetaProf;

    public Medicos(int tarjetaProf, String nombre, int Id, String especialidad) {
        super(nombre, Id, especialidad);
        this.tarjetaProf=tarjetaProf;
    }

    public int getTarjetaProf() {
        return tarjetaProf;
    }

    public void setTarjetaProf(int tarjetaProf) {
        this.tarjetaProf = tarjetaProf;
    }
    
    
}
