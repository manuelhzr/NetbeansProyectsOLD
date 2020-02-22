/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina_andres;


public class Nomina {
    private String[] Nombres;
    private String[] Cargo;
    private int[] Horas;
    private float salarioBase;

    public Nomina() {
        Nombres=new String[10];
        Cargo=new String[10];
        Horas=new int[10];
        salarioBase=0;
    }

    public String getNombres(int pos) {
        return Nombres[pos];
    }

    public void setNombres(int pos, String Nombres) {
        this.Nombres[pos] = Nombres;
    }

    public String getCargo(int pos) {
        return Cargo[pos];
    }

    public void setCargo(int pos, String Cargo) {
        this.Cargo[pos] = Cargo;
    }

    public int getHoras(int pos) {
        return Horas[pos];
    }

    public void setHoras(int pos,int Horas) {
        this.Horas[pos] = Horas;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public float[] salario(){
        float[] Salario=new float[10];
        for (int i = 0; i < 10; i++) {
            Salario[i]=getHoras(i)*getSalarioBase();
        }
        return Salario;
    }
    
    public float[] RetencionFuente(){
        float[] Retencion=new float[10];
        for (int i = 0; i < 10; i++) {
            if (salario()[i]<=100000) {
                Retencion[i]=(float) (salario()[i]*0.05);
            }else {
                if (salario()[i]>100000 && salario()[i]<=1000000) {
                    Retencion[i]=(float) (salario()[i]*0.07);
                }else{
                    if (salario()[i]>1000000 && salario()[i]<=5000000) {
                        Retencion[i]=(float) (salario()[i]*0.15);
                    }else{
                        Retencion[i]=(float) (salario()[i]*0.2);
                    }
                }
            }
        }
        return Retencion;
    }
    
    public float[] Salud(){
        float[] salud=new float[10];
        for (int i = 0; i < 10; i++) {
            salud[i]=(float) (salario()[i]*0.04);
        }
        return salud;
    }
    
    public float[] Pension(){
        float[] pension=new float[10];
        for (int i = 0; i < 10; i++) {
            pension[i]=(float) (salario()[i]*0.03);
        }
        return pension;
    }
    
    public int[] Subsidio(){
        int[] sub=new int[10];
        for (int i = 0; i < 10; i++) {
            if(salario()[i]<=(737717*2)){
                sub[i]=150000;
            }
            else{
                sub[i]=0;
            }
        }
        return sub;
    }
    
    
    
}
