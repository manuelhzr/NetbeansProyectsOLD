/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizacion;

/**
 *
 * @author manue
 */
public class Trabajador extends Participantes{
    private String Area;
    private String NivelAcademico;
    private String SubCategoria;
    private Departamento departamento;
    private Asalariado asal=null;
    private Voluntario vol=null;

    public Trabajador() {
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getNivelAcademico() {
        return NivelAcademico;
    }

    public void setNivelAcademico(String NivelAcademico) {
        this.NivelAcademico = NivelAcademico;
    }

    public String getSubCategoria() {
        return SubCategoria;
    }

    public void setSubCategoria(String SubCategoria) {
        this.SubCategoria = SubCategoria;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Asalariado getAsal() {
        return asal;
    }

    public void setAsal(Asalariado asal) {
        this.asal = asal;
    }

    public Voluntario getVol() {
        return vol;
    }

    public void setVol(Voluntario vol) {
        this.vol = vol;
    }
    
    
}
