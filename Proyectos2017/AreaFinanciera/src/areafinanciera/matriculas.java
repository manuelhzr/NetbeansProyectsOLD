
package areafinanciera;

 
 public class matriculas {

    public matriculas() {
    }
    
 private int tipoPrograma; 
 private float ValorInicial;
 private int estrato;
 private String Programa;
 private int semestre;
 private int modalidad;
 
 private String egresadoDe;
 private int trabjador;

 
    public int getTipoPrograma() {
        return tipoPrograma;
    }

    public void setTipoPrograma(int tipoPrograma) {
        this.tipoPrograma = tipoPrograma;
    }

    public float getValorInicial() {
        return ValorInicial;
    }

    public void setValorInicial(float ValorInicial) {
        this.ValorInicial = ValorInicial;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public String getPrograma() {
        return Programa;
    }

    public void setPrograma(String Programa) {
        this.Programa = Programa;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getModalidad() {
        return modalidad;
    }

    public void setModalidad(int modalidad) {
        this.modalidad = modalidad;
    }

    public String getEgresadoDe() {
        return egresadoDe;
    }

    public void setEgresadoDe(String egresadoDe) {
        this.egresadoDe = egresadoDe;
    }

    public int getTrabjador() {
        return trabjador;
    }

    public void setTrabjador(int trabjador) {
        this.trabjador = trabjador;
    }
    
    private float primerSemestre(){
        float val=0;
        if(getSemestre()==1 && (getPrograma().equals("Ing Sistemas")||getPrograma().equals("Ing Industrial"))){
            val=getValorInicial()+getValorInicial();            
        }
        return val;
    }
    
    private float DescuentoEstrato(){
        float descuento=0;
        if(getEstrato()==1 || getEstrato()==2){
            descuento=(float) (getValorInicial()*0.1);
        }
        return descuento;
    }
    
    private float descuentoModalidad(){
        float descuento=0;
        if(getModalidad()==2){
            descuento=(float) (getValorInicial()*0.05);
        }
        return descuento;
    }
    
    private float descuentoEgresado(){
        float descuento=0;
        if(getEgresadoDe().equals("UNIVERSIDAD DE MONTERIA")){
            descuento=(float) (getValorInicial()*0.1);
        }
        return descuento;
    }
    
    private float descuentoTrabajador(){
        float descuento=0;
        if(getTrabjador()==2){
            descuento=(float) (getValorInicial()*0.1);
        }
        return descuento;
    }
    
    public float totalpagopregrado(){
        float total=0;
        if(primerSemestre()!=0){
            setValorInicial(getValorInicial()*2);
            total=(getValorInicial()-DescuentoEstrato()-descuentoModalidad());
        }else{
            total=(getValorInicial()-DescuentoEstrato()-descuentoModalidad());
        }
        return total;
    }
    
    public float totalpagopostgrado(){
        setValorInicial(getValorInicial()*2);
        float total=(getValorInicial())-DescuentoEstrato()-descuentoEgresado()-descuentoTrabajador();
        return total;        
    }
 }
    
