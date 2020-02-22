package Clinica;

public class adminClinica implements interfaceAdmin{
    
    private pacientes[] listaCitas;
    private Medicos[] listaMedicos;
    private static adminClinica admin=new adminClinica();
    
    private adminClinica() {
        this.listaCitas=new pacientes[100];
        this.listaMedicos=new Medicos[100];
        
        for (int i = 0; i < 100; i++) {
            this.listaCitas[i]=null;
            this.listaMedicos[i]=null;
        }
        
    }

    public static adminClinica getAdmin() {
        return admin;
    }

    public pacientes getListaCitas(int p) {
        return listaCitas[p];
    }

    public void setListaCitas(int p, pacientes listaCitas) {
        this.listaCitas[p] = listaCitas;
    }

    public Medicos getListaMedicos(int p) {
        return listaMedicos[p];
    }

    public void setListaMedicos(int p, Medicos listaMedicos) {
        this.listaMedicos[p] = listaMedicos;
    }

    public boolean agregarCita(pacientes paciente){
        
        for (int i = 0; i < 100; i++) {
            if (getListaCitas(i)==null) {
                setListaCitas(i, paciente);
                return true;
            }
        }
        
        return false;
    }

    public boolean agregarMedico(Medicos medico){
        
        for (int i = 0; i < 100; i++) {
            if (getListaMedicos(i)==null) {
                setListaMedicos(i, medico);
                return true;
            }
        }

        return false;
    }
    
    public int buscarMedico(int id){
        for (int i = 0; i < 100; i++) {
            if (getListaMedicos(i)!=null && getListaMedicos(i).getId()==id) {
                return i;
            }
        }
        return -1;
    }
    
    public int buscarCita(int id){
        for (int i = 0; i < 100; i++) {
            if (getListaCitas(i)!=null && getListaCitas(i).getId()==id) {
                return i;
            }
        }
        return -1;
    }
    
}
