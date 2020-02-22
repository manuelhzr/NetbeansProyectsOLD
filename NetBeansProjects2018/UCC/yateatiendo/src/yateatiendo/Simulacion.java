/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yateatiendo;

public  class Simulacion {
    private int tamInicial;
    private int estActual;
    private int cantEstudiantes;
    private int operadores;
    private int tamActual;
    
    private TadCola cola;
    
    private int  tamMedio, div, tamMaximo;
    
    private double tiempo4Operador, tiempomaxEspera;
    

    public Simulacion() {
        tamInicial=0;
        estActual=0;
        cantEstudiantes=0;
        operadores=3;
        tamActual=0;
        cola= new TadCola();
        tiempo4Operador=0;
        tamMedio=0;
        div=0;
        tamMaximo=0;
        tiempomaxEspera=0;
    }
    
    private void operadores(){
        if (tamActual>20) {
            this.operadores=4;
        }else{
            this.operadores=3;
        }
    }
    
    private void iniciarCola(){
        tamInicial=(int) (Math.random() * 50);
        tamMedio=tamInicial;
        for (int i = 0; i < tamInicial; i++) {
            llegadaEstudiante();
        }
    }
    
    private void llegadaEstudiante(){
        estActual++;
        cola.encolar(estActual);
        tamActual++;
        tamMedio+=tamActual;
        div++;
        operadores();
        setTamMaximo(tamActual);
    }
    
    private int salidaEstudiante() {
        int est=cola.desencolar();
        tamActual--;
        operadores();
        tamMedio+=tamActual;
        div++;
        setTamMaximo(tamActual);
        
        return est;
    }
    
    private double tOP1=0;
    private void operador1() {
        int est;
        if (tOP1<420) {
        est=salidaEstudiante();
        cantEstudiantes++;
        double t=1.5;
        t+=Math.random()*1;
        tOP1+=t;
        
        if (est==tamInicial) {
                tiempomaxEspera=tOP1;
            }
        
        }
    }
    
    private double tOP2=0;
    private void operador2() {
        int est;
        if (tOP2<420) {
        est=salidaEstudiante();
        cantEstudiantes++;
        double t=2;
        t+=Math.random()*3;
        tOP2+=t;
        
        
            if (est==tamInicial) {
                tiempomaxEspera=tOP1;
            }
        
        }
    }
    
    private double tOP3=0;
    private int operador3() {
        int est;
        if (tOP3<420) {
        est=salidaEstudiante();
        cantEstudiantes++;
        double t=2;
        t+=Math.random()*2;
        tOP3+=t;
        
        if (est==tamInicial) {
                tiempomaxEspera=tOP1;
            }
        
        return (int) (t);
        }
        
        return 1;
        
    }
    
    private int operador4() {
        int est;
        if (tiempo4Operador<420) {
        est=salidaEstudiante();
        cantEstudiantes++;
        double t=2;
        t+=Math.random()*2.5;
        tiempo4Operador+=t;
        
        if (est==tamInicial) {
                tiempomaxEspera=tOP1;
            }
        
        return (int) (t);
        }
        return 1;
    }
    
    private void setTamMaximo(int tamAct){
        if (tamAct>=tamMaximo) {
            tamMaximo=tamAct;
        }
    }
    
    public int getTamMaximo(){
        return tamMaximo;
    }

    public double getTiempo4Operador() {
        return tiempo4Operador;
    }

    public int getCantEstudiantes() {
        return cantEstudiantes;
    }
    
    public int tamañoMedio(){
        return tamMedio/div;
    }

    public double getTiempomaxEspera() {
        return tiempomaxEspera;
    }
    
    public void simular() {
        iniciarCola();
        int minutos=0;
        int i;
        while(minutos<420){
            operador1();
            operador1();
            operador2();
            if (operadores==4) {
                operador3();
                i=operador4();
            }else{
                i=operador3();
            }
            
            for (int j = 0; j < i; j++) {
                llegadaEstudiante();
                llegadaEstudiante();
                
            }
                
                    minutos+=i; 
                
        }
    }
    
    
    
}
