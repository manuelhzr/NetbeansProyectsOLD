/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizherencia;

/**
 *
 * @author Lenovo
 */
public class Salarios {

    private Planta[] Empleadoplanta;
    private Supervisor[] Empleadosupervisor;
    private Vendedor[] Empleadovendedor;

    private final int tam = 10;

    public Salarios() {
        Empleadoplanta = new Planta[tam];
        Empleadosupervisor = new Supervisor[tam];
        Empleadovendedor = new Vendedor[tam];
    }

    public Planta getEmpleadoplanta(int p) {
        return Empleadoplanta[p];
    }

    public void setEmpleadoplanta(int p, Planta Empleadoplanta) {
        this.Empleadoplanta[p] = Empleadoplanta;
    }

    public Supervisor getEmpleadosupervisor(int p) {
        return Empleadosupervisor[p];
    }

    public void setEmpleadosupervisor(int p, Supervisor Empleadosupervisor) {
        this.Empleadosupervisor[p] = Empleadosupervisor;
    }

    public Vendedor getEmpleadovendedor(int p) {
        return Empleadovendedor[p];
    }

    public void setEmpleadovendedor(int p, Vendedor Empleadovendedor) {
        this.Empleadovendedor[p] = Empleadovendedor;
    }

    public float SalarioPlanta(int pos) {
        return getEmpleadoplanta(pos).Salario();
    }

    public float SalarioSupervisor(int pos) {
        return getEmpleadosupervisor(pos).Salario();
    }

    public float SalarioVendedor(int pos) {
        return getEmpleadovendedor(pos).Salario();
    }

}
