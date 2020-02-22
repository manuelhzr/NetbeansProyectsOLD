package Clinica;

import java.util.HashMap;


public class Prototype {
    private HashMap<String, personas> prototipo = new HashMap<String, personas>();
    Medicos med;
    pacientes pac;

    public Prototype() {
    }

    public Medicos getMed() {
        return med;
    }

    public void setMed(int tarjetaProf, String nombre, int Id, String especialidad) {
        this.med = new Medicos(tarjetaProf, nombre, Id, especialidad);
        prototipo.put("Medico", med);
    }

    public pacientes getPac() {
        return pac;
    }

    public void setPac(String medico, String fecha, String nombre, int ID, String especialidad) {
        this.pac = new pacientes(medico, fecha, nombre, ID, especialidad);
        prototipo.put("Paciente", pac);
    }
    
    public Object clonar(String tipo) throws CloneNotSupportedException {
        return prototipo.get(tipo).clone();
    }
    
    
}
